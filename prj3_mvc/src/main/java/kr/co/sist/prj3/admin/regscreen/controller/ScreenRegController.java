package kr.co.sist.prj3.admin.regscreen.controller;

import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.sist.prj3.admin.regscreen.service.ScreenRegService;
import kr.co.sist.prj3.admin.regscreen.vo.ScreenInfoVO;


/**
 * ��������� ��Ʈ�ѷ�
 * @author user
 */
@Controller
public class ScreenRegController {
	
	@Autowired(required=false)
	private ScreenRegService srs;
	
		//���������ȭ��
		@GetMapping("/screen_regist.do")//���������.do
		public String screenInfoFrm(int mNum,Model model) {
			
			model.addAttribute("movieInfo",srs.screenInfoService(mNum));//�ϴ� 8���ֱ�
			
			return "screenInfo_regist/screen_regist";
		}//screenInfoFrm
		
		
		//���������ó��
		@PostMapping("/movie_list.do")//�󿵽ð��������ó��.do -> �ΰ��� ��ȭ�������������̵�
		public String screenInfoPrecess(ScreenInfoVO siVO,Model model) {
			
			model.addAttribute("modifyInfo",srs.screenProcessService(siVO));
			
			return "admin_movie/movie_list";
		}//screenInfoPrecess

}//class