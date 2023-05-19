package kr.co.sist.prj3.user.mypage.dao;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import kr.co.sist.prj3.user.mypage.domain.ModifyInfoDomain;
import kr.co.sist.prj3.user.mypage.vo.ModifyInfoVO;

@Component
public class UserDAO {
	
	//회원정보수정 값 select
	public ModifyInfoDomain selectMyInfo(Model model) {
		ModifyInfoDomain mid=null;
		
		return mid;
	}//selectMyInfo
	
	
	//닉네임 중복확인
	public boolean selectDupNicname(String user_id) {
		
		return false;
	}//selectDupNicname
	
	
	//회원정보 수정
	public int updateInfo(ModifyInfoVO miVO) {
		int cnt=0;
		
		return cnt;
	}//updateInfo
	
	
	//회원탈퇴
	public int updateQuitMember(String user_id) {
		int cnt=0;
		
		return cnt;
	}//updateQuitMember

}//class
