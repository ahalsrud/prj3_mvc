package kr.co.sist.prj3.user.resmovie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.sist.prj3.user.resmovie.vo.ReservationVO;

@Controller
public class ReservationController {
	
	@GetMapping("/movie_reserve.do")
	public String reservationMovie(Model model) {
		return "movie_reservation/movie_reserve";
	}//reservationMovie
	
	@GetMapping("/seat_reserve.do")
	public String reservationSeat(Model model) {
		return "movie_reservation/seat_reserve";
	}//reservationSeat
	
	@GetMapping("/reserve_success.do")
	public String reservationProcess(ReservationVO rVO, Model model) {
		return "movie_reservation/reserve_success";
	}//reservationProcess

}//class
