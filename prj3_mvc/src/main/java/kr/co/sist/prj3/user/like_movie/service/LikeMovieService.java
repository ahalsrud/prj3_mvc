package kr.co.sist.prj3.user.like_movie.service;

import java.util.ArrayList;
import java.util.List;

import kr.co.sist.prj3.user.like_movie.domain.MyGradeDomain;
import kr.co.sist.prj3.user.like_movie.domain.MyMovieDomain;
import kr.co.sist.prj3.user.like_movie.vo.SelectTypeVO;

public class LikeMovieService {

	// ���Ǵ� ��ȭ
	public List<MyMovieDomain> searchMyMovie(SelectTypeVO stVO) {
		List<MyMovieDomain> list = new ArrayList<MyMovieDomain>();
		
		return list;
	}// searchMyMovie
	
	public int searchCntMyMovie() {
		return 0;
	}// searchCntMyMovie
	
	public int removeMyMovie(int num) {
		return 0;
	}// removeMyMovie
	
	
	
	
	// ���� �� ����
	public List<MyGradeDomain> searchMyGrade(String id) {
		List<MyGradeDomain> list = new ArrayList<MyGradeDomain>();
		
		return list;
	}// searchMyGrade
	
	public int searchCntMyGrade() {
		return 0;
	}// searchCntMyGrade
	
	public int removeMyGrade(String id) {
		return 0;
	}// removeMyGrade
	
}// class
