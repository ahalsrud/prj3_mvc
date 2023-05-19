<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info="예매 현황 view"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			.results tr[visible='false'],
			.no-result{
			  display:none;
			}
			
			.results tr[visible='true']{
			  display:table-row;
			}
			
			.counter{
			  padding:8px; 
			  color:#ccc;
			}
			
			.header { margin-bottom:25px; width: 100%; height: 100px; background-color: #e74c3c; }
			h2 { color: white; text-align: left; padding-top: 30px; padding-left: 50px; font-weight: bold; }
        </Style>
        
        <style>
        .editBtn, .regBtn {
	background-color: #e74c3c;
	color: white;
	border: none;
	border-radius: 5px;
	width: 50px;
	height: 30px;
}

.delBtn {
	background-color: #b7b7b7;
	color: white;
	border: none;
	border-radius: 5px;
	width: 50px;
	height: 30px;
}
        </style>
        
        
        <!--  <script type="text/javascript">
	        $(document).ready(function() {
	        	  $(".search").keyup(function () {
	        	    var searchTerm = $(".search").val();
	        	    var listItem = $('.results tbody').children('tr');
	        	    var searchSplit = searchTerm.replace(/ /g, "'):containsi('")
	        	    
	        	  $.extend($.expr[':'], {'containsi': function(elem, i, match, array){
	        	        return (elem.textContent || elem.innerText || '').toLowerCase().indexOf((match[3] || "").toLowerCase()) >= 0;
	        	    }
	        	  });
	        	    
	        	  $(".results tbody tr").not(":containsi('" + searchSplit + "')").each(function(e){
	        	    $(this).attr('visible','false');
	        	  });
	
	        	  $(".results tbody tr:containsi('" + searchSplit + "')").each(function(e){
	        	    $(this).attr('visible','true');
	        	  });
	
	        	  var jobCount = $('.results tbody tr[visible="true"]').length;
	        	    $('.counter').text(jobCount + ' 건의 검색결과');
	
	        	  if(jobCount == '0') {$('.no-result').show();}
	        	    else {$('.no-result').hide();}
	        			  });
	        	});
        </script> -->
    </head>
   <body>
        <div class="d-flex" id="wrapper">
            <!-- Sidebar-->
            <div class="border-end bg-white" id="sidebar-wrapper">
                <div class="sidebar-heading border-bottom bg-light"><img src="http://localhost/prj3_mvc/images/movie.png" style="width:60px; height:30px;"><font style="color:#E74C3C; font-weight: bold;">MOVIEPLANET</font></div>
                <div class="list-group list-group-flush">
                                      <a class="list-group-item list-group-item-action list-group-item-light p-3" href="http://localhost/prj3_mvc/admin/sang_chung2.jsp">영화 등록</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="http://localhost/prj3_mvc/admin/moe_park2.jsp">영화 관리</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="http://localhost/prj3_mvc/admin/sang_chung3.jsp">상영정보 등록</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="http://localhost/prj3_mvc/admin/moe_park1.jsp">영화 한줄평 관리</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="http://localhost/prj3_mvc/admin/kyeong_kyu1.jsp">영화 리뷰 현황판 관리</a>
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
                                <li class="nav-item active"><a class="nav-link" href="http://localhost/prj3_mvc/admin/index.html" style="color:red; font-weight:bold;">Home</a></li>
                            </ul>
                        </div>
                    </div>
                </nav>
                <!-- Page content-->
                <div class="container-fluid">
                   <div class="header">
               <h2>회원 관리</h2>
               </div>
                  <!-- 검색바 시작 -->
                    <div style="float: left; padding-right: 20px;">
                    <select class="form-select w-80" aria-label="Default select example">
                    <option selected>전체</option>
                    <option value="1">제목</option>
                    <option value="2">글쓴이</option>
                    <option value="3">제목+글쓴이</option>
               </select>
                    </div>
                    <div>
                    <div class="form-group pull-right" style="width:300px; float: left;  padding-bottom: 20px;"><!-- 검색바 너비 -->
                <input type="text" class="search form-control" placeholder="회원명으로 검색">
                    </div>
                      <div style="float: left; width: 33%; padding-left:30px;">
                <input type="button" class="btn btn-outline-danger" value="검색"/>
                      </div>
                    </div>
               <span class="counter pull-right"></span>
                    <!-- 검색바 끝 -->
               
               <!-- 테이블을 담은 div 시작 -->   
                    <div style="width:1650px"><!-- 테이블의 div너비 -->
                    <table class="table table-hover table-bordered results">
                    <!-- 테이블 각 행의 넓이 비율 설정 원하면 늘리거나 줄이면 됨-->
                    <colgroup>
               <col style="width:200px"> <!-- 아이디 행 넓이 비율 3% -->
               <col style="width:200px"> <!-- 아이디 행 넓이 비율 3% -->
               <col style="width:200px"> <!-- 아이디 행 넓이 비율 3% -->
               <col style="width:300px"> <!-- 아이디 행 넓이 비율 3% -->
               <col style="width:200px"> <!-- 아이디 행 넓이 비율 3% -->
               <col style="width:300px"> <!-- 아이디 행 넓이 비율 3% -->
               <col style="width:250px"> <!-- 아이디 행 넓이 비율 3% -->
               </colgroup>
                    <!-- 테이블 각 행의 넓이 비율 설정 끝 -->
               <thead style="text-align:center">
                    <tr>
                       <th scope="col" >아이디</th>
                       <th scope="col" >이름</th>
                       <th scope="col" >생년월일</th>
                       <th scope="col" >주소</th>
                       <th scope="col" >연락처</th>
                      <th scope="col" >가입일</th>
                      <th scope="col" >열람/삭제</th>
                  </tr>
                 <!--  <tr class="warning no-result">
                        <td colspan="7" style="text-align:center"><i class="fa fa-warning"></i> 검색결과가 없습니다.</td>
                  </tr> -->
               </thead>
               <tbody style="text-align:center">
               
               <c:if test="${empty memList}">
               		<tr><td colspan="7">조회 결과 없음</td></tr>
               </c:if>
               <c:forEach items="${memList }" var="mem" >
                  <tr>
                     <td><c:out value="${mem.user_id}"/></td>
                     <td><c:out value="${mem.name}"/></td>
                     <td><c:out value="${mem.birth_date}"/></td>
                     <td><c:out value="${mem.addr}"/></td>
                     <td><c:out value="${mem.tel}"/></td>
                     <td><c:out value="${mem.reg_date}"/></td>
                     <td><a href="${mem.user_id}"><input type="button" value="열람" class="editBtn"></a> / 
                     <a href="${mem.user_id}"><input type="button" value="삭제" class="delBtn"></a></td>
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
