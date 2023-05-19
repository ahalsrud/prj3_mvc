package kr.co.sist.prj3.admin.admin_movie.domain;

public class MovieGradeDomain {

	private String m_title, user_id, comment, input_date;
	private int grade, m_num;
	
	public MovieGradeDomain() {
	}

	public MovieGradeDomain(String m_title, String user_id, String comment, String input_date, int grade, int m_num) {
		super();
		this.m_title = m_title;
		this.user_id = user_id;
		this.comment = comment;
		this.input_date = input_date;
		this.grade = grade;
		this.m_num = m_num;
	}

	public String getM_title() {
		return m_title;
	}

	public void setM_title(String m_title) {
		this.m_title = m_title;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getInput_date() {
		return input_date;
	}

	public void setInput_date(String input_date) {
		this.input_date = input_date;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getM_num() {
		return m_num;
	}

	public void setM_num(int m_num) {
		this.m_num = m_num;
	}

	@Override
	public String toString() {
		return "MovieGradeDomain [m_title=" + m_title + ", user_id=" + user_id + ", comment=" + comment
				+ ", input_date=" + input_date + ", grade=" + grade + ", m_num=" + m_num + "]";
	}

}
