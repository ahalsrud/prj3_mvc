package kr.co.sist.prj3.user.review.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import kr.co.sist.prj3.MyBatisHandler;
import kr.co.sist.prj3.user.review.domain.MovieInfoDomain;
import kr.co.sist.prj3.user.review.domain.MyReviewDomain;
import kr.co.sist.prj3.user.review.domain.ReviewBoardDomain;
import kr.co.sist.prj3.user.review.domain.ReviewInfoDomain;
import kr.co.sist.prj3.user.review.vo.LikeVO;
import kr.co.sist.prj3.user.review.vo.MyReviewSearchVO;
import kr.co.sist.prj3.user.review.vo.ReviewSearchVO;
import kr.co.sist.prj3.user.review.vo.WriteReviewVO;


@Component
public class UserReviewDAO {

	/**
	 * �ش翵ȭ ���� �ҷ�����
	 * @param mNum(��ȭ����)
	 */
	public MovieInfoDomain selectMovieInfo(int mNum) {
		
		return null;
	}//selectMovieInfo
	
	/**
	 * �ش翵ȭ�� ���� ���� ����Ʈ �����ֱ�
	 * @param mNum(��ȭ����)
	 */
	public List<ReviewBoardDomain> selectReviewList(int mNum) {
		List<ReviewBoardDomain> list = new ArrayList<ReviewBoardDomain>();
	
		
		return list;
	}//selectReview
	
	/**
	 * ���� ����Ʈ �˻�
	 * @param rsVO
	 */
	public List<ReviewBoardDomain> selectSearchReview(ReviewSearchVO rsVO){
		List<ReviewBoardDomain> list = new ArrayList<ReviewBoardDomain>();
		
		return list;
	}//selectSearchReview
	
	/**
	 * ���� �ۼ��ϱ�
	 * @param wrVO
	 */
	public void insertReview(WriteReviewVO wrVO) {
			
	}//insertReview
	
	/**
	 * ���� Ŭ���� ���� ���� �����ֱ�
	 * @param rvNum(�����ȣ)
	 */
	/*
	 * public ReviewInfoDomain selectReview(int rvNum) {
	 * 
	 * ReviewInfoDomain reviewInfo = null;
	 * 
	 * // 1.MyBatis �ڵ鷯 ��� SqlSession ss =
	 * MyBatisHandler.getInstance().getMyBatisHandler(false);
	 * 
	 * // 2. Handler�� ����ϱ� reviewInfo = ss.selectOne("", rvNum);
	 * 
	 * // 4. ���� ���� if (ss != null) { ss.close(); } // end if
	 * 
	 * return reviewInfo;
	 * 
	 * }//selectReview
	 */	
	/**
	 * ���� Ŭ���� ���� ���ƿ� �������� �����ֱ�
	 * @return
	 */
	public String selectLikeStatus(LikeVO lVO) {

		String result = "";

		// 1.MyBatis �ڵ鷯 ���
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2. Handler�� ����ϱ�
		result = ss.selectOne("selectLikeStatus", lVO);

		// 4. ���� ����
		if (ss != null) { 	ss.close();		} // end if

		return result;

	}// selectLikeStatus
	
	/**
	 * ���� Ŭ���� ���� ���ƿ� ���� �����ֱ�
	 * @param rvNum(�����ȣ)
	 */
	public int selectCntLike ( int rv_num ) {
		
		int cnt = 0;
		
		//1.MyBatis �ڵ鷯 ���
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. Handler�� ����ϱ�
		cnt = ss.selectOne("selectLikes", rv_num);		
		// 3. transaction �Ϸ��ϱ�
		
				
		//4. ���� ����
		if(ss!=null) {ss.close();}//end if
				
		return cnt;
		
	
		
	}//selectCntLike
	
	/**
	 * �ش� ���� â���� ��ȸ�� +1 ����
	 * @param rvNum(�����ȣ)
	 */
	public int updateHits(int rvNum) {
		
		return 0;
	}//updateHits
	
	/**
	 * ���ƿ� ������
	 * @param lVO
	 */
	public int insertLike(LikeVO lVO) {
		
		int cnt = 0;
		
		//1.MyBatis �ڵ鷯 ���
		SqlSession ss =MyBatisHandler.getInstance().getMyBatisHandler(false);
		
		//2. Handler�� ����ϱ�
		cnt = ss.insert("insertLike", lVO);		
		
		//3. transaction �Ϸ��ϱ�
				if(cnt==1) {
					ss.commit();
				}
				
		//4. ���� ����
				if(ss!=null) {ss.close();}//end if
				
		return cnt;
		
		
	}//insertLike
	
	/**
	 * ���ƿ� ����
	 * @param lVO
	 */
	public int deleteLike(LikeVO lVO) {

		int cnt = 0;

		// 1.MyBatis �ڵ鷯 ���
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2. Handler�� ����ϱ�
		cnt = ss.delete("deleteLike", lVO);

		// 3. transaction �Ϸ��ϱ�
		if (cnt == 1) {
			ss.commit();
		}

		// 4. ���� ����
		if (ss != null) {
			ss.close();
		} // end if

		return cnt;
	
	}//deleteLike
	
	/**
	 * ���ƿ� ���� �����ؼ� �����ֱ�
	 * @param rvNum(�����ȣ)
	 */
	/*
	 * public int selectLikeCount(int rvNum) {
	 * 
	 * return 0; }//selectLikeCount
	 */
	
	
	/**
	 * ���� �� ���� �˻�(����������)
	 * @param mrsVO
	 */
	public List<MyReviewDomain> selectMyReview (MyReviewSearchVO mrsVO) {
		List<MyReviewDomain> list = new ArrayList<MyReviewDomain>();
		
		

		// 1.MyBatis �ڵ鷯 ���
		SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(false);

		// 2. Handler�� ����ϱ�
		list = ss.selectOne("selectLikeStatus", mrsVO);

		// 4. ���� ����
		if (ss != null) { 	ss.close();		} // end if

		return list;
		
		
	}//selectMyReview
	
	
	
	
}//class