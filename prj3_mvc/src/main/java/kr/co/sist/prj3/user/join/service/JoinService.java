package kr.co.sist.prj3.user.join.service;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.sist.prj3.user.join.dao.JoinDAO;
import kr.co.sist.prj3.user.join.vo.UserVO;


@Component
public class JoinService {

	@Autowired
	private JoinDAO jDAO;
	
	
	//회원 가입
	public boolean joinService ( UserVO uVO ) {
		int cnt=0;
		cnt = jDAO.insertUser(uVO);
		return cnt==1;
	}

	//id 중복확인 
	public String idDupService( String user_id ) {
		boolean available = false;
		JSONObject jsonObj = new JSONObject();
		
		//일단 false
		jsonObj.put("available", available);
		
		available = jDAO.selectDupId(user_id)==null;
		
		
		if(available) {
			jsonObj.put("available", available);
		}//end if
		
		return jsonObj.toJSONString();
	
	}//idDupService

	
	
	
	//닉네임 중복확인
	public String nickDupService( String nick_name ) {
		boolean available = false;
		JSONObject jsonObj = new JSONObject();
		
		//일단 false
		jsonObj.put("available", available);
		
		available = jDAO.selectDupId(nick_name)==null;
		
		
		if(available) {
			jsonObj.put("available", available);
		}//end if
		
		return jsonObj.toJSONString();
		
	}


	
	
}//class
