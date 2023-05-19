package kr.co.sist.prj3.admin.regmovie.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.sist.prj3.admin.regmovie.service.AdminMovieRegistService;
import kr.co.sist.prj3.admin.regmovie.vo.AdminMovieVO;

/**
 * 영화등록컨트롤러
 * @author user
 */
@Controller
public class AdminMovieInfoController {
	
	@Autowired(required=false)
	private AdminMovieRegistService amrs;
	
	
	//영화등록
	@GetMapping("/movie_regist.do")//영화등록.do
	public String adminMovieRegist() {
		
		
		return "movie_regist/movie_regist";
	}//adminMovieRegist
	
	
	//영화등록페이지 값 넘기기
	//@GetMapping("/movie_success.do")//영화관리.do  -> 민경이 영화관리페이지로이동
	public String adminMovieRegistProcess(AdminMovieVO amVO) {
		
			amrs.addMovieInfo(amVO);
		
		return "movie_regist/movie_success";
	}//adminMovieRegistProcess
	

}//class
