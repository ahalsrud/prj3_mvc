package kr.co.sist.prj3.admin.regmovie.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.MyBatisHandler;
import kr.co.sist.prj3.admin.regmovie.vo.AdminActorVO;
import kr.co.sist.prj3.admin.regmovie.vo.AdminDirectVO;
import kr.co.sist.prj3.admin.regmovie.vo.AdminMovieVO;

/**
 * ��ȭ��� DAO
 * @author user
 */
@Component
public class AdminMovieResgistDAO {
	
	
	//��ȭ�������
	public void insertMovieInfo(AdminMovieVO amVO) {
		
		//1.MyBatisHandler���
		SqlSession ss=MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2.Handler���
		int cnt=ss.insert("kr.co.sist.prj3.testMapper.insertMovie",amVO);
		
		//3. transaction�Ϸ�
		if( cnt==1) {
			ss.commit();
		}
		
		if(ss!=null) {ss.close();}
		
		
	}//insertMovieInfo
	
	
	//�����������
	public void insertDirectorInfo(AdminDirectVO adVO) {
		
	}//insertMovieInfo
	
	
	//����������
	public void insertActorInfo(AdminActorVO aaVO) {
		
	}//insertMovieInfo
	
	
	//������������
	public int deleteDirector(int dNum) {
		int num=0;
		
		return num;
	}//deleteDirector
	
	
	//�����������
	public int deleteActor(int aNum) {
		int num=0;
		
		return num;
	}//deleteDirector
	
	

}//class
