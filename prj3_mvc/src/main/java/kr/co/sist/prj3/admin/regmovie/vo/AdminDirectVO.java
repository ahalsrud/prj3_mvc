package kr.co.sist.prj3.admin.regmovie.vo;

import java.util.Arrays;

/**
 * ��ȭ��� ��������VO
 * @author user
 */
public class AdminDirectVO {
	
	private int d_num;
	private String[] d_name,d_eng,d_img;
	
	
	public AdminDirectVO() {
		super();
	}


	public AdminDirectVO(int d_num, String[] d_name, String[] d_eng, String[] d_img) {
		super();
		this.d_num = d_num;
		this.d_name = d_name;
		this.d_eng = d_eng;
		this.d_img = d_img;
	}


	public int getD_num() {
		return d_num;
	}


	public void setD_num(int d_num) {
		this.d_num = d_num;
	}


	public String[] getD_name() {
		return d_name;
	}


	public void setD_name(String[] d_name) {
		this.d_name = d_name;
	}


	public String[] getD_eng() {
		return d_eng;
	}


	public void setD_eng(String[] d_eng) {
		this.d_eng = d_eng;
	}


	public String[] getD_img() {
		return d_img;
	}


	public void setD_img(String[] d_img) {
		this.d_img = d_img;
	}


	@Override
	public String toString() {
		return "AdminDirectVO [d_num=" + d_num + ", d_name=" + Arrays.toString(d_name) + ", d_eng="
				+ Arrays.toString(d_eng) + ", d_img=" + Arrays.toString(d_img) + "]";
	}
	
	
	
	
	

}//class
