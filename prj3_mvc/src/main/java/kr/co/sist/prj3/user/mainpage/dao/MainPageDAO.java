package kr.co.sist.prj3.user.mainpage.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.MyBatisHandler;
import kr.co.sist.prj3.user.mainpage.domain.MainInfoDomain;
import kr.co.sist.prj3.user.mainpage.domain.SearchMovieDomain;

@Component
public class MainPageDAO {
	
	public MainInfoDomain selectBestMovie() {
		MainInfoDomain mif=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		mif=ss.selectOne("center");
		
		if(ss != null) {ss.close();}//end if
		return mif;
		
	}
	
	public List<SearchMovieDomain> selectAllMovie() {
		List<SearchMovieDomain> list=null;
		
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		list=ss.selectList("movieList");
		
		return list;
	}
	


}//class
