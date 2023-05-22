package kr.co.sist.prj3.user.join.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.sist.prj3.user.join.service.JoinService;
import kr.co.sist.prj3.user.join.vo.UserVO;

@Controller
public class JoinController {

	@Autowired(required=false)
	private JoinService jService;
	
	/**
	 * 회원가입 폼
	 * @return
	 */
	@GetMapping("join.do")
	public String joinFrm( ) { // join_frm.jsp

		return "userInfo/userJoin";
		//return "redirect:frm/userJoin.jsp";
	}//
		
	
	/**
	 * 회원가입 처리 
	 * @param uVO
	 * @return
	 */
	@PostMapping("/join_process.do")
	public String joinProcess ( UserVO uVO )  {
		
		System.out.println(uVO);
		String resultPage = "userInfo/failed_join";
		
		if(jService.joinService(uVO)) { //성공 시
			resultPage = "userInfo/complete_join";
		}//end if
		
		System.out.println(resultPage);
		return resultPage;
	}//joinProcess
		
	
	/**
	 * id 중복확인
	 * @param userId
	 * @param model
	 * @return
	 */
	@GetMapping("/idDup.do")
	@ResponseBody
	public String idDupProcess( String user_id) { //id_dup.jsp or void
		
			String jsonObj="";
			
			jsonObj =jService.idDupService(user_id);
			
			return jsonObj;
		
	}//idDupProcess

	
	/**
	 * 닉네임 중복확인
	 * @param userId
	 * @param model
	 * @return
	 */
	@PostMapping("/nickDup.do")
	@ResponseBody
	public String nickDupProcess( String nick_name)  {// nick_dup.jsp or void

		String jsonObj="";
		
		jsonObj =jService.idDupService(nick_name);
		
		return jsonObj;
		
		
	}//nickDupProcess
	
	
}//class
