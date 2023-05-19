package kr.co.sist.prj3.user.profile.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.MyBatisHandler;
import kr.co.sist.prj3.user.profile.vo.ProfileModifyVO;

@Component
public class ProfileDAO {

	
	/**
	 * �г������� �˻�
	 * @param nickName
	 * @return
	 */
	public String selectChkNick (String nickName) {
		
		String result="";
		return result;
		
	}//selectChkNick

	
	
	
	/**
	 * ������, �г��� ����
	 * @param pVO
	 * @return
	 */
	public int updateProfile(ProfileModifyVO pVO) {
		
		int result=0;
		return result;
	}//updateProfile
	
	
	
	public String selectProfileMsg(String user_id) {
		
		String profileMsg = "";
		
		//1.MyBatis �ڵ鷯 ���
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. Handler�� ����ϱ�
		profileMsg = ss.selectOne("selectProfileMsg", user_id);		
		
				
		//4. ���� ����
		if(ss!=null) {ss.close();}//end if
				
		return profileMsg;
		
		
	}//selectProfileMsg
	
	
	
}//class
