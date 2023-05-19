<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>





<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko" lang="ko">
<head>
    
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta http-equiv="Expires" content="-1" />
    <meta http-equiv="Pragma" content="no-cache" />
    <meta http-equiv="Cache-Control" content="No-Cache" />
    <meta http-equiv="imagetoolbar" content="no" />
    <meta name="viewport" content="width=1024" />
    <meta name="keywords" content="CGV, 시지브이, 영화관, 극장, 영화, 티켓, 박스오피스, 극장, Movie, Theater, Cinema, Cgv, cgv, 예매, 상영작" />
    <meta name="description" content="CGV는 선진화된 관람문화와 최고의 서비스로 고객에게 잊을 수 없는 감동을 선사합니다. CGV홈페이지를 통해 영화 예매뿐만 아니라 그 이상의 서비스와 감동을 전달하고, 다양한 즐거움과 특별한 경험을 제공하고자 합니다." />
    <meta property="og:site_name" content="영화 그 이상의 감동. CGV"/>
    <meta id="ctl00_og_title" property="og:title" content="통합검색 | 영화 그 이상의 감동. CGV"></meta>
    
    
    <meta id="ctl00_og_image" property="og:image" content="https://img.cgv.co.kr/WebApp/images/common/logo_new_kakao_prevw.png"></meta>
    <link rel="alternate" href="http://m.cgv.co.kr" />
    <link rel="shortcut icon" href="https://img.cgv.co.kr/theater_img/favicon.ico" type="image/x-icon" />
    <title id="ctl00_headerTitle">통합검색 | MOVIEPLANET</title>
    <link rel="shortcut icon" type="image/x-icon" href="https://img.cgv.co.kr/R2014/images/favicon.ico" />
    <link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/webfont.css" />
	<link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/reset.css" />
    <link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/layout.css" />
    <link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/module.css?20211209" />
    <link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/content.css" />
    <link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/common.css" />
    
    <link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/eggupdate.css" />
    <link rel="stylesheet" media="print" type="text/css" href="https://img.cgv.co.kr/R2014/css/print.css" />    
    <link rel="stylesheet" type="text/css" href="https://img.cgv.co.kr/R2014/js/jquery.ui/smoothness/jquery-ui-1.10.4.custom.min.css" />
    
    <script type="text/javascript" src="/common/js/extraTheaters.js"></script>
    <script type="text/javascript" src="https://img.cgv.co.kr/R2014/js/app.config.js"></script>
    <script type="text/javascript" src="https://img.cgv.co.kr/R2014/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="https://img.cgv.co.kr/R2014/js/jquery.plugin/jquery.tmpl.min.js"></script>
    <script type="text/javascript" src="https://img.cgv.co.kr/R2014/js/jquery.plugin/jquery.validate.js"></script>
    <script type="text/javascript" src="https://img.cgv.co.kr/R2014/js/jquery.plugin/jquery.paging.min.js"></script>
    <script type="text/javascript" src="https://img.cgv.co.kr/R2014/js/jquery.ui/jquery-ui-1.10.4.custom.min.js"></script>
    <script type="text/javascript" src="https://img.cgv.co.kr/R2014/js/jquery.utils.js"></script>
    <script type="text/javascript" src="https://img.cgv.co.kr/R2014/js/app.utils.js"></script>
	<script type="text/javascript" src="https://img.cgv.co.kr/R2014/js/jquery.utils.pageing.js"></script>
    <script type="text/javascript" src="https://img.cgv.co.kr/R2014/js/app.init.js"></script>

    <!--[if lte IE 9]><script type="text/javascript" src="https://img.cgv.co.kr/R2014/js/jquery.plugin/jquery.placeholder.js"></script><![endif]-->
    <script type="text/javascript" src="https://img.cgv.co.kr/R2014/js/jquery.plugin/jquery.dotdotdot.min.js"></script>
    <script type="text/javascript" src="https://img.cgv.co.kr/R2014/js/silverlight_link.js"></script>
	<script src="https://img.cgv.co.kr/R2014/js/slick/slick.js" type="text/javascript" charset="utf-8"></script>

    <link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/phototicket/phototicket.css" />
    <link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/slick.css" />
	<link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/slick-theme-custom.css" />

    <script type="text/javascript" src="https://img.cgv.co.kr/R2014/js/icheck/login.timer.js"></script>
    <script src="https://img.cgv.co.kr/R2014/js/icheck/icheck.min.js" type="text/javascript" charset="utf-8"></script>
    <link rel="stylesheet" type="text/css" href="https://img.cgv.co.kr/R2014/js/icheck/iCheck.css" />

    <!-- 2020.05.07 감정지수/프리에그 프로젝트 추가 -->
    <link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/preegg.css" />

     <!-- 2023.03.27 홈페이지 스토어 영역 內 배너 영역 미노출의 件 -->
    <script type="text/javascript" src="https://img.cgv.co.kr/R2014/js/giftstore/giftstore.js"></script>
    <script type="text/javascript" src="https://img.cgv.co.kr/R2014/js/giftstore/commonstore.js"></script>
    <link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/giftstore/giftstore.css" /> 

    <!-- 홈페이지 CSS 일원화로 인한 반영 20220721 -->
    <link rel="stylesheet" type="text/css" href="https://img.cgv.co.kr/resource_pc/css/cgv.min.css" />
    <script type="text/javascript" src="https://img.cgv.co.kr/resource_pc/js/cgvUi.js"></script>

    <!-- 각페이지 Header Start--> 
    


    <!--/각페이지 Header End--> 
