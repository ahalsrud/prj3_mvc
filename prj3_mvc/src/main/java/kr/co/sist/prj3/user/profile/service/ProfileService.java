package kr.co.sist.prj3.user.profile.service;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.user.join.dao.JoinDAO;
import kr.co.sist.prj3.user.profile.dao.ProfileDAO;
import kr.co.sist.prj3.user.profile.domain.MyProfileDomain;
import kr.co.sist.prj3.user.profile.vo.ProfileModifyVO;

@Component
public class ProfileService {

	@Autowired(required = false)
	private ProfileDAO pDAO;
	
	@Autowired(required = false)
	private JoinDAO jDAO;

	
	/**
	 * �г������� �˻�
	 * @param nickName
	 * @return
	 */
	public String nickDupService (String nick_name) {
		
		boolean available = false;
		JSONObject jsonObj = new JSONObject();
		
		//�ϴ� false
		jsonObj.put("available", available);
		
		available = jDAO.selectDupNick(nick_name)==null;
		System.out.println(nick_name+"---"+available);
		
		if(available) {
			jsonObj.put("available", available);
		}//end if
		
		return jsonObj.toJSONString();
		
	}//selectChkNick

	
	
	
	/**
	 * ������, �г��� ����
	 * @param pVO
	 * @return
	 */
	public boolean profileModifyService(ProfileModifyVO pVO) {
		
		int cnt = pDAO.updateProfile(pVO);
		return cnt==1;
		
	}//updateProfile
	
	
	
	
	/**
	 * �ڱ�Ұ��� ���� (�������� ���ǿ���)
	 * @param user_id
	 * @return
	 */
/*	public String profileMsgSetService(String user_id) {
		
		String profileMsg = "";
		profileMsg = pDAO.selectProfileMsg(user_id);
			
		return profileMsg;
		
		
	}//profileSetService
*/	
	
	public MyProfileDomain profileSetService(String user_id) {
		
		MyProfileDomain profile = null;
		profile = pDAO.selectProfile(user_id);
		return profile;
		
	}//profileService
	
	
	
}//class
