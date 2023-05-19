<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



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
    <meta id="ctl00_ctl00_og_title" property="og:title" content="프로필관리 &lt; My CGV | 영화 그 이상의 감동. CGV"></meta>
    
    
    <meta id="ctl00_ctl00_og_image" property="og:image" content="https://img.cgv.co.kr/WebApp/images/common/logo_new_kakao_prevw.png"></meta>
    <link rel="alternate" href="http://m.cgv.co.kr" />
    <link rel="shortcut icon" href="https://img.cgv.co.kr/theater_img/favicon.ico" type="image/x-icon" />
    <title id="ctl00_ctl00_headerTitle">프로필관리 &lt;</title>
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

    <!-- 홈페이지 CSS 일원화로 인한 반영 20220721 -->
    <link rel="stylesheet" type="text/css" href="https://img.cgv.co.kr/resource_pc/css/cgv.min.css" />
    <script type="text/javascript" src="https://img.cgv.co.kr/resource_pc/js/cgvUi.js"></script>

    <!-- 각페이지 Header Start--> 
    
    <link rel="stylesheet" media="all" type="text/css" href="https://img.cgv.co.kr/R2014/css/phototicket/phototicket.css" />
    <!--통합결제-->
    <link rel="stylesheet" type="text/css" href="https://img.cgv.co.kr/R2014/css/mypagenew.css" />

    <!--/각페이지 Header End--> 
   

    
</head>
<body class="">

<div class="skipnaiv">
	<a href="#contents" id="skipHeader">메인 컨텐츠 바로가기</a>
</div>    
<div id="cgvwrap">
    
    
  
	
      <!-- S Header
        Description
        - class 'nav' 에 class 'active' 추가시 서브메뉴노출
        - class 'nav' 에 class 'fixed' 추가시 상단고정되며 스타일 변경됨
     -->
	<div class="header">			
            <!-- 서비스 메뉴 --> 
            
<div class="header_content">
    <div class="contents">
        <h1 onclick=""><a href="/"><img src="http://localhost/prj3_mvc/images/movie.png" alt="CGV" /></a><span>MOVIEPLANET</span></h1>
        <ul class="memberInfo_wrap">
            
            
            <li><a href="/user/mycgv/"><img src="https://img.cgv.co.kr/R2014/images/common/ico/loginMember.png" alt="MY CGV" /><span>마이페이지</span></a></li>
            <!-- <li><a href="/support/default.aspx"><img src="https://img.cgv.co.kr/R2014/images/common/ico/loginCustomer.png" alt="고객센터" /><span>고객센터</span></a></li> -->
        </ul>
    </div>
</div>


<div class="nav">
    <div class="contents">
        <h1><a href="/" tabindex="-1"><img src="https://img.cgv.co.kr/R2014/images/common/logo/logoWhite.png" alt="CGV" /></a></h1>
        <ul class="nav_menu">
            <li>
                <h2><a href="/movies/?lt=1&ft=0">영화</a></h2>
            </li>
            <li>
                <h2><a href="/ticket/">예매</a></h2>
            </li>
            <li>
                <h2><a href="/culture-event/popcorn-store/"></a></h2>
                
            </li>
            <li>
                <h2 onclick="gaEventLog('PC_GNB','주메뉴_이벤트','')"><a href="/culture-event/event/defaultNew.aspx"></a></h2>
            </li>
            <li>
                <h2 onclick="gaEventLog('PC_GNB','주메뉴_해택','')"><a href="/discount/discountlist.aspx"></a></h2>
            </li>
        </ul>
        <div class="totalSearch_wrap">
            <label for="totalSearch">
                <input type="text" id="header_keyword" placeholder="영화명 검색" />
                <input type="hidden" id="header_ad_keyword" name="header_ad_keyword" />
            </label>
            <button type="button" class="btn_totalSearch" id="btn_header_search">검색</button>
            <iframe src="//ad.cgv.co.kr/NetInsight/html/CGV/CGV_201401/main@Search_txt" width="0" height="0" title="" frameborder="0" scrolling="no" marginwidth="0" marginheight="0" allowfullscreen="allowfullscreen" mozallowfullscreen="mozallowfullscreen" msallowfullscreen="msallowfullscreen" oallowfullscreen="oallowfullscreen" webkitallowfullscreen="webkitallowfullscreen"></iframe>
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
			
   

