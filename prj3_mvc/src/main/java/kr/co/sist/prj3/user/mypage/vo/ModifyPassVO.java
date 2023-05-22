package kr.co.sist.prj3.user.mypage.vo;

public class ModifyPassVO {
	
	private String pass, newPass;

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNewPass() {
		return newPass;
	}

	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}

	@Override
	public String toString() {
		return "ModifyPassVO [pass=" + pass + ", newPass=" + newPass + "]";
	}
	
	

}//class
