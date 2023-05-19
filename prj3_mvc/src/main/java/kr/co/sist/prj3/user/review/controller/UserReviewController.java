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
	
	// 제목 클릭한 리뷰,댓글,좋아요(+카운트) 보여주기
	@GetMapping("/review_post.do")
	public String showReview(LikeVO lVO, Model model) {
		
		//id(모델에서 꺼냄)와 rvNum(쿼리에서 넘어옴) 세팅
		//lVO.setId("user1");
		
		 System.out.println(lVO.getRv_num()+": 유저리뷰컨트롤러");
		 System.out.println(lVO.getUser_id());
		 

		
		boolean likeStatus=false;
		int likeCnt=0;
		ReviewInfoDomain reviewInfo=null;
		
		//리뷰내용 도메인
		reviewInfo = urService.showReview(lVO.getRv_num());
		
		
		//댓글내용 도메인
		
		
		
		
		//좋아요 상태와 수
		likeStatus = urService.likeStatusService(lVO);
		likeCnt = urService.likeCount(lVO.getRv_num());
		
		//모델에 담기
		model.addAttribute("reviewInfo", reviewInfo);
		model.addAttribute("likeStatus", likeStatus);
		model.addAttribute("likeCnt", likeCnt);
		
		return "/review/review_post";
	}

	// 해당 리뷰 창에서 조회수 +1씩 증가
	public String hitsUpProcess(int rvNum) {
		return "";
	}

	
	// 해당 리뷰 창에서 좋아요 누르면 +1, 해제하면 -1
	@ResponseBody
	@GetMapping("/likeClicked.do")
	public String likeUpDown( LikeVO lVO, boolean liked) {
		
		String jsonObj="";
		System.out.println("여기는 오니?");
		
		if (liked) { //좋아요(눌린) 상태였다면
			//딜리트
			jsonObj = urService.likeOffService(lVO);

		} else {
			//인서트
			jsonObj =urService.likeOnService(lVO);
			
		} // end else
		
		
		return jsonObj;
		
	}//likeUpDown

	
	// 내가 쓴 리뷰 검색(마이페이지)
	@GetMapping("/my_review.do")
	public String reviewSearchProcess( MyReviewSearchVO mrsVO, Model model) {
	
		
		
		
		
		return "/review/my_review";
	}// my_review_borad.jsp
}//class
