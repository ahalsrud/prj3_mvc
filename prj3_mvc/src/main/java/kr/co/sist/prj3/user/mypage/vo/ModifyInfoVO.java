package kr.co.sist.prj3.user.mypage.vo;

public class ModifyInfoVO {
	
	private int zipcode;
	private String nick_name,email,tel,addr,detail_addr,birth_date;
	
	
	public ModifyInfoVO() {
	}


	public ModifyInfoVO(int zipcode, String nick_name, String email, String tel, String addr, String detail_addr,
			String birth_date) {
		super();
		this.zipcode = zipcode;
		this.nick_name = nick_name;
		this.email = email;
		this.tel = tel;
		this.addr = addr;
		this.detail_addr = detail_addr;
		this.birth_date = birth_date;
	}


	public int getZipcode() {
		return zipcode;
	}


	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}


	public String getNick_name() {
		return nick_name;
	}


	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getDetail_addr() {
		return detail_addr;
	}


	public void setDetail_addr(String detail_addr) {
		this.detail_addr = detail_addr;
	}


	public String getBirth_date() {
		return birth_date;
	}


	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}


	@Override
	public String toString() {
		return "ModifyInfoVO [zipcode=" + zipcode + ", nick_name=" + nick_name + ", email=" + email + ", tel=" + tel
				+ ", addr=" + addr + ", detail_addr=" + detail_addr + ", birth_date=" + birth_date + "]";
	}
	

	
	
}//class
