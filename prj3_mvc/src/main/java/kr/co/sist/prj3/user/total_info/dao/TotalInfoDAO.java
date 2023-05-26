package kr.co.sist.prj3.user.total_info.dao;

import java.sql.SQLException;
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

	//공통정보
	public CommInfoDomain selectcommInfo(LikeMovieVO lmVO) {
		CommInfoDomain cid = null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		cid = ss.selectOne("selectcommInfo", lmVO);
		
		if(ss != null) { ss.close(); }// end if
		
		return cid;
	}// selectcommInfo

	///////////////////////////////좋아요 부분 
	///return value of "org.apache.ibatis.session.SqlSession.selectOne(String, Object)" is null
//	// 좋아요 상태
//			public int selectLikeMovie(LikeMovieVO lmVO) {
//				SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
//				int cnt = ss.selectOne("selectLikeMovie", lmVO);
//				if(ss != null ) { ss.close(); } // end if
//				
//				return cnt;
//			}// selectLikeMovie
				
			// 좋아요 추가
			public int insertLikeMovie(LikeMovieVO lmVO) {
			    SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

			    int cnt = ss.insert("insertLikeMovie", lmVO);

			    if (cnt == 1) {
			        ss.commit();
			    } else {
			        ss.rollback();
			    }
			    if (ss != null) {
			        ss.close();
			    }
			    return cnt;
			}
				
			// 좋아요 삭제
			public int deleteLikeMovie(LikeMovieVO lmVO) {
				int cnt = 0;
				
				SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
				cnt = ss.delete("deleteLikeMovie", lmVO);
				
				if(cnt == 1) {
					ss.commit();
				}else {
					ss.rollback();
				}// end else
				
				if (ss != null) { ss.close(); }// end if
				
				return cnt;
			}// deleteLikeMovie
			
		//줄거리
		public String selectSummary(int m_num) throws SQLException{
			
			String summary="";
			
			//1.MyBatis Handler 얻기
			SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
			
			//2.handler 사용 
			summary=ss.selectOne("selectSummary", m_num);
			
			//3. 조회결과 처리
			//4.MyBatis Handler 닫기
			if( ss != null ) {ss.close();}//end if
			
			return summary;
			
		}// selectSummary
		
		
		//주요정보-감독
		public List<DirectorDomain> selectDirector(int m_num) {
			List<DirectorDomain> list=null;
			
			SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
			list = ss.selectList("selectDirectorMain", m_num);
			
			if(ss != null) { ss.close(); }// end if
			
			return list;
		}// selectDirector
		
		//주요정보-배우
			public List<ActorDomain> selectActor(int m_num) {
				List<ActorDomain> list = new ArrayList<ActorDomain>();
				
				SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
				list = ss.selectList("selectActorMain", m_num);
				
				if(ss != null) { ss.close(); }// end if
				
				return list;
			}// selectAcotrList
	
	// 출연/제작
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
	
	// 평점
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
	
	// 평점 좋아요
	public void insertLikeGrade(LikeGradeVO lgVO) {
		
	}// insertLikeGrade
	
	public int deleteLikeGrade(LikeGradeVO lgVO) {
		return 0;
	}// deleteLikeGrade
	
	
}