<div class="cols-content" id="menu">
    <div class="col-aside">
		<div class="skipnaiv">
			<a href="#mycgv_contents" id="skipMycgvMenu">MYCGV 서브메뉴 건너띄기</a>
		</div>
	    <h2>MY CGV 서브메뉴</h2>
	    <div class="snb">
	        <ul>
	            <li >
                    <a href="/user/mycgv/?g=1" >MY CGV HOME <i></i></a>
                </li>
	           
                        
	        </ul>
	        <ul>
                 <li>
                    <a href="" title="현재 선택">프로필 관리<i></i></a>
                </li>
	            
                        
	        </ul>
	       
	    </div>
    </div>
	<div class="col-detail" id="mycgv_contents">
	    
    <input type="hidden" id="isIPIN" name="isIPIN" value="jFZKM5GCrrspxSCDBJ/aZPJzBHY84L6fg3gkITx1hLIKdGBTiHNfbVLgRDBBtHzxd4gu39B69dAGYP5rjFUhWQ==" />
<div class="tit-mycgv">
    <h3>나의 정보</h3>
</div>
<div class="tit-mycgv">
    <h4>나의 프로필</h4>
</div>



<!--1-->

<form name="aspnetForm" method="post" action="./edit-myinfo-myprofile.aspx" id="aspnetForm" enctype="multipart/form-data" novalidate="novalidate">
<div>
<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="/wEPDwULLTE5NDY1OTc2MjJkZGXGZF9rPaBjXwH1HbdmUHs5/x2S" />
</div>

<div>

	<input type="hidden" name="__VIEWSTATEGENERATOR" id="__VIEWSTATEGENERATOR" value="5FA425E8" />
</div>
<div class="tbl-form">
    <table summary="나의프로필정보 이름,아이디, 닉네임,프로필이미지 표기">
        <caption>나의프로필정보</caption>
        <colgroup>
        <col width="19%" />
        <col width="*" />
        </colgroup>
        <tbody>
            <tr>
                <th scope="row">이름</th>
                <td><strong><c:out value="${name}"/></strong></td>
            </tr>
            <tr>
                <th scope="row">아이디</th>
                <td><span><c:out value="${user_id}"/></span></td>
            </tr>
            <tr>
                <th scope="row"><label for="nick_name">닉네임</label></th>
                <td>
                    <p>한글, 영문, 숫자 혼용 가능 (한글 기준 10자 이내)</p>
                    <input type="hidden" id="old_nick_name" name="old_nick_name" value="" /> 
                    <input type="text" id="nick_name" name="nick_name" 
                    value="<c:out value="${nick_name}"/>" required="required" maxlength="10" class="s-medium" /> 
                    <button id="check_duplication" type="button" class="round gray"><span>중복확인</span></button>
                </td>
            </tr>
            
            <tr>
                <th scope="row">프로필이미지</th>
                <td>
                    <p class="profile-info">각 서비스(이벤트, 매거진, 영화리뷰 등)의 리뷰 및 덧글작성시 등록하신 대표이미지가 노출됩니다.<br />프로필 이미지 종류를 선택해 주세요.</p>
                    <%-- <input type="hidden" id="profile" name="profile" value="<c:out value="${profile}"/>" />
                    <input type="hidden" id="user_small_image" name="user_small_image" value="" /> --%>
                    <div class="sect-profile-img">
                        <div class="box-image" style="border:1px solid #333;">
                            <span class="thumb-image" >
                                <img id="profile" name="profile" src="<c:out value="${profile}"/>" alt="${name }님 프로필 사진" onerror="errorImage(this, {type:'profile'})" />
                                <span class="profile-mask"></span>
                                
                            </span>
                        </div>
                        <div class="box-contents">
                            <p>jpg, gif, BMP 파일만 등록 가능합니다. (최대 3M)</p>
                            <input type="file" id="profile_upload_file" name="profile_upload_file" title="내용"  />
                        </div>
                    </div>

					<!-- 나의 프로필 / cgv 정보 : 프로필 관리 -->
					

                </td>
            </tr>
            
             <tr>
                <th scope="row"><label>자기소개</label></th>
                <td>
                    <p>자기소개를 입력해주세요 (한글 기준 100자 이내)</p>
                    <textarea id="profile_msg" name="profile_msg" maxlength="100" class=""><c:out value="${profile_msg }"/></textarea>
                </td>
            </tr>
            
            
            
        </tbody>
    </table>
