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

	
	//로그인
	public LoginResultDomain selectUser(LoginVO lVO) {
		
		LoginResultDomain lrDomain = null;
		
		// 1.MyBatis 핸들러 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2.핸들러 사용하기 - 쿼리문 수행하기
		lrDomain = ss.selectOne("userLogin", lVO);
		

		// 3.조회결과 처리
		// 4.MyBatis Handler 닫기
		if (ss != null) { ss.close(); }//end if
				
		return lrDomain;
	}//selectUser
	
	
}//class
