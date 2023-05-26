package kr.co.sist.prj3.user.total_info.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.exceptions.PersistenceException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.sist.prj3.user.login.domain.LoginResultDomain;
import kr.co.sist.prj3.user.total_info.domain.ActorDomain;
import kr.co.sist.prj3.user.total_info.domain.DirectorDomain;
import kr.co.sist.prj3.user.total_info.domain.MovieImgDomain;
import kr.co.sist.prj3.user.total_info.domain.ProduceDomain;
import kr.co.sist.prj3.user.total_info.service.TotalInfoService;
import kr.co.sist.prj3.user.total_info.vo.LikeMovieVO;

@Controller
public class TotalInfoController {

	@Autowired(required = false)
	private TotalInfoService tis;

	// 첫 페이지 로드 때 여기를 부르고 조건 없이 무조건 실행되는 스크립트 영역의 ajax에 의해서 아래 주요정보 경로를 탄다.
	///////////////////////// 공통 정보
	@GetMapping("/main_info.do")
	public String infoFrm(@RequestParam("m_num") int m_num, LikeMovieVO lmVO, Model model, HttpSession session) throws PersistenceException {
		// 공통부분
		model.addAttribute("movie", tis.searchCommInfo(lmVO));

		//로그인 상태 확인
	    if (session.getAttribute("lrDomain") != null) {
	        LoginResultDomain lrDomain = (LoginResultDomain)session.getAttribute("lrDomain");
	        lmVO.setUser_id(lrDomain.getUser_id());

	        boolean likeStatus = tis.movieLikeStatus(lmVO);
	        model.addAttribute("likeStatus", likeStatus);
	    } else {
	        // 로그인하지 않은 경우 좋아요 기능 사용안함
	        model.addAttribute("likeStatus", false);
	    }

	    return "/total_info/main_info";
	}//infoFrm
	
	@ResponseBody
	@GetMapping("/add_like.do")
	public String addLike(LikeMovieVO lmVO, boolean liked, Model model, HttpSession session) {

		String jsonObj = "";
		
		if (session.getAttribute("lrDomain") != null) {
	        LoginResultDomain lrDomain = (LoginResultDomain) session.getAttribute("lrDomain");

	        // 좋아요 추가 작업 수행
			if (liked) {
				lmVO.setUser_id(lrDomain.getUser_id());
				System.out.println("insert");
				jsonObj = tis.addLikeMovie(lmVO);
			} else {
				lmVO.setUser_id(lrDomain.getUser_id());
				System.out.println("delete");
				jsonObj = tis.removeLikeMovie(lmVO);
			} // end else
	    } 

		return jsonObj;
	}// addLike

//////////////////////////////////////   주요정보   ///////////////////////////////////////////
	@ResponseBody
	@GetMapping("/detail_info.do")
	public String detailInfo(int m_num, Model model) throws PersistenceException, SQLException {

		JSONObject jsonObj = new JSONObject();

		///// 줄거리
		String summary = tis.summaryInfo(m_num);
		jsonObj.put("summary", summary);

		////// 감독
		List<DirectorDomain> directorList = tis.directorInfo(m_num);
		JSONArray directorArray = new JSONArray();

		for (DirectorDomain director : directorList) {
			JSONObject directorObj = new JSONObject();
			directorObj.put("d_img", director.getD_img());
			directorObj.put("d_name", director.getD_name());
			directorArray.add(directorObj);
		} // end for

		jsonObj.put("director", directorArray);

		// 배우
		List<ActorDomain> actorList = tis.actorInfo(m_num);
		JSONArray actorArray = new JSONArray();

		for (ActorDomain actor : actorList) {
			JSONObject actorObj = new JSONObject();
			actorObj.put("a_img", actor.getA_img());
			actorObj.put("a_name", actor.getA_name());
			actorArray.add(actorObj);
		} // end for
		jsonObj.put("actor", actorArray);
		
		// 영화 이미지
		List<MovieImgDomain> movieImgList = tis.movieImg(m_num);
        JSONArray movieImgArray = new JSONArray();
        
        for (MovieImgDomain mImg : movieImgList) {
        	JSONObject movieImgObj = new JSONObject(); 
        	movieImgObj.put("m_img", mImg.getM_img());
        	movieImgArray.add(movieImgObj);
        }//end for
        jsonObj.put("movieImg", movieImgArray);

		// 여기서 줄거리, 감독/배우list를 모두 담은 jsonObj.toJSONString();을 반환
		return jsonObj.toJSONString();
	}// infoFrm

//////////////////////////////////////////   감독/출연진   ////////////////////////////////////////////
	@ResponseBody
	@GetMapping("/produce_info.do")
	public String CrewFrm(int m_num, Model model) throws PersistenceException {

		JSONObject jsonObj = new JSONObject();

		// 감독
		List<DirectorDomain> directorList = tis.directorInfo(m_num);
		JSONArray directorArray = new JSONArray();

		for (DirectorDomain director : directorList) {
			JSONObject directorObj = new JSONObject();
			directorObj.put("d_img", director.getD_img());
			directorObj.put("d_name", director.getD_name());
			directorObj.put("d_eng", director.getD_eng());
			directorArray.add(directorObj);
		} // end for

		jsonObj.put("director", directorArray);

        //배우
        List<ActorDomain> actorList = tis.actorInfo(m_num);
        JSONArray actorArray = new JSONArray();
        
        for (ActorDomain actor : actorList) {
        	JSONObject actorObj = new JSONObject(); 
        	actorObj.put("a_img", actor.getA_img());
        	actorObj.put("a_name", actor.getA_name());
        	actorObj.put("a_eng", actor.getA_eng());
        	actorObj.put("role", actor.getRole());
        	actorArray.add(actorObj);
        }//end for
        
        jsonObj.put("actor", actorArray);

		//제작진/영화사
		ProduceDomain produce = tis.searchProduce(m_num);
		
		jsonObj.put("origin", produce.getOrigin());
		jsonObj.put("script", produce.getScript());
		jsonObj.put("produce", produce.getProduce());
		jsonObj.put("ration", produce.getRation());
		jsonObj.put("imports", produce.getImports());
        jsonObj.put("actor", actorArray);
		
			// 감독,배우,제작진/영화사 를 모두 담은 jsonObj.toJSONString();을 반환
			return jsonObj.toJSONString();
	}// CrewFrm
	
/////////////////////////////////   평점    ////////////////////////////////////////////
	

}// class
