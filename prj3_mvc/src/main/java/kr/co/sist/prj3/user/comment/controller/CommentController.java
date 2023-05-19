package kr.co.sist.prj3.user.comment.controller;

import org.springframework.ui.Model;

import kr.co.sist.prj3.user.comment.vo.CommVO;
import kr.co.sist.prj3.user.comment.vo.ReplyVO;

/**
 * ��� ��Ʈ�ѷ�
 * @author user
 *
 */
public class CommentController {


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
	public String addCommentProcess( CommVO cVO )  {
		
		String result="";
		return result;
		
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
	public String addReplyProcess( ReplyVO rpVO )   {
		
		String result="";
		return result;
	
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
