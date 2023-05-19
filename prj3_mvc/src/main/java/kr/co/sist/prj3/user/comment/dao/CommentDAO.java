package kr.co.sist.prj3.user.comment.dao;

import java.util.List;

import kr.co.sist.prj3.user.comment.domain.CommentDomain;
import kr.co.sist.prj3.user.comment.domain.ReplyDomain;
import kr.co.sist.prj3.user.comment.vo.CommVO;
import kr.co.sist.prj3.user.comment.vo.ReplyVO;

public class CommentDAO {


	/**
	 * 댓글 등록 - ajax
	 * @param cmVO
	 */
	public void insertComment( CommVO cmVO ) {
		
	}//insertComment


	/**
	 * 대댓글이 없는 댓글은 삭제
	 * @param comNum
	 * @return
	 */
	public int deleteComment ( int comNum ) {
		
		int result = 0;
		return result;
		
		
	}//deleteComment
	
	
	/**
	 * 대댓글이 있는 경우는 내용을 업데이트
	 * @param comNum
	 * @return
	 */
	public int updateComment (int comNum ) {
		
		int result = 0;
		return result;
		
		
	}//deleteComment

	
	
	/**
	 * 대댓글 등록
	 * @param rpVO
	 */
	public void insertReply( ReplyVO rpVO ) {
		
		
	}//insertReply

	
	/**
	 * 대댓글 삭제
	 * @param replyNum
	 * @return
	 */
	public int deleteReplyService( int replyNum ) {
		
		int result = 0;
		return result;
		
	}//deleteReplyService


	
	/**
	 * 댓글 리스트 셀렉
	 * @param rvNum
	 * @return
	 */
	public List<CommentDomain> selectComments ( int rvNum ) {
		
		List<CommentDomain> list = null;
		return list;
		
	}//selectComments
	
	
	
	/**
	 * 대댓글 리스트 셀렉
	 * @param comNum
	 * @return
	 */
	public List<ReplyDomain> selectReplies (int comNum ) {
		
		List<ReplyDomain> list = null;
		return list;
		
		
		
	}//selectReplies



	
	
}//class
