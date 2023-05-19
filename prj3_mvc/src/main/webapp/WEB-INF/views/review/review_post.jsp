<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" info="여러 노드의 파싱"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<head>
<!-- META -->
<meta charset="utf-8">
<meta name="generator" content="Rhymix">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=no" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="" />
<meta name="csrf-token" content="UkcBJRYhQI7ZosRT" />
<!-- TITLE -->
<title>타이틀</title>
<!-- CSS -->
<link rel="stylesheet" href="http://localhost/prj3_mvc/css/NewFile.css" />
<link rel="stylesheet" href="http://localhost/prj3_mvc/css/NewFile1.css" />
<link rel="stylesheet" href="http://localhost/prj3_mvc/css/NewFile2.css" />
<link rel="stylesheet" href="http://localhost/prj3_mvc/css/NewFile3.css" />
<link rel="stylesheet" href="http://localhost/prj3_mvc/css/NewFile4.css" />
<link rel="stylesheet" href="http://localhost/prj3_mvc/css/NewFile5.css" />
<link rel="stylesheet" href="http://localhost/prj3_mvc/css/NewFile6.css" />
<link rel="stylesheet" href="http://localhost/prj3_mvc/css/NewFile7.css" />
<link rel="stylesheet" href="http://localhost/prj3_mvc/css/NewFile8.css" />
<link rel="stylesheet" href="http://localhost/prj3_mvc/css/NewFile9.css" />
<link rel="stylesheet"
	href="http://localhost/prj3_mvc/css/NewFile10.css" />
<link rel="stylesheet"
	href="http://localhost/prj3_mvc/css/NewFile11.css" />
<link rel="stylesheet"
	href="http://localhost/prj3_mvc/css/NewFile12.css" />
<link rel="stylesheet"
	href="http://localhost/prj3_mvc/css/NewFile13.css" />

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />

<!-- JS -->
<script src="/common/js/jquery-2.2.4.min.js?20190112221345"></script>
<script src="/files/cache/assets/minified/rhymix.min.js?20221117005757"></script>
<script src="/modules/board/tpl/js/board.js?20201227091305"></script>
<script
	src="/modules/board/skins/ink_board_rawdell/js/board.js?20211226033228"></script>
<script
	src="/modules/board/skins/ink_board_rawdell/js/board_pc.js?20211014021546"></script>
<script
	src="/modules/board/skins/ink_board_rawdell/js/jquery.selectbox.min.js?20201227114829"></script>
<script
	src="/modules/editor/skins/ckeditor/js/xe_textarea.js?20190112221345"></script>
<script src="/modules/editor/tpl/js/editor_common.js?20190112221345"></script>
<script src="/layouts/ink_layout_rawdell/js/layout.js?20201227114846"></script>
<script
	src="/layouts/ink_layout_rawdell/js/jquery.scrollbar.min.js?20201227114846"></script>
<script
	src="/layouts/ink_layout_rawdell/js/jquery.selectbox.min.js?20201227114846"></script>
<script src="/layouts/ink_layout_rawdell/js/layout_pc.js?20201227114846"></script>
<script
	src="/layouts/ink_layout_rawdell/js/jquery.cookie.js?20201227114846"></script>
<script
	src="/layouts/ink_layout_rawdell/js/swiper.min.js?20201227114846"></script>




<!-- jQuery CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- jQuery CDN -->



<style>
#popup_menu_area {
	outline: none !important;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.15) !important;
}
</style>
<style>
body, table, input, button, .ink_wrap .xe_content, .text_en {
	font-family: Pretendard, -apple-system, BlinkMacSystemFont, system-ui,
		'Apple SD Gothic Neo', 'Noto Sans KR', 'Malgun Gothic', sans-serif;
	font-weight: 400;
}

#popup_menu_area {
	padding: 12px 15px 5px;
}

#popup_menu_area li {
	margin-bottom: 7px;
}

#popup_menu_area a {
	padding: 0 !important;
	color: #999;
	transition-property: color;
	transition-duration: 0.2s;
	transition-timing-function: ease-in;
}

#popup_menu_area a:hover {
	color: #333;
	background-color: transparent !important;
}

.ink_container, .ink_banner_top, .ink_footer {
	width: 1200px;
}

