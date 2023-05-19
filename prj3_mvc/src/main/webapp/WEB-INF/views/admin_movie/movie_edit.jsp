<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info="관리자 - 예매 등록"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>MOVIEPLANET</title>
        <!-- Favicon -->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
        <!-- bootstrap 시작-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
        <!-- bootstrap 끝-->
        <!-- jQuery CDN 시작 -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
        <!-- jQuery CDN 끝 -->
        
        <style>
			
			.header { margin-bottom:25px; width: 100%; height: 100px; background-color: #e74c3c; }
			h2 { color: white; text-align: left; padding-top: 30px; padding-left: 50px; font-weight: bold; }
			
			textarea{
			font-size: 10px;
			width: 470px;
			height: 80px;
			}
        
			#movieTitle{
			width:800px;
			margin-left: 200px;
			}
			
			#kTitle{
			width: 200px;
			}
			
			#eTitle{
			width: 200px;
			margin-left: 60px;
			}
			
			#genreDiv,#originDiv,#scriptDiv, #produceDiv,#rationDiv,#incomeDiv{
			float: left;
			width:265px;
			}
			
			#runDiv{
			position: relative;
			}
			
			#dateDiv{
			float: left;
			width:265px;
			}
			
			#rateDiv{
			position: relative;
			}
			
			label{
			font-size:20px;
			font-weight:bold;
			}
			
			#directDiv{
			height: 320px;
			}
			
			#dNameDiv{
			float: left;
			margin-left: 80px;
			margin-top: 50px;
			}
			
			.dImgDiv{
			width:200; height:400;
			float:left;
			text-align: center;
			}
			
			#actorDiv{
			height: 340px;
			}
			
			#pDiv{
			margin-top:30px;
			height: 210px;
			}
			
			#actorNameDiv{
			float: left;
			margin-left: 80px;
			margin-top: 60px;
			}
			
			.aImgDiv{
			width:200; height:400;
			float:left;
			text-align: center;
			margin-top: 20px;
			}
			
			#btnDiv{
			margin-left: 240px;
			margin-top: 50px;
			height: 80px;
			}
			
			#modifyBtn,#cancelBtn{
			width: 130px;
			}
			
			.imgDiv{
			width:200; height:400;
			float:right;
			text-align: center;
			}
			
			
			
			.imageBox, #profile{
				border:1px solid #333;
				width: 200px;
			    height: 250px;
			    background-repeat: no-repeat;
			    background-position: center;
			}
			
			.input-file-button{
			  padding: 6px 20px;
			  background-color:#3a405d;
			  border-radius: 4px;
			  color: white;
			  cursor: pointer;
			  font-size: 15px;
			}
			
			#file {
				display: none;
			}
			
			.policy-table th, td {
				border: none;
			}
			
			#summary {
				font-size: 15px;
			}
			
</style>
        
        
<script type="text/javascript">
         
