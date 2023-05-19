package kr.co.sist.prj3.admin.admin_movie.controller;


import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.sist.prj3.admin.admin_movie.service.AdminMovieService;

@Controller
public class AdminMovieController {

	@Autowired(required=false)
	private AdminMovieService ams;
	
	// 영화 관리
	@GetMapping("/movie_list.do")
	public String movieListFrm(String mTitle, Model model) throws PersistenceException {
		
		model.addAttribute("list", ams.searchMovieList(mTitle));
		
		return "/admin_movie/movie_list";
	}// movieListFrm
	
	// 평점 관리
	@GetMapping("/movie_grade.do")
	public String movieGradeFrm(String mTitle, Model model) {
		return "/admin_movie/movie_grade";
	}
	
	// 영화 수정
	@PostMapping("/movie_edit.do")
	public String editMovieFrm(int mNum, Model model) throws PersistenceException {
		
		
		model.addAttribute("emd", ams.searchMovie(mNum));
		model.addAttribute("dList", ams.searchDirector(mNum));
		model.addAttribute("aList", ams.searchActor(mNum));
		
		return "admin_movie/movie_edit";
	}
	
	public String editMovieProcess(HttpServletRequest request) {
		return "";
	}
	
}
