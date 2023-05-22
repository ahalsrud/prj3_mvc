package kr.co.sist.prj3.admin.member.service;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.admin.member.dao.MemberMgtDAO;
import kr.co.sist.prj3.admin.member.domain.MemberBrdDomain;
import kr.co.sist.prj3.admin.member.domain.MemberInfoDomain;

@Component
public class MemberMgtService {

	@Autowired(required = false)
	private MemberMgtDAO mmDAO;
	
	/**
	 * 유저명으로 검색 
	 * @param name
	 * @return
	 */
	public List<MemberBrdDomain> memberSearchService(String name) {
		
		List<MemberBrdDomain> list = null;
		list = mmDAO.selectMembers(name);
		
		return list;
	}//memberSearchService

	/**
	 * id로 검색
	 * @param userId
	 * @return
	 */
	public MemberInfoDomain memberInfoService(String userId) {
		
		MemberInfoDomain mid=null;
		mid = mmDAO.selectMemberInfo(userId);
		
		return mid;
	}//memberInfoService

	
	/**
	 * id로 삭제(update)
	 * @param userId
	 * @return
	 */
	public String memberRemoveService(String user_id) {
		
		JSONObject jsonObj = new JSONObject();
		Boolean success = false;
		
		int cnt = mmDAO.updateDeleteMember(user_id);
		System.out.println("memService---="+cnt);
		
		//기본
		jsonObj.put("success",false);
		
		
		if(cnt==1) {//업뎃 성공시			
			jsonObj.put("success",true);
		}//end if
		
			return jsonObj.toJSONString();
		
		
	}//meberRemoveService
	
	
	
	
	public static void main (String[] args) {

		System.out.println(new MemberMgtService().memberSearchService(""));
	}//main
	
	
}//class
