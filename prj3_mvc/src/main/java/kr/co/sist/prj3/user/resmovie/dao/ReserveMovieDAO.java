package kr.co.sist.prj3.user.resmovie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.MyBatisHandler;
import kr.co.sist.prj3.user.resmovie.domain.ReserveMovieDomain;

@Component
public class ReserveMovieDAO {
	
	public List<ReserveMovieDomain> selectRes() {
		List<ReserveMovieDomain> list=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		list=ss.selectList("kr.co.sist.prj3.reservationMapper.selectMovie");
		if(ss != null) {ss.close();}//end if
		
		return list;
	}//selectRes
	
	public ReserveMovieDomain selectInfo(int m_num) {
		ReserveMovieDomain rmDomain=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		rmDomain = ss.selectOne("kr.co.sist.prj3.reservationMapper.selectMovieInfo",m_num);
		return rmDomain;
	}//selectInfo
	
	public ReserveMovieDomain selectHour(int m_num) {
		ReserveMovieDomain rmDomain=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		rmDomain = ss.selectOne("selectMovieHour",m_num);
		
		return rmDomain;
	}//selectHour

}//class
