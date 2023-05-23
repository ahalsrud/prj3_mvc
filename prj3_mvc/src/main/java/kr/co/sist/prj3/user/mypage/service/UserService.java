package kr.co.sist.prj3.user.mypage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.sist.prj3.user.mypage.dao.UserDAO;
import kr.co.sist.prj3.user.mypage.domain.ModifyInfoDomain;
import kr.co.sist.prj3.user.mypage.vo.ModifyInfoVO;

@Component
public class UserService {
	
	@Autowired(required=false)
	private UserDAO uDAO;
	
	@PostMapping()//비밀번호 확인
	public boolean checkPassService(String user_id,String pass) {
		
		boolean checkFlag=uDAO.passProcess(user_id,pass);
		
		
		return checkFlag;
	}//checkPassService
	
	
	@PostMapping()//회원정보 select
	public ModifyInfoDomain showMyInfo(String user_id) {
		
		ModifyInfoDomain mid=uDAO.selectMyInfo(user_id);
		
		return mid;
	}//checkPassService
	
	
	@PostMapping()//닉네임중복확인
	public boolean dubNicname() {
		
		return false;
	}//checkPassService
	
	
	@PostMapping()//회원정보수정
	public int modifyInfo(ModifyInfoVO miVO) {
		int cnt=uDAO.updateInfo(miVO);
		
		return cnt;
	}//checkPassService
	
	
	@PostMapping()//회원탈퇴
	public int quitMember(String user_id) {
		int cnt=0;
		
		return cnt;
	}//checkPassService
	
	
	
	

}//class
