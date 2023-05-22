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
	private Clob content; // 내용
	
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
	public Clob getContent() {
		return content;
	}
	public void setContent(Clob content) {
		this.content = content;
	}
	public ReviewModifyVO(String user_id, String title, int rv_num, Clob content) {
		super();
		this.user_id = user_id;
		this.title = title;
		this.rv_num = rv_num;
		this.content = content;
	}
	
	
	
}//ReviewModifyVO
