package kr.co.sist.prj3.user.resmovie.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.user.resmovie.dao.ReserveMovieDAO;
import kr.co.sist.prj3.user.resmovie.domain.ReserveMovieDomain;
import kr.co.sist.prj3.user.resmovie.vo.ReservationVO;

@Component
public class ReserveMovieService {
	
	@Autowired(required = false)
	private ReserveMovieDAO rmDAO;
	
	public List<ReserveMovieDomain> showMovieTitle() {
		List<ReserveMovieDomain> list = new ArrayList<ReserveMovieDomain>();
		
		list=rmDAO.selectRes();
		
		return list;
	}//showMovieTitle
	
	
	public String showMovieDate(int m_num) {
		ReserveMovieDomain rmDomain=null;
		
		JSONObject jsonObj=new JSONObject();
		rmDomain= rmDAO.selectInfo(m_num);
		
		Calendar cal=new GregorianCalendar();
	      int year=cal.get(Calendar.YEAR);
	      int month=cal.get(Calendar.MONTH)+1;
	      int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);
	      String day="";
	      switch(dayOfWeek) {
	         case 1 : day="��";break;
	         case 2 : day="��";break;
	         case 3 : day="ȭ";break;
	         case 4 : day="��";break;
	         case 5 : day="��";break;
	         case 6 : day="��";break;
	         default : day="��";break;
	      }//end switch
		
		
		String start=rmDomain.getOpen_date().substring(rmDomain.getOpen_date().lastIndexOf("-") + 1);
		String end=rmDomain.getEnd_date().substring(rmDomain.getEnd_date().lastIndexOf("-") + 1);
		
		jsonObj.put("open_date", start);
		jsonObj.put("end_date", end);
		jsonObj.put("year", year);
		jsonObj.put("month", month);
		jsonObj.put("day", day);
		
		
		return jsonObj.toJSONString();
	}//showMovieDate
	
	
	 public String showMovieTime(int m_num) { ReserveMovieDomain rmDomain=null;
	 String[] hours=null;
	 
	 JSONObject jsonObj=new JSONObject();
	 JSONArray jsonArray=new JSONArray();
	 rmDomain=rmDAO.selectHour(m_num);
	 
	 //�� �ð��� �����϶�
	 if(rmDomain.getRelease_hour().contains(",")) {
	 JSONObject jsonTemp=new JSONObject();
	 hours=rmDomain.getRelease_hour().split(",");
	 
	 for(int i=0; i<hours.length; i++) {
		 
		 jsonTemp.put("hours", hours[i]);
		 jsonArray.add(jsonTemp);
		 
	 }//end for
	 
	 jsonObj.put("jsonHours", jsonArray);	 
	 }//end if
	 
	 jsonObj.put("hours", rmDomain.getRelease_date());
	 
	 
	 return jsonObj.toJSONString();
	 }//showMovieTime
	 	
	public void reservationService(ReservationVO rVO) {
		
	}//reservationService
	

}//class
