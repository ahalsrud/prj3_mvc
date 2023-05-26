package kr.co.sist.prj3.user.comment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.user.comment.dao.CommentDAO;
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
@Component
public class CommentService {

	@Autowired(required = false)
	private CommentDAO commDAO;

	/**
	 * 댓글 등록 - ajax
	 * @param cmVO
	 */
	public boolean addCommentService( CommVO cmVO ) {
		
		boolean success=false;
		success = commDAO.insertComment(cmVO)==1;
		return success;
		
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
	public boolean addReplyService( ReplyVO rpVO ) {
		
		boolean success=false;
		success = commDAO.insertReply(rpVO)==1;
		return success;
		
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
	public List<CommWithRepliesDomain> getCommentsService ( int rv_num ) {
		
		List<CommWithRepliesDomain> cwrList = null;
		List<CommentDomain> commList = null;
		List<ReplyDomain> replyList = null;
		
		//댓글
		commList = commDAO.selectComments(rv_num);
		//대댓글
		replyList = null;
		
		
		
		//대댓글이 담긴 댓글로 잘 처리해준다
		
		
		
		
		return cwrList;
		
	}//getCommentsService

	

	
}//class