</div>
<div class="set-btn aright"><button type="button" id="set_profile" class="round inred on" ><span>등록하기</span></button></div>
</form>







<script type="text/javascript" src="https://img.cgv.co.kr/R2014//js/system/crypto.js"></script>
<script type="text/javascript">
//<![CDATA[
    (function ($) {
        $(function () {

            //######################## SSL관련 hidden작업  (s) #######################

            


            $('#set_profile').on('click', function () {
                var rd_agree_profileInfo = $("input[name='rd_agree_profileInfo']:checked").val();

                var msg = "동의 안함 설정 시, ";
                var itemNoCnt = 0;

                if (rd_agree_profileInfo == "N") {
                    msg = msg + "[닉네임] [프로필 사진]";
                    itemNoCnt++;
                }
                msg = msg + " 를 이용하실 수 없습니다.";

                if (itemNoCnt > 0) {
                    alert(msg);
                }


                if (rd_agree_profileInfo == "Y") {
                    if ($('#nick_name').val() != '' && $('#old_nick_name').val() != $('#nick_name').val() && $('#check_duplication').attr('data') != 1) {
                        alert('닉네임 중복확인 해주세요.');
                        $('#check_duplication').focus();
                        return false;
                    }
                }

            });

          
            //######################## SSL관련 hidden작업  (e) #######################



          
       

            $('#delete_image').on('click', function () {
                if (!confirm('설정된 프로필 이미지를 삭제 하시겠습니까?'))
                    return;

                $('#img_userprofileimage').attr('src', '');
                $('#user_small_image').val('');
                $('#user_image').val('');
                $('#delete_image').remove();
            });

      

            $('#check_duplication').on('click', function () {
                var _this = $(this);
                var nickNameObj = $('#nick_name');

                if (nickNameObj.val() == '') {
                    alert('닉네임을 정상적으로 입력해주세요.');
                    return nickNameObj.focus();
                }

                var url = '/common/ajax/user.aspx/CheckDuplicationByNickName';
                var data = { 'nickName': nickNameObj.val() };

                var callback = function (result) {
                    if (result == null || result.resultCode == null) return;
                    var resultCode = result.resultCode;

                    if (resultCode == "") {
                        alert("오류가 발생하였습니다.");
                        _this.attr('data', 0);
                    }
                    else if (resultCode != "0") {
                        alert('입력하신 닉네임 정보는 이미 사용중 입니다.\n다른 닉네임 정보를 입력해 주세요.');
                        nickNameObj.focus();
                        _this.attr('data', 0);
                    }
                    else {
                        alert('입력하신 닉네임 정보는 사용가능한 정보 입니다.');
                        _this.attr('data', 1);
                    }
                };

                app.ajax().set({ dataType: 'json', url: url, data: JSON.stringify(data), contentType: "application/json; charset=utf-8", successHandler: callback });
            });

            $('.sect-profile-img > .box-contents > input[type=radio]').on('click', function () {
                var profileImageCode = $(this).data('code');
                var objProfileImage = $('#profile_upload_file');

                if (profileImageCode != "user") {
                    objProfileImage.attr('disabled', 'disabled');

                    var profileImageValue = $(this).val();
                    var winPop;
                }
                else {
                    objProfileImage.removeAttr('disabled');
                }

                objProfileImage.attr('src', $(this).val());
            });

            $("input[name=rd_agree_profileInfo]").on('click', function () {
                //닉네임
                if ($('input:radio[name="rd_agree_profileInfo"]:checked').val() == "Y") {
                    $('#nick_name').attr("disabled", false);
                } else if ($('input:radio[name="rd_agree_profileInfo"]:checked').val() == "N") {
                    $('#nick_name').attr("disabled", true);
                    $('#nick_name').val('');

                    $('#img_userprofileimage').attr('src', '');
                    $('#user_small_image').val('');
                    $('#user_image').val('');
                    $('#delete_image').remove();
                }
            });

         
            fnLoding();
            function fnLoding() {

                /* 1번 탭 S */
                if ($('input:radio[name="rd_agree_profileInfo"]:checked').val() == "N") {
                    $('#nick_name').attr("disabled", true);
                }
                /* 1번 탭 E */

            }


            function getCookie(cookieName) {
                var nameOfcookie = name + "=";
                var x = 0;
                while (x <= document.cookie.length) {
                    var y = (x + nameOfcookie.length);
                    if (document.cookie.substring(x, y) == nameOfcookie) {
                        if ((endOfcookie = document.cookie.indexOf(";", y)) == -1)
                            endOfcookie = document.cookie.length;
                        return unescape(document.cookie.substring(y, endOfcookie));
                    }
                    x = document.cookie.indexOf(" ", x) + 1;
                    if (x == 0)
                        break;
                }
                return "";
            }

            /*
            function validateEmailDomain(val) {
                return /(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/.test(val);
            }
            $('#special_day').next().children().attr({
                'alt': 'special day 선택'
            });
            */

        });
    })(jQuery);
