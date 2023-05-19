package kr.co.sist.prj3.admin.review.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.MyBatisHandler;
import kr.co.sist.prj3.admin.review.domain.ReviewBoardDomain;
import kr.co.sist.prj3.admin.review.domain.ReviewInfoDomain;
import kr.co.sist.prj3.admin.review.vo.ReviewSearchVO;

@Component
public class AdminReviewDAO {

	public List<ReviewBoardDomain> selectReviewList(ReviewSearchVO rsVO) throws PersistenceException{
		List<ReviewBoardDomain> list = new ArrayList<ReviewBoardDomain>();
		
		//1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. handler 쿼리문 수행
		if (rsVO.getSearch_type()==null || rsVO.getSearch_type().isEmpty()) {
			list=ss.selectList("kr.co.sist.prj3.reviewMapper.reviewList");
			System.out.println("reviewDAO / 처음 불렸을 때 DAO까지 값 받고 다녀옴");
		} else {
			list=ss.selectList("kr.co.sist.prj3.reviewMapper.reviewListSearch",rsVO);
			System.out.println("reviewDAO / search버튼 DAO까지 값 받고 다녀옴");
		}//end else
		
		//3. 조회결과 처리
		
		//4. MyBatis Handler 닫기
		if( ss!= null) {ss.close();}//end if

		return list;
	}//selectReviewList

//	public static void main(String[] args) {
//		ReviewSearchVO rsVO = new ReviewSearchVO();
//		rsVO.setSearch_type("1");
//		rsVO.setSearch("클");
//		new AdminReviewDAO().selectReviewList(null);
//	}//main
	
	public List<ReviewBoardDomain> selectSearchReview(ReviewSearchVO rsVO){
		List<ReviewBoardDomain> list = new ArrayList<ReviewBoardDomain>();
		
		return list;
	}//selectSearchReview

	public int deleteReview(int rvNum) {
		
		return 0;
	}//deleteReview

	public ReviewInfoDomain selectReview(int rvNum) {
		
		return null;
	}//selectReview

	/*public List<CommentsDomain> showReviewComments(int rvNum){
		댓글Domain 만들어야함
	}*/
}//class
