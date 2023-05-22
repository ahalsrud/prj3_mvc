package kr.co.sist.prj3.admin.regmovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.admin.regmovie.dao.AdminMovieResgistDAO;
import kr.co.sist.prj3.admin.regmovie.vo.AdminActorVO;
import kr.co.sist.prj3.admin.regmovie.vo.AdminDirectVO;
import kr.co.sist.prj3.admin.regmovie.vo.AdminMovieVO;

/**
 * ��ȭ��� Service
 * @author user
 */
@Component
public class AdminMovieRegistService {
	
	@Autowired(required=false)
	private AdminMovieResgistDAO amDAO;
	
	
	//��ȭ�������
	public void addMovieInfo(AdminMovieVO amVO) {
		
		amDAO.insertMovieInfo(amVO);
		
		
	}//addMovieInfo
	
	
	//�����������
	public void addDirectorInfo(AdminDirectVO[] adVO) {
		
		  amDAO.insertDirectorInfo(adVO);
		
	}//addMovieInfo
	
	
	
	//����������
	public void addActorInfo(AdminActorVO aaVO) {
		
		
	}//addMovieInfo


	
}//class
