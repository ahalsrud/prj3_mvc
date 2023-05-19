package kr.co.sist.prj3.user.mypage.service;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.sist.prj3.user.mypage.domain.ModifyInfoDomain;

@Component
public class UserService {
	
	@PostMapping()//비밀번호 확인
	public boolean checkPassService(String user_id) {
		
		return false;
	}//checkPassService
	
	
	@PostMapping()//회원정보 select
	public ModifyInfoDomain showMyInfo(Model model) {
		ModifyInfoDomain mid=null;
		
		return mid;
	}//checkPassService
	
	
	@PostMapping()//닉네임중복확인
	public boolean dubNicname() {
		
		return false;
	}//checkPassService
	
	
	@PostMapping()//회원정보수정
	public int modifyInfo() {
		int cnt=0;
		
		return cnt;
	}//checkPassService
	
	
	@PostMapping()//회원탈퇴
	public int quitMember(String user_id) {
		int cnt=0;
		
		return cnt;
	}//checkPassService
	
	
	
	

}//class
