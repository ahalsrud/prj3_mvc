package kr.co.sist.prj3.user.join.controller;

import org.springframework.ui.Model;

import kr.co.sist.prj3.user.join.vo.UserVO;

public class JoinController {

	

	
	/**
	 * ȸ������ ��
	 * @return
	 */
	public String joinFrm( ) { // join_frm.jsp

		return "";
		
	}
		
	
	/**
	 * ȸ������ ó�� 
	 * @param uVO
	 * @return
	 */
	public String joinProcess ( UserVO uVO )  {// join_complete.jsp
		return "";

	}
		
	
	/**
	 * id �ߺ�Ȯ��
	 * @param userId
	 * @param model
	 * @return
	 */
	public String idDupFrmProcess( String userId , Model model) { //id_dup.jsp or void
		return "";
	 
	}

	
	/**
	 * �г��� �ߺ�Ȯ��
	 * @param userId
	 * @param model
	 * @return
	 */
	public String nickDupFrmProcess( String userId, Model model )  {// nick_dup.jsp or void
		return "";

	}
	
	
}//class
