package kr.co.sist.prj3.user.mypage.service;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.sist.prj3.user.mypage.domain.ModifyInfoDomain;

@Component
public class UserService {
	
	@PostMapping()//��й�ȣ Ȯ��
	public boolean checkPassService(String user_id) {
		
		return false;
	}//checkPassService
	
	
	@PostMapping()//ȸ������ select
	public ModifyInfoDomain showMyInfo(Model model) {
		ModifyInfoDomain mid=null;
		
		return mid;
	}//checkPassService
	
	
	@PostMapping()//�г����ߺ�Ȯ��
	public boolean dubNicname() {
		
		return false;
	}//checkPassService
	
	
	@PostMapping()//ȸ����������
	public int modifyInfo() {
		int cnt=0;
		
		return cnt;
	}//checkPassService
	
	
	@PostMapping()//ȸ��Ż��
	public int quitMember(String user_id) {
		int cnt=0;
		
		return cnt;
	}//checkPassService
	
	
	
	

}//class
