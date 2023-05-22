package kr.co.sist.prj3.user.review.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.sist.prj3.user.review.domain.MyReviewDomain;
import kr.co.sist.prj3.user.review.service.UserReviewService;
import kr.co.sist.prj3.user.review.vo.LikeVO;
import kr.co.sist.prj3.user.review.vo.MyReviewSearchVO;
import kr.co.sist.prj3.user.review.vo.ReviewModifyVO;
import kr.co.sist.prj3.user.review.vo.ReviewSearchVO;
import kr.co.sist.prj3.user.review.vo.WriteReviewVO;

@Controller
public class UserReviewController {
	
	@Autowired(required = false)
	private UserReviewService urService ;
	
	/**
	 * ����
	 * �ش� ��ȭ�� ���� ���� ����Ʈ �����ֱ� + �˻����
	 * 2023.05.20
	 * @author KT
	 */
	@RequestMapping(value = "/review_list.do", method = {RequestMethod.GET,RequestMethod.POST} )
	public String showSearchReviewList(ReviewSearchVO rsVO, Model model) {
		
		String url = "";
		model.addAttribute("reviewList", urService.showSearchReviewList(rsVO));
		url = "/review/review_list";
		
		return url;
	}//showMovieInfo
	
	/**
	 * ����
	 * ���� �ۼ��� ���� !����!
	 * 2023.05.22
	 * @author KT
	 */
	@GetMapping("/review_write_delete.do")
	public String review(int rv_num) {
		
		urService.reviewDelete(rv_num);
		
		return "redirect:/review_list.do";
	}//reviewFrm
	
	/**
	 * ����
	 * ���� �ۼ� �������� !�̵�! + !��ȸ!
	 * 2023.05.20
	 * @author KT
	 */
	@GetMapping("/review_write.do")
	public String reviewFrm(int m_num) {
		
		
		return "/review/review_write";
	}//reviewFrm 

	/**
	 * ����
	 * ���� �ۼ� �������� !�̵�! + !��ȸ!
	 * 2023.05.20
	 * @author KT
	 */
	@GetMapping("/review_write_modify.do")
	public String reviewFrm(int rv_num, Model model) {
		
		model.addAttribute("review", urService.reviewWriteShow(rv_num));
		
		return "/review/review_write_modify";
	}//reviewFrm
	
	/**
	 * ����
	 * ���� !����! ���������� !����!
	 * 2023.05.20
	 * @author KT
	 */
	@GetMapping("/review_write_modify_process.do")
	public String reviewProcess(ReviewModifyVO rmVO, Model model) {
		
		model.addAttribute("review", urService.reviewModify(rmVO));
		
		return "/review/review_write";
	}//reviewFrm
	
	/**
	 * ����
	 * ���� !���! ���������� !���! 
	 * 2023.05.20
	 * @author KT
	 */
	@PostMapping("/review_write_process.do")
	public String reviewProcess(WriteReviewVO wrVO,Model model) {
	
		urService.reviewProcess(wrVO);
		
		return "redirect:/review_list.do";
	}//reviewProcessA
	
	
	/**
	 * ����
	 * ���� Ŭ���� ��������,����,���,���ƿ�(+ī��Ʈ) �����ֱ�
	 * 2023.05.21
	 * @author KT,KM
	 */
	@GetMapping("/review_post.do")
	public String showReview(LikeVO lVO, Model model) {

		//��������
		model.addAttribute("reviewInfo",urService.showReview(lVO));
		
//		id(�𵨿��� ����)�� rvNum(�������� �Ѿ��) ����
//		lVO.setUser_id("user1");
		
		 
		//id�� ���ǿ��� ����+VO�� ���� 
		if(lVO.getUser_id()==null) {
			lVO.setUser_id("user5");						
		}//end if
		
		//////////////// �Թ� ////////////////
		boolean likeStatus=false;
		int likeCnt=0;
		
		//��۳��� ������
		
		
		//���ƿ� ���¿� ��
		likeStatus = urService.likeStatusService(lVO);
		likeCnt = urService.likeCount(lVO.getRv_num());
		
		//�𵨿� ���
		model.addAttribute("likeStatus", likeStatus);
		model.addAttribute("likeCnt", likeCnt);

		model.addAttribute("id", lVO.getUser_id());
		return "/review/review_post";
	}//end showReview

	
	
	
	
	/**
	 * ����
	 * �ش� ���� â���� ���ƿ� ������ +1, �����ϸ� -1
	 * 2023.05.22
	 * @author KM
	 */
	@ResponseBody
	@GetMapping("/likeClicked.do")
	public String likeUpDown( LikeVO lVO, boolean liked) {
		
		String jsonObj="";
		
		if (liked) { //���ƿ�(����) ���¿��ٸ�
			//����Ʈ
			jsonObj = urService.likeOffService(lVO);

		} else {
			//�μ�Ʈ
			jsonObj =urService.likeOnService(lVO);
			
		} // end else
		
		
		return jsonObj;
		
	}//likeUpDown

	
	
	
	/**
	 * ���� �� ���� �˻�(����������)
	 * 2023.05.22
	 * @author KM
	 */
	@GetMapping("/my_review.do")
	public String reviewSearchProcess( MyReviewSearchVO mrsVO, Model model,
										String user_id) {
		
		if(mrsVO.getSearch()==null && mrsVO.getSearch_type()==0) { //�˻���� �ɼ��� null�϶�
			mrsVO.setSearch("");
			mrsVO.setSearch_type(0);
		}//end if
		
		
		//VO�� ���̵� �����ؾ���
		if(mrsVO.getUser_id()==null) {
			mrsVO.setUser_id(user_id);
		}//end if
		
		List<MyReviewDomain> list = urService.myReviewService(mrsVO);
		
		
		model.addAttribute("myReviews", list) ;
		model.addAttribute("myReviewCnt", list.size()) ;
		
		
		// ������ ���� ������ �Ѱ������ - LoginResultDomain�� ���ǿ� ����� ��
		
		
		return "/review/my_review";
	}// my_review_borad.jsp
	
///////////////////////////////////////////////////////////////////
	
	
	// �ش� ���� â���� ��ȸ�� +1�� ����
		public String hitsUpProcess(int rvNum) {
			return "";
		}
	
}//class
