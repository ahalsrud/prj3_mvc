package kr.co.sist.prj3.user.profile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.user.profile.dao.ProfileDAO;
import kr.co.sist.prj3.user.profile.vo.ProfileModifyVO;

@Component
public class profileService {

	@Autowired(required = false)
	private ProfileDAO pDAO;
	
	/**
	 * 닉네임으로 검색
	 * @param nickName
	 * @return
	 */
	public String nickDupService (String nickName) {
		
		String result="";
		return result;
		
	}//selectChkNick

	
	
	
	/**
	 * 프로필, 닉네임 수정
	 * @param pVO
	 * @return
	 */
	public int profileModifyService(ProfileModifyVO pVO) {
		
		int result=0;
		return result;
	}//updateProfile
	
	
	
	
	/**
	 * 자기소개만 세팅 (나머지는 세션에서)
	 * @param user_id
	 * @return
	 */
	public String profileSetService(String user_id) {
		
		String profileMsg = "";
		profileMsg = pDAO.selectProfileMsg(user_id);
			
		return profileMsg;
		
		
	}//profileSetService
	
	
}//class