<style>
.search_wrap .search_title span:after {
    content: ''
}
</style>   

    
</head>
<body class="">

<div class="skipnaiv">
	<a href="#contents" id="skipHeader">메인 컨텐츠 바로가기</a>
</div>    
<div id="cgvwrap">
    
	
	<div class="header">			
            <!-- 서비스 메뉴 --> 
            
<div class="header_content">
    <div class="contents">
        <h1 onclick=""><a href="/"><img src="http://localhost/test_prj/admin/images/movie.png" alt="CGV" /></a><span>MOVIEPLANET</span></h1>
        <ul class="memberInfo_wrap">

            
            <!-- <li><a href="/user/login/?returnURL=http%3a%2f%2fwww.cgv.co.kr%2fsearch%2fdefault.aspx%3fquery%3d%ec%95%84%eb%b0%94%ed%83%80"><img src="https://img.cgv.co.kr/R2014/images/common/ico/loginPassword.png" alt="로그인" /><span>로그인</span></a></li>
            <li><a href="/user/join/"><img src="https://img.cgv.co.kr/R2014/images/common/ico/loginJoin.png" alt="회원가입" /><span>회원가입</span></a></li>
            
            
            <li><a href="/user/mycgv/"><img src="https://img.cgv.co.kr/R2014/images/common/ico/loginMember.png" alt="MY CGV" /><span>MY CGV</span></a></li>
            <li><a href="/support/default.aspx"><img src="https://img.cgv.co.kr/R2014/images/common/ico/loginCustomer.png" alt="고객센터" /><span>고객센터</span></a></li> -->
        </ul>
    </div>
</div>

<script>
    //GA Analytics TopMenu 영역 LOG
    //빨강 CGV클릭
    $('.header_content > .contents > h1 > a').on({
        click: function (e) {
            gaEventLog('PC_GNB', '홈', '');
        }
    });
    //서비스 메뉴
    $('.header_content > .contents > ul > li > a').on({
        click: function (e) {
            gaEventLog('PC_GNB', '서비스메뉴_'+this.text, '');
        }
    });

   

</script>
            <!-- 서비스 메뉴 -->
           
			<!-- 서브 메뉴 -->
			
