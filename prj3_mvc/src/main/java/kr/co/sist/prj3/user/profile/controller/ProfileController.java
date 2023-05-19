package kr.co.sist.prj3.user.profile.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.sist.prj3.user.profile.service.profileService;

/**
 * 프로필 컨트롤러
 * @author user
 *
 */

@Controller
public class ProfileController {

	@Autowired(required = false)
	private profileService pService;
	
	/**
	 * 프로필 관리 폼 보여주기
	 * @param model
	 * @return
	 */
	@GetMapping("/my_profile.do")
	public String profileFrm( Model model ) {
		
		//로그인 했는지 확인?
		
		
		String userId = "";
		String name = "";
		String nick = "";
		String profile = "";
		String profileMsg = "";

		userId = "user1";
		name = "윤윤윤";
		nick = "윤삼";
		profile = "";
		 
		//아이디, 이름, 닉네임, 프로필 모델에서 꺼내기
		/*
		 String userId = (String)model.getAttribute("user_id"); 
		 String name =(String)model.getAttribute("name"); 
		 String nick = (String)model.getAttribute("nick_name");
		 String profile =(String)model.getAttribute("profile");
		 */
		
		
		//자기소개 불러서 세팅하기
		 profileMsg = pService.profileSetService(userId);
		
		//모델에 담기
		model.addAttribute("user_id",userId );
		model.addAttribute("name",name );
		model.addAttribute("nick_name", nick);
		model.addAttribute("profile", profile);
		model.addAttribute("profile_msg", profileMsg);
		
		return "/profile/my_profile";
		
	}//profileFrm

	/**
	 * 닉네임 중복확인 - ajax로 가능할지 ok
	 * @param nickName
	 * @return
	 */
	public String nickDupProcess( String nickName) {
		
 		String result="";
		return result;
		
	}//nickDupProcess
	
	

	
	/**
	 * 프로필 수정(update)
	 * @param model
	 * @param request
	 * @return
	 */
	public String profileModifyProcess(Model model, HttpServletRequest request) {
		return "my_profile";
	}//profileModifyProcess
	
	
}//class
