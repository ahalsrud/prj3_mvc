package kr.co.sist.prj3.user.total_info.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.MyBatisHandler;
import kr.co.sist.prj3.user.total_info.domain.ActorDomain;
import kr.co.sist.prj3.user.total_info.domain.CommInfoDomain;
import kr.co.sist.prj3.user.total_info.domain.DirectorDomain;
import kr.co.sist.prj3.user.total_info.domain.GradeDomain;
import kr.co.sist.prj3.user.total_info.vo.GradeVO;
import kr.co.sist.prj3.user.total_info.vo.LikeGradeVO;
import kr.co.sist.prj3.user.total_info.vo.LikeMovieVO;

@Component
public class TotalInfoDAO {

	public CommInfoDomain selectcommInfo(LikeMovieVO lmVO) {
		CommInfoDomain cid = null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		cid = ss.selectOne("selectcommInfo", lmVO);
		
		if(ss != null) { ss.close(); }// end if
		
		return cid;
	}// selectcommInfo
	
	// ���ƿ� ����
		public String selectLikeMovie(LikeMovieVO lmVO) {
			
			String result = "";
			
			SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
			
			result = ss.selectOne("selectLikeMovie", lmVO);
			
			if(ss != null ) { ss.close(); } // end if
			
			return result;
		}// selectLikeMovie
			
		// ���ƿ� �߰�
		public int insertLikeMovie(LikeMovieVO lmVO) {
		    SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		    int cnt = ss.insert("insertLikeMovie", lmVO);

		    if (cnt == 1) {
		    	System.out.println("�߰� ���� => commit");
		        ss.commit();
		    } else {
		        System.out.println("�߰� ����");
		        ss.rollback();
		    }
		    if (ss != null) {
		        ss.close();
		    }
		    return cnt;
		}
			
		// ���ƿ� ����
		public int deleteLikeMovie(LikeMovieVO lmVO) {
			int cnt = 0;
			
			SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
			cnt = ss.delete("deleteLikeMovie", lmVO);
			
			if(cnt == 1) {
				System.out.println("���� ���� => commit");
				ss.commit();
			}else {
				ss.rollback();
			}// end else
			
			if (ss != null) { ss.close(); }// end if
			
			return cnt;
		}// deleteLikeMovie
	
public String selectSummary(int mNum) {
		
		String summary="";
		
		//1.MyBatis Handler ���
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2.handler ��� 
		summary=ss.selectOne("selectSummary", mNum);
		
		//3. ��ȸ��� ó��
		//4.MyBatis Handler �ݱ�
		if( ss != null ) {ss.close();}//end if
		
		return summary;
		
		
		
	}// selectSummary
	
	public List<DirectorDomain> selectDirector(int mNum) {
		List<DirectorDomain> list = new ArrayList<DirectorDomain>();
		
		return list;
	}// selectDirector
	
	public List<ActorDomain> selectAcotr(int mNum) {
		List<ActorDomain> list = new ArrayList<ActorDomain>();
		
		return list;
	}// selectAcotr
	
	// �⿬/����
	public List<DirectorDomain> selectDirectorList(int mNum) {
		List<DirectorDomain> list = new ArrayList<DirectorDomain>();
		
		return list;
	}// selectDirectorList
	
	public List<ActorDomain> selectAcotrList(int mNum) {
		List<ActorDomain> list = new ArrayList<ActorDomain>();
		
		return list;
	}// selectAcotrList
	
	public int selectProduce() {
		return 0;
	}// selectProduce
	
	// ����
	public List<GradeDomain> selectGrade(int mNum) {
		List<GradeDomain> list = new ArrayList<GradeDomain>();
		
		return list;
	}// selectGrade
	
	public void insertGrade(GradeVO gVO) {
		
	}// insertGrade
	
	public int deleteGrade(GradeVO gVO) {
		return 0;
	}// deleteGrade
	
	public int selectAvgGrade() {
		return 0;
	}// selectAvgGrade 
	
	// ���� ���ƿ�
	public void insertLikeGrade(LikeGradeVO lgVO) {
		
	}// insertLikeGrade
	
	public int deleteLikeGrade(LikeGradeVO lgVO) {
		return 0;
	}// deleteLikeGrade
	
	
}
