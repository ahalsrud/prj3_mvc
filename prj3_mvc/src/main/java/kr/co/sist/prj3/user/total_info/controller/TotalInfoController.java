package kr.co.sist.prj3.user.total_info.controller;

import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.sist.prj3.user.total_info.service.TotalInfoService;

@Controller
public class TotalInfoController {

	@Autowired(required = false)
	private TotalInfoService tis;
	
	
	// 주요정보
	@GetMapping("/main_info.do")
	public String infoFrm(int m_num, Model model) throws PersistenceException {
		
		model.addAttribute("movie", tis.searchCommInfo(m_num));
		model.addAttribute("summary",tis.summaryInfo(m_num));
		
		return "/total_info/main_info";
	}
	
	

	
}
