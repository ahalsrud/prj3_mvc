package kr.co.sist.prj3.user.review.vo;

import java.sql.Clob;

/**
 * 리뷰 수정
 * @author KT
 */
public class ReviewModifyVO {
	
	private String user_id; // 아이디
	private String title; // 제목
	private int rv_num; // 이력서번호
	private String content; // 내용
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getRv_num() {
		return rv_num;
	}
	public void setRv_num(int rv_num) {
		this.rv_num = rv_num;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "ReviewModifyVO [user_id=" + user_id + ", title=" + title + ", rv_num=" + rv_num + ", content=" + content
				+ "]";
	}

	
	
	
}//ReviewModifyVO