$(function() {
	//감독정보 추가 삭제 버튼
	$("#dNamedAdd").click(function() {
		var newDiv = $('<div id="directDiv"><div class="dImgDiv"><div id="profile"></div><br/><label class="input-file-button" for="file" onclick="img()">변경</label><input type="file" name="file" id="file"/></div><div id="dNameDiv"><label>감독명</label><br/><input style="width:200px;" type="text" name="directKName" id="directKName" value="" placeholder="한글명"/><br/><br/><input style="width:200px;" type="text" name="directEName" id="directEName" value="" placeholder="영어명"/><input type="button" id="dNamdDelete" value="삭제" class="btn btn-danger"/></div><br/></div>');
		$("#directAddDiv").append(newDiv);
        		 
			newDiv.find("#dNamdDelete").click(function() {
			newDiv.remove();
		});
	});//click
			
	//출연진정보 추가 삭제 버튼
	$("#aNameAdd").click(function() {
        		 
		var newDiv = $('<div id="actorDiv"><div class="aImgDiv"><div id="profile"></div><br/><label class="input-file-button" for="file" onclick="img()">변경</label><input type="file" name="file" id="file"/></div><div id="actorNameDiv"><label>배우명</label><br/><input style="width:200px;" type="text" name=actorKName id="actorKName" value="" placeholder="한글명"/><input style="width:200px;" type="text" name="actorEName" id="actorEName" value="" placeholder="영어명"/><br/><br/><label>역할</label><br/><input style="width:200px;" type="text" name="role" id="role" value="" placeholder="역할"/><input type="button" id="aNameDelete" value="삭제" class="btn btn-danger"/></div><br/></div>');
		$("#actorAddDiv").append(newDiv);
        		 
			newDiv.find("#aNameDelete").click(function() {
			newDiv.remove();
		});
        		 
	});//click
        	 
	$("#cancelBtn").click(function() {
		location.href="movie_list.do";
	});
	
});//ready
</script>
</head>
   <body>
        <div class="d-flex" id="wrapper" >
            <!-- Sidebar-->
            <!-- 문제의심2 -->
            <div class="border-end bg-white" id="sidebar-wrapper">
                <div class="sidebar-heading border-bottom bg-light"><img src="http://localhost/test_prj/admin/images/movie.png" style="width:60px; height:30px;"><font style="color:#E74C3C; font-weight: bold;">MOVIEPLANET</font></div>
                <div class="list-group list-group-flush">
                  	<a class="list-group-item list-group-item-action list-group-item-light p-3" href="movie_regist.do">영화 등록</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="movie_list.do">영화 관리</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="movie_grade.do">영화 한줄평 관리</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="review_manage.do">영화 리뷰 현황판 관리</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="ticket_situaion.do">예매 현황</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="member_manage.do">회원 관리</a>
                </div>
            </div>
            <!-- Page content wrapper-->
            <!-- 문제의심 -->
            <div id="page-content-wrapper" >
                <!-- Top navigation-->
                <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
                    <div class="container-fluid">
                        <button class="btn btn-primary" id="sidebarToggle"> &lt;&lt; </button>
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav ms-auto mt-2 mt-lg-0">
                                <li class="nav-item active"><a class="nav-link" href="http://localhost/test_prj/admin/index.html" style="color:red; font-weight:bold;">Home</a></li>
                            </ul>
                        </div>
                    </div>
                </nav>
             
                
                
                
                <!-- Page content-->
                <div class="container-fluid">
                   <div class="header">
		               <h2><span>영화 수정</span></h2>
		           </div>
					   <span style="margin-left: 20px;">등록된 영화를 확인, 수정할 수 있습니다.</span><br/>
					   <hr/>
					   
					<div id="movieTitle">
	               	 <form action="" method="get" id="" name="">
					
					 <!-- 영화제목 -->
						<div>
							<label>영화제목</label><br/>
							<input type="text" name="kTitle" id="kTitle" value="${ emd.m_title }" placeholder="한글 영화명"/>
							<input type="text" name="eTitle" id="eTitle" value="${ emd.eng_title }" placeholder="영어 영화명"/>
						</div>
						
							<div class="imgDiv">
							<h3 style="text-align: left;">포스터</h3>
								<div id="profile">
								</div>
								<br/>
								<label class="input-file-button" for="file" onclick="img()">
		  							변경
								</label>
								<input type="file" name="file" id="file"/>							
							</div>
							
						<!-- 주요정보 -->
						<div id="mainInfo">
							<br/>
								<div id="genreDiv">
									<label>장르</label><br/>
									<input style="width:200px;" type="text" name="genre" id="genre" value="${ emd.genre }" placeholder="장르"/>
								</div>
								<div id="runDiv">
									<label>러닝타임</label><br/>
									<input style="width:200px;" type="text" name="run_time" id="run_time" value="${ emd.run_time }" placeholder="러닝타임"/>
								</div>
								<div id="dateDiv">
									<label>개봉일</label><br/>
									<input style="width:200px;" type="text" name="oDate" id="oDate" value="${ emd.release_date }" placeholder="개봉일"/>
								</div>
								<div id="rateDiv">
									<label>등급</label><br/>
									<input style="width:200px;" type="text" name="rate" id="rate" value="${ emd.rank }" placeholder="등급"/>
								</div>
								<div id="countryDiv">
									<label>국가</label><br/>
									<input style="width:200px;" type="text" name="country" id="country" value="${ emd.country }" placeholder="국가"/>
								</div><br/>
								<div id="infoDiv">
									<label>줄거리</label><br/>
									<textarea name="summary" id="summary" placeholder="줄거리내용">${ emd.summary }</textarea>
								</div>
						</div>
						<br/>
						
						<!-- 감독정보 -->
						<c:forEach var="director" items="${ dList }" varStatus="i">
							<div id="directDiv">
								<div class="dImgDiv">
									<div id="profile">
									</div>
									<br/>
									<label class="input-file-button" for="file" onclick="img()">
			  							변경
									</label>
									<input type="file" name="file" id="file"/>							
								</div>
								<div id="dNameDiv">
									<label>감독명</label><br /> <input style="width: 200px;" type="text" name="directKName" id="directKName" value="${ director.d_name }" placeholder="한글명"/>
									<br/><br/>
									<input style="width:200px;" type="text" name="directEName" id="directEName" value="${ director.d_eng }" placeholder="영어명"/>
									<input type="button" id="dNamedAdd" value="추가" class="btn btn-secondary"/>
								</div>
								<br/>
							</div>
						</c:forEach>
							
							<div id="directAddDiv">
							</div>
						
						
						<!-- 출연진 -->
						<c:forEach var="actor" items="${ aList }" varStatus="i">
						<div id="actorDiv">
							<div class="aImgDiv">
								<div id="profile">
								</div>
								<br/>
								<label class="input-file-button" for="file" onclick="img()">
		  							변경
								</label>
								<input type="file" name="file" id="file"/>							
							</div>
							<div id="actorNameDiv">
								<label>배우명</label><br/>
								<input style="width:200px;" type="text" name=actorKName id="actorKName" value="${ actor.a_name }" placeholder="한글명"/>
								<input style="width:200px;" type="text" name="actorEName" id="actorEName" value="${ actor.a_eng }" placeholder="영어명"/>
								<br/><br/>
								<label>역할</label><br/>
								<input style="width:200px;" type="text" name="role" id="role" value="${ actor.role }" placeholder="역할"/>
								<input type="button" id="aNameAdd" value="추가" class="btn btn-secondary"/>
							</div>
							<br/>
						</div>
						</c:forEach>
						
							<div id="actorAddDiv">
							</div>
							
						<!-- 제작 -->
						<div id="pDiv">
							<h3><span style="color:black;">제작</span></h3>
							<br/>
									<div id="originDiv">
										<label>원작</label><br/>
										<input style="width:200px;" type="text" name="origin" id="origin" value="${ emd.origin }" placeholder="원작"/>
									</div>
									<div id="scriptDiv">
										<label>각본</label><br/>
										<input style="width:200px;" type="text" name="script" id="script" value="${ emd.script }" placeholder="각본"/>
									</div>
									<div id="produceDiv">
										<label>제작</label><br/>
										<input style="width:200px;" type="text" name="produce" id="produce" value="${ emd.produce }" placeholder="제작"/>
									</div>
									<br/>
									<div id="rationDiv">
										<label>배급</label><br/>
										<input style="width:200px;" type="text" name="ration" id="ration" value="${ emd.ration }" placeholder="제작"/>
									</div>
									<div id="incomeDiv">
										<label>수입</label><br/>
										<input style="width:200px;" type="text" name="imports" id="imports" value="${ emd.imports }" placeholder="제작"/>
									</div>
						
						</div>
					
						<div id="btnDiv">
							<input type="button" value="수정" id="modifyBtn" name="modifyBtn" class="btn btn-secondary"/>&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="button" value="취소" id="cancelBtn" name="cancelBtn" class="btn btn-danger"/>
							
						</div>
						
						</form>
					</div>
					
					
				</div>
			</div>
          </div>
				
				
				
				
				
				
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
