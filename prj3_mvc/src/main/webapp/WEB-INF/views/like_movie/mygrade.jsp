<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko" lang="ko">
<head>
    <link rel="alternate" href="http://m.cgv.co.kr" />
    <link rel="shortcut icon" href="https://img.cgv.co.kr/theater_img/favicon.ico" type="image/x-icon" />
    <title id="ctl00_headerTitle">내가 쓴 평점 &lt; 영화 | 영화 그 이상의 감동.</title>
    <link rel="shortcut icon" type="image/x-icon" href="https://img.cgv.co.kr/R2014/images/favicon.ico" />
    <link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/webfont.css" />
	<link rel="stylesheet" media="all" type="text/css" href="http://localhost/prj3_mvc/css/reset.css" />
    <link rel="stylesheet" media="all" type="text/css" href="http://localhost/prj3_mvc/css/layout.css" />
    <link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/module.css?20211209" />
    <link rel="stylesheet" media="all" type="text/css" href="http://localhost/prj3_mvc/css/content.css" />
    <link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/common.css" />
    
    <link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/eggupdate.css" />
    <link rel="stylesheet" media="print" type="text/css" href="https://img.cgv.co.kr/R2014/css/print.css" />    
    <link rel="stylesheet" type="text/css" href="https://img.cgv.co.kr/R2014/js/jquery.ui/smoothness/jquery-ui-1.10.4.custom.min.css" />

    <link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/phototicket/phototicket.css" />
    <link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/slick.css" />
	<link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/slick-theme-custom.css" />

    <link rel="stylesheet" type="text/css" href="https://img.cgv.co.kr/R2014/js/icheck/iCheck.css" />

    <!-- 2020.05.07 감정지수/프리에그 프로젝트 추가 -->
    <link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/preegg.css" />

    <!-- 홈페이지 CSS 일원화로 인한 반영 20220721 -->
    <link rel="stylesheet" type="text/css" href="https://img.cgv.co.kr/resource_pc/css/cgv.min.css" />
    <script type="text/javascript" src="https://img.cgv.co.kr/resource_pc/js/cgvUi.js"></script>
