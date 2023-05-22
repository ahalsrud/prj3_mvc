package kr.co.sist.prj3.user.mypage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.sist.prj3.user.mypage.service.MyPageService;

@Controller
public class MyPageController {
	
	@Autowired(required = false)
	private MyPageService mps;
	
	@GetMapping("/mypage.do")
	public String myPage(String id,Model model) { // 나중에 session으로 받고 String id 지우기
		
		model.addAttribute("resInfo", mps.showResDetail(id));
		model.addAttribute("canInfo",mps.showCanDetail(id));
		
		return "mypage/mypage";
	}//myPage
	
	@GetMapping("/cancelRes.do")
	public String canRes( Model model) { //나중에 session으로 받고 String id 지우기
		model.addAttribute("resultFlag",mps.cancelRes());
		model.addAttribute("resultSeat",mps.cancelSeats());
		
		return "forward:mypage.do";
	}//canRes
	
	@GetMapping("/checkPass.do")//비밀번호확인페이지
	public String checkPass(Model model) {
		return "mypage/checkPass";
	}//myPage
	
	@GetMapping("/confirm_pass.do")//비밀번호변경
	public String confirm_pass(Model model) {
		
		//lrDomain=(LoginResultDomain)model.getAttribute("lVO")
		//model.addAttribute("loginResult",lrDomain);
		
		return "mypage/confirm_pass";
	}//confirm_pass
	
	/*
	 * public String confirm_pass_process() {
	 * 
	 * }
	 */

}//class
