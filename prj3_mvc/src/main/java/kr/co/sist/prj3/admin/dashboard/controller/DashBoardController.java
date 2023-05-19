package kr.co.sist.prj3.admin.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashBoardController {

	
	@GetMapping("/dashBoard.do")
	public String DashBoardProcess() {
		
		
		
		
		return "dashBoard/dashBoard";
	}//DashBoardProcess
	
	
}//class
