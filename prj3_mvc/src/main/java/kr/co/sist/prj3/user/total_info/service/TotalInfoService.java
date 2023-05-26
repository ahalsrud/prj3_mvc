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
	
	// ���ƿ� ����
	public boolean movieLikeStatus(LikeMovieVO lmVO) {
		
		String result="";
		boolean likeStatus = false;
		
	    result = tiDAO.selectLikeMovie(lmVO);

	    if(result != null && !result.isEmpty()) { //���ƿ� ���ڵ尡 ��ȸ�ȴٸ�
			likeStatus = true;
		}//end if
	    
	    return likeStatus;
	}// movieLikeStatus
			
	// ���ƿ� �߰�
	public String addLikeMovie(LikeMovieVO lmVO) {
		boolean resultFlag=false;
		JSONObject jsonObj = new JSONObject();
		
	    int cnt = tiDAO.insertLikeMovie(lmVO);
	    
	    if(cnt==1) {
			jsonObj.put("resultFlag", resultFlag);
		}//end if
		
		return jsonObj.toJSONString();
	}
			
	// ���ƿ� ����
	public String removeLikeMovie(LikeMovieVO lmVO) {
		boolean resultFlag=false;
		JSONObject jsonObj = new JSONObject();
		
		int cnt = tiDAO.deleteLikeMovie(lmVO);
		
		if(cnt==1) {
			jsonObj.put("resultFlag", resultFlag);
		}//end if
		
		return jsonObj.toJSONString();
	}// removeLikeMove
	
	//���Ӹ� ��ȸ
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
		
		// �⿬/����
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
		
		// ����
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
