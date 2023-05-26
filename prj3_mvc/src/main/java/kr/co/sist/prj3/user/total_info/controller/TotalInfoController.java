package kr.co.sist.prj3.user.total_info.controller;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.sist.prj3.user.total_info.domain.ActorDomain;
import kr.co.sist.prj3.user.total_info.domain.DirectorDomain;
import kr.co.sist.prj3.user.total_info.service.TotalInfoService;
import kr.co.sist.prj3.user.total_info.vo.LikeMovieVO;

@Controller
public class TotalInfoController {

	@Autowired(required = false)
	private TotalInfoService tis;

	//���� ����
	@RequestMapping(value="/main_info.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String infoFrm(@RequestParam("m_num") int m_num, LikeMovieVO lmVO, Model model) throws PersistenceException {
		// ����κ�
	    model.addAttribute("movie", tis.searchCommInfo(lmVO));
	    
//	    // ���ƿ� ����
//	    boolean likeStatus = false;
//	    lmVO.setUser_id("user1");
//	    
//	    likeStatus = tis.movieLikeStatus(lmVO);
//	    model.addAttribute("likeStatus", likeStatus);
	    
		//�ٰŸ�
	    model.addAttribute("summary",tis.summaryInfo(m_num));
		//����
		model.addAttribute("director",tis.directorInfo(m_num));
		//���
		model.addAttribute("actor",tis.actorInfo(m_num));
	    
			return "/total_info/main_info";
		}//infoFrm
	
	@ResponseBody
	@PostMapping("/add_like.do")
	public void addLike(LikeMovieVO lmVO, Model model) {
	    // ���ƿ� �߰� �۾� ����
        lmVO.setUser_id("user1");
        
        tis.addLikeMovie(lmVO);
	}
	
	@ResponseBody
	@PostMapping("/remove_like.do")
	public void removeLike(LikeMovieVO lmVO, int m_num, Model model) {
		
		model.addAttribute("m_num", m_num);
		tis.removeLikeMovie(lmVO);
	}
	
//////////////////////////////////////�ֿ�����(ȭ����ȯ)//////////////////////////
	@ResponseBody
	@GetMapping("/detail_info.do")
	public String detailInfo(@RequestParam("m_num") int m_num, Model model) throws PersistenceException, SQLException {
	    
		
			JSONObject jsonObj = new JSONObject();
			
			/////�ٰŸ�
			String summary = tis.summaryInfo(m_num);
			jsonObj.put("summary", summary);
			
			//////����
	        List<DirectorDomain> directorList = tis.directorInfo(m_num);
	        JSONArray directorArray = new JSONArray();
	        
	        for (DirectorDomain director : directorList) {
	        	JSONObject directorObj = new JSONObject(); 
	            directorObj.put("d_img", director.getD_img());
	            directorObj.put("d_name", director.getD_name());
	            directorArray.add(directorObj);
	        	}//end for
	        
	        jsonObj.put("director", directorArray);
	            

	        //���
	        List<ActorDomain> actorList = tis.actorInfo(m_num);
	        JSONArray actorArray = new JSONArray();
	        
	        for (ActorDomain actor : actorList) {
	        	JSONObject actorObj = new JSONObject(); 
	        	actorObj.put("a_img", actor.getA_img());
	        	actorObj.put("a_name", actor.getA_name());
	        	actorArray.add(actorObj);
	        }//end for
	        
	        jsonObj.put("actor", actorArray);
	        
			return jsonObj.toJSONString(); 
			//���⼭ ���� ��� �ٰŸ� �� �����ؾ��ϴϱ� jsonObj.toString();�Ǿ����� ������??????
			//�׷��� ajax���� jsonObj.summary�� �ۼ��ص� Ű�� ���� �Ѵ� �ѷ����� ������ ����
			//�� ������ ���񽺿��� �̹� �ѹ� jsonObj.toString();���� Ű�� ���� ������ �����߶���!?!?!?! ��������!??!
			//���� �����غ���
		}//infoFrm	
	
	
////////////////////////////////////////// ����/�⿬��
	@ResponseBody
	@GetMapping("/produce_info.do")
	public String CrewFrm(int m_num, Model model) throws PersistenceException {
		
		//����
		model.addAttribute("director",tis.searchDirectorList(m_num));
		//�ֿ�
		model.addAttribute("actor",tis.searchActorList(m_num));
		//������/��ȭ��
		model.addAttribute("produce",tis.searchProduce(m_num));
		
		return "/total_info/main_info";
	}//CrewFrm
	
}//class
