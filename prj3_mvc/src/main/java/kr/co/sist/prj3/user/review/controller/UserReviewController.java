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
	 * 유저
	 * 해당 영화에 대한 리뷰 리스트 보여주기 + 검색기능
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
	 * 유저
	 * 내가 작성한 리뷰 !삭제!
	 * 2023.05.22
	 * @author KT
	 */
	@GetMapping("/review_write_delete.do")
	public String review(int rv_num) {
		
		urService.reviewDelete(rv_num);
		
		return "redirect:/review_list.do";
	}//reviewFrm
	
	/**
	 * 유저
	 * 리뷰 작성 페이지로 !이동! + !조회!
	 * 2023.05.20
	 * @author KT
	 */
	@GetMapping("/review_write.do")
	public String reviewFrm(int m_num) {
		
		
		return "/review/review_write";
	}//reviewFrm 

	/**
	 * 유저
	 * 리뷰 작성 페이지로 !이동! + !조회!
	 * 2023.05.20
	 * @author KT
	 */
	@GetMapping("/review_write_modify.do")
	public String reviewFrm(int rv_num, Model model) {
		
		model.addAttribute("review", urService.reviewWriteShow(rv_num));
		
		return "/review/review_write_modify";
	}//reviewFrm
	
	/**
	 * 유저
	 * 리뷰 !수정! 페이지에서 !수정!
	 * 2023.05.20
	 * @author KT
	 */
	@GetMapping("/review_write_modify_process.do")
	public String reviewProcess(ReviewModifyVO rmVO, Model model) {
		
		model.addAttribute("review", urService.reviewModify(rmVO));
		
		return "/review/review_write";
	}//reviewFrm
	
	/**
	 * 유저
	 * 리뷰 !등록! 페이지에서 !등록! 
	 * 2023.05.20
	 * @author KT
	 */
	@PostMapping("/review_write_process.do")
	public String reviewProcess(WriteReviewVO wrVO,Model model) {
	
		urService.reviewProcess(wrVO);
		
		return "redirect:/review_list.do";
	}//reviewProcessA
	
	
	/**
	 * 유저
	 * 제목 클릭한 리뷰정보,리뷰,댓글,좋아요(+카운트) 보여주기
	 * 2023.05.21
	 * @author KT,KM
	 */
	@GetMapping("/review_post.do")
	public String showReview(LikeVO lVO, Model model) {

		//리뷰정보
		model.addAttribute("reviewInfo",urService.showReview(lVO));
		
//		id(모델에서 꺼냄)와 rvNum(쿼리에서 넘어옴) 세팅
//		lVO.setUser_id("user1");
		
		 
		//id는 세션에서 꺼냄+VO에 세팅 
		if(lVO.getUser_id()==null) {
			lVO.setUser_id("user5");						
		}//end if
		
		//////////////// 규미 ////////////////
		boolean likeStatus=false;
		int likeCnt=0;
		
		//댓글내용 도메인
		
		
		//좋아요 상태와 수
		likeStatus = urService.likeStatusService(lVO);
		likeCnt = urService.likeCount(lVO.getRv_num());
		
		//모델에 담기
		model.addAttribute("likeStatus", likeStatus);
		model.addAttribute("likeCnt", likeCnt);

		model.addAttribute("id", lVO.getUser_id());
		return "/review/review_post";
	}//end showReview

	
	
	
	
	/**
	 * 유저
	 * 해당 리뷰 창에서 좋아요 누르면 +1, 해제하면 -1
	 * 2023.05.22
	 * @author KM
	 */
	@ResponseBody
	@GetMapping("/likeClicked.do")
	public String likeUpDown( LikeVO lVO, boolean liked) {
		
		String jsonObj="";
		
		if (liked) { //좋아요(눌린) 상태였다면
			//딜리트
			jsonObj = urService.likeOffService(lVO);

		} else {
			//인서트
			jsonObj =urService.likeOnService(lVO);
			
		} // end else
		
		
		return jsonObj;
		
	}//likeUpDown

	
	
	
	/**
	 * 내가 쓴 리뷰 검색(마이페이지)
	 * 2023.05.22
	 * @author KM
	 */
	@GetMapping("/my_review.do")
	public String reviewSearchProcess( MyReviewSearchVO mrsVO, Model model,
										String user_id) {
		
		if(mrsVO.getSearch()==null && mrsVO.getSearch_type()==0) { //검색어와 옵션이 null일때
			mrsVO.setSearch("");
			mrsVO.setSearch_type(0);
		}//end if
		
		
		//VO에 아이디 세팅해야함
		if(mrsVO.getUser_id()==null) {
			mrsVO.setUser_id(user_id);
		}//end if
		
		List<MyReviewDomain> list = urService.myReviewService(mrsVO);
		
		
		model.addAttribute("myReviews", list) ;
		model.addAttribute("myReviewCnt", list.size()) ;
		
		
		// 유저에 대한 정보도 넘겨줘야함 - LoginResultDomain이 세션에 저장될 것
		
		
		return "/review/my_review";
	}// my_review_borad.jsp
	
///////////////////////////////////////////////////////////////////
	
	
	// 해당 리뷰 창에서 조회수 +1씩 증가
		public String hitsUpProcess(int rvNum) {
			return "";
		}
	
}//class