//]]>
</script>
<script type="text/javascript">
    function setProfileImage(snsType, imgUrl) {
        $('#img_userprofileimage').attr('src', imgUrl);
    }
    
</script>

<!-- c_tab_re 제어 -->
<script type="text/javascript">
    $(function () {
        function cTabControll() {
            $('.c_tab_re').each(function () {
                var onTit = $(this).find('> li.on > a').attr('title');
                $(this).find('> li > a').click(function () {
                    var btn = $(this).parent();
                    var myNum = btn.index();
                    var myConts = $(this).parents('.c_tab_wrap_re').nextUntil('.c_tab_wrap_re', '.c_tab_recont');
                    var myCont = myConts.eq(myNum);

                    btn.siblings().removeClass('on');
                    btn.siblings().find('> a').removeAttr('title');
                    btn.addClass('on');
                    btn.find('> a').attr('title', onTit);

                    myConts.removeClass('on');
                    myCont.addClass('on');

                    return false;

                })

            })
        } cTabControll();
    });
</script>
<script type="text/javascript">
/*
    function setAddressData(data) {

        var zipcode1Obj = $('#zipcode1');
        var zipcode2Obj = $('#zipcode2');
        var addressObj = $('#address');
        var addressDetailObj = $('#address_detail');
        var doroNmAddr1Obj = $('#rd_home_addr_1');
        var doroNmAddr2Obj = $('#rd_home_addr_2');
        var doroidObj = $('#rd_home_addr_id');
        var doroseqObj = $('#rd_home_addr_seq');

        zipcode1Obj.val(data['zipcode']);
        zipcode2Obj.val(data['zipcode1']);
        addressObj.val(data['address']);
        addressDetailObj.val(data['address_detail'] + (data['addr_item'] == "" ? "" : " " + data['addr_item']));
        doroNmAddr1Obj.val(data['doro_nm_addr']);
        doroNmAddr2Obj.val(data['address_detail']);
        doroidObj.val(data['doroid']);
        doroseqObj.val(data['doroseq']);
    }
    */
