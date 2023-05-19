<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info="리뷰 현황 view"
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
        <Style>
			 .header { width: 100%; height: 100px; background-color: #e74c3c; margin-bottom: 25px;}
			.results tr[visible='false'],
			.no-result{
			  display:none;
			}
			
			.results tr[visible='true']{
			  display:table-row;
			}
			
			h2 { color: white; text-align: left; padding-top: 30px; padding-left: 50px; font-weight: bold; }
			.counter{
			  padding:8px; 
			  color:#ccc;
			}
        </Style>
        <script type="text/javascript">
        	$(document).ready(function() {
        	  $("#subBtn").click(function() {
        	    $("#searchFrm").submit();
        	  });
        	});
        </script>
    </head>
   <body>
        <div class="d-flex" id="wrapper">
            <!-- Sidebar-->
            <div class="border-end bg-white" id="sidebar-wrapper">
                <div class="sidebar-heading border-bottom bg-light"><img src="http://localhost/prj3_mvc/images/movie.png" style="width:60px; height:30px;"><font style="color:#E74C3C; font-weight: bold;">MOVIEPLANET</font></div>
                <div class="list-group list-group-flush">
                   <a class="list-group-item list-group-item-action list-group-item-light p-3" href="http://localhost/prj3_mvc/admin/sang_chung2.jsp">영화 등록</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="http://localhost/prj3_mvc/admin/moe_park2.jsp">영화 관리</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="http://localhost/prj3_mvc/admin/moe_park1.jsp">영화 한줄평 관리</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="http://localhost/prj3_mvc/admin/review_manage.jsp">영화 리뷰 현황판 관리</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="http://localhost/prj3_mvc/admin/sang_chung1.jsp">예매 현황</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="http://localhost/prj3_mvc/admin/member_manage.jsp">회원 관리</a>
                </div>
            </div>
            <!-- Page content wrapper-->
            <div id="page-content-wrapper">
                <!-- Top navigation-->
                <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
                    <div class="container-fluid">
                        <button class="btn btn-primary" id="sidebarToggle"> &lt;&lt; </button>
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav ms-auto mt-2 mt-lg-0">
                                <li class="nav-item active"><a class="nav-link" href="http://localhost/prj3_mvc/admin/index.html">Home</a></li>
                                <li class="nav-item"><span class="nav-link" href="#!" style="color:red; font-weight:bold;">ADMIN</span></li>
                            </ul>
                        </div>
                    </div>
                </nav>
                <!-- form 시작 -->
                <form action="review_manage.do" id="searchFrm" name="searchFrm" method="post">
                <!-- Page content-->
                <div class="container-fluid">
                	<div class="header">
					<h2>영화 리뷰 현황판 관리</h2>
					</div>
                    <!-- 검색바 시작 -->
                    <div style="float: left; padding-right: 20px;">
                    <select class="form-select w-80" aria-label="Default select example" name="search_type" id="search_type">
						  <option selected value="0">전체</option>
						  <option value="1">제목</option>
						  <option value="2">내용</option>
						  <option value="3">제목+내용</option>
						  <option value="4">글쓴이</option>
					</select>
                    </div>
                    <div>
                    <div class="form-group pull-right" style="width:300px; float: left;  padding-bottom: 20px;"><!-- 검색바 너비 -->
				    <input type="text" class="search form-control" placeholder="리뷰 검색" name="search">
                    </div>
                   	<div style="float: left; width: 33%; padding-left:30px;">
				    <input type="button" value="검색" class="btn btn-outline-danger" id="subBtn"/>
                   	</div>
                    </div>
					<span class="counter pull-right"></span>
                    <!-- 검색바 끝 -->
					</form>
					<!-- form 끝 -->
					<!-- 테이블을 담은 div 시작 -->	
                    <div style="width:1600px"><!-- 테이블의 div너비 -->
                    <table class="table table-hover table-bordered results">
                    <!-- 테이블 각 행의 넓이 비율 설정 원하면 늘리거나 줄이면 됨-->
                    <colgroup>
					<col style="width:15%"> <!-- 제목 행 넓이 비율 15% -->
					<col style="width:6%"> <!-- 아이디 행 넓이 비율 3% -->
					<col style="width:9%"> <!-- 작성일 행 넓이 비율 6% -->
					<col style="width:6%"> <!-- 관리 행 넓이 비율 6% -->
					</colgroup>
                    <!-- 테이블 각 행의 넓이 비율 설정 끝 -->
					<thead style="text-align:center">
  						<tr>
  							<th scope="col" >제목</th>
  							<th scope="col" >작성자</th>
  							<th scope="col" >작성일</th>
  							<th scope="col" >관리</th>
						</tr>
						<tr class="warning no-result">
						      <td colspan="4" style="text-align:center"><i class="fa fa-warning"></i> 검색결과가 없습니다.</td>
						</tr>
					</thead>
					<tbody style="text-align:center">
					<c:if test="${ empty reviewList }">
					<tr>
					<td colspan="4">리뷰가 존재하지 않습니다.
					</tr>
					</c:if>
						<c:forEach var="review" items="${reviewList}">
						<tr>
						<td><c:out value="${review.title}"/>
								<input type="hidden" value="${ review.rv_num }"></td>
						<td><c:out value="${review.user_id }"/></td>
						<td><c:out value="${review.input_date}"/></td>
						<td><input type="button" value="삭제"/></td>
						</tr>
						</c:forEach>
					</tbody>
					
					</table>
           			</div>
					<!-- 테이블을 담은 div 끝 -->	
                </div>
            </div>
        </div>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
