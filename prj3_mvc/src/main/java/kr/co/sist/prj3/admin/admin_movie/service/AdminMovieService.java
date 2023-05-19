package kr.co.sist.prj3.admin.admin_movie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.admin.admin_movie.dao.AdminMovieDAO;
import kr.co.sist.prj3.admin.admin_movie.domain.ActorDomain;
import kr.co.sist.prj3.admin.admin_movie.domain.DirectorDomain;
import kr.co.sist.prj3.admin.admin_movie.domain.EditMovieDomain;
import kr.co.sist.prj3.admin.admin_movie.domain.MovieGradeDomain;
import kr.co.sist.prj3.admin.admin_movie.domain.MovieListDomain;
import kr.co.sist.prj3.admin.admin_movie.vo.ActorVO;
import kr.co.sist.prj3.admin.admin_movie.vo.DirectorVO;
import kr.co.sist.prj3.admin.admin_movie.vo.EditMovieVO;

@Component
public class AdminMovieService {

	@Autowired(required=false) 
	private AdminMovieDAO amDAO;
	
	// ��ȭ ����
	public List<MovieListDomain> searchMovieList(String mTitle) {
		List<MovieListDomain> list = amDAO.selectMovieList(mTitle);
		
		return list;
	}
	
	// ���� ����
	public List<MovieGradeDomain> searchMovieGrade(String mTitle) {
		List<MovieGradeDomain> list = new ArrayList<MovieGradeDomain>();
		
		return list;
	}
	
	// ��ȭ ������ select
	public EditMovieDomain searchMovie(int mNum) {
		EditMovieDomain emd = amDAO.selectMovie(mNum);
		
		return emd;
	}
	
	// ��ȭ ����
	public int modifyMovie(EditMovieVO emVO) {
		return 0;
	}
	
	// ����
	public List<DirectorDomain> searchDirector(int mNum) {
		List<DirectorDomain> list = amDAO.selectDirector(mNum);
		
		return list;
	}
	
	public void addDirector(DirectorVO dVO) {
		
	}
	
	public int removeDirector(int mNum) {
		return 0;
	}
	
	// ���
	public List<ActorDomain> searchActor(int mNum) {
		List<ActorDomain> list = amDAO.selectActor(mNum);
		
		return list;
	}
	
	public void addActor(ActorVO aVO) {
		
	}
	
	public int removeActor(int mNum) {
		return 0;
	}
}
