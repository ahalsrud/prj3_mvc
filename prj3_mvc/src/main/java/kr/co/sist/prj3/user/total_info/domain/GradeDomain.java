package kr.co.sist.prj3.user.total_info.domain;

public class GradeDomain {

	public int m_num, m_grade;
	public String comments, nick_name, likes, input_date;
	
	public GradeDomain() {
		super();
	}

	public GradeDomain(int m_num, int m_grade, String comments, String nick_name, String likes, String input_date) {
		super();
		this.m_num = m_num;
		this.m_grade = m_grade;
		this.comments = comments;
		this.nick_name = nick_name;
		this.likes = likes;
		this.input_date = input_date;
	}

	public int getM_num() {
		return m_num;
	}

	public void setM_num(int m_num) {
		this.m_num = m_num;
	}

	public int getM_grade() {
		return m_grade;
	}

	public void setM_grade(int m_grade) {
		this.m_grade = m_grade;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getLikes() {
		return likes;
	}

	public void setLikes(String likes) {
		this.likes = likes;
	}

	public String getInput_date() {
		return input_date;
	}

	public void setInput_date(String input_date) {
		this.input_date = input_date;
	}

	@Override
	public String toString() {
		return "GradeDomain [m_num=" + m_num + ", m_grade=" + m_grade + ", comments=" + comments + ", nick_name="
				+ nick_name + ", likes=" + likes + ", input_date=" + input_date + "]";
	}
	
	
	
	
}
