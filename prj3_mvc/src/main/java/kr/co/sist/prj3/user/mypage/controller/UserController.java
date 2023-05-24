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
		
		return "mypage/checkPass";//비밀번호확인.jsp
	}//checkPassFrm
	
	@PostMapping("/modifyInfo.do")
	public String checkPassFrmProcess(String user_id,String pass,Model model) throws GeneralSecurityException, UnsupportedEncodingException {
		
		boolean isPasswordCorrect = us.checkPassService(user_id,pass);
		
		model.addAttribute("selectInfo",us.showMyInfo(user_id));
		
		//비밀번호 확인 process
		if (isPasswordCorrect) {
		    // 비밀번호가 맞는 경우, 다음 페이지로 이동
		    return "mypage/modifyInfo";
		} else {
		    // 비밀번호가 틀린 경우, 에러 메시지 표시 등 필요한 처리 수행
			model.addAttribute("errorMessage", "비밀번호가 틀렸습니다. 비밀번호 확인 후 재입력 바랍니다.");
		
			return "mypage/checkPass";
		}//end else
		 
	}//checkPassFrmProcess
	
	
	@PostMapping("/main.do")
	public String modifyInfoProcess(ModifyInfoVO miVO,Model model) {
		
		System.out.println(miVO.getUser_id());
		model.addAttribute("modifyInfo",us.modifyInfo(miVO));
		
		
		return "main/main_frm";//메인페이지로 이동
	}//modifyInfoProcess
	
	
	
	@PostMapping("/quitMember.do")
	public String quitMember(String user_id) {
		
		us.quitMember(user_id);
		
		return "main/main_frm";
	}//quitMember
	
	
	

}//class
