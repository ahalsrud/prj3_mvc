package kr.co.sist.prj3.user.total_info.controller;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.sist.prj3.user.total_info.domain.ActorDomain;
import kr.co.sist.prj3.user.total_info.domain.DirectorDomain;
import kr.co.sist.prj3.user.total_info.service.TotalInfoService;
import kr.co.sist.prj3.user.total_info.vo.LikeMovieVO;

@Controller
public class TotalInfoController {

	@Autowired(required = false)
	private TotalInfoService tis;

	//공통 정보
	@RequestMapping(value="/main_info.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String infoFrm(@RequestParam("m_num") int m_num, LikeMovieVO lmVO, Model model) throws PersistenceException {
		// 공통부분
	    model.addAttribute("movie", tis.searchCommInfo(lmVO));
	    
//	    // 좋아요 상태
//	    boolean likeStatus = false;
//	    lmVO.setUser_id("user1");
//	    
//	    likeStatus = tis.movieLikeStatus(lmVO);
//	    model.addAttribute("likeStatus", likeStatus);
	    
		//줄거리
	    model.addAttribute("summary",tis.summaryInfo(m_num));
		//감독
		model.addAttribute("director",tis.directorInfo(m_num));
		//배우
		model.addAttribute("actor",tis.actorInfo(m_num));
	    
			return "/total_info/main_info";
		}//infoFrm
	
	@ResponseBody
	@PostMapping("/add_like.do")
	public void addLike(LikeMovieVO lmVO, Model model) {
	    // 좋아요 추가 작업 수행
        lmVO.setUser_id("user1");
        
        tis.addLikeMovie(lmVO);
	}
	
	@ResponseBody
	@PostMapping("/remove_like.do")
	public void removeLike(LikeMovieVO lmVO, int m_num, Model model) {
		
		model.addAttribute("m_num", m_num);
		tis.removeLikeMovie(lmVO);
	}
	
//////////////////////////////////////주요정보(화면전환)//////////////////////////
	@ResponseBody
	@GetMapping("/detail_info.do")
	public String detailInfo(@RequestParam("m_num") int m_num, Model model) throws PersistenceException, SQLException {
	    
		
			JSONObject jsonObj = new JSONObject();
			
			/////줄거리
			String summary = tis.summaryInfo(m_num);
			jsonObj.put("summary", summary);
			
			//////감독
	        List<DirectorDomain> directorList = tis.directorInfo(m_num);
	        JSONArray directorArray = new JSONArray();
	        
	        for (DirectorDomain director : directorList) {
	        	JSONObject directorObj = new JSONObject(); 
	            directorObj.put("d_img", director.getD_img());
	            directorObj.put("d_name", director.getD_name());
	            directorArray.add(directorObj);
	        	}//end for
	        
	        jsonObj.put("director", directorArray);
	            

	        //배우
	        List<ActorDomain> actorList = tis.actorInfo(m_num);
	        JSONArray actorArray = new JSONArray();
	        
	        for (ActorDomain actor : actorList) {
	        	JSONObject actorObj = new JSONObject(); 
	        	actorObj.put("a_img", actor.getA_img());
	        	actorObj.put("a_name", actor.getA_name());
	        	actorArray.add(actorObj);
	        }//end for
	        
	        jsonObj.put("actor", actorArray);
	        
			return jsonObj.toJSONString(); 
			//여기서 감독 배우 줄거리 다 리턴해야하니까 jsonObj.toString();되야하지 않을까??????
			//그런데 ajax에서 jsonObj.summary로 작성해도 키와 값이 둘다 뿌려지는 문제가 생겨
			//이 문제는 서비스에서 이미 한번 jsonObj.toString();으로 키와 값의 쌍으로 리턴했때문!?!?!?! 오ㅇ오오!??!
			//서비스 수정해보기
		}//infoFrm	
	
	
////////////////////////////////////////// 감독/출연진
	@ResponseBody
	@GetMapping("/produce_info.do")
	public String CrewFrm(int m_num, Model model) throws PersistenceException {
		
		//감독
		model.addAttribute("director",tis.searchDirectorList(m_num));
		//주연
		model.addAttribute("actor",tis.searchActorList(m_num));
		//제작진/영화사
		model.addAttribute("produce",tis.searchProduce(m_num));
		
		return "/total_info/main_info";
	}//CrewFrm
	
}//class
