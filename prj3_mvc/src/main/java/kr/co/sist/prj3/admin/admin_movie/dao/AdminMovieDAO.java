package kr.co.sist.prj3.admin.admin_movie.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.MyBatisHandler;
import kr.co.sist.prj3.admin.admin_movie.domain.ActorDomain;
import kr.co.sist.prj3.admin.admin_movie.domain.DirectorDomain;
import kr.co.sist.prj3.admin.admin_movie.domain.EditMovieDomain;
import kr.co.sist.prj3.admin.admin_movie.domain.MovieGradeDomain;
import kr.co.sist.prj3.admin.admin_movie.domain.MovieListDomain;
import kr.co.sist.prj3.admin.admin_movie.vo.ActorVO;
import kr.co.sist.prj3.admin.admin_movie.vo.DirectorVO;
import kr.co.sist.prj3.admin.admin_movie.vo.EditMovieVO;

@Component
public class AdminMovieDAO {

	// 영화 관리
	public List<MovieListDomain> selectMovieList(String mTitle) {
		List<MovieListDomain> list = new ArrayList<MovieListDomain>();
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		list = ss.selectList("selectMovieList", mTitle);
		
		if(ss != null ) { ss.close(); }// end if
		
		return list;
	}
	
	// 평점 관리
	public List<MovieGradeDomain> selectMovieGrade(String mTitle) {
		List<MovieGradeDomain> list = new ArrayList<MovieGradeDomain>();
		
		return list;
	}
	
	public int deleteMovieGrade(int mNum) {
		return 0;
	}
	
	// 영화 수정
	public EditMovieDomain selectMovie(int mNum) throws PersistenceException {
		EditMovieDomain emd = null;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		emd = ss.selectOne("selectMovie", mNum);
		
		if(ss != null) { ss.close(); }// end if
		
		return emd;
	}// selectMovie
	
	public int updateMovie(EditMovieVO emVO) {
		return 0;
	}
	
	// 감독
	public List<DirectorDomain> selectDirector(int mNum) {
		List<DirectorDomain> list = null;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		list = ss.selectList("selectDirector", mNum);
		
		return list;
	}
	
	public void insertDirector(DirectorVO dVO) {
		
	}
	
	public int deleteDirector(int mNum) {
		return 0;
	}
	
	// 배우
	public List<ActorDomain> selectActor(int mNum) {
		List<ActorDomain> list = null;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		list = ss.selectList("selectActor", mNum);
		
		return list;
	}
	
	public void insertActor(ActorVO aVO) {
		
	}
	
	public int deleteActor(int mNum) {
		return 0;
	}
}
