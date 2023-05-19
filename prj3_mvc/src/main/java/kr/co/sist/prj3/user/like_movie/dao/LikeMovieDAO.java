package kr.co.sist.prj3.user.like_movie.dao;

import java.util.ArrayList;
import java.util.List;

import kr.co.sist.prj3.user.like_movie.domain.MyGradeDomain;
import kr.co.sist.prj3.user.like_movie.domain.MyMovieDomain;
import kr.co.sist.prj3.user.like_movie.vo.SelectTypeVO;

public class LikeMovieDAO {

	// 기대되는 영화
	public List<MyMovieDomain> selectMyMovie(SelectTypeVO stVO) {
		List<MyMovieDomain> list = new ArrayList<MyMovieDomain>();
		
		return list;
	}// selectMyMovie
	
	public int selectCntMovie() {
		return 0;
	}// selectCntMovie
	
	public int deleteMyMovie(int num) {
		return 0;
	}// deleteMyMovie
	
	
	
	
	// 내가 쓴 평점
	public List<MyGradeDomain> selectMyGrade(String id) {
		List<MyGradeDomain> list = new ArrayList<MyGradeDomain>();
		
		return list;
	}// selectMyGrade
	
	public int selectCntGrade() {
		return 0;
	}// selectCntGrade
	
	public int deleteMyGrade(String id) {
		return 0;
	}// deleteMyGrade
	
}
