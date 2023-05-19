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
 * ���� ���� Service
 * @author kt
 */
@Controller
public class UserReviewService {
	
	@Autowired
	private UserReviewDAO urDAO ; 
	
	
	/**
	 * �ش翵ȭ ���� �ҷ�����
	 * @param mNum(��ȭ��ȣ)
	 */
	public MovieInfoDomain showMovieInfo(int mNum) {
		
		
		return null;
	}//showMovieInfo
	
	/**
	 * �ش翵ȭ�� ���� ���� ����Ʈ �����ֱ�
	 * @param mNum(��ȭ��ȣ)
	 */
	public List<ReviewBoardDomain> showReviewList(int mNum){
		List<ReviewBoardDomain> list = new ArrayList<ReviewBoardDomain>();
		
		return list;
	}//showReviewList
	
	/**
	 * ���� ����Ʈ �˻�
	 * @param rsVO
	 */
	public List<ReviewBoardDomain> showSearchReviewList(ReviewSearchVO rsVO){
		List<ReviewBoardDomain> list = new ArrayList<ReviewBoardDomain>();
		
		return list;
	}//showSearchReviewList
	
	/**
	 * ���� �ۼ��ϱ�
	 * @param wrVO
	 */
	public void reviewProcess(WriteReviewVO wrVO) {
		
	}//reviewProcess
	
	/**
	 * ���� Ŭ���� ���� �����ֱ�
	 * @param rvNum(�����ȣ)
	 */
	public ReviewInfoDomain showReview(int rv_num){
		
		ReviewInfoDomain reviewInfo = null;
	//	reviewInfo = urDAO.selectReview(rv_num);
		
		return reviewInfo;
	}//showReview
	
	/**
	 * ���� Ŭ���� ���� ���ƿ� �������� �����ֱ�
	 */
	public boolean likeStatusService(LikeVO lVO) {
	
		String result="";
		boolean likeStatus = false;
		
		result = urDAO.selectLikeStatus(lVO);
		
		if(result != null && !result.isEmpty()) { //���ƿ� ���ڵ尡 ��ȸ�ȴٸ�
			likeStatus = true;
		}//end if
		
				
		return likeStatus;
	}//likeStatusService
	
	/**
	 * ���� Ŭ���� ���� ���ƿ� ���� �����ֱ�
	 * @param rvNum(�����ȣ)
	 */
	public int countLikeService(int rvNum) {
		
		return 0;
	}//countLikeService
	
	/**
	 * �ش� ���� â���� ��ȸ�� +1 ����
	 * @param rvNum(�����ȣ)
	 */
	public int hitsUp(int rvNum) {
		
		return 0;
	}//hitsUp
	
	/**
	 * ���ƿ� ������
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
	 * ���ƿ� ����
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
	 * ���ƿ� ���� �����ؼ� �����ֱ�
	 * @param rvNum
	 */
	public int likeCount (int rvNum) {
		int cnt=0;
		
		cnt = urDAO.selectCntLike(rvNum);
		
		return cnt;
	}//likeCount
	
	
	/**
	 * ���� �� ���� �˻�(����������)
	 * @param mrsVO
	 */
	public  List<MyReviewDomain> MyReviewService(MyReviewSearchVO mrsVO){
		List<MyReviewDomain> list = new ArrayList<MyReviewDomain>();
		
		return list;
	}//MyReviewService
	
}//LikeService
