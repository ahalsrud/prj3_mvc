package kr.co.sist.prj3.user.mypage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.sist.prj3.user.mypage.vo.ModifyInfoVO;


public class UserController {
	
	public String checkPassFrm() {
		
		return "";//비밀번호확인.jsp
	}//checkPassFrm
	
	
	public String checkPassFrmProcess(String user_id,Model model) {
		
		return "";//회원정보수정.jsp
	}//checkPassFrmProcess
	
	public String dupNicname(String user_id) {
		
		return "";
	}//dubNicname
	
	public String modifyInfoProcess(ModifyInfoVO miVO) {
		
		return "";//메인페이지로 이동
	}//modifyInfoProcess

}//class
