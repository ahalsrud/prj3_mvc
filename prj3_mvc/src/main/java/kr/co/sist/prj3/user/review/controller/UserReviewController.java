package kr.co.sist.prj3.user.review.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.sist.prj3.user.review.domain.ReviewInfoDomain;
import kr.co.sist.prj3.user.review.service.UserReviewService;
import kr.co.sist.prj3.user.review.vo.LikeVO;
import kr.co.sist.prj3.user.review.vo.MyReviewSearchVO;
import kr.co.sist.prj3.user.review.vo.ReviewSearchVO;
import kr.co.sist.prj3.user.review.vo.WriteReviewVO;

@Controller
public class UserReviewController {
	
	@Autowired
	private UserReviewService urService ;
	
	
	public String showMovieInfo(int mNum, Model model) {
		
		return "";
	}//showMovieInfo
	
	
	public String showReviewList(int mNum, Model model) {
		return "";
	}//showReviewList
	
	
	@GetMapping("/review_list.do")
	public String showSearchReviewList(ReviewSearchVO rsVO, Model model) {
		return "/review/review_list";
	}//showSearchReviewList
	
	
	@GetMapping("/review_write.do")
	public String reviewFrm(int mNum) {
		
		return "/review/review_write";
	}
	
	public String reviewProcess(WriteReviewVO wrVO,Model model) {
		
		return "";
	}
	
	// ���� Ŭ���� ����,���,���ƿ�(+ī��Ʈ) �����ֱ�
	@GetMapping("/review_post.do")
	public String showReview(LikeVO lVO, Model model) {
		
		//id(�𵨿��� ����)�� rvNum(�������� �Ѿ��) ����
		//lVO.setId("user1");
		
		 System.out.println(lVO.getRv_num()+": ����������Ʈ�ѷ�");
		 System.out.println(lVO.getUser_id());
		 

		
		boolean likeStatus=false;
		int likeCnt=0;
		ReviewInfoDomain reviewInfo=null;
		
		//���䳻�� ������
		reviewInfo = urService.showReview(lVO.getRv_num());
		
		
		//��۳��� ������
		
		
		
		
		//���ƿ� ���¿� ��
		likeStatus = urService.likeStatusService(lVO);
		likeCnt = urService.likeCount(lVO.getRv_num());
		
		//�𵨿� ���
		model.addAttribute("reviewInfo", reviewInfo);
		model.addAttribute("likeStatus", likeStatus);
		model.addAttribute("likeCnt", likeCnt);
		
		return "/review/review_post";
	}

	// �ش� ���� â���� ��ȸ�� +1�� ����
	public String hitsUpProcess(int rvNum) {
		return "";
	}

	
	// �ش� ���� â���� ���ƿ� ������ +1, �����ϸ� -1
	@ResponseBody
	@GetMapping("/likeClicked.do")
	public String likeUpDown( LikeVO lVO, boolean liked) {
		
		String jsonObj="";
		System.out.println("����� ����?");
		
		if (liked) { //���ƿ�(����) ���¿��ٸ�
			//����Ʈ
			jsonObj = urService.likeOffService(lVO);

		} else {
			//�μ�Ʈ
			jsonObj =urService.likeOnService(lVO);
			
		} // end else
		
		
		return jsonObj;
		
	}//likeUpDown

	
	// ���� �� ���� �˻�(����������)
	@GetMapping("/my_review.do")
	public String reviewSearchProcess( MyReviewSearchVO mrsVO, Model model) {
	
		
		
		
		
		return "/review/my_review";
	}// my_review_borad.jsp
}//class
