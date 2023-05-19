package kr.co.sist.prj3.user.resmovie.vo;

public class ReservationVO {
	
	private String releas_hour;
	private int s_num, h_num, v_num, r_num, m_num, watch_date, people;
	public ReservationVO() {
		super();
	}
	public ReservationVO(String releas_hour, int s_num, int h_num, int v_num, int r_num, int m_num, int watch_date,
			int people) {
		super();
		this.releas_hour = releas_hour;
		this.s_num = s_num;
		this.h_num = h_num;
		this.v_num = v_num;
		this.r_num = r_num;
		this.m_num = m_num;
		this.watch_date = watch_date;
		this.people = people;
	}
	public String getReleas_hour() {
		return releas_hour;
	}
	public void setReleas_hour(String releas_hour) {
		this.releas_hour = releas_hour;
	}
	public int getS_num() {
		return s_num;
	}
	public void setS_num(int s_num) {
		this.s_num = s_num;
	}
	public int getH_num() {
		return h_num;
	}
	public void setH_num(int h_num) {
		this.h_num = h_num;
	}
	public int getV_num() {
		return v_num;
	}
	public void setV_num(int v_num) {
		this.v_num = v_num;
	}
	public int getR_num() {
		return r_num;
	}
	public void setR_num(int r_num) {
		this.r_num = r_num;
	}
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public int getWatch_date() {
		return watch_date;
	}
	public void setWatch_date(int watch_date) {
		this.watch_date = watch_date;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	@Override
	public String toString() {
		return "ReservationVO [releas_hour=" + releas_hour + ", s_num=" + s_num + ", h_num=" + h_num + ", v_num="
				+ v_num + ", r_num=" + r_num + ", m_num=" + m_num + ", watch_date=" + watch_date + ", people=" + people
				+ "]";
	}
	
	
	
	

}
