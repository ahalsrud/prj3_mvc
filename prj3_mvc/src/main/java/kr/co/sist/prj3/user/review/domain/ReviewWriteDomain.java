package kr.co.sist.prj3.user.review.domain;

import java.sql.Clob;

public class ReviewWriteDomain {

	private String title;
	private Clob content;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Clob getContent() {
		return content;
	}
	public void setContent(Clob content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "ReviewWriteDomain [title=" + title + ", content=" + content + "]";
	}
	
}//class
