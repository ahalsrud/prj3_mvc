<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="utf-8">
<title>${ movie.m_title } | MOVIEPLANET</title>
<link href="//m2.daumcdn.net/img-media/2010ci/Daum_favicon.ico" rel="shortcut icon">
<link rel="stylesheet" type="text/css" href="http://localhost/prj3_mvc/css/PcCommonCssBundle_merged.css" />


<script src="//t1.daumcdn.net/media/kraken/movie/386a1cd/common.merged.js"></script>
<script src="//t1.daumcdn.net/media/kraken/movie/386a1cd/PcCommonScriptBundle.merged.js"></script>
<script src="//t1.daumcdn.net/cssjs/movie/v2/amchart/amcharts.js"></script>
<script src="//t1.daumcdn.net/cssjs/movie/v2/amchart/serial.js"></script>
		<!-- 경태추가 -->
		<!-- bootstrap 시작-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
        <!-- bootstrap 끝-->
      	<!-- 경태추가 -->
      	
      <!-- jQuery CDN 시작 -->
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
      <!-- jQuery CDN 끝 -->

<style type="text/css">
/* 경태추가 */
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
tbody a:link {
  color : #E74C3C;
  text-decoration: none;
}
tbody a:visited {
  color : #E74C3C;
  text-decoration: none;
}
tbody a:hover {
  color : red;
  text-decoration: underline;
}
tbody a:active {
  color : green;
  text-decoration: none;
}
/* 경태추가 */

.tooltip_info .link_tooltip {
    display: none;
    font-size: 16px;
    line-height: 27px;
    color: #98989C;
    text-decoration: none;
}

a{
  text-decoration:none; color:inherit; cursor: pointer;
}
 .right_area .icon{
    display: flex;
    align-items: center;
    justify-content: center;
    width: calc(100vw * (45 / 1920));
    height: calc(100vw * (45 / 1920));

    border-radius: 50%;
    border: solid 2px #eaeaea;
    background-color: #fff;
}

.icon.heart img{
    width: calc(100vw * (24 / 1920));
    height: calc(100vw * (24 / 1920));
}

.icon.heart.fas{
  color:red
}
.heart{
    transform-origin: center;
}
.heart.active img{
    animation: animateHeart .3s linear forwards;
}


/* 주요정보에 대한 스타일 */
.thumbnail{
	width: 115px;
	height: 167px;
	border-radius: 8px;
}

.test td{
	padding-right: 48px;
}

.test span{
	color : #666;
}

/* 주요정보에 대한 스타일 */

@keyframes animateHeart{
    0%{transform:scale(.2);}
    40%{transform:scale(1.2);}
    100%{transform:scale(1);}
  }
#likeBtn { float: left; margin-right: 20px; }
#ticketing { margin-top: 5px;}
</style>

<script type="text/javascript">

function searchReview(){
			m_num = ${param.m_num};
			search = $("#search").val();
			search_type = $("#search_type").val();
			m_title = $("#m_title").val();
	
			$.ajax({
				url: "review_info.do",
				method: "get",
				data : { m_num: m_num,
				search: search,
				search_type: search_type},
				dataType: "json",
				
				error: function(xhr) {
				alert("이동 실패: " + xhr.statusText);
				},
				success: function(jsonObj) {
					
					var output = '<form action="review_info.do" id="searchFrm" name="searchFrm" method="get">' 
					+'<div class="contents" style="padding-top: 30px; ">'
					+'<div style="float: left; padding-right: 20px;">'
					+'<select class="form-select w-80" aria-label="Default select example" name="search_type" id="search_type">'
					+'<option selected value="0">전체</option>'
					+'<option value="1">제목</option>'
					+'<option value="2">글쓴이</option>'
					+'<option value="3">제목+글쓴이</option>'
					+'</select></div>'
					+'<div class="form-group pull-right" style="width:300px; float: left;  padding-bottom: 20px;">'
					+'<input type="text" class="search form-control" placeholder="리뷰 검색" id="search" name="search" >'
					+'<input type="hidden" name="m_num" value="2" />'
					+'</div>'
					+'<div style="float: left; width: 33%; padding-left:30px;">'
					+'<input type="button" value="검색" class="btn btn-outline-danger" id="subBtn" name="subBtn" onclick="searchReview()"/>'
					+'</div>'
					+'<div>'
					+'<a href="review_write.do?m_num='+m_num+'">'
					+'<input type="button" value="리뷰 작성하기" class="btn btn-outline-primary" id="" style="float: right;"/>'
					+'</a>'
					+'</div>'
					+'</div>'
					+'<span class="counter pull-right"></span>'
					+'</form>'
					+'<div style="width:1100px">'
					+'<table class="table table-hover table-bordered results"  style="text-align:center">'
					+'<colgroup>'
					+'<col style="width:3%">' 
					+'<col style="width:20%">'
					+'<col style="width:6%">' 
					+'<col style="width:9%">' 
					+'<col style="width:6%">' 
					+'<col style="width:6%">' 
					+'</colgroup>'
					+'<thead style="text-align:center">'
					+'<tr>'
					+'<th scope="col" >No.</th>'
					+'<th scope="col" >제목</th>'
					+'<th scope="col" >작성자</th>'
					+'<th scope="col" >작성일</th>'
					+'<th scope="col" >조회</th>'
					+'<th scope="col" >좋아요</th>'
					+'</tr>'
					+'</thead>'
					+'<tbody>'
					+'<form action="review_post.do" name="reviewFrm" id="reviewFrm" method="post">';
					if(jsonObj.reviewSize==0){
					output+='<tr><td colspan="6">해당영화에 대한 리뷰가 존재하지 않습니다.</td></tr>';
					}//end if
					$.each(jsonObj.review, function(idx, ele){
					var reviewCnt = idx + 1;
					output+='<tr>'
					+'<td scope="row">'+reviewCnt+'</td>'
					+'<td><a href="review_post.do?rv_num='+ele.rv_num+'&m_title='+m_title+'&m_num='+m_num+'">'+ele.title+'</a></td>'
					+'<td>'+ele.nick_name+'</td>'
					+'<td>'+ele.input_date+'</td>'
					+'<td>'+ele.hits+'</td>'
					+'<td>'+ele.like_total+'</td>'
					+'</tr>';
					});
					output+='</form>'
					+'</tbody>'				
					+'</table>'
					+'</div>';
					$("#output").html(output); 
		
			}//success
		});//ajax
}//searchReview
	
