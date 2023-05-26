package kr.co.sist.prj3.user.total_info.service;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.user.total_info.dao.TotalInfoDAO;
import kr.co.sist.prj3.user.total_info.domain.ActorDomain;
import kr.co.sist.prj3.user.total_info.domain.CommInfoDomain;
import kr.co.sist.prj3.user.total_info.domain.DirectorDomain;
import kr.co.sist.prj3.user.total_info.domain.GradeDomain;
import kr.co.sist.prj3.user.total_info.domain.ProduceDomain;
import kr.co.sist.prj3.user.total_info.vo.GradeVO;
import kr.co.sist.prj3.user.total_info.vo.LikeGradeVO;
import kr.co.sist.prj3.user.total_info.vo.LikeMovieVO;

@Component
public class TotalInfoService {

	@Autowired(required=false)
	private TotalInfoDAO tiDAO;
	
	public CommInfoDomain searchCommInfo(LikeMovieVO lmVO) {
		CommInfoDomain cid = tiDAO.selectcommInfo(lmVO);
		
		return cid;
	}// searchCommInfo
	
	// 좋아요 상태
	public boolean movieLikeStatus(LikeMovieVO lmVO) {
		
		String result="";
		boolean likeStatus = false;
		
	    result = tiDAO.selectLikeMovie(lmVO);

	    if(result != null && !result.isEmpty()) { //좋아요 레코드가 조회된다면
			likeStatus = true;
		}//end if
	    
	    return likeStatus;
	}// movieLikeStatus
			
	// 좋아요 추가
	public String addLikeMovie(LikeMovieVO lmVO) {
		boolean resultFlag=false;
		JSONObject jsonObj = new JSONObject();
		
	    int cnt = tiDAO.insertLikeMovie(lmVO);
	    
	    if(cnt==1) {
			jsonObj.put("resultFlag", resultFlag);
		}//end if
		
		return jsonObj.toJSONString();
	}
			
	// 좋아요 삭제
	public String removeLikeMovie(LikeMovieVO lmVO) {
		boolean resultFlag=false;
		JSONObject jsonObj = new JSONObject();
		
		int cnt = tiDAO.deleteLikeMovie(lmVO);
		
		if(cnt==1) {
			jsonObj.put("resultFlag", resultFlag);
		}//end if
		
		return jsonObj.toJSONString();
	}// removeLikeMove
	
	//서머리 조회
		public String summaryInfo(int m_num) {

			String summary="";
			summary = tiDAO.selectSummary(m_num);

			return summary;
			
		}// summaryInfo
		
		public List<DirectorDomain> directorInfo(int m_num) {
			List<DirectorDomain> list = new ArrayList<DirectorDomain>();
			
			return list;
		}// directorInfo
		
		public List<ActorDomain> actorInfo(int m_num) {
			List<ActorDomain> list = new ArrayList<ActorDomain>();
			
			return list;
		}// actorInfo
		
		// 출연/제작
		public List<DirectorDomain> searchDirectorList(int m_num) {
			List<DirectorDomain> list = new ArrayList<DirectorDomain>();
			
			return list;
		}// searchDirectorList
		
		public List<ActorDomain> searchActorList(int m_num) {
			List<ActorDomain> list = new ArrayList<ActorDomain>();
			
			return list;
		}// searchActorList
		
		public ProduceDomain searchProduce(int m_num) {
			ProduceDomain pd = new ProduceDomain();
			
			return pd;
		}// searchProduce
		
		// 평점
		public List<GradeDomain> searchGrade(int m_num) {
			List<GradeDomain> list = new ArrayList<GradeDomain>();
			
			return list;
		}// searchGrade
		
		public void addGrade(GradeVO gVO) {
			
		}// addGrade
		
		public int removeGrade(GradeVO gVO) {
			return 0;
		}// removeGrade
		
		public int avgGradeUser() {
			return 0;
		}// avgGradeUser
		
		public void addLikeGrade(LikeGradeVO lgVO) {
			
		}// addLikeGrade
		
		public int removeLikeGrade(LikeGradeVO lgVO) {
			return 0;
		}// removeLikeGrade

}// class
