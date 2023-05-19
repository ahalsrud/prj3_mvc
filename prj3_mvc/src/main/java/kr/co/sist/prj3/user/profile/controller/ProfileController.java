package kr.co.sist.prj3.user.profile.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.sist.prj3.user.profile.service.profileService;

/**
 * ������ ��Ʈ�ѷ�
 * @author user
 *
 */

@Controller
public class ProfileController {

	@Autowired(required = false)
	private profileService pService;
	
	/**
	 * ������ ���� �� �����ֱ�
	 * @param model
	 * @return
	 */
	@GetMapping("/my_profile.do")
	public String profileFrm( Model model ) {
		
		//�α��� �ߴ��� Ȯ��?
		
		
		String userId = "";
		String name = "";
		String nick = "";
		String profile = "";
		String profileMsg = "";

		userId = "user1";
		name = "������";
		nick = "����";
		profile = "";
		 
		//���̵�, �̸�, �г���, ������ �𵨿��� ������
		/*
		 String userId = (String)model.getAttribute("user_id"); 
		 String name =(String)model.getAttribute("name"); 
		 String nick = (String)model.getAttribute("nick_name");
		 String profile =(String)model.getAttribute("profile");
		 */
		
		
		//�ڱ�Ұ� �ҷ��� �����ϱ�
		 profileMsg = pService.profileSetService(userId);
		
		//�𵨿� ���
		model.addAttribute("user_id",userId );
		model.addAttribute("name",name );
		model.addAttribute("nick_name", nick);
		model.addAttribute("profile", profile);
		model.addAttribute("profile_msg", profileMsg);
		
		return "/profile/my_profile";
		
	}//profileFrm

	/**
	 * �г��� �ߺ�Ȯ�� - ajax�� �������� ok
	 * @param nickName
	 * @return
	 */
	public String nickDupProcess( String nickName) {
		
 		String result="";
		return result;
		
	}//nickDupProcess
	
	

	
	/**
	 * ������ ����(update)
	 * @param model
	 * @param request
	 * @return
	 */
	public String profileModifyProcess(Model model, HttpServletRequest request) {
		return "my_profile";
	}//profileModifyProcess
	
	
}//class
