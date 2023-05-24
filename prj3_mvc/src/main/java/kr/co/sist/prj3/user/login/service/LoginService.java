package kr.co.sist.prj3.user.login.service;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.user.login.dao.LoginDAO;
import kr.co.sist.prj3.user.login.domain.LoginResultDomain;
import kr.co.sist.prj3.user.login.vo.LoginVO;
import kr.co.sist.util.cipher.DataEncrypt;


@Component
public class LoginService {

	@Autowired(required = false)
	private LoginDAO lDAO;
	
	
	// 로그인
		public LoginResultDomain loginService(LoginVO lVO) throws UnsupportedEncodingException, NoSuchAlgorithmException {
			
			LoginResultDomain lrDomain = null;
			JSONObject jsonObj = new JSONObject();
			JSONObject jsonTemp = new JSONObject();
			
			
			//일단 false로
			jsonObj.put("success", false);
			jsonObj.put("msg", "아이디 혹은 비밀번호를 다시 확인해주세요.");
			
			
			lVO.setPass(DataEncrypt.messageDigest("MD5", lVO.getPass()));
			lrDomain = lDAO.selectUser(lVO);

			
			
			return lrDomain;
			
		}//LoginResultDomain
	
	
}//class
