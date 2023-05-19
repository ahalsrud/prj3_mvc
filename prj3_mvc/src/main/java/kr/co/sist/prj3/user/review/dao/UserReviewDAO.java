package kr.co.sist.prj3.user.review.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.MyBatisHandler;
import kr.co.sist.prj3.user.review.domain.MovieInfoDomain;
import kr.co.sist.prj3.user.review.domain.MyReviewDomain;
import kr.co.sist.prj3.user.review.domain.ReviewBoardDomain;
import kr.co.sist.prj3.user.review.domain.ReviewInfoDomain;
import kr.co.sist.prj3.user.review.vo.LikeVO;
import kr.co.sist.prj3.user.review.vo.MyReviewSearchVO;
import kr.co.sist.prj3.user.review.vo.ReviewSearchVO;
import kr.co.sist.prj3.user.review.vo.WriteReviewVO;


@Component
public class UserReviewDAO {

	/**
	 * 해당영화 정보 불러오기
	 * @param mNum(영화정보)
	 */
	public MovieInfoDomain selectMovieInfo(int mNum) {
		
		return null;
	}//selectMovieInfo
	
	/**
	 * 해당영화에 관한 리뷰 리스트 보여주기
	 * @param mNum(영화정보)
	 */
	public List<ReviewBoardDomain> selectReviewList(int mNum) {
		List<ReviewBoardDomain> list = new ArrayList<ReviewBoardDomain>();
	
		
		return list;
	}//selectReview
	
	/**
	 * 리뷰 리스트 검색
	 * @param rsVO
	 */
	public List<ReviewBoardDomain> selectSearchReview(ReviewSearchVO rsVO){
		List<ReviewBoardDomain> list = new ArrayList<ReviewBoardDomain>();
		
		return list;
	}//selectSearchReview
	
	/**
	 * 리뷰 작성하기
	 * @param wrVO
	 */
	public void insertReview(WriteReviewVO wrVO) {
			
	}//insertReview
	
	/**
	 * 제목 클릭한 리뷰 정보 보여주기
	 * @param rvNum(리뷰번호)
	 */
	/*
	 * public ReviewInfoDomain selectReview(int rvNum) {
	 * 
	 * ReviewInfoDomain reviewInfo = null;
	 * 
	 * // 1.MyBatis 핸들러 얻기 SqlSession ss =
	 * MyBatisHandler.getInstance().getMyBatisHandler(false);
	 * 
	 * // 2. Handler를 사용하기 reviewInfo = ss.selectOne("", rvNum);
	 * 
	 * // 4. 연결 끊기 if (ss != null) { ss.close(); } // end if
	 * 
	 * return reviewInfo;
	 * 
	 * }//selectReview
	 */	
	/**
	 * 제목 클릭한 리뷰 좋아요 눌렀는지 보여주기
	 * @return
	 */
	public String selectLikeStatus(LikeVO lVO) {

		String result = "";

		// 1.MyBatis 핸들러 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2. Handler를 사용하기
		result = ss.selectOne("selectLikeStatus", lVO);

		// 4. 연결 끊기
		if (ss != null) { 	ss.close();		} // end if

		return result;

	}// selectLikeStatus
	
	/**
	 * 제목 클릭한 리뷰 좋아요 갯수 보여주기
	 * @param rvNum(리뷰번호)
	 */
	public int selectCntLike ( int rv_num ) {
		
		int cnt = 0;
		
		//1.MyBatis 핸들러 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. Handler를 사용하기
		cnt = ss.selectOne("selectLikes", rv_num);		
		// 3. transaction 완료하기
		
				
		//4. 연결 끊기
		if(ss!=null) {ss.close();}//end if
				
		return cnt;
		
	
		
	}//selectCntLike
	
	/**
	 * 해당 리뷰 창에서 조회수 +1 증가
	 * @param rvNum(리뷰번호)
	 */
	public int updateHits(int rvNum) {
		
		return 0;
	}//updateHits
	
	/**
	 * 좋아요 누르기
	 * @param lVO
	 */
	public int insertLike(LikeVO lVO) {
		
		int cnt = 0;
		
		//1.MyBatis 핸들러 얻기
		SqlSession ss =MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. Handler를 사용하기
		cnt = ss.insert("insertLike", lVO);		
		
		//3. transaction 완료하기
				if(cnt==1) {
					ss.commit();
				}
				
		//4. 연결 끊기
				if(ss!=null) {ss.close();}//end if
				
		return cnt;
		
		
	}//insertLike
	
	/**
	 * 좋아요 해제
	 * @param lVO
	 */
	public int deleteLike(LikeVO lVO) {

		int cnt = 0;

		// 1.MyBatis 핸들러 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2. Handler를 사용하기
		cnt = ss.delete("deleteLike", lVO);

		// 3. transaction 완료하기
		if (cnt == 1) {
			ss.commit();
		}

		// 4. 연결 끊기
		if (ss != null) {
			ss.close();
		} // end if

		return cnt;
	
	}//deleteLike
	
	/**
	 * 좋아요 갯수 갱신해서 보여주기
	 * @param rvNum(리뷰번호)
	 */
	/*
	 * public int selectLikeCount(int rvNum) {
	 * 
	 * return 0; }//selectLikeCount
	 */
	
	
	/**
	 * 내가 쓴 리뷰 검색(마이페이지)
	 * @param mrsVO
	 */
	public List<MyReviewDomain> selectMyReview (MyReviewSearchVO mrsVO) {
		List<MyReviewDomain> list = new ArrayList<MyReviewDomain>();
		
		

		// 1.MyBatis 핸들러 얻기
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2. Handler를 사용하기
		list = ss.selectOne("selectLikeStatus", mrsVO);

		// 4. 연결 끊기
		if (ss != null) { 	ss.close();		} // end if

		return list;
		
		
	}//selectMyReview
	
	
	
	
}//class