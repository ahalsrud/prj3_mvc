package kr.co.sist.prj3.user.mypage.dao;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import kr.co.sist.prj3.user.mypage.domain.ModifyInfoDomain;
import kr.co.sist.prj3.user.mypage.vo.ModifyInfoVO;

@Component
public class UserDAO {
	
	//ȸ���������� �� select
	public ModifyInfoDomain selectMyInfo(Model model) {
		ModifyInfoDomain mid=null;
		
		return mid;
	}//selectMyInfo
	
	
	//�г��� �ߺ�Ȯ��
	public boolean selectDupNicname(String user_id) {
		
		return false;
	}//selectDupNicname
	
	
	//ȸ������ ����
	public int updateInfo(ModifyInfoVO miVO) {
		int cnt=0;
		
		return cnt;
	}//updateInfo
	
	
	//ȸ��Ż��
	public int updateQuitMember(String user_id) {
		int cnt=0;
		
		return cnt;
	}//updateQuitMember

}//class