.ink_footer_wrap {
	min-width: 1200px;
}

.nav_wrap.fixed {
	width: 1200px;
	margin-left: -600px;
}

.ink_content {
	width: 930px;
}

.ink_sidebar.right_sidebar {
	width: 220px;
}

.ink_sidebar.left_sidebar {
	width: 250px;
}

.ink_sidebar.right_sidebar::after {
	right: 245px
}

.ink_sidebar.left_sidebar::after {
	left: 275px;
}

.containerB .ink_content {
	width: 905px;
}

.containerB.sidebar_typeN .ink_content {
	width: 100%;
}

.containerB .ink_sidebar.right_sidebar {
	width: 195px;
}

.containerB .ink_sidebar.left_sidebar {
	width: 225px;
}

.normal_mode .ink_gnb .menu_1depth {
	line-height: 70px;
}

.nav_wrap.view_mode, .normal_mode .gnb_space .menu_1depth {
	height: 70px;
}

.ink_header {
	margin-top: 25px;
}

.nav_wrap.color_nav, .view_mode.color_nav .ink_gnb, .normal_mode.color_nav .menu_1depth,
	.nav_wrap .mymenu_title, .nav_wrap.color_nav.fixed {
	background-color: #c14c3d !important;
}

.nav_wrap.color_nav .menu_1depth, .color_nav.view_mode a, .nav_wrap.color_nav .nav_buttons button
	{
	color: rgba(255, 255, 255, 0.7);
}

.nav_wrap.color_nav .menu_1depth:hover, .color_nav.view_mode a:hover,
	.nav_wrap.color_nav .nav_buttons button:hover, .nav_wrap.color_nav .active>a.menu_1depth
	{
	color: #FFF;
}

.view_mode.color_nav .ink_gnb>ul>li {
	border-color: rgba(255, 255, 255, 0.3);
}

.view_mode.color_nav .ink_gnb .menu_1depth {
	border-color: rgba(255, 255, 255, 0.5);
}

.ink_header .logo, .ink_header .header_side {
	height: 72px;
}

.header_typeB3 {
	padding-top: -18px;
}

body {
	background-color: #e6e6e6;
}

.ink_sidebar.left_sidebar::after, .ink_sidebar.right_sidebar::after {
	background-color: rgba(0, 0, 0, 0.05);
}
</style>
<style>
.atc_body .xe_content {
	padding: 30px 40px 35px 40px;
}

.ldd>ul>li, .ldn td {
	padding-top: 14px;
	padding-bottom: 14px;
}

.list_wrap .title_link, .ldf header h1 {
	font-size: 13px;
	font-size: 15px;
}

.ldn .list_author {
	font-size: 13px;
	font-size: 13px;
}

.hd{
height:100px;
}

.hd_span{
 display: inline-block; /* 인라인 요소를 블록 요소로 변경 */
  height: 100%;
}

</style>
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700&display=swap" />


<script>

	

$(function(){
	var currentLikes= $("#cntLike").text();
//	var currentLikes= parseInt($("#cntLike").text());

	
	//아이디와 리뷰번호를 받는다
	//아이디 - from 세션, hidden에 숨겨놨다가 가져오기
	//var userId = $("").val();
	//var rvNum = $("").val();
	
	 var id = "${param.user_id }";
	var rvNum = ${param.rv_num};
	 
	
	//좋아요 상태 확인 후 세팅
	//checkLikeStatus();
	
	
	//좋아요 버튼이 눌리면
	$("#likeBtn").click(function(){
		//현재 버튼의 클래스를 확인
		var liked = $(this).hasClass('submitted');
		//눌린 상태였다면 true, 안눌린 상태였다면 false 
		
		alert(liked);
		$.ajax({
			
			//db의 좋아요 테이블에 insert 혹은 delete해주기
			url:"/prj3_mvc/likeClicked.do",
			method:"get",
			data: {user_id : id,
				   rv_num : rvNum ,
				   liked : liked },
			dataType:"json",	   
			success : function(jsonObj) {

					//db에서 할일

					if (!jsonObj.resultFlag) { //db작업에 성공하면

						if (liked) { //눌린 상태였다면 해제하기

							$("#likeBtn").removeClass('submitted');
							currentLikes--;
							$("#cntLike").text(currentLikes);

						} else { //안 눌린 상태였다면 누르기

							$("#likeBtn").addClass('submitted');
							currentLikes++;
							$("#cntLike").text(currentLikes);

						}//end else

					}//end if	

				},//end success
				error : function(xhr) {
					alert("문제");
				}//end error

			});//ajax

		});//click

	});//ready

	//좋아요 상태 확인 후 화면에 먼저 보여줌
