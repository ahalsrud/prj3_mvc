package kr.co.sist.prj3.admin.regmovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.admin.regmovie.dao.AdminMovieResgistDAO;
import kr.co.sist.prj3.admin.regmovie.vo.AdminActorVO;
import kr.co.sist.prj3.admin.regmovie.vo.AdminDirectVO;
import kr.co.sist.prj3.admin.regmovie.vo.AdminMovieVO;

/**
 * 영화등록 Service
 * @author user
 */
@Component
public class AdminMovieRegistService {
	
	@Autowired(required=false)
	private AdminMovieResgistDAO amDAO;
	
	
	//영화정보등록
	public void addMovieInfo(AdminMovieVO amVO) {
		
		amDAO.insertMovieInfo(amVO);
		
		
	}//addMovieInfo
	
	
	//감독정보등록
	public void addDirectorInfo(AdminDirectVO[] adVO) {
		
		  amDAO.insertDirectorInfo(adVO);
		
	}//addMovieInfo
	
	
	
	//배우정보등록
	public void addActorInfo(AdminActorVO aaVO) {
		
		
	}//addMovieInfo


	
}//class
