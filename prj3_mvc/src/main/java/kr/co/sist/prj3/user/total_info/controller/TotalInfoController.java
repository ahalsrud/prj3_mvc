package kr.co.sist.prj3.user.total_info.controller;

import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.sist.prj3.user.review.vo.LikeVO;
import kr.co.sist.prj3.user.total_info.service.TotalInfoService;
import kr.co.sist.prj3.user.total_info.vo.LikeMovieVO;

@Controller
public class TotalInfoController {

	@Autowired(required = false)
	private TotalInfoService tis;

	@GetMapping("/main_info.do")
	public String infoFrm(LikeMovieVO lmVO, Model model) throws PersistenceException {
	    System.out.println("����κ�");
	    System.out.println(lmVO.getM_num());
		// ����κ�
	    model.addAttribute("movie", tis.searchCommInfo(lmVO));
	    
	    return "/total_info/main_info";
	}// infoFrm
	
	@ResponseBody
	@PostMapping("/add_like.do")
	public void addLike(LikeMovieVO lmVO, Model model) {
	    // ���ƿ� �߰� �۾� ����
		System.out.println(lmVO.getM_num());
        lmVO.setUser_id("user1");
        
        tis.addLikeMovie(lmVO);
	}
	
	@ResponseBody
	@PostMapping("/remove_like.do")
	public void removeLike(LikeMovieVO lmVO, int m_num, Model model) {
		System.out.println("delete");
		
		model.addAttribute("m_num", m_num);
		tis.removeLikeMovie(lmVO);
	}
}
