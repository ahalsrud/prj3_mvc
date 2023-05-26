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
import kr.co.sist.prj3.user.total_info.domain.MovieImgDomain;
import kr.co.sist.prj3.user.total_info.domain.ProduceDomain;
import kr.co.sist.prj3.user.total_info.vo.GradeVO;
import kr.co.sist.prj3.user.total_info.vo.LikeGradeVO;
import kr.co.sist.prj3.user.total_info.vo.LikeMovieVO;

@Component
public class TotalInfoDAO {

	// ��������
	public CommInfoDomain selectcommInfo(LikeMovieVO lmVO) {
		CommInfoDomain cid = null;

		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		cid = ss.selectOne("selectcommInfo", lmVO);

		if (ss != null) {
			ss.close();
		} // end if

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

	// �ٰŸ�
	public String selectSummary(int m_num) throws SQLException {

		String summary = "";

		// 1.MyBatis Handler ���
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2.handler ���
		summary = ss.selectOne("selectSummary", m_num);

		// 3. ��ȸ��� ó��
		// 4.MyBatis Handler �ݱ�
		if (ss != null) {
			ss.close();
		} // end if

		return summary;

	}// selectSummary

	// ���� (�ֿ�����, �⿬/����)
	public List<DirectorDomain> selectDirector(int m_num) {
		List<DirectorDomain> list = null;

		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		list = ss.selectList("selectDirectorMain", m_num);

		if (ss != null) {
			ss.close();
		} // end if

		return list;
	}// selectDirector

	// ��� (�ֿ�����, �⿬/����)
	public List<ActorDomain> selectActor(int m_num) {
		List<ActorDomain> list = new ArrayList<ActorDomain>();

		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		list = ss.selectList("selectActorMain", m_num);

		if (ss != null) {
			ss.close();
		} // end if

		return list;
	}// selectAcotrList
	
	// ��ȭ ����
	public List<MovieImgDomain> selectMovieImg(int m_num) {
		List<MovieImgDomain> list = new ArrayList<MovieImgDomain>();
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		list = ss.selectList("selectMovieImg", m_num);
		
		if (ss != null) {
			ss.close();
		} // end if
		return list;
	}// selectAcotrList

	// ���ۻ�
	public ProduceDomain selectProduce(int m_num) {
		ProduceDomain pd =null;
		
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		pd = ss.selectOne("selectProduce", m_num);

		if (ss != null) {
			ss.close();
		} // end if

		return pd;
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