<script type="text/javascript">
    $(document).ready(function () {
        $('.nav_menu > li > h2 > a').on({
            mouseenter: function (e) {
                var target = e.target;
                $(target).parents('.nav_menu').find('.nav_overMenu').slideDown(function () {
                    $('.nav').addClass('active');
                });
            },
            click: function (e) {
                var target = e.target;
                if (!$('.nav').hasClass('active')) {
                    $(this).trigger('mouseenter');
                } else {
                    $('.nav').trigger('mouseleave');
                }
            }
        });

        /********************************************************
        //서브메뉴 구글 GA Analytics 로그 처리 - 2022.01.12 myilsan
        ********************************************************/
        //cgv화이트 메뉴클릭
        $('.nav > .contents > h1 > a').on({
             click: function (e) {
                 gaEventLog('PC_GNB', '홈', '');
            }
        });

        //주메뉴 클릭
        $('.nav_menu > li > h2 > a').on({
            click: function (e) {
                gaEventLog('PC_GNB', '주메뉴_' + this.text, '');
            }
        });

        //주메뉴 하위메뉴 클릭
        $('.nav_overMenu > dd > h3 > a').on({
            click: function (e) {
                var target = e.target;
                var parText = $(target).parents('.nav_overMenu').find('dt')[0].innerText;
                gaEventLog('PC_GNB', parText + '_' + this.text, '');
            }
        });

        //하위메뉴 최상위 클릭
        $(".nav_overMenu > dt > h2 > a").on({
            click: function (e) {
                gaEventLog('PC_GNB',this.text + '_' + this.text, '');
            }
        });

        //------------------end----------------------- [@,.o]>

        $('.nav').on({
            mouseleave: function (e) {
                $(this).find('.nav_overMenu').slideUp(200, function () {
                    $('.nav').removeClass('active');
                });
            }
        });

        $('.totalSearch_wrap input[type=text]').on({
            focusin: function () {
                $('.totalSearch_wrap').addClass("active");
            }
        });

        $('.btn_totalSearchAutocomplete_close').on({
            click: function () {
                $('.totalSearch_wrap').removeClass("active");
            },
            focusout: function (e) {
                //     $('.totalSearch_wrap').removeClass("active");

            }
        });

        $(this).on({
            scroll: function (e) {
                /* S GNB fixed */
                var headerOffsetT = $('.header').offset().top;
                var headerOuterH = $('.header').outerHeight(true);
                var fixedHeaderPosY = headerOffsetT + headerOuterH;
                var scrollT = $(this).scrollTop();
                var scrollL = $(this).scrollLeft();

                if (scrollT >= fixedHeaderPosY) {
                    $('.nav').addClass('fixed');
                    $('.fixedBtn_wrap').addClass('topBtn');
                } else {
                    $('.nav').removeClass('fixed');
                    $('.fixedBtn_wrap').removeClass('topBtn');
                }

                /* S > GNB fixed 좌우 스크롤
                Description
                - GNB가 fixed 되었을때 좌우 스크롤 되게 처리
                */
                if ($('.nav').hasClass('fixed')) {
                    $('.nav').css({ 'left': -1 * scrollL })
                } else {
                    $('.nav').css({ 'left': 0 })
                }
                /* E > GNB fixed 좌우 스크롤 */
                /* S GNB fixed */
            }
        });

        $('.btn_gotoTop').on({
            click: function () {
                $('html, body').stop().animate({
                    scrollTop: '0'
                }, 400);
            }
        });

        //통합검색 상단 검색 버튼
        $('#btn_header_search').on('click', function () {

           
            if ($('#header_ad_keyword').val() != "")
                goSearch($('#header_ad_keyword'));      //광고
            else
                goSearch($('#header_keyword'));

            
            return false;
        });

        //통합검색 검색어 입력창
        $('#header_keyword').keyup(function (e) {
            if (e.keyCode == 13) goSearch($('#header_keyword'));
        });

         //검색 입력창 클릭 시 광고값 reset
        $('#header_keyword').on('click', function () {
            $(this).attr('placeholder', '');
            $('#header_ad_keyword').val('');
        });

    });

    //통합검색
    function goSearch($objKeyword) {

        if ($objKeyword.val() == "") {
            alert("검색어를 입력해 주세요");
            $objKeyword.focus();
            return false;
        }

        //GA 검색로그
        gaEventLog('PC_GNB', '검색', $objKeyword.val());
        location = "/search/?query=" + escape($objKeyword.val());
    }

   

    //상단 키워드 광고 (S)
    function AdSearchExt(txt, SearchText) {
        $('#header_keyword').attr('placeholder', txt);
        $('#header_ad_keyword').val(SearchText);
    }

    function hdIcoSet(left, sh) { }
    //상단 키워드 광고 (E)

    //상단광고닫기
    function hideCgvTopAd() {
        $(".cgv-ad-wrap").hide();
        $('#wrap_main_notice').parent('div').css('top', 280);
    }

    //비즈스프링 클릭로그
    function setClickLog(title) {
        // eval("try{trk_clickTrace('EVT', '" + title + "')}catch(_e){}");
    }

