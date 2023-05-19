package kr.co.sist.prj3.user.resmovie.domain;

public class ReserveMovieDomain {
	
	private String m_title, theater, release_hour, release_date, end_date;

	public ReserveMovieDomain() {
		super();
	}

	public ReserveMovieDomain(String m_title, String theater, String release_hour, String release_date,
			String end_date) {
		super();
		this.m_title = m_title;
		this.theater = theater;
		this.release_hour = release_hour;
		this.release_date = release_date;
		this.end_date = end_date;
	}

	public String getM_title() {
		return m_title;
	}

	public void setM_title(String m_title) {
		this.m_title = m_title;
	}

	public String getTheater() {
		return theater;
	}

	public void setTheater(String theater) {
		this.theater = theater;
	}

	public String getRelease_hour() {
		return release_hour;
	}

	public void setRelease_hour(String release_hour) {
		this.release_hour = release_hour;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	@Override
	public String toString() {
		return "ReserveMovieDomain [m_title=" + m_title + ", theater=" + theater + ", release_hour=" + release_hour
				+ ", release_date=" + release_date + ", end_date=" + end_date + "]";
	}
	
	

	

}//class
