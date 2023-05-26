package kr.co.sist.prj3.user.total_info.controller;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import kr.co.sist.prj3.user.login.domain.LoginResultDomain;
import kr.co.sist.prj3.user.review.vo.LikeVO;
import kr.co.sist.prj3.user.total_info.service.TotalInfoService;
import kr.co.sist.prj3.user.total_info.vo.LikeMovieVO;

@Controller
public class TotalInfoController {

	@Autowired(required = false)
	private TotalInfoService tis;

	/*
	 * @GetMapping("/main_info.do") public String infoFrm(@RequestParam("m_num") int
	 * m_num, LikeMovieVO lmVO, Model model, @SessionAttribute(value="lrDomain",
	 * required = false) LoginResultDomain lrDomain) throws PersistenceException {
	 * // 공통부분 model.addAttribute("movie", tis.searchCommInfo(lmVO));
	 * 
	 * 임의로 id와 좋아요 상태를 세팅하지 말고 lmVO에 모델에서 꺼낸 id를 세팅 // id lmVO.setUser_id("user1");
	 * 
	 * // 좋아요 상태
	 * 
	 * 
	 * 
	 * lmVO.setUser_id(lrDomain.getUser_id());
	 * 
	 * boolean likeStatus = false;
	 * 
	 * likeStatus = tis.movieLikeStatus(lmVO); model.addAttribute("likeStatus",
	 * likeStatus);
	 * 
	 * return "/total_info/main_info"; }// infoFrm
	 */
	
	@GetMapping("/main_info.do")
	public String infoFrm(@RequestParam("m_num") int m_num, LikeMovieVO lmVO, Model model, HttpSession session) throws PersistenceException {
	    // 공통부분
	    model.addAttribute("movie", tis.searchCommInfo(lmVO));

	    // 로그인 상태 확인
	    if (session.getAttribute("lrDomain") != null) {
	        LoginResultDomain lrDomain = (LoginResultDomain) session.getAttribute("lrDomain");
	        lmVO.setUser_id(lrDomain.getUser_id());

	        boolean likeStatus = tis.movieLikeStatus(lmVO);
	        model.addAttribute("likeStatus", likeStatus);
	    } else {
	        // 로그인하지 않은 경우 좋아요 기능 사용안함
	        model.addAttribute("likeStatus", false);
	    }

	    return "/total_info/main_info";
	}
	
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
		
		/*
		 * // 좋아요 추가 작업 수행 if (liked) { System.out.println("insert"); jsonObj =
		 * tis.addLikeMovie(lmVO); } else { System.out.println("delete"); jsonObj =
		 * tis.removeLikeMovie(lmVO); } // end else
		 */
		return jsonObj;
	}
}
