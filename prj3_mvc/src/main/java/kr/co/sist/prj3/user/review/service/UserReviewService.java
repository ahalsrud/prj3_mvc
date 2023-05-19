package kr.co.sist.prj3.user.review.service;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.co.sist.prj3.user.review.dao.UserReviewDAO;
import kr.co.sist.prj3.user.review.domain.MovieInfoDomain;
import kr.co.sist.prj3.user.review.domain.MyReviewDomain;
import kr.co.sist.prj3.user.review.domain.ReviewBoardDomain;
import kr.co.sist.prj3.user.review.domain.ReviewInfoDomain;
import kr.co.sist.prj3.user.review.vo.LikeVO;
import kr.co.sist.prj3.user.review.vo.MyReviewSearchVO;
import kr.co.sist.prj3.user.review.vo.ReviewSearchVO;
import kr.co.sist.prj3.user.review.vo.WriteReviewVO;

/**
 * 리뷰 관련 Service
 * @author kt
 */
@Controller
public class UserReviewService {
	
	@Autowired
	private UserReviewDAO urDAO ; 
	
	
	/**
	 * 해당영화 정보 불러오기
	 * @param mNum(영화번호)
	 */
	public MovieInfoDomain showMovieInfo(int mNum) {
		
		
		return null;
	}//showMovieInfo
	
	/**
	 * 해당영화에 관한 리뷰 리스트 보여주기
	 * @param mNum(영화번호)
	 */
	public List<ReviewBoardDomain> showReviewList(int mNum){
		List<ReviewBoardDomain> list = new ArrayList<ReviewBoardDomain>();
		
		return list;
	}//showReviewList
	
	/**
	 * 리뷰 리스트 검색
	 * @param rsVO
	 */
	public List<ReviewBoardDomain> showSearchReviewList(ReviewSearchVO rsVO){
		List<ReviewBoardDomain> list = new ArrayList<ReviewBoardDomain>();
		
		return list;
	}//showSearchReviewList
	
	/**
	 * 리뷰 작성하기
	 * @param wrVO
	 */
	public void reviewProcess(WriteReviewVO wrVO) {
		
	}//reviewProcess
	
	/**
	 * 제목 클릭한 리뷰 보여주기
	 * @param rvNum(리뷰번호)
	 */
	public ReviewInfoDomain showReview(int rv_num){
		
		ReviewInfoDomain reviewInfo = null;
	//	reviewInfo = urDAO.selectReview(rv_num);
		
		return reviewInfo;
	}//showReview
	
	/**
	 * 제목 클릭한 리뷰 좋아요 눌렀는지 보여주기
	 */
	public boolean likeStatusService(LikeVO lVO) {
	
		String result="";
		boolean likeStatus = false;
		
		result = urDAO.selectLikeStatus(lVO);
		
		if(result != null && !result.isEmpty()) { //좋아요 레코드가 조회된다면
			likeStatus = true;
		}//end if
		
				
		return likeStatus;
	}//likeStatusService
	
	/**
	 * 제목 클릭한 리뷰 좋아요 갯수 보여주기
	 * @param rvNum(리뷰번호)
	 */
	public int countLikeService(int rvNum) {
		
		return 0;
	}//countLikeService
	
	/**
	 * 해당 리뷰 창에서 조회수 +1 증가
	 * @param rvNum(리뷰번호)
	 */
	public int hitsUp(int rvNum) {
		
		return 0;
	}//hitsUp
	
	/**
	 * 좋아요 누르기
	 * @param lVO
	 */
	public String likeOnService(LikeVO lVO) {
		
		boolean resultFlag=false;
		JSONObject jsonObj = new JSONObject();
		
		int cnt = urDAO.insertLike(lVO);
		
		if(cnt==1) {
		
			jsonObj.put("resultFlag", resultFlag);
			
		}//end if
		
		return jsonObj.toJSONString();
		
	}//likeOnService
	
	/**
	 * 좋아요 해제
	 * @param lVO
	 */
	public String likeOffService(LikeVO lVO) {
		
		boolean resultFlag=false;
		JSONObject jsonObj = new JSONObject();
		
		int cnt = urDAO.deleteLike(lVO);
		
		if(cnt==1) {
		
			jsonObj.put("resultFlag", resultFlag);
			
		}//end if
		
		return jsonObj.toJSONString();
		
	}//likeOffService
	
	/**
	 * 좋아요 갯수 갱신해서 보여주기
	 * @param rvNum
	 */
	public int likeCount (int rvNum) {
		int cnt=0;
		
		cnt = urDAO.selectCntLike(rvNum);
		
		return cnt;
	}//likeCount
	
	
	/**
	 * 내가 쓴 리뷰 검색(마이페이지)
	 * @param mrsVO
	 */
	public  List<MyReviewDomain> MyReviewService(MyReviewSearchVO mrsVO){
		List<MyReviewDomain> list = new ArrayList<MyReviewDomain>();
		
		return list;
	}//MyReviewService
	
}//LikeService
