package kr.co.sist.prj3.user.mypage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.sist.prj3.user.mypage.vo.ModifyInfoVO;


public class UserController {
	
	public String checkPassFrm() {
		
		return "";//��й�ȣȮ��.jsp
	}//checkPassFrm
	
	
	public String checkPassFrmProcess(String user_id,Model model) {
		
		return "";//ȸ����������.jsp
	}//checkPassFrmProcess
	
	public String dupNicname(String user_id) {
		
		return "";
	}//dubNicname
	
	public String modifyInfoProcess(ModifyInfoVO miVO) {
		
		return "";//������������ �̵�
	}//modifyInfoProcess

}//class
