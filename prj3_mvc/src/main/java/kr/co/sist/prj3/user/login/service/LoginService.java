package kr.co.sist.prj3.user.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.user.login.dao.LoginDAO;
import kr.co.sist.prj3.user.login.domain.LoginResultDomain;
import kr.co.sist.prj3.user.login.vo.LoginVO;


@Component
public class LoginService {

	@Autowired(required = false)
	private LoginDAO lDAO;
	
	
	// ·Î±×ÀÎ
	public LoginResultDomain loginService(LoginVO lVO) {
		
		LoginResultDomain lrDomain = null;
		lrDomain = lDAO.selectUser(lVO);
		
		
		return lrDomain;
	}//LoginResultDomain
	
	
}//class
