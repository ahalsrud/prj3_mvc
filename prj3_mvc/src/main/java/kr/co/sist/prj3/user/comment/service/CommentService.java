package kr.co.sist.prj3.user.comment.service;

import java.util.List;

import kr.co.sist.prj3.user.comment.domain.CommWithRepliesDomain;
import kr.co.sist.prj3.user.comment.domain.CommentDomain;
import kr.co.sist.prj3.user.comment.domain.ReplyDomain;
import kr.co.sist.prj3.user.comment.vo.CommVO;
import kr.co.sist.prj3.user.comment.vo.ReplyVO;

/**
 * 댓글 서비스
 * @author user
 *
 */
public class CommentService {

	

	/**
	 * 댓글 등록 - ajax
	 * @param cmVO
	 */
	public void addCommentService( CommVO cmVO ) {
		
	}//insertComment


	/**
	 * 대댓글이 없는 댓글은 삭제
	 * @param comNum
	 * @return
	 */
	public int removeCommentService ( int comNum ) {
		
		int result = 0;
		return result;
		
		
	}//deleteComment
	
	
	/**
	 * 대댓글이 있는 경우는 내용을 업데이트
	 * @param comNum
	 * @return
	 */
	public int updateCommentService  (int comNum ) {
		
		int result = 0;
		return result;
		
		
	}//deleteComment

	
	
	/**
	 * 대댓글 등록
	 * @param rpVO
	 */
	public void addReplyService( ReplyVO rpVO ) {
		
		
	}//insertReply

	
	/**
	 * 대댓글 삭제
	 * @param replyNum
	 * @return
	 */
	public int removeReplyService( int replyNum ) {
		
		int result = 0;
		return result;
		
	}//deleteReplyService


	
	/**
	 * 댓글 리스트 셀렉
	 * @param rvNum
	 * @return
	 */
	public List<CommWithRepliesDomain> getCommentsService ( int rvNum ) {
		
		List<CommWithRepliesDomain> list = null;
		return list;
		
	}//getCommentsService
	
	


	
}//class