</script>
<div class="nav">
    <div class="contents">
        <h1><a href="/" tabindex="-1"></a></h1>
        <ul class="nav_menu">
            <li>
                <h2><a href="/movies/?lt=1&ft=0">영화</a></h2>
            </li>
            <li>
                <h2><a href="/ticket/"><strong>예매</strong></a></h2>
            </li>
            <li>
            </li>
            <li>
            </li>
            <li>
            </li>
        </ul>
        <div class="totalSearch_wrap">
            <label for="totalSearch">
                <input type="text" id="" value="" placeholder="영화명 검색"/>
                <input type="hidden" id="header_ad_keyword" name="header_ad_keyword" />
            </label>
            <button type="button" class="btn_totalSearch" id="btn_header_search">검색</button>
            <!--<div class="totalSearchAutocomplete_wrap">
                <dl class="totalSearchAutocomplete_list">
                    <dt>영화</dt>
                    <dd><a href="#none"><strong>전지</strong>적 작가시점</a></dd>
                    <dd><a href="#none">내언니 <strong>전지</strong>현과 나</a></dd>
                    <dd><a href="#none">수호<strong>전지</strong> 영웅본색</a></dd>
                </dl>
                <dl class="totalSearchAutocomplete_list">
                    <dt>인물</dt>
                    <dd><a href="#none"><strong>전지</strong>현</a></dd>
                    <dd><a href="#none"><strong>전지</strong>희</a></dd>
                    <dd><a href="#none">이<strong>전지</strong></a></dd>
                </dl>
                <a href="#none" class="btn_totalSearchAutocomplete_close">닫기</a>
            </div>//-->
        </div>
    </div>
</div>
            <!-- 서브 메뉴 -->			
	</div>
	<!-- E Header -->

	<!-- Contaniner -->
	<div id="contaniner"  class=""><!-- 벽돌 배경이미지 사용 시 class="bg-bricks" 적용 / 배경이미지가 없을 경우 class 삭제  -->
        

		<!-- Contents Area -->
		 <div id="contents" class="">
        
            
            <!-- Contents Start -->
			
 
<script type="text/javascript" src="http://img.cgv.co.kr/R2014/js/swiper.min.js" ></script>
<link rel="stylesheet" media="all" type="text/css" href="http://img.cgv.co.kr/R2014/css/swiper-bundle.min.css" />
<form name="aspnetForm" method="post" action="./?query=%uc544%ubc14%ud0c0" id="aspnetForm">
<div>
<input type="hidden" name="__EVENTTARGET" id="__EVENTTARGET" value="" />
<input type="hidden" name="__EVENTARGUMENT" id="__EVENTARGUMENT" value="" />
<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="/wEPDwUKMTI0ODM3Nzc0N2RkxI/Oif3xFkQ3z1QEN/paqSsRmBU=" />
</div>

<script type="text/javascript">
//<![CDATA[
var theForm = document.forms['aspnetForm'];
if (!theForm) {
    theForm = document.aspnetForm;
}
function __doPostBack(eventTarget, eventArgument) {
    if (!theForm.onsubmit || (theForm.onsubmit() != false)) {
        theForm.__EVENTTARGET.value = eventTarget;
        theForm.__EVENTARGUMENT.value = eventArgument;
        theForm.submit();
    }
}
//]]>
</script>


