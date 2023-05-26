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
 * ��� ����
 * @author user
 *
 */
@Component
public class CommentService {

	@Autowired(required = false)
	private CommentDAO commDAO;

	/**
	 * ��� ��� - ajax
	 * @param cmVO
	 */
	public boolean addCommentService( CommVO cmVO ) {
		
		boolean success=false;
		success = commDAO.insertComment(cmVO)==1;
		return success;
		
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
	public boolean addReplyService( ReplyVO rpVO ) {
		
		boolean success=false;
		success = commDAO.insertReply(rpVO)==1;
		return success;
		
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
	public List<CommWithRepliesDomain> getCommentsService ( int rv_num ) {
		
		List<CommWithRepliesDomain> cwrList = null;
		List<CommentDomain> commList = null;
		List<ReplyDomain> replyList = null;
		
		//���
		commList = commDAO.selectComments(rv_num);
		//����
		replyList = null;
		
		
		
		//������ ��� ��۷� �� ó�����ش�
		
		
		
		
		return cwrList;
		
	}//getCommentsService

	

	
}//class
