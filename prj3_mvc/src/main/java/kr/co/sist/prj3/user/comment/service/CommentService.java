package kr.co.sist.prj3.user.comment.service;

import java.util.List;

import kr.co.sist.prj3.user.comment.domain.CommWithRepliesDomain;
import kr.co.sist.prj3.user.comment.domain.CommentDomain;
import kr.co.sist.prj3.user.comment.domain.ReplyDomain;
import kr.co.sist.prj3.user.comment.vo.CommVO;
import kr.co.sist.prj3.user.comment.vo.ReplyVO;

/**
 * ��� ����
 * @author user
 *
 */
public class CommentService {

	

	/**
	 * ��� ��� - ajax
	 * @param cmVO
	 */
	public void addCommentService( CommVO cmVO ) {
		
	}//insertComment


	/**
	 * ������ ���� ����� ����
	 * @param comNum
	 * @return
	 */
	public int removeCommentService ( int comNum ) {
		
		int result = 0;
		return result;
		
		
	}//deleteComment
	
	
	/**
	 * ������ �ִ� ���� ������ ������Ʈ
	 * @param comNum
	 * @return
	 */
	public int updateCommentService  (int comNum ) {
		
		int result = 0;
		return result;
		
		
	}//deleteComment

	
	
	/**
	 * ���� ���
	 * @param rpVO
	 */
	public void addReplyService( ReplyVO rpVO ) {
		
		
	}//insertReply

	
	/**
	 * ���� ����
	 * @param replyNum
	 * @return
	 */
	public int removeReplyService( int replyNum ) {
		
		int result = 0;
		return result;
		
	}//deleteReplyService


	
	/**
	 * ��� ����Ʈ ����
	 * @param rvNum
	 * @return
	 */
	public List<CommWithRepliesDomain> getCommentsService ( int rvNum ) {
		
		List<CommWithRepliesDomain> list = null;
		return list;
		
	}//getCommentsService
	
	


	
}//class