<script src="/WebResource.axd?d=O5F0dg69w2r38nWidHYzn3F_LoSxgzI-r_CxvaKM90QJYNm7EusOdLlLVPQdIrk6Xrhi_bPxR7gTuM63_-5osEN5N101&amp;t=636765788300000000" type="text/javascript"></script>


<script src="/ScriptResource.axd?d=vLDCNIe58OYCp1IBznLOa_7ELQjFZW7qqCtHGjAoJN9G2a2Qoq_JYgpEes8D2_T9DfwTzV1rsPeeiifVB5MYJPzLqJmctD5iSrTyPcuVrYGC5-iA6RANgXkCerthNVAps74VQ-OSHkjbo7ldw9keOP3Zh7I1&amp;t=ffffffff999c3159" type="text/javascript"></script>
<script src="/ScriptResource.axd?d=mizHOlpiVKV2a1df2yfQWN7BiqRY8me6FhRswTmihxriWROjj-dr8iQK9KXpa6Y2RlWnBj5emUfLX_yU6zzvBNvwwL6oRDyN9QNB5D8GLyR6V95X20QLdH1dY1G4cGxhkighz3yJZqs6U8L5LEwDEdmwyfBw44BOgCWFY4TGtKfYaE8k0&amp;t=ffffffff999c3159" type="text/javascript"></script>

<div>

	<input type="hidden" name="__VIEWSTATEGENERATOR" id="__VIEWSTATEGENERATOR" value="59A49A67" />
</div>
<script type="text/javascript">
//<![CDATA[
Sys.WebForms.PageRequestManager._initialize('ctl00$PlaceHolderContent$ScriptManager1', 'aspnetForm', [], [], [], 90, 'ctl00');
//]]>
</script>
 