<style type="">
.gradeTitle { font-weight: bold; }
</style>
</head>
<body class="">
	<div class="skipnaiv">
		<a href="#contents" id="skipHeader">메인 컨텐츠 바로가기</a>
	</div>
	<div id="cgvwrap">
		<div class="cgv-ad-wrap" id="cgv_main_ad">
			<div id="TopBarWrapper" class="sect-head-ad">
				<div class="top_extend_ad_wrap">
					<div class="adreduce" id="adReduce">
						<iframe
							src="//ad.cgv.co.kr/NetInsight/html/CGV/CGV_201401/sub@TopBar_EX"
							width="100%" height="80" title="" frameborder="0" scrolling="no"
							topmargin="0" leftmargin="0" marginwidth="0" marginheight="0"
							name="TopBanner" id="TopBanner"></iframe>
					</div>
					<div class="adextend" id="adExtend"></div>
				</div>
			</div>
		</div>

		<div class="header">
			<!-- 서비스 메뉴 -->
			<div class="header_content">
				<div class="contents">
					<h1 onclick="">
						<a href="/"> <img
							src="http://localhost/prj3_mvc/images/movie.png"
							alt="movieplanet" />
						</a> <span>MOVIEPLANET</span>
					</h1>
					<ul class="memberInfo_wrap">
						<li><a href="/user/login/logout.aspx" class="logout"
							title="로그아웃"><img
								src="https://img.cgv.co.kr/R2014/images/common/ico/loginPassword.png"
								alt="로그아웃" /><span>로그아웃</span></a></li>


						<li><a href="mypage.do"><img
								src="https://img.cgv.co.kr/R2014/images/common/ico/loginMember.png"
								alt="MY PAGE" /><span>MY PAGE</span></a></li>
					</ul>
				</div>
			</div>

			<div class="nav">
				<div class="contents">
					<h1>
						<a href="/" tabindex="-1"><img
							src="https://img.cgv.co.kr/R2014/images/common/logo/logoWhite.png"
							alt="CGV" /></a>
					</h1>
					<ul class="nav_menu">
						<li>
							<h2>
								<a href="/movies/?lt=1&ft=0">영화</a>
							</h2>
						</li>
						<li>
							<h2>
								<a href="/ticket/"><strong>예매</strong></a>
							</h2>
						</li>
						<li></li>
						<li></li>
					</ul>
					<div class="totalSearch_wrap">
						<label for="totalSearch"> 
							<input type="text" id="header_keyword" value="" placeholder="영화 검색"/> 
							<input type="hidden" id="header_ad_keyword" name="header_ad_keyword" />
						</label>
						<button type="button" class="btn_totalSearch" id="btn_header_search" >검색</button>
						<iframe
							src="//ad.cgv.co.kr/NetInsight/html/CGV/CGV_201401/main@Search_txt"
							width="0" height="0" title="" frameborder="0" scrolling="no"
							marginwidth="0" marginheight="0"
							allowfullscreen="allowfullscreen"
							mozallowfullscreen="mozallowfullscreen"
							msallowfullscreen="msallowfullscreen"
							oallowfullscreen="oallowfullscreen"
							webkitallowfullscreen="webkitallowfullscreen"></iframe>
					</div>
				</div>
			</div>
			<!-- 서브 메뉴 -->
		</div>
		<!-- E Header -->

		<!-- Contaniner -->
		<div id="contaniner" class="">
			<!-- 벽돌 배경이미지 사용 시 class="bg-bricks" 적용 / 배경이미지가 없을 경우 class 삭제  -->


			<!-- Contents Area -->
			<div id="contents" class="">


				<!-- Contents Start -->

				<div class="wrap-point-mylist">

					<div class="cols-content">

						<div class="col-aside">
							<h2>프로필 및 서브메뉴</h2>
							<div class="box-round-dgray">
								<div class="box-round-inner">
									<div class="inner-contents-profile">
										<div class="box-image">
											<div class="thumb-image">
												<img
													src="http://localhost/prj3_mvc/images/default_profile.gif"
													alt="모민경님 프로필 사진"
													onerror="errorImage(this, {type:'profile'})" /> <span
													class="profile-mask"></span>

											</div>
											<!-- 등급종류 클래스 : vip, rvip, vvip -->
										</div>
										<div class="box-contents">
											<strong>모민경님</strong> <a id="go_edit_page" href="#"
												class="edit" target="_blank" title="새창열림">나의 정보 변경</a> <em></em>

										</div>
									</div>
								</div>
							</div>
							<div class="box-round-wgray">
								<div class="box-round-inner">
									<div class="inner-contents-log">
										<a href="like_movie.do"> 
											<strong>기대되는 영화</strong>
										</a>
									</div>
								</div>
							</div>
							<div class="box-round-on">
								<div class="box-round-inner">
									<div class="inner-contents-log">
										<a href="/user/movielog/watched.aspx"> 
											<strong>내가 쓴 평점</strong>
										</a>
									</div>
								</div>
							</div>
							<div class="box-round-wgray">
								<div class="box-round-inner">
									<div class="inner-contents-log">
										<a href="/movies/point/my-list.aspx"> 
											<strong>내가 쓴 리뷰</strong>
										</a>
									</div>
								</div>
							</div>
						</div>


						<div class="col-detail">
							<div class="tit-mycgv">
								<h3>내가 쓴 평점</h3>
								<p><em>1건</em></p>
							</div>
							<div class="warp-my-reviewlist">
								<ul class="point_col1">
									<li class="nodata">
										<div>등록된 글이 없습니다.</div>
									</li>
									<li class="yesdata">
										<div>
											<p class="grade">평점 : 5</p>
											<p class="gradeTitle">가디언즈 오브 갤럭시</p>
											<p class="gradeP">기대돼요</p>
											<em style="color: #396dc9; font-weight: bolder;">모민경</em>
											2023. 5. 5. 19:59
										</div>
									</li>
								</ul>
							</div>
							<?xml version="1.0" encoding="utf-8"?>
							<div class="paging"></div>
						</div>

					</div>
				</div>
			</div>
		</div>

		<div class="com_pop_wrap">
			<div class="com_pop_fog"></div>
		</div>

		<!-- E Popup -->

	</div>

</body>
</html>