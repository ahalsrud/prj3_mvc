package kr.co.sist.prj3.user.review.domain;

import java.sql.Clob;

/**
 * �ش� ���� ����
 * @author kt
 */
public class ReviewInfoDomain {

	private String title; //��������
	private String m_title; //��ȭ����
	private String nick_name; //�г���
	private String profile; //������
	private String input_date; //�ۼ���
	private String profile_msg; //�ڱ�Ұ�

	private int hits; //��ȸ��
	private int like_total; //�� ���ƿ�
	private int com_total; //�� ��ۼ�
	
	private Clob content; //����
	
}//class
