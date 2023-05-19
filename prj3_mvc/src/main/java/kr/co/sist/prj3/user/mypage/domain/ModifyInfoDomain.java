package kr.co.sist.prj3.user.mypage.domain;

public class ModifyInfoDomain {
	
	private int zipcode;
	private String id,name,nick_name,email,tel,addr,detail_addr,birth_date;
	
	
	public ModifyInfoDomain() {
	}


	public ModifyInfoDomain(int zipcode, String id, String name, String nick_name, String email, String tel,
			String addr, String detail_addr, String birth_date) {
		super();
		this.zipcode = zipcode;
		this.id = id;
		this.name = name;
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


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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
		return "ModifyInfoDomain [zipcode=" + zipcode + ", id=" + id + ", name=" + name + ", nick_name=" + nick_name
				+ ", email=" + email + ", tel=" + tel + ", addr=" + addr + ", detail_addr=" + detail_addr
				+ ", birth_date=" + birth_date + "]";
	}
	
	

}//class
