package kr.co.sist.prj3.admin.regmovie.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kr.co.sist.prj3.admin.regmovie.service.AdminMovieRegistService;
import kr.co.sist.prj3.admin.regmovie.vo.AdminDirectVO;
import kr.co.sist.prj3.admin.regmovie.vo.AdminMovieVO;

/**
 * ��ȭ�����Ʈ�ѷ�
 * @author user
 */
@Controller
public class AdminMovieInfoController {
	
	@Autowired(required=false)
	private AdminMovieRegistService amrs;
	
	
	//��ȭ���
	@GetMapping("/movie_regist.do")//��ȭ���.do
	public String adminMovieRegist() {
		
		
		return "movie_regist/movie_regist";
	}//adminMovieRegist
	
	
	//��ȭ��������� �� �ѱ��
	@PostMapping("/movie_success.do")//��ȭ����.do  -> �ΰ��� ��ȭ�������������̵�
	public String adminMovieRegistProcess(HttpServletRequest request) {
		File saveDir=new File("C:/Users/user/git/prj3_mvc/prj3_mvc/src/main/webapp/images");
		int fileSize=1024*1024*30;
		
		 try {
			 MultipartRequest mr = new MultipartRequest(request, saveDir.getAbsolutePath(), fileSize, "UTF-8", new DefaultFileRenamePolicy());

	            //��ȭ�������
	            String poster = mr.getFilesystemName("poster");
	            
	            String m_title = mr.getParameter("m_title");
	            String eng_title = mr.getParameter("eng_title");
	            String genre = mr.getParameter("genre");
	            String run_time = mr.getParameter("run_time");
	            String rank = mr.getParameter("rank");
	            String country = mr.getParameter("country");
	            String summary = mr.getParameter("summary");
	            String origin = mr.getParameter("origin");
	            String script = mr.getParameter("script");
	            String produce = mr.getParameter("produce");
	            String ration = mr.getParameter("ration");
	            String imports = mr.getParameter("imports");
	            String release_date = mr.getParameter("release_date");
	            
	            AdminMovieVO amVO=new AdminMovieVO();
	            amVO.setM_title(m_title);
	            amVO.setEng_title(eng_title);
	            amVO.setGenre(genre);
	            amVO.setRun_time(run_time);
	            amVO.setRank(rank);
	            amVO.setCountry(country);
	            amVO.setSummary(summary);
	            amVO.setOrigin(origin);
	            amVO.setScript(script);
	            amVO.setProduce(produce);
	            amVO.setRation(ration);
	            amVO.setImports(imports);
	            amVO.setRelease_date(release_date);
	            amVO.setPoster(poster);
	            
	            // ������ ���� ó��
	            amrs.addMovieInfo(amVO);
	            
	            //�������� ����
	            int count = 0;
	            String fileCount = mr.getParameter("counter");
	            if (fileCount != null) {
	                count = Integer.parseInt(fileCount);
	            }
	            
	            
	            String d_img=mr.getFilesystemName("d_img");
	            String[] d_name=mr.getParameterValues("d_name");
	            String[] d_eng=mr.getParameterValues("d_eng");
	            
	            AdminDirectVO[] adVO = new AdminDirectVO[count];
	                for(int i=0 ; i < count ; i++) {
	                	adVO[i] = new AdminDirectVO(); // ��ü ���� �� �Ҵ�
	                	if(count==0) {
	                		adVO[i].setD_img(d_img);
	                	}
	                	adVO[i].setD_img(d_img+i);
		                adVO[i].setD_name(d_name[i]);
		                adVO[i].setD_eng(d_eng[i]);
	                }
	                amrs.addDirectorInfo(adVO);
	            
	            

	        } catch (IOException e) {
	            e.printStackTrace();
	        }//end catch
		
		
		return "movie_regist/movie_success";
	}//adminMovieRegistProcess
	

}//class
