package kr.co.sist.prj3.user.mainpage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.sist.prj3.user.mainpage.service.MainPageService;

@Controller
public class MainPageController {
	
	@Autowired(required = false)
	private MainPageService mps;
	
	@GetMapping("/mainPage.do")
	public String mainPageFrm(Model model) {
		
		
		model.addAttribute("best",mps.mainPageBestMovie());
		model.addAttribute("all",mps.mainPageFrmService());
		
		return "main/main_frm";
	}//mainPage
	
	@GetMapping("/search_movie.do")
	public String searchMovieFrm(String str,Model model) {
		return "main/search_movie";
	}//searchMovieFrm
	
	
}
