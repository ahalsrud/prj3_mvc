package kr.co.sist.prj3.user.comment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.sist.prj3.user.comment.service.CommentService;
import kr.co.sist.prj3.user.comment.vo.CommVO;
import kr.co.sist.prj3.user.comment.vo.ReplyVO;

/**
 * 댓글 컨트롤러
 * @author user
 *
 */
@Controller
public class CommentController {

	@Autowired(required = false)
	private CommentService commService;

	/**
	 * 로그인 안했을 때 로그인폼 보여주기
	 * @return
	 */
	public String loginFrm(  ) {
		return "login_frm";
		
	}//loginFrm

	
	/**
	 * 댓글 등록 - ajax
	 * @return
	 */
	//@PostMapping("/add_comment.do")
	@RequestMapping(value="/add_comment.do" , method= {RequestMethod.POST,RequestMethod.GET})
	
	public String addCommentProcess( CommVO cVO )  {
		String resultPage="";
		
		if(commService.addCommentService(cVO)) {
			resultPage="forward:/review_post.do";
		}//end if
		
			
		return resultPage;
		
	}//addCommentProcess
	

	/**
	 * 댓글 삭제(혹은 수정)
	 * @param comNum 댓글번호
	 * @return
	 */
	public String removeCommentProcess( int comNum )  {
		

		return "review"; //리뷰 글 페이지로

	}//removeCommentProcess
	


	
	/**
	 * 대댓글 등록 - ajax
	 * @param rpVO
	 * @return
	 */
	@RequestMapping(value="/add_reply.do" , method= {RequestMethod.POST,RequestMethod.GET})
	public String addReplyProcess( ReplyVO rpVO )   {
		String resultPage="";
		
		if(commService.addReplyService(rpVO)) {
			resultPage="forward:/review_post.do";
		}//end if
		
		return resultPage;
	
	}//addReplyProcess

	
	
	
	/**
	 * 대댓글 삭제
	 * @param replyNum
	 * @return
	 */
	public String removeReplyProcess( int replyNum ) {
		

		return "review";

	}//removeReplyProcess
	
	
	
	

	/**
	 * 댓글과 대댓글 보여주기
	 * @param rvNum
	 * @param model
	 * @return
	 */
	public String getCommentsProcess( int rvNum , Model model )  {

		return "review";

	}//getCommentsProcess




	
	
}//class
