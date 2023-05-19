package kr.co.sist.prj3.admin.review.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.admin.review.dao.AdminReviewDAO;
import kr.co.sist.prj3.admin.review.domain.ReviewBoardDomain;
import kr.co.sist.prj3.admin.review.domain.ReviewInfoDomain;
import kr.co.sist.prj3.admin.review.vo.ReviewSearchVO;

@Component
public class AdminReviewService {

	@Autowired(required = false)
	private AdminReviewDAO arDAO;
	
	public List<ReviewBoardDomain> showReviewList(ReviewSearchVO rsVO){
		List<ReviewBoardDomain> list = new ArrayList<ReviewBoardDomain>();
		
		list = arDAO.selectReviewList(rsVO);
		
		return list;
	}//showReviewList
	
	
	public int deleteReview() {
		
		return 0;
	}//deleteReview

	public ReviewInfoDomain showReview(int rvNum) {
		
		return null;
	}//showReview
	
	/*public List<CommentsDomain> showReviewComments(int rvNum, Model model){
		
	}*/
	
}//class
