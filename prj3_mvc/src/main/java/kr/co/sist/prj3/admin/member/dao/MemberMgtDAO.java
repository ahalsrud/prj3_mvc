package kr.co.sist.prj3.admin.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.MyBatisHandler;
import kr.co.sist.prj3.admin.member.domain.MemberBrdDomain;
import kr.co.sist.prj3.admin.member.domain.MemberInfoDomain;

@Component
public class MemberMgtDAO {

	
	/**
	 * ���������� �˻�
	 * @param name
	 * @return
	 */
	public List<MemberBrdDomain> selectMembers(String name) {
		List<MemberBrdDomain> list = null;


		// 1.MyBatis �ڵ鷯 ���
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2. Handler�� ����ϱ�
		list = ss.selectList("selectMembers", name);

		// 4. ���� ����
		if (ss != null) {
			ss.close();
		} // end if

		return list;
		
	}//selectMember

	
	/**
	 * id�� �˻�
	 * @param userId
	 * @return
	 */
	public MemberInfoDomain selectMemberInfo(String userId) {
		MemberInfoDomain mid = null;

		// 1.MyBatis �ڵ鷯 ���
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2. Handler�� ����ϱ�
		mid = ss.selectOne("selectMemberInfo", userId);

		// 4. ���� ����
		if (ss != null) {
			ss.close();
		} // end if

		return mid;

	}// selectMemberInfo

	
	/**
	 * id�� �˻��Ͽ� n/a�� ����
	 * @param userId
	 * @return
	 */
	public int updateDeleteMember(String userId) {
		
		int result=0;
		return result;
		
	}//updateDeleteMember
	
	
	
}//class