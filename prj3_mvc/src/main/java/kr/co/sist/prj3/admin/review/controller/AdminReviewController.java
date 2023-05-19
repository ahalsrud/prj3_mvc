package kr.co.sist.prj3.admin.review.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.sist.prj3.admin.review.service.AdminReviewService;
import kr.co.sist.prj3.admin.review.vo.ReviewSearchVO;

@Controller
public class AdminReviewController {

	@Autowired(required = false)
	private AdminReviewService arss;

	// ��� ���� ����Ʈ �����ֱ�
	@RequestMapping(value = "/review_manage.do", method = {RequestMethod.GET,RequestMethod.POST} )
	public String showReviewList(ReviewSearchVO rsVO, Model model) {
		
		String jsp = "";
		
		if(rsVO.getSearch_type() == null) {
			model.addAttribute("reviewList",arss.showReviewList(rsVO));
			System.out.println("review��Ʈ�ѷ� / ó�� �ҷ��� �� DAO���� �� �ް� �ٳ��");
			jsp = "/review/review_manage";
		} else {
			model.addAttribute("reviewList",arss.showReviewList(rsVO));
			System.out.println("review��Ʈ�ѷ� / �˻� ��� DAO���� �� �ް� �ٳ��");
			jsp = "/review/review_manage";
		}//else
		
		return jsp;
	}//showReviewList
	
	public String deleteReview(int rvNum){
		
		return "";
	}//deleteReview
	
	
	
	public String showReviewInfo(int rvNum, Model model) {
		
		return "";
	}//showReviewInfo

	public String showReviewComments(int rvNum, Model model) {
		
		return "";
	}//showReviewComments
	
}//class
