package kr.co.sist.prj3.user.mypage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyPageController {
	
	@GetMapping("/mypage.do")
	public String myPage(Model model) {
		return "mypage/mypage";
	}//myPage
	
	@GetMapping("/checkPass.do")//비밀번호확인페이지
	public String checkPass(Model model) {
		return "mypage/checkPass";
	}//myPage
	
	@GetMapping("/modifyInfo.do")//개인정보변경
	public String modifyInfo(/*String pass,*/Model model) {
		return "mypage/modifyInfo";
	}//myPage

}//class
