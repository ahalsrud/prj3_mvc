package kr.co.sist.prj3.user.comment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.user.comment.dao.CommentDAO;
import kr.co.sist.prj3.user.comment.domain.AllDomain;
import kr.co.sist.prj3.user.comment.domain.CommWithRepliesDomain;
import kr.co.sist.prj3.user.comment.domain.CommentDomain;
import kr.co.sist.prj3.user.comment.domain.ReplyDomain;
import kr.co.sist.prj3.user.comment.vo.CommVO;
import kr.co.sist.prj3.user.comment.vo.ReplyVO;

/**
 * ¥Ò±€ º≠∫ÒΩ∫
 * @author user
 *
 */
@Component
public class CommentService {

	@Autowired(required = false)
	private CommentDAO commDAO;

	public List<AllDomain> getCommList(int rv_num){
		List<AllDomain> list = null;
		
		list = commDAO.selectComment(rv_num);
		
		return list;
		
	}//getCommList

	public List<AllDomain> getReplyList(int rv_num){
		List<AllDomain> list = null;
		
		list = commDAO.selectReply(rv_num);
		
		return list;
		
	}//getReplyList
	
	/**
	 * ¥Ò±€ µÓ∑œ - ajax
	 * @param cmVO
	 */
	public boolean addCommentService( CommVO cmVO ) {
		
		boolean success=false;
		success = commDAO.insertComment(cmVO)==1;
		return success;
		
	}//insertComment

	/**
	 * ¥Î¥Ò±€ µÓ∑œ
	 * @param rpVO
	 */
	public boolean addReplyService( ReplyVO rpVO ) {
		
		boolean success=false;
		success = commDAO.insertReply(rpVO)==1;
		return success;
		
	}//insertReply

	/**
	 * ¥Î¥Ò±€¿Ã æ¯¥¬ ¥Ò±€¿∫ ªË¡¶
	 * @param comNum
	 * @return
	 */
	public int removeCommentService ( int comNum ) {
		
		int result = 0;
		return result;
		
	}//deleteComment
	
	
	/**
	 * ¥Ò±€ æ˜µ•¿Ã∆Æ
	 */
	public boolean updateCommentService  (int com_num ) {
		
		boolean success=false;
		success = commDAO.updateComment(com_num)==1;
		return success;
		
	}//deleteComment

	/**
	 * ¥Î¥Ò±€ æ˜µ•¿Ã∆Æ
	 */
	public boolean updateReplyService  (int rp_num ) {
		
		boolean success=false;
		success = commDAO.updateReply(rp_num)==1;
		return success;
		
	}//deleteComment

	
	

	
	/**
	 * ¥Î¥Ò±€ ªË¡¶
	 * @param replyNum
	 * @return
	 */
	public int removeReplyService( int replyNum ) {
		
		int result = 0;
		return result;
		
	}//deleteReplyService


	
	/**
	 * ¥Ò±€ ∏ÆΩ∫∆Æ ºø∑∫
	 * @param rvNum
	 * @return
	 */
	public List<CommWithRepliesDomain> getCommentsService ( int rv_num ) {
		
		List<CommWithRepliesDomain> cwrList = null;
		List<CommentDomain> commList = null;
		List<ReplyDomain> replyList = null;
		
		//¥Ò±€
		commList = commDAO.selectComments(rv_num);
		//¥Î¥Ò±€
		replyList = null;
		
		
		
		//¥Î¥Ò±€¿Ã ¥„±‰ ¥Ò±€∑Œ ¿ﬂ √≥∏Æ«ÿ¡ÿ¥Ÿ
		
		
		
		
		return cwrList;
		
	}//getCommentsService

	

	
}//class
