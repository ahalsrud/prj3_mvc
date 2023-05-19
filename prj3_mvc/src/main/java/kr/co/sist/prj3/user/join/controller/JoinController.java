package kr.co.sist.prj3.user.join.controller;

import org.springframework.ui.Model;

import kr.co.sist.prj3.user.join.vo.UserVO;

public class JoinController {

	

	
	/**
	 * 회원가입 폼
	 * @return
	 */
	public String joinFrm( ) { // join_frm.jsp

		return "";
		
	}
		
	
	/**
	 * 회원가입 처리 
	 * @param uVO
	 * @return
	 */
	public String joinProcess ( UserVO uVO )  {// join_complete.jsp
		return "";

	}
		
	
	/**
	 * id 중복확인
	 * @param userId
	 * @param model
	 * @return
	 */
	public String idDupFrmProcess( String userId , Model model) { //id_dup.jsp or void
		return "";
	 
	}

	
	/**
	 * 닉네임 중복확인
	 * @param userId
	 * @param model
	 * @return
	 */
	public String nickDupFrmProcess( String userId, Model model )  {// nick_dup.jsp or void
		return "";

	}
	
	
}//class
