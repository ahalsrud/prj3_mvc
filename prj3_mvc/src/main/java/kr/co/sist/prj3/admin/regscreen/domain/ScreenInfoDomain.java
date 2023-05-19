package kr.co.sist.prj3.admin.regscreen.domain;

/**
 * 상영정보등록 Domain
 * @author user
 */
public class ScreenInfoDomain {
	
	private int m_num;
	private String m_title, eng_title, rank, release_date;

	public ScreenInfoDomain() {
	}

	public ScreenInfoDomain(int m_num, String m_title, String eng_title, String rank, String release_date) {
		super();
		this.m_num = m_num;
		this.m_title = m_title;
		this.eng_title = eng_title;
		this.rank = rank;
		this.release_date = release_date;
	}

	public int getM_num() {
		return m_num;
	}

	public void setM_num(int m_num) {
		this.m_num = m_num;
	}

	public String getM_title() {
		return m_title;
	}

	public void setM_title(String m_title) {
		this.m_title = m_title;
	}

	public String getEng_title() {
		return eng_title;
	}

	public void setEng_title(String eng_title) {
		this.eng_title = eng_title;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	@Override
	public String toString() {
		return "ScreenInfoDomain [m_num=" + m_num + ", m_title=" + m_title + ", eng_title=" + eng_title + ", rank="
				+ rank + ", release_date=" + release_date + "]";
	}
	
	


	

}//class
