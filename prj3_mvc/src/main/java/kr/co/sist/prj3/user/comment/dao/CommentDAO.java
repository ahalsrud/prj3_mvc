package kr.co.sist.prj3.user.comment.dao;

import java.util.List;

import kr.co.sist.prj3.user.comment.domain.CommentDomain;
import kr.co.sist.prj3.user.comment.domain.ReplyDomain;
import kr.co.sist.prj3.user.comment.vo.CommVO;
import kr.co.sist.prj3.user.comment.vo.ReplyVO;

public class CommentDAO {


	/**
	 * ��� ��� - ajax
	 * @param cmVO
	 */
	public void insertComment( CommVO cmVO ) {
		
	}//insertComment


	/**
	 * ������ ���� ����� ����
	 * @param comNum
	 * @return
	 */
	public int deleteComment ( int comNum ) {
		
		int result = 0;
		return result;
		
		
	}//deleteComment
	
	
	/**
	 * ������ �ִ� ���� ������ ������Ʈ
	 * @param comNum
	 * @return
	 */
	public int updateComment (int comNum ) {
		
		int result = 0;
		return result;
		
		
	}//deleteComment

	
	
	/**
	 * ���� ���
	 * @param rpVO
	 */
	public void insertReply( ReplyVO rpVO ) {
		
		
	}//insertReply

	
	/**
	 * ���� ����
	 * @param replyNum
	 * @return
	 */
	public int deleteReplyService( int replyNum ) {
		
		int result = 0;
		return result;
		
	}//deleteReplyService


	
	/**
	 * ��� ����Ʈ ����
	 * @param rvNum
	 * @return
	 */
	public List<CommentDomain> selectComments ( int rvNum ) {
		
		List<CommentDomain> list = null;
		return list;
		
	}//selectComments
	
	
	
	/**
	 * ���� ����Ʈ ����
	 * @param comNum
	 * @return
	 */
	public List<ReplyDomain> selectReplies (int comNum ) {
		
		List<ReplyDomain> list = null;
		return list;
		
		
		
	}//selectReplies



	
	
}//class