$(function(){	
        	
	/*  $(window).on('load', function() {
	    searchReview();
	}); */
	// 리뷰 클릭 시
	 $("#review").click(function() {
		
		searchReview();
		
    });//click
    
});//ready

</script>

<!-- =================================JSTL로 공통부분 출력============================== -->
</head>

<body class=""> 
	<!-- 경태 -->
	 <input type="hidden" value="${ movie.m_title }" id="m_title"/>
	 <!-- 경태 -->
    <div class="kakao_wrap detail_type"> 
		<header class="kakao_head search_on" data-tiara-layer="gnb"> 
    <div class="kakaohead_top">
        <div class="inner_head" data-tiara-layer="service">
                <a class="link_daum" data-tiara-layer="logo">
                <img src="http://localhost/prj3_mvc/images/movie_small.png" width="70" height="35" class="logo_daum" alt="Daum"></a>
		                <c:choose>
		                	<c:when test="${ empty lrDomain.user_id }">
				                <a style="margin-left: 960px;" href="login.do"><span style="font-weight: bold; ">Login</span></a>
		                	</c:when>
		                	<c:when test="${ !empty lrDomain.user_id }">
				                <a style="margin-left: 960px;" href="logout.do"><span style="font-weight: bold; ">Logout</span></a>
		                	</c:when>
		                </c:choose>
        </div>
    </div>
    <div class="kakaohead_menu">
        <div class="inner_head">
            <nav id="gnbContent" class="gnb_movie">
                <h2 class="screen_out">영화 메인메뉴</h2>
                <ul data-tiara-layer="tab">
                    <li class="home ">
                        <a href="main_frm.do" class="link_gnb" data-tiara-layer="home">영화</a>
                    </li>
                    <li class="ranking ">
                        <a href="/ranking/reservation" class="link_gnb" data-tiara-layer="ranking">예매</a>
                    </li>
                </ul>
            </nav>
            
            <!-- 검색 시작 -->
            <a href="javascript:" class="link_search">
                <span class="ico_movie ico_search">검색하기</span>
            </a> 
            <div class="moviesearch_wrap"> 
                <h2 class="screen_out">검색</h2>
                <form action="" class="d_sch" role="search">
                    <fieldset class="fld_sch">
                        <legend class="screen_out">검색어 입력폼</legend>
                        <div class="box_search" data-tiara-layer="service search">
                            <input type="input" class="tf_keyword" name="q" title="검색어 입력" autocomplete="off" autocorrect="off" autocapitalize="off" spellcheck="false" placeholder="영화 검색"  value="">
                            <button type="button" class="btn_search" ><span class="ico_movie ico_search">검색</span></button>
                        </div>
                    </fieldset>
                </form>
                <div class="suggest_layer">
                </div>
            </div>
            <!-- 검색 끝 -->
        </div>
    </div>
    <div id="wrapMinidaum"></div>
        <script src="https://go.daum.net/minidaum_pc.daum" charset="utf-8" type="text/javascript"></script>
</header>
        <hr class="hide">

        <main class="kakao_content">