/* 	function checkLikeStatus() {

		//로그인 상태라면

		$.ajax({

			url : "/likeStatusSet.do",
			method : "get",
			data : {
				userId : userId,
				rvNum : rvNum
			},
			success : function(response) {

				//서버에서 해야할일 
				//1.좋아요 테이블에서 유저id와 리뷰번호로 select 
				//2.리뷰번호로 좋아요 테이블의 레코드 수를 센다

				//id로 게시글에서
				if ('좋아요 테이블에서 레코드가 셀렉되었다면') { // 좋아요 상태라면 - 테이블에 레코드가 존재한다면

					$("#likeBtn").addClass('bt_vote.submitted');

				}//end if

				//좋아요 수를 세팅해줌
				$("#cntLike").text('좋아요수');
				currentLikes = '좋아요수';

			},//end success
			error : function() {

			}//end error

		});//ajax

	}//checkLikeStatus */
</script>


</head>


<!-- BODY START -->
<body>

	<!-- PC -->

	<div class="ink_wrap lightmode">
		<div id="container" class="ink_container header_typeB3 containerN">



			<div id="ink_wrapper" class="ink_wrapper clearfix">

				<div id="content" class="ink_content" role="main">

					<section class="ink_board guest_mode">
						<div class="bd_header" >
						
						
						<div style="height:100px; margin-top:20px;">
						<div style="width:930px; height:80px; border-radius: 15px; background-color: white;">
						<div style="float:left"><img src="http://localhost/prj3_mvc/images/movie_small.png" style="height:50px; margin-top:20px;"/></div>
						<div style="font-size:20px; margin-top:27px; float:left"><font font style="color:#E74C3C; font-weight: bold;">MOVIEPLANET</font></div>
						<a href="#void" style="float:right; margin-right:30px; margin-top:50px; font-weight: bold;" >HOME</a>
						</div>
						</div>
							<h2 class="bd_title" >
								<i class="far fa-list-alt big-icon"></i> <a href="">메인으로</a>
								<i class="fas fa-angle-right"></i> 
								<a class="category_link" href=""><c:out value="${mTitle}"/></a>
							</h2>
						</div>
						<article class="ink_atc round20 has_list">

							<header class="atc_header">
								<h1>


									<a href=""
										class="atc_title"><c:out value="${title}"/></a>
								</h1>
								<div class="atc_info clearfix">
									<span class="atc_nickname"><span
										class="inkpf color round small"><img class="inkpf_img"
											src="${profile}"
											alt="${nickName}"/></span> <a href=""
										class="member_66498994">${nickName}</a>
									</span> <span class="text_en atc_date font_grey1"><c:out value="${inputDate}"/></span>
									<div class="atc_info_right text_en font_grey1">
										<span class="count_read"><i class="fas fa-eye"
											title="조회 수"></i> <c:out value="${hits}"/></span> <span class="count_vote pt_col"><i
											class="fas fa-heart" title="좋아요 수"></i> <c:out value="${like}"/></span> <span
											class="count_cmt pt_col2"><i
											class="fas fa-comment-dots" tilte="댓글"></i> <c:out value="${sumCom}"/></span>

									</div>
								</div>
							</header>
							<div class="atc_body">

								<!--BeforeDocument(90958928,66498994)-->
								<div
									class="document_90958928_66498994 rhymix_content xe_content">
									<p>본문 내용</p>
								</div>
								<!--AfterDocument(90958928,66498994)-->
								<div class="atc_buttons clearfix">
									<div class="atc_vote">
									
									<c:choose>
									<c:when test="${likeStatus}">
										<button id="likeBtn" class="bt_vote vote_area submitted" type="button">
											<!--onclick="insertWarn('로그인 해주세요.')"  -->
											좋아요<span id="cntLike" class="voted_count text_en"><c:out value="${likeCnt}"/></span>
										</button>
									</c:when>
									<c:otherwise>
										<button id="likeBtn" class="bt_vote vote_area" type="button">
											<!--onclick="insertWarn('로그인 해주세요.')"  -->
											좋아요<span id="cntLike" class="voted_count text_en"><c:out value="${likeCnt}"/></span>
										</button>
									</c:otherwise>
									</c:choose>
									
									</div>
								</div>
								<div class="atc_box bg_grey1">
									<div class="atc_sign">
										<h3>
											<span class="inkpf color round"><img class="inkpf_img"
												src="//img.extmovie.com/files/member_extra_info/profile_image/899/339/056/56339899.jpg?20200605172258"
												alt="NeoSun" /></span> <span class="nickname">NeoSun</span>
											<div class="ink_pointbar text_en">
											</div>
										</h3>
										<div class="sign_body">
											<div
												style="max-height: 100px; overflow: auto; overflow-x: hidden; height: expression(this.scrollHeight &gt; 100 ? '100px' : 'auto')">
												<p>자기소개말</p>
											</div>
										</div>
									</div>
								</div>
						
								<div id="voted_who">
									<div class="atc_who bg_grey1 scroll_wrap show">
										<h3>
											추천인
											<!--좋아요 누른 사람들 list로 가져와서 뿌려야함  -->
										</h3>
										<div class="inner scrollbar-macosx">
											<ul class="scroll_x">
												<li><span class="inkpf color round"> <img src=""
														alt="닉네임" class="inkpf_img" /></span><br /> <span
													class="vote_nickname">닉네임</span></li>
											</ul>
										</div>
									</div>
								</div>
							</div>
							<div id="comment" class="cmt cmt_bubble">
								<div class="cmt_title">
									<h3>
										댓글 <span class="pt_col text_en cmt_count"><c:out value="${sumCom}"/></span>
									</h3>
								</div>
								<div class="cmt_notice">
									<i class="fas fa-microphone"></i>추천+댓글을 달면 포인트가 더 올라갑니다 <br>
									정치,종교 관련 언급 절대 금지입니다 <br> 상대방의 의견에 반박, 비아냥, 조롱 금지입니다 <br>
									영화는 개인의 취향이니, 상대방의 취향을 존중하세요 <br> <a
										href="https://extmovie.com/notice/30806202"
										style="color: #228b22;">자세한 익무 규칙은 여길 클릭하세요</a>
								</div>
								<!-- //cmt_notice -->
								<div class="cmt_wrap has_top">
									<div class="cmt_list">
									<!--댓글 시작  -->
										<article class="cmt_unit" id="comment_번호">
											<!--프로필 이미지 wrapper 시작  -->
											<div class="inkpf_wrap">
												<span class="inkpf round">
												<img class="inkpf_img" src="http://localhost/prj3_mvc/upload/${profile}" alt="프로필 이미지" /></span>
											</div>
											<!--프로필 이미지 wrapper 끝 -->
											<!--댓글 작성자 wrapper 시작  -->
											<div class="cmt_header">
												<a href="#popup_menu_area" class="nickname member_71600550"
													onclick="return false">닉네임</a>
											</div>
											<!--댓글 작성자 wrapper 끝 -->
											<!--댓글 내용 시작  -->
											<div class="cmt_body">
												<!--BeforeComment(90954240,71600550)-->
												<div class="comment_90954240_71600550 rhymix_content xe_content">
													댓글내용!!!!
												</div>
											<!--댓글 내용 끝  -->
												<!--AfterComment(90954240,71600550)-->
												<div class="cmt_buttons">
														<a class="bt bt2 bt_recomment" href="javascript:void(0)"
															onclick="reComment(90953778,90954240,'/movietalk/comment/90954240/reply?category=61633579');return false;">댓글</a>
												</div>
												<!--작성일 시작-->
												<div class="cmt_date_wrap text_en font_grey1">
													<div class="cmt_date">05.19.03:22</div>
												</div>
												<!--작성일 끝-->
											</div>
											<!--댓글 내용 끝 -->
										</article>
									<!--댓글 끝  -->
									
									<!--대댓글 시작  -->
										<article class="cmt_unit reply" id="comment_대댓번호">
											<div class="inkpf_wrap">
												<span class="inkpf round">
												<img class="inkpf_img" src="http://localhost/prj3_mvc/upload/${profile}" alt="프로필 이미지" /></span>
											</div>
											<div class="cmt_header">
												<a href="" class="nickname member_80215049"
													onclick="return false">닉네임</a> <span
													class="writer pt_bg2">작성자</span>
											</div>
											<div class="cmt_body">
												<div class="parent">
													<i class="fas fa-comment-dots"></i> 부모댓글작성자닉넴
												</div>
												<!--BeforeComment(90954854,80215049)-->
												<div
													class="comment_90954854_80215049 rhymix_content xe_content">
													대댓글내용!!!!</div>
												<!--AfterComment(90954854,80215049)-->
												<div class="cmt_buttons">
														<a class="bt bt2 bt_recomment" href=""
															onclick="">댓글</a>
												</div>
												<div class="cmt_date_wrap text_en font_grey1">
													<div class="cmt_date">05.19.03:22</div>
												</div>
											</div>
										</article>
									<!--대댓글 끝  -->

										
										<!-- //cmt_loop -->
										
										
									</div>
									<!-- //cmt_list -->
								</div>
								<!-- //cmt_wrap -->
								
								
								<div class="cmt_write cmt_write_unit">
									<span class="inkpf round"></span>
									<form action="/" method="post" class="cmt_form"
										onsubmit="return procFilter(this, insert_comment)">
										<!-- <input type="hidden" name="error_return_url"
											value="/movietalk/90953778?category=61633579" /><input
											type="hidden" name="act" value="dispBoardContent" /> <input
											type="hidden" name="mid" value="movietalk" /> <input
											type="hidden" name="document_srl" value="90953778" /> <input
											type="hidden" name="comment_srl" value="" /> <input
											type="hidden" name="content" value="" /> -->
										<div class="cmt_write_input text_ver">
											<!-- <input type="hidden" name="use_html" value="Y" /> <input
												type="hidden" id="htm_90953778" value="n" /> -->
											<textarea class="cmt_textarea" id="editor_90953778" cols="50"
												rows="4" placeholder="댓글 내용을 입력해주세요."></textarea>
										</div>
										<div class="cmt_write_option">
											<div class="bt_area bt_right">
												<button class="ib ib2 ib_color" type="submit">댓글 등록</button>
											</div>
										</div>
									</form>
								</div>


								<!-- //cmt_write -->
							<!-- 	<div class="cmt_write_unit cmt_write_re" id="cmt_write_re">
									<form action="/" method="post" class="cmt_form"	>
										<input type="hidden" name="error_return_url"
											value="/movietalk/90953778?category=61633579" /><input
											type="hidden" name="act" value="dispBoardContent" /> <input
											type="hidden" name="mid" value="movietalk" /> <input
											type="hidden" name="document_srl" value="90953778" /> <input
											type="hidden" name="content" value="" /> <input
											type="hidden" name="comment_srl" value="" /> <input
											type="hidden" name="parent_srl" value="" /> <input
											type="hidden" name="use_html" value="Y" /> <input
											type="hidden" id="htm_2" value="n" /> <span
											class="inkpf round"></span>
										<div class="cmt_write_input text_ver">
											<textarea class="cmt_textarea" id="editor_2"
												placeholder="댓글 내용을 입력해주세요."></textarea>
								
										</div>
										<div class="cmt_write_option">
											
											<div class="bt_area bt_right">
												<button class="ib ib2 ib_mono bt_close" type="button"
													onclick="jQuery('#cmt_write_re').hide();">취소</button>
												<button class="ib ib2 ib_color" type="submit">댓글 등록</button>
											</div>
										</div>
									</form>
								</div> -->
								<!-- //cmt_write_re -->
							
							
							</div>
							
							
							<!--로그인 -->
							<!-- //cmt_wrap -->
			<div class="cmt_write cmt_write_unit no_grant">
				<div class="cmt_not_permitted">
			<i class="fas fa-comment-dots font_grey1"></i> 권한이 없습니다.<a class="ink_link2" href="javascript:void(0)" onclick="inkPop('ink_login2')">로그인</a></div>
			</div>
						</article>
					</section>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
