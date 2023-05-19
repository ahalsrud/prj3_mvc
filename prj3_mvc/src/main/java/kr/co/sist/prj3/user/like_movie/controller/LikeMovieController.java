package kr.co.sist.prj3.user.like_movie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.sist.prj3.user.like_movie.vo.SelectTypeVO;

@Controller
public class LikeMovieController {

	@GetMapping("/mypage_movie.do")
	public String myPageFrm() {
		return "/like_movie/mypage";
	}// myPageFrm
	
	@GetMapping("/like_movie.do")
	public String myMovieFrm(SelectTypeVO stVO, Model model) {
		return "/like_movie/like_movie";
	}// myMovieFrm
	
	@GetMapping("/mygrade.do")
	public String myGradeFrm(Model model) {
		return "/like_movie/mygrade";
	}
	
}
