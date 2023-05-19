package kr.co.sist.prj3.admin.regscreen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.admin.regscreen.dao.ScreenRegDAO;
import kr.co.sist.prj3.admin.regscreen.domain.ScreenInfoDomain;
import kr.co.sist.prj3.admin.regscreen.vo.ScreenInfoVO;

/**
 * ��������� Servoce
 * @author user
 */
@Component
public class ScreenRegService {
	
	@Autowired(required=false)
	private ScreenRegDAO srDAO;
	
	
	//����������ȭ�� select
	public ScreenInfoDomain screenInfoService(int mNum) {
		
		
		ScreenInfoDomain sid=srDAO.selectOneMovie(mNum);
		
		return sid;
	}//screenInfoService
	
	
	
	//�󿵵�� - �󿵽ð� update
	public int screenProcessService(ScreenInfoVO siVO) {
		int cnt=srDAO.updateScreen(siVO);
		System.out.println(cnt+"service----------");
		
		return cnt;
	}//screenInfoService

}//class
