package kr.co.sist.prj3.user.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import kr.co.sist.prj3.user.login.domain.LoginResultDomain;
import kr.co.sist.prj3.user.login.service.LoginService;
import kr.co.sist.prj3.user.login.vo.LoginVO;

@SessionAttributes("lrDomain")
@Controller
public class LoginController {

	@Autowired(required = false)
	private LoginService lService;
	
	// 로그인
	@GetMapping("/login.do")
	public String loginFrm() {
		return "redirect:/frm/login.jsp";
	}//loginFrm
	
	
	
	// Model을 이용하여 세션저장 및 이름 화면에 띄우기
	@RequestMapping(value="/frm/login_process.do", method= {RequestMethod.POST, RequestMethod.GET})
	public String loginFrmProcess(LoginVO lVO, Model model) {

		LoginResultDomain lrDomain = null;
		
		lrDomain = lService.loginService(lVO);
		
		
		model.addAttribute("lrDomain",lrDomain);

		return "/main/main_loged_frm";
		
		
	}//loginFrmProcess
	
	
	
	
	
	//로그아웃
	@GetMapping("/frm/logout.do")
	public String logoutFrm(SessionStatus ss) {
	
		ss.setComplete();
		
		return "/main/main_frm";
	}//logoutFrm
	
	
	
}//class
