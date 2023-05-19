package kr.co.sist.prj3.user.review.domain;

import java.sql.Clob;

/**
 * 해당 리뷰 정보
 * @author kt
 */
public class ReviewInfoDomain {

	private String title; //리뷰제목
	private String m_title; //영화제목
	private String nick_name; //닉네임
	private String profile; //프로필
	private String input_date; //작성일
	private String profile_msg; //자기소개

	private int hits; //조회수
	private int like_total; //총 좋아요
	private int com_total; //총 댓글수
	
	private Clob content; //내용
	
}//class
