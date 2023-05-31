package kr.co.sist.prj3.user.login.controller;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import kr.co.sist.prj3.user.login.domain.LoginResultDomain;
import kr.co.sist.prj3.user.login.service.LoginService;
import kr.co.sist.prj3.user.login.vo.LoginVO;

@SessionAttributes({"lrDomain"})
@Controller
public class LoginController {

	@Autowired(required = false)
	private LoginService lService;
	
	// �α���
	@GetMapping("/login.do")
	public String loginFrm() {
		
		return "/login/login";
	}//loginFrm
	
	
	// Model�� �̿��Ͽ� �������� �� �̸� ȭ�鿡 ����
	@ResponseBody
	@RequestMapping(value="/login_process.do", method= {RequestMethod.POST, RequestMethod.GET})
	public String loginFrmProcess(LoginVO lVO, Model model) throws UnsupportedEncodingException, GeneralSecurityException{

		LoginResultDomain lrDomain=null;
		lrDomain = lService.loginService(lVO);
		
		//���ǿ� ����
		model.addAttribute("lrDomain",lrDomain);
		
		
		
		JSONObject jsonObj = new JSONObject();
		JSONObject jsonTemp = new JSONObject();
		
		
		//�ϴ� false��
		jsonObj.put("success", false);
		jsonObj.put("msg", "���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		
		
		if(lrDomain!=null) {
			jsonObj.put("success", true);
			jsonObj.put("url", "login_success.do");
			
		}//end if

		return jsonObj.toJSONString();
		
		
	}//loginFrmProcess
		
		
	@GetMapping("/login_success.do")
	public String mainHome() {
		return "forward:main_loged_frm.do";
	}
	
	
	
	//�α׾ƿ�
	@GetMapping("/logout.do")
	public String logoutFrm(SessionStatus ss) {
	
		ss.setComplete();
		
		return "forward:mainPage.do";
	}//logoutFrm
	
	
	
}//class
