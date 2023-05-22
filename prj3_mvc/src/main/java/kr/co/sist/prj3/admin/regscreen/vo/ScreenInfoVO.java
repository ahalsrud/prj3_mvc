package kr.co.sist.prj3.admin.regscreen.vo;

/**
 * 상영정보등록 VO
 * @author user
 */
public class ScreenInfoVO {
	
	private int m_num; 
	private String theater, release_hour, open_date, end_date;
	
	
	public ScreenInfoVO() {
	}


	public ScreenInfoVO(int m_num, String theater, String release_hour, String open_date, String end_date) {
		super();
		this.m_num = m_num;
		this.theater = theater;
		this.release_hour = release_hour;
		this.open_date = open_date;
		this.end_date = end_date;
	}


	public int getM_num() {
		return m_num;
	}


	public void setM_num(int m_num) {
		this.m_num = m_num;
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


	public String getOpen_date() {
		return open_date;
	}


	public void setOpen_date(String open_date) {
		this.open_date = open_date;
	}


	public String getEnd_date() {
		return end_date;
	}


	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}


	@Override
	public String toString() {
		return "ScreenInfoVO [m_num=" + m_num + ", theater=" + theater + ", release_hour=" + release_hour
				+ ", open_date=" + open_date + ", end_date=" + end_date + "]";
	}
	
	


	
	

}//class
