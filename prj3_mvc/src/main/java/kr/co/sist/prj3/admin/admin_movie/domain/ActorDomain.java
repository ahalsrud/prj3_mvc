package kr.co.sist.prj3.admin.admin_movie.domain;

public class ActorDomain {

	private String a_name, a_eng, a_img, role;
	private int m_num;

	public ActorDomain() {
	}

	public ActorDomain(String a_name, String a_eng, String a_img, String role, int m_num) {
		this.a_name = a_name;
		this.a_eng = a_eng;
		this.a_img = a_img;
		this.role = role;
		this.m_num = m_num;
	}

	public String getA_name() {
		return a_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

	public String getA_eng() {
		return a_eng;
	}

	public void setA_eng(String a_eng) {
		this.a_eng = a_eng;
	}

	public String getA_img() {
		return a_img;
	}

	public void setA_img(String a_img) {
		this.a_img = a_img;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getM_num() {
		return m_num;
	}

	public void setM_num(int m_num) {
		this.m_num = m_num;
	}

	@Override
	public String toString() {
		return "ActorDomain [a_name=" + a_name + ", a_eng=" + a_eng + ", a_img=" + a_img + ", role=" + role + ", m_num="
				+ m_num + "]";
	}

}
