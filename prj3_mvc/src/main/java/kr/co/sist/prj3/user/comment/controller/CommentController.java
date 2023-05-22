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
 * ��� ��Ʈ�ѷ�
 * @author user
 *
 */
@Controller
public class CommentController {

	@Autowired(required = false)
	private CommentService commService;

	/**
	 * �α��� ������ �� �α����� �����ֱ�
	 * @return
	 */
	public String loginFrm(  ) {
		return "login_frm";
		
	}//loginFrm

	
	/**
	 * ��� ��� - ajax
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
	 * ��� ����(Ȥ�� ����)
	 * @param comNum ��۹�ȣ
	 * @return
	 */
	public String removeCommentProcess( int comNum )  {
		

		return "review"; //���� �� ��������

	}//removeCommentProcess
	


	
	/**
	 * ���� ��� - ajax
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
	 * ���� ����
	 * @param replyNum
	 * @return
	 */
	public String removeReplyProcess( int replyNum ) {
		

		return "review";

	}//removeReplyProcess
	
	
	
	

	/**
	 * ��۰� ���� �����ֱ�
	 * @param rvNum
	 * @param model
	 * @return
	 */
	public String getCommentsProcess( int rvNum , Model model )  {

		return "review";

	}//getCommentsProcess




	
	
}//class
