package kr.co.sist.prj3.user.profile.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.MyBatisHandler;
import kr.co.sist.prj3.user.profile.vo.ProfileModifyVO;

@Component
public class ProfileDAO {

	
	/**
	 * 닉네임으로 검색
	 * @param nickName
	 * @return
	 */
	public String selectChkNick (String nickName) {
		
		String result="";
		return result;
		
	}//selectChkNick

	
	
	
	/**
	 * 프로필, 닉네임 수정
	 * @param pVO
	 * @return
	 */
	public int updateProfile(ProfileModifyVO pVO) {
		
		int result=0;
		return result;
	}//updateProfile
	
	
	
	public String selectProfileMsg(String user_id) {
		
		String profileMsg = "";
		
		//1.MyBatis 핸들러 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. Handler를 사용하기
		profileMsg = ss.selectOne("selectProfileMsg", user_id);		
		
				
		//4. 연결 끊기
		if(ss!=null) {ss.close();}//end if
				
		return profileMsg;
		
		
	}//selectProfileMsg
	
	
	
}//class