</form>
 <!-- 실컨텐츠 시작 -->
    <div class="search_wrap">
        <div class="searchingMovieResult_wrap" id ="searchMovieResult">
        <!-- S > CASE 1: 검색결과 있음 -->
	<td id="ctl00_PlaceHolderContent_countNR">
						<strong class='search_title'><span id='movieCount'></span></strong>
						</td>


	<ul class='searchingMovieResult_list'>
        
               
                <li>
						<a href="/movies/detail-view/?midx=86072" class="img_wrap">
						<img src ="https://img.cgv.co.kr/Movie/Thumbnail/Poster/000086/86072/86072_320.jpg" alt ="아바타-물의 길"  onerror="errorImage(this)">
                        			 <p class='movieState screening'><strong>상영중</strong><span> 예매율0.0%</span></p>
						</a>
								<div class='searchingMovieResult_info_wrap'>
									<strong class='searchingMovieName'>아바타-물의 길
                                    <!-- 영상물 등급 노출 변경 2022.08.24 -->
                                    <i class="cgvIcon etc age12">12</i>
                                    <!-- <img src="https://img.cgv.co.kr/R2014/images/common/flag/age/12.png" alt="12세이상"> -->
                                    </strong>
									<span>2022.12.14 개봉</span>
									<span><div>
                                            <img src='https://img.cgv.co.kr/R2014/Images/common/egg/eggGoldenegggreat.png'/>
                                            <span>96%</span>
                                        </div></span>
					</div>
				</li>
            
               
                <li>
						<a href="/movies/detail-view/?midx=86217" class="img_wrap">
						<img src ="https://img.cgv.co.kr/Movie/Thumbnail/Poster/000086/86217/86217_320.jpg" alt ="아바타 리마스터링"  onerror="errorImage(this)">
                        			 
						</a>
								<div class='searchingMovieResult_info_wrap'>
									<strong class='searchingMovieName'>아바타 리마스터링
                                    <!-- 영상물 등급 노출 변경 2022.08.24 -->
                                    <i class="cgvIcon etc age12">12</i>
                                    <!-- <img src="https://img.cgv.co.kr/R2014/images/common/flag/age/12.png" alt="12세이상"> -->
                                    </strong>
									<span>2022.09.21 개봉</span>
									<span><div>
                                            <img src='https://img.cgv.co.kr/R2014/Images/common/egg/eggGoldenegggreat.png'/>
                                            <span>99%</span>
                                        </div></span>
					</div>
				</li>
            
               
                <li>
						<a href="/movies/detail-view/?midx=80723" class="img_wrap">
						<img src ="https://img.cgv.co.kr/Movie/Thumbnail/Poster/000080/80723/80723_320.jpg" alt ="아바타"  onerror="errorImage(this)">
                        			 
						</a>
								<div class='searchingMovieResult_info_wrap'>
									<strong class='searchingMovieName'>아바타
                                    <!-- 영상물 등급 노출 변경 2022.08.24 -->
                                    <i class="cgvIcon etc age12">12</i>
                                    <!-- <img src="https://img.cgv.co.kr/R2014/images/common/flag/age/12.png" alt="12세이상"> -->
                                    </strong>
									<span>2018.06.21 개봉</span>
									<span><div>
                                            <img src='https://img.cgv.co.kr/R2014/Images/common/egg/eggGoldenegggreat.png'/>
                                            <span>99%</span>
                                        </div></span>
					</div>
				</li>
                <li>
						<a href="/movies/detail-view/?midx=80723" class="img_wrap">
						<img src ="https://img.cgv.co.kr/Movie/Thumbnail/Poster/000080/80723/80723_320.jpg" alt ="아바타"  onerror="errorImage(this)">
                        			 
						</a>
								<div class='searchingMovieResult_info_wrap'>
									<strong class='searchingMovieName'>아바타
                                    <!-- 영상물 등급 노출 변경 2022.08.24 -->
                                    <i class="cgvIcon etc age12">12</i>
                                    <!-- <img src="https://img.cgv.co.kr/R2014/images/common/flag/age/12.png" alt="12세이상"> -->
                                    </strong>
									<span>2018.06.21 개봉</span>
									<span><div>
                                            <img src='https://img.cgv.co.kr/R2014/Images/common/egg/eggGoldenegggreat.png'/>
                                            <span>99%</span>
                                        </div></span>
					</div>
				</li>
                <li>
						<a href="/movies/detail-view/?midx=80723" class="img_wrap">
						<img src ="https://img.cgv.co.kr/Movie/Thumbnail/Poster/000080/80723/80723_320.jpg" alt ="아바타"  onerror="errorImage(this)">
                        			 
						</a>
								<div class='searchingMovieResult_info_wrap'>
									<strong class='searchingMovieName'>아바타
                                    <!-- 영상물 등급 노출 변경 2022.08.24 -->
                                    <i class="cgvIcon etc age12">12</i>
                                    <!-- <img src="https://img.cgv.co.kr/R2014/images/common/flag/age/12.png" alt="12세이상"> -->
                                    </strong>
									<span>2018.06.21 개봉</span>
									<span><div>
                                            <img src='https://img.cgv.co.kr/R2014/Images/common/egg/eggGoldenegggreat.png'/>
                                            <span>99%</span>
                                        </div></span>
					</div>
				</li>
                <li>
						<a href="/movies/detail-view/?midx=80723" class="img_wrap">
						<img src ="https://img.cgv.co.kr/Movie/Thumbnail/Poster/000080/80723/80723_320.jpg" alt ="아바타"  onerror="errorImage(this)">
                        			 
						</a>
								<div class='searchingMovieResult_info_wrap'>
									<strong class='searchingMovieName'>아바타
                                    <!-- 영상물 등급 노출 변경 2022.08.24 -->
                                    <i class="cgvIcon etc age12">12</i>
                                    <!-- <img src="https://img.cgv.co.kr/R2014/images/common/flag/age/12.png" alt="12세이상"> -->
                                    </strong>
									<span>2018.06.21 개봉</span>
									<span><div>
                                            <img src='https://img.cgv.co.kr/R2014/Images/common/egg/eggGoldenegggreat.png'/>
                                            <span>99%</span>
                                        </div></span>
					</div>
				</li>
                <li>
						<a href="/movies/detail-view/?midx=80723" class="img_wrap">
						<img src ="https://img.cgv.co.kr/Movie/Thumbnail/Poster/000080/80723/80723_320.jpg" alt ="아바타"  onerror="errorImage(this)">
                        			 
						</a>
								<div class='searchingMovieResult_info_wrap'>
									<strong class='searchingMovieName'>아바타
                                    <!-- 영상물 등급 노출 변경 2022.08.24 -->
                                    <i class="cgvIcon etc age12">12</i>
                                    <!-- <img src="https://img.cgv.co.kr/R2014/images/common/flag/age/12.png" alt="12세이상"> -->
                                    </strong>
									<span>2018.06.21 개봉</span>
									<span><div>
                                            <img src='https://img.cgv.co.kr/R2014/Images/common/egg/eggGoldenegggreat.png'/>
                                            <span>99%</span>
                                        </div></span>
					</div>
				</li>
                <li>
						<a href="/movies/detail-view/?midx=80723" class="img_wrap">
						<img src ="https://img.cgv.co.kr/Movie/Thumbnail/Poster/000080/80723/80723_320.jpg" alt ="아바타"  onerror="errorImage(this)">
                        			 
						</a>
								<div class='searchingMovieResult_info_wrap'>
									<strong class='searchingMovieName'>아바타
                                    <!-- 영상물 등급 노출 변경 2022.08.24 -->
                                    <i class="cgvIcon etc age12">12</i>
                                    <!-- <img src="https://img.cgv.co.kr/R2014/images/common/flag/age/12.png" alt="12세이상"> -->
                                    </strong>
									<span>2018.06.21 개봉</span>
									<span><div>
                                            <img src='https://img.cgv.co.kr/R2014/Images/common/egg/eggGoldenegggreat.png'/>
                                            <span>99%</span>
                                        </div></span>
					</div>
				</li>
                <li>
						<a href="/movies/detail-view/?midx=80723" class="img_wrap">
						<img src ="https://img.cgv.co.kr/Movie/Thumbnail/Poster/000080/80723/80723_320.jpg" alt ="아바타"  onerror="errorImage(this)">
                        			 
						</a>
								<div class='searchingMovieResult_info_wrap'>
									<strong class='searchingMovieName'>아바타
                                    <!-- 영상물 등급 노출 변경 2022.08.24 -->
                                    <i class="cgvIcon etc age12">12</i>
                                    <!-- <img src="https://img.cgv.co.kr/R2014/images/common/flag/age/12.png" alt="12세이상"> -->
                                    </strong>
									<span>2018.06.21 개봉</span>
									<span><div>
                                            <img src='https://img.cgv.co.kr/R2014/Images/common/egg/eggGoldenegggreat.png'/>
                                            <span>99%</span>
                                        </div></span>
					</div>
				</li>
            
               
                <li>
						<a href="/movies/detail-view/?midx=77601" class="img_wrap">
						<img src ="https://img.cgv.co.kr/Movie/Thumbnail/Poster/000077/77601/77601_320.jpg" alt ="아바타 정글의 비밀"  onerror="errorImage(this)">
                        			 
						</a>
								<div class='searchingMovieResult_info_wrap'>
									<strong class='searchingMovieName'>아바타 정글의 비밀
                                    <!-- 영상물 등급 노출 변경 2022.08.24 -->
                                    <i class="cgvIcon etc ageAll">All</i>
                                    <!-- <img src="https://img.cgv.co.kr/R2014/images/common/flag/age/All.png" alt="전체관람가"> -->
                                    </strong>
									<span>2014.03.27 개봉</span>
									<span><div>
                                            <img src='https://img.cgv.co.kr/R2014/Images/common/egg/eggGoldenegggood.png'/>
                                            <span>?</span>
                                        </div></span>
					</div>
				</li>
            
               
            
	</ul>
    <?xml version="1.0" encoding="utf-8"?>
<div class="paging">
</div>
        </div>
    </div>

            
		 </div>
		<!-- /Contents Area -->
	</div>
    <div class="fixedBtn_wrap">
        <a href="#none" class="btn_gotoTop"><img src="https://img.cgv.co.kr/R2014/images/common/btn/gotoTop.png" alt="최상단으로 이동" /></a>
    </div>
    <!-- TOP Fixed 버튼 -->
    
</div>


</body>
</html>