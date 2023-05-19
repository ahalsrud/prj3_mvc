package kr.co.sist.prj3.user.total_info.vo;

public class LikeMovieVO {

	private int m_num;
	private String user_id;
	
	public LikeMovieVO() {
	}

	public LikeMovieVO(int m_num, String user_id) {
		this.m_num = m_num;
		this.user_id = user_id;
	}

	public int getM_num() {
		return m_num;
	}

	public void setM_num(int m_num) {
		this.m_num = m_num;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "LikeMovieVO [m_num=" + m_num + ", user_id=" + user_id + "]";
	}
	
	
}
