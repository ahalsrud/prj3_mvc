package kr.co.sist.prj3.user.mypage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.user.mypage.dao.MyPageDAO;
import kr.co.sist.prj3.user.mypage.domain.CanDetailDomain;
import kr.co.sist.prj3.user.mypage.domain.ProfileDomain;
import kr.co.sist.prj3.user.mypage.domain.ResDetailDomain;

@Component
public class MyPageService {
	
	@Autowired(required = false)
	private MyPageDAO mpd;
	
	public ProfileDomain showProfile(String id) {
		ProfileDomain pd=null;
		
		return pd;
	}//showProfile
	
	public List<ResDetailDomain> showResDetail(String id) {
		List<ResDetailDomain> list = new ArrayList<ResDetailDomain>();
		
		list=mpd.selectRes(id);
		
		return list;
	}//showResDetail
	
	public List<CanDetailDomain> showCanDetail(String id) {
		List<CanDetailDomain> list = new ArrayList<CanDetailDomain>();
		
		list=mpd.selectCan(id);
		
		return list;
	}//showResDetail
	
	public boolean cancelRes() {
		boolean flag=false;
		
		int result=mpd.updateRes();
		
		if(result>0) {
			flag=true;
		}//end if
		
		
		return flag;
	}//cancelRes
	
	public boolean cancelSeats() {
		boolean flag=false;
		
		int result=mpd.updateSeats();
		
		if(result>0) {
			flag=true;
		}//end if
		
		
		return flag;
	}//cancelSeats

}//class
