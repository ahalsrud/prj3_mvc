package kr.co.sist.prj3.user.resmovie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.sist.prj3.user.resmovie.domain.ReserveMovieDomain;
import kr.co.sist.prj3.user.resmovie.service.ReserveMovieService;
import kr.co.sist.prj3.user.resmovie.vo.ReservationVO;

@Controller
@SessionAttributes("m_num")
public class ReservationController {
	
	@Autowired(required = false)
	private ReserveMovieService rms;
	
	@GetMapping("/movie_reserve.do")
	public String reservationMovie(Model model) {
		
		//영화 제목 받아오기
		
		model.addAttribute("titles",rms.showMovieTitle());
		
		
	return "movie_reservation/movie_reserve";
	}//reservationMovie
	
	@GetMapping("/movie_date.do")
	@ResponseBody
	public String movieDate(int m_num, Model model) {
		String jsonObj="";
		
		model.addAttribute("m_num", m_num);
		jsonObj=rms.showMovieDate(m_num);
		
		return jsonObj;
	}//movieDate
	
	@GetMapping("/movie_hour.do")
	@ResponseBody
	public String movieHour(Model model) {
		String jsonObj="";
		int m_num=(Integer)model.getAttribute("m_num");
		
		jsonObj=rms.showMovieTime(m_num);
		
		return jsonObj;
	}//movieHour
	
	@GetMapping("/seat_reserve.do")
	public String reservationSeat(Model model) {
		int m_num=0;
		
		
		return "movie_reservation/seat_reserve";
	}//reservationSeat
	
	@GetMapping("/reserve_success.do")
	public String reservationProcess(ReservationVO rVO, Model model) {
		return "movie_reservation/reserve_success";
	}//reservationProcess

}//class