</script>

	</div>
</div>
<script id="temp_view_usergrade" type="text/x-jquery-tmpl">

<div class="popwrap" style="width:330px;margin-top:-500px;margin-left:-165px">

						<h1>VIP 등급 이력</h1>
						<div class="pop-contents">
						<!-- Contents Addon -->
							<div class="sect-my-grade">
								<p><strong>김규미</strong> 고객님의 연도별 고객 등급 이력입니다.</p>
								<div class="grade-lst-light scrollbox">
									<table summary="연도별 VIP 세부 등급 이력" id="mytable">
										<caption>VIP 등급 이력 리스트</caption>
										<colgroup>
											<col width="50%">
											<col width="*">
										</colgroup>
										<thead>
											<tr>
												<th scope="col">승급 년/월별</th>
												<th scope="col">등급</th>
											</tr>
										</thead>
										<tbody>
											
										</tbody>
									</table>
								</div>
								<ul class="tb-desclist">
									<li>- 고객님의 등급은 당해년도 VIP 규정에 따라 부여된 등급입니다</li>
									<li>- 연속 VIP는 전년도와 등급 갱신월이 일치해야 인정됩니다<br />
									(예. 17년 4월 RVIP의 경우, 18년 4월 RVIP 갱신 시에만 2년 연속 RVIP로 인정되며, 2017년 5월 RVIP 승급 시 17년 5월에 1년 차 RVIP로 인정)</li>
									<li>- 등급이 하락된 경우 하락된 등급의 1년 차로 인정됩니다<br />
									(예. 17년 4월 SVIP의 경우 18년 4월 VVIP로 등급 하락 시 VVIP 1년 차로 인정)</li>
								</ul>

							
							</div>
						<!-- //Contents Addon -->
						</div>
						<button type="button" class="btn-close">MY 지난 등급 이력 팝업 닫기</button>
					</div>

</script>
<script type="text/javascript">
    //<![CDATA[
    (function ($) {
        $(function () {

            $('#go_edit_page').on('click', function () {
                var win = window.open("/user/popup/edit-profile.aspx", "profile", "left=0,top=o,width=445,height=440,toolbar=no,scrollbars=no");
                win.focus();
            });

            $('#btn_set_my_favorite').on('click', function () {
                var win = window.open("/user/popup/favoriteTheaters.aspx?ismycgv=true", "url", "left=0,top=o,width=645,height=370,toolbar=no,scrollbars=no");
                win.focus();
            });

            $('#view_usergrade').on('click', function () {
                GetUserGradeList(this);
                return false;
            });

            function GetUserGradeList(_this) {

                var url = '/common/ajax/user.aspx/GetUserGradeList_2017';
                var data = null;
                var callback = function (result) {
                    app.log(result);

                    var $std = $(_this),
                    options = {
                        '$target': $std,
                        'html': $('#temp_view_usergrade').html(),
                        'position': 'absolute',
                        'mask': 'none'
                    };
                    app.instWin.add(options);

                    var $tbody = $('#mytable > tbody:last'),
                        $tr1 = $('#tempUserGradeTbodyTr1')
                    //  $tr2 = $('#tempUserGradeTbodyTr2');
                    $.each(result, function (i, v) {

                        $tbody.append("<tr><th scope='row'>" + v.YearMonthSub + "년" + v.MonthSub + "월" + "</th><td>" + v.GradeCode + "</td></tr>");

                    });
                }
                app.ajax().get({ dataType: 'json', url: url, data: data, contentType: "application/json; charset=utf-8", successHandler: callback });
            }
           

        });
    })(jQuery);
    //]]>
</script>
</div>

            
            <!--/ Contents End -->
		 </div>
		<!-- /Contents Area -->
	</div>
	
	

</body>
</html>