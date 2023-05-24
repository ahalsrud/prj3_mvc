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
	
	
	// �α���
		public LoginResultDomain loginService(LoginVO lVO) throws UnsupportedEncodingException, NoSuchAlgorithmException {
			
			LoginResultDomain lrDomain = null;
			JSONObject jsonObj = new JSONObject();
			JSONObject jsonTemp = new JSONObject();
			
			
			//�ϴ� false��
			jsonObj.put("success", false);
			jsonObj.put("msg", "���̵� Ȥ�� ��й�ȣ�� �ٽ� Ȯ�����ּ���.");
			
			
			lVO.setPass(DataEncrypt.messageDigest("MD5", lVO.getPass()));
			lrDomain = lDAO.selectUser(lVO);

			
			
			return lrDomain;
			
		}//LoginResultDomain
	
	
}//class
