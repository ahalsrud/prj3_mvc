package kr.co.sist.prj3.user.comment.domain;

import java.util.List;

/**
 * 대댓글이 달린 댓글<br>
 * 뎃글번호, 프로필명,닉네임,댓글내용, 작성일, List<대댓글>
 * @author user
 *
 */
public class CommWithRepliesDomain {

	private int com_num;
	private String profile, nick_name, content, input_date;
	private List<ReplyDomain> replies ; 
	

	
}//class
