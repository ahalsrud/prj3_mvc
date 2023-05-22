package kr.co.sist.prj3.admin.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.sist.prj3.admin.member.domain.MemberBrdDomain;
import kr.co.sist.prj3.admin.member.domain.MemberInfoDomain;
import kr.co.sist.prj3.admin.member.service.MemberMgtService;

/**
 * ȸ�� ��Ȳ �Խ���/�˻�
 * @author user
 *
 */
@Controller
public class MemberMgtController {

	@Autowired
	private MemberMgtService mmService;
	
	
	@GetMapping("/member_board.do")
	public String memberSearchProcess(String name, Model model) {
		
		List<MemberBrdDomain> list=null;
		
		name="";
		list = mmService.memberSearchService(name);
		
		
		model.addAttribute("memList", list);
		
		return "/member/member_board";
	}//memberSearchProcess
	
	
	

	/**
	 * ȸ�� �� ���� ����
	 * @param userId
	 * @param model
	 * @return
	 */
	@GetMapping("/member_info.do")
	public String memberInfoProcess(String user_id, Model model) {
		
		MemberInfoDomain mid=null;
		
		mid = mmService.memberInfoService(user_id);
		
		
		model.addAttribute("mem", mid);
		
		return "/member/member_info";
	}//memberInfoProcess

	
	
	
	
	/**
	 * ȸ�� ���� (update)
	 * @param model
	 * @return
	 */
	public String memberRemoveProcess(Model model) {
		
		
		
		return "member_board";
	}//memberRemoveProcess
	
	

	
	
}//class