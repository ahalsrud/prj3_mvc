package kr.co.sist.prj3.admin.regmovie.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.sist.prj3.admin.regmovie.service.AdminMovieRegistService;
import kr.co.sist.prj3.admin.regmovie.vo.AdminMovieVO;

/**
 * ��ȭ�����Ʈ�ѷ�
 * @author user
 */
@Controller
public class AdminMovieInfoController {
	
	@Autowired(required=false)
	private AdminMovieRegistService amrs;
	
	
	//��ȭ���
	@GetMapping("/movie_regist.do")//��ȭ���.do
	public String adminMovieRegist() {
		
		
		return "movie_regist/movie_regist";
	}//adminMovieRegist
	
	
	//��ȭ��������� �� �ѱ��
	//@GetMapping("/movie_success.do")//��ȭ����.do  -> �ΰ��� ��ȭ�������������̵�
	public String adminMovieRegistProcess(AdminMovieVO amVO) {
		
			amrs.addMovieInfo(amVO);
		
		return "movie_regist/movie_success";
	}//adminMovieRegistProcess
	

}//class
