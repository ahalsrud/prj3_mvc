package kr.co.sist.prj3.user.login.dao;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.MyBatisHandler;
import kr.co.sist.prj3.user.login.domain.LoginResultDomain;
import kr.co.sist.prj3.user.login.vo.LoginVO;


@Component
public class LoginDAO {

	
	//�α���
	public LoginResultDomain selectUser(LoginVO lVO) {
		
		LoginResultDomain lrDomain = null;
		
		// 1.MyBatis �ڵ鷯 ���
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2.�ڵ鷯 ����ϱ� - ������ �����ϱ�
		lrDomain = ss.selectOne("userLogin", lVO);
		

		// 3.��ȸ��� ó��
		// 4.MyBatis Handler �ݱ�
		if (ss != null) { ss.close(); }//end if
				
		return lrDomain;
	}//selectUser
	
	
}//class