<article id="mainContent" class="kakao_article">
    <h2 class="screen_out">영화 상세 본문</h2>
    <div class="section_detail">
        <!-- 상세상단 기본정보 -->
        <div class="box_basic" data-tiara-layer="main">
    <div class="info_poster">
    <img src="images/${ movie.poster }"  style="border-radius: 15px; width: 210px; height: 308px;" />
    </div>
    <div class="info_detail">
        <div class="detail_tit">
            <h3 class="tit_movie">
                <span class="txt_tit">
                    ${ movie.m_title }
                </span>
            </h3>
                <div class="head_origin">
                    <span class="txt_name">${ movie.eng_title }</span>
                </div>
                <input type="hidden" id="releaseStatus" value="true" />
                <input type="hidden" id="releaseFlag" value="Y" />
                <input type="hidden" id="latestReleaseDate" value="23.04.26" />
                <input type="hidden" id="daysCountFromRelease" value="10" />
        </div>
        <br/>
        <div class="detail_cont">
            <div class="inner_cont">
                        <dl class="list_cont">
                                <dt>개봉</dt>
                            <dd>${ movie.release_date }</dd>
                        </dl>
                    <dl class="list_cont">
                        <dt>장르</dt>
                        <dd>${ movie.genre }</dd>
                    </dl>
                    <dl class="list_cont">
                        <dt>국가</dt>
                        <dd>${ movie.country }</dd>
                    </dl>

            </div>
            <div class="inner_cont">
                    <dl class="list_cont">
                    <dt>평점</dt>
                    <dd><span class="ico_movie ico_star"></span>8.3</dd>
                    </dl>
              		
                    <dl class="list_cont">
                    <dt>러닝타임</dt>
                    <dd>
                        ${ movie.run_time }분
                    </dd>
                    </dl>
                    <dl class="list_cont">
                        <dt>등급</dt>
                        <dd>
                            ${ movie.rank }
                        </dd>
                        </dl>
            </div>
            
            
        </div>
            	<!------------------------------- 좋아요, 예메하기 버튼 추가 박진호 0507 -->
            		<!-- <input type="button" class="like" id="likeBtn" value="♥좋아요" style="width:80px; height:35px; cursor: pointer; border-radius: 10px" /> -->
            		<div id="likeBtn" class="right_area">
  						<a href="javascript:;" class="icon heart">
    						<img src="https://cdn-icons-png.flaticon.com/512/812/812327.png" alt="찜하기"> 
  						</a>
					</div>
					<div id="ticketing">
            			<input type="button" class="ticketing" id="tiecketingBtn" value="예매하기" style="width:80px; height:35px; cursor: pointer; margin-left: 10px; border-radius: 10px; background-color: #E74C3C; border-color: #E74C3C; color: white; font-size:11pt;font-family:굴림;font-weight:bolder"  />
    				</div>
    </div>
</div>
        <!-- 상세하단 -->
        <div class="box_detailinfo">
            <!-- 탭메뉴 -->
<div class="tabmenu_wrap">
    <strong class="screen_out">영화제 탭메뉴</strong>
    <ul class="list_tabmenu" role="tablist" data-tiara-layer="tab">
        <li  ><!-- 선택시 on 클래스 추가 -->
                <span class="txt_tabmenu" id="mainInfo" style="cursor: pointer">주요정보</span>
        </li>
        <li  >
            <a href="#void" id="produce">
                <span class="txt_tabmenu">출연/제작</span>
            </a>
        </li>
        <li>
            <a href="#void" id="grade">
                <span class="txt_tabmenu">평점</span>
            </a>
        </li>
        <li>
            <a href="#void" id="review">
                <span class="txt_tabmenu">리뷰</span>
            </a>
        </li>
    </ul>
</div>            <div class="contents"></div>
        </div>
        <br/>
         <div id="output"><!-- --------------------  탭 클릭시 ajax로 화면 부분 전환시작 - 데이터 덮어쓰기 --------------------------------------------------------------->
  		     
        <div>${ summary }</div>
        
       <br/><br/><br/>
        <div class="detail_crewinfo" data-tiara-layer="crew">
            <h5 class="tit_section">감독 / 출연진</h5>
            <br/>
            
            <table>
          	<tr>
            <c:forEach var="dInfo" items="${director}">
          		<td>
          			<img src="http://localhost/prj3_mvc/images/${ dInfo.d_img }" >
            		<c:out value="${ dInfo.d_img }"/><br/>
            		<c:out value="${ dInfo.d_name }"/><br/>
            		감독
          	    </td>
			</c:forEach>
			
          	<c:forEach var="aInfo" items="${actor}">
            	<td>
            		<c:out value="${ aInfo.a_img }"/><br/>
            		<c:out value="${ aInfo.a_name }"/><br/>
            		배우
            	</td>
			</c:forEach>
          	</tr>
			</table>
        </div>
        
    </div><!-- --------------------   탭 클릭시 ajax로 화면 부분 전환 끝  ---------------------------------------------------------------->
    
       <!-- =================================JSTL로 공통부분 출력 끝============================== -->
       
        </div>
</article>        
</main>
        <hr class="hide">
        </div>


</body>
</html>