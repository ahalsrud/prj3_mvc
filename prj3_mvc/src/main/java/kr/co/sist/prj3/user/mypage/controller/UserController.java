package kr.co.sist.prj3.user.mypage.controller;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.sist.prj3.user.mypage.service.UserService;
import kr.co.sist.prj3.user.mypage.vo.ModifyInfoVO;

@Controller
public class UserController {
	
	@Autowired(required=false)
	private UserService us;
	
	@GetMapping("/check_pass.do")
	public String checkPassFrm() {
		
		return "mypage/checkPass";//��й�ȣȮ��.jsp
	}//checkPassFrm
	
	@PostMapping("/modifyInfo.do")
	public String checkPassFrmProcess(String user_id,String pass,Model model) throws GeneralSecurityException, UnsupportedEncodingException {
		
		boolean isPasswordCorrect = us.checkPassService(user_id,pass);
		
		model.addAttribute("selectInfo",us.showMyInfo(user_id));
		
		//��й�ȣ Ȯ�� process
		if (isPasswordCorrect) {
		    // ��й�ȣ�� �´� ���, ���� �������� �̵�
		    return "mypage/modifyInfo";
		} else {
		    // ��й�ȣ�� Ʋ�� ���, ���� �޽��� ǥ�� �� �ʿ��� ó�� ����
			model.addAttribute("errorMessage", "��й�ȣ�� Ʋ�Ƚ��ϴ�. ��й�ȣ Ȯ�� �� ���Է� �ٶ��ϴ�.");
		
			return "mypage/checkPass";
		}//end else
		 
	}//checkPassFrmProcess
	
	
	@PostMapping("/main.do")
	public String modifyInfoProcess(ModifyInfoVO miVO,Model model) {
		
		System.out.println(miVO.getUser_id());
		model.addAttribute("modifyInfo",us.modifyInfo(miVO));
		
		
		return "main/main_frm";//������������ �̵�
	}//modifyInfoProcess
	
	
	
	@PostMapping("/quitMember.do")
	public String quitMember(String user_id) {
		
		us.quitMember(user_id);
		
		return "main/main_frm";
	}//quitMember
	
	
	

}//class
