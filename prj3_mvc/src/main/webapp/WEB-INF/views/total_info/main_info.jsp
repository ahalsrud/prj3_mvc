<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="ko">
<head>
    <meta charset="utf-8">
<title>${ movie.m_title } | MOVIEPLANET</title>

<link href="//m2.daumcdn.net/img-media/2010ci/Daum_favicon.ico" rel="shortcut icon">
<link rel="stylesheet" type="text/css" href="http://localhost/prj3_mvc/css/PcCommonCssBundle.merged.css" />

<script src="//t1.daumcdn.net/media/kraken/movie/386a1cd/common.merged.js"></script>
<script src="//t1.daumcdn.net/media/kraken/movie/386a1cd/PcCommonScriptBundle.merged.js"></script>
<script src="//t1.daumcdn.net/cssjs/movie/v2/amchart/amcharts.js"></script>
<script src="//t1.daumcdn.net/cssjs/movie/v2/amchart/serial.js"></script>

<style type="text/css">
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

@keyframes animateHeart{
    0%{transform:scale(.2);}
    40%{transform:scale(1.2);}
    100%{transform:scale(1);}
  }
#likeBtn { float: left; margin-right: 20px; }
#ticketing { margin-top: 5px;}
</style>

<script type="text/javascript">
$(function() {	
	
	// 주요정보 클릭 시
	 $("#mainInfo").click(function() {
		$.ajax({
			url : "main_info.do",
			method: "GET",
			dataType: "html",
			error : function(xhr) {
				alert("문제발생");
				console.log(xhr.status);
			},
			success: function(data) {
				var output = "<div> 뭐짖이이이이이이ㅣ세계를 열광시킬 올 타임 슈퍼 어드벤처의 등장!"
				+ "뉴욕의 평범한 배관공 형제 '마리오'와 ‘루이지’는 배수관 고장으로 위기에 빠진 도시를 구하려다 미스터리한 초록색 파이프 안으로 빨려 들어가게 된다."
				+ "파이프를 통해 새로운 세상으로 차원 이동하게 된 형제." 
				+ "형 '마리오'는 뛰어난 리더십을 지닌 '피치'가 통치하는 버섯왕국에 도착하지만 동생 '루이지'는 빌런 '쿠파'가 있는 다크랜드로 떨어지며 납치를 당하고 ‘마리오’는 동생을 구하기 위해 ‘피치’와 ‘키노피오’의 도움을 받아 '쿠파'에 맞서기로 결심한다.</div>"
				
				+ "<br/><br/><br>"
				+ "<div class='detail_crewinfo' data-tiara-layer='crew'>"
				+ "<h5 class='tit_section'>감독 / 출연진</h5>"
				+ "<br/>"
				+ "<ul class='list_crewall'>"
				+ "<li>"
				+ "<div class='item_crewall'>"
				+ "<a href='/person/main?personId=37689' class='thumb_item' data-tiara-layer='thumb' data-tiara-copy='주요정보_출연진_썸네일' data-tiara-ordnum='1'>"
				+ "<img src='https://img1.daumcdn.net/thumb/C116x168/?fname=http%3A%2F%2Ft1.daumcdn.net%2Fcfile%2F1340D410AE0CB5B755' class='img_thumb' alt='제임스 건'>"
				+ "</a>"
				+ "<div class='thumb_cont'>"
				+ "<strong class='tit_item'>"
				+ "<a href='/person/main?personId=37689' class='link_tit' data-tiara-layer='name' data-tiara-copy='주요정보_출연진_이름' data-tiara-ordnum='1'>제임스 건</a>"
				+ "</strong>"
				+ "<span class='txt_info'>감독</span>"
				+ "</div> </div> </li> <li>"
				+ "<div class='item_crewall'>"
				+ "<a href='/person/main?personId=110974' class='thumb_item' data-tiara-layer='thumb' data-tiara-copy='주요정보_출연진_썸네일' data-tiara-ordnum='2'>"
				+ "<img src='https://img1.daumcdn.net/thumb/C116x168/?fname=http%3A%2F%2Ft1.daumcdn.net%2Fmovie%2F4a10874f56791f822331095f0306a539869297de' class='img_thumb' alt='크리스 프랫'>"
				+ "</a>"
				+ "<div class='thumb_cont'>"
				+ "<strong class='tit_item'>"
				+ "<a href='/person/main?personId=110974' class='link_tit' data-tiara-layer='name' data-tiara-copy='주요정보_출연진_이름' data-tiara-ordnum='2'>크리스 프랫</a>"
				+ "</strong>"
				+ "<span class='txt_info'>주연</span>"
				+ "</div> </div> </li> <li>"
				+ "<div class='item_crewall'>"
				+ "<a href='/person/main?personId=17260' class='thumb_item' data-tiara-layer='thumb' data-tiara-copy='주요정보_출연진_썸네일' data-tiara-ordnum='3'>"
				+ "<img src='https://img1.daumcdn.net/thumb/C116x168/?fname=https%3A%2F%2Ft1.daumcdn.net%2Fmovie%2F73bff634a371f32a0ff11458622b2bd2c7024e62' class='img_thumb' alt='조 샐다나'>"
				+ "</a>"
				+ "<div class='thumb_cont'>"
				+ "<strong class='tit_item'>"
				+ "<a href='/person/main?personId=17260' class='link_tit' data-tiara-layer='name' data-tiara-copy='주요정보_출연진_이름' data-tiara-ordnum='3'>조 샐다나</a>"
				+ "</strong>"
				+ "<span class='txt_info'>주연</span>"
				+ "</div> </div> </li> <li>"
				+ "<div class='item_crewall'>"
				+ "<a href=''/person/main?personId=224680' class='thumb_item' data-tiara-layer='thumb' data-tiara-copy='주요정보_출연진_썸네일' data-tiara-ordnum='4'>"
				+ "<img src='https://img1.daumcdn.net/thumb/C116x168/?fname=http%3A%2F%2Ft1.daumcdn.net%2Fcfile%2F183B893D4EC3368A16' class='img_thumb' alt='데이브 바티스타'>"
				+ "</a>"
				+ "<div class='thumb_cont'>"
				+ "<strong class='tit_item'>"
				+ "<a href='/person/main?personId=224680' class='link_tit' data-tiara-layer='name' data-tiara-copy='주요정보_출연진_이름' data-tiara-ordnum='4'>데이브 바티스타</a>"
				+ "</strong>"
				+ "<span class='txt_info'>주연</span>"
				+ "</div> </div> </li>"
				
				
				$("#output").html(output); 
			}
				
		});// ajax
	});// click 
	
	/////////////////////////////////////////////////////////////////////////////////
	// 출연/제작 클릭 시
     $("#produce").click(function() {
        $.ajax({
            url: "main_info.do",
            method: "GET",
            dataType: "html",
            error: function(xhr) {
                alert("이동 실패: " + xhr.statusText);
            },
            success: function(data) {
            	
            	var output = 
            		"<div class='contents'><h4 class='screen_out'>출연/제작</h4>"
            	    +"<div class='detail_crewinfo'>"
            	    +"<h5 class='tit_section'>감독</h5>"
            	    +"<br/>"
            	    +"<ul class='list_crew'>"
            	    +"<li>"
            	    +"<div class='item_crew'>"
            	    +"<a href='/person/main?personId=37689' class='thumb_item' data-tiara-layer='detail_crew' data-tiara-copy='출연제작_감독/주연/출연'>"
            	    +"<img src='https://img1.daumcdn.net/thumb/C116x168/?fname=http%3A%2F%2Ft1.daumcdn.net%2Fcfile%2F1340D410AE0CB5B755' class='img_thumb' alt='제임스 건'>"
            	    +"</a>"
            	    +"<div class='thumb_cont'>"
            	    +"<strong class='tit_item'>"
            	    +"<a href='/person/main?personId=37689' class='link_txt' data-tiara-layer='detail_crew' data-tiara-copy='출연제작_감독/주연/출연'>제임스 건</a>"
            	    +"</strong>"
            	    +"<span class='subtit_item'>James Gunn</span>"
            	    +"</div>"
            	    +"</div>"
            	    +"</li>"
            	    +"</ul>"
            	    +"</div>"
            	    +"<div class='detail_crewinfo'>"
            	    +"<br/><br/>"
            	    +"<h5 class='tit_section'>주연</h5>"
            	    +"<br/>"
            	    +"<ul class='list_crew'>"
            	    +"<li>"
            	    +"<div class='item_crew'>"
            	    +"<a href='/person/main?personId=110974' class='thumb_item' data-tiara-layer='detail_crew' data-tiara-copy='출연제작_감독/주연/출연'>"
            	    +"<img src='https://img1.daumcdn.net/thumb/C116x168/?fname=http%3A%2F%2Ft1.daumcdn.net%2Fmovie%2F4a10874f56791f822331095f0306a539869297de' class='img_thumb' alt='크리스 프랫'>"
            	    +"</a>"
            	    +"<div class='thumb_cont'>"
            	    +"<strong class='tit_item'>"
            	    +"<a href='/person/main?personId=110974' class='link_txt' data-tiara-layer='detail_crew' data-tiara-copy='출연제작_감독/주연/출연'>크리스 프랫</a>"
            	    +"</strong>"
            	    +"<span class='subtit_item'>Chris Pratt</span>"
            	    +"<span class='txt_info'>스타로드 역</span>"
            	    +"</div>"
            	    +"</div>"
            	    +"</li>"
            	    +"<li>"
            	    +"<div class='item_crew'>"
            	    +"<a href='/person/main?personId=17260' class='thumb_item' data-tiara-layer='detail_crew' data-tiara-copy='출연제작_감독/주연/출연'>"
            	    +"<img src='https://img1.daumcdn.net/thumb/C116x168/?fname=https%3A%2F%2Ft1.daumcdn.net%2Fmovie%2F73bff634a371f32a0ff11458622b2bd2c7024e62' class='img_thumb' alt='조 샐다나'>"
            	    +"</a>"
            	    +"<div class='thumb_cont'>"
            	    +"<strong class='tit_item'>"
            	    +"<a href='/person/main?personId=17260' class='link_txt' data-tiara-layer='detail_crew' data-tiara-copy='출연제작_감독/주연/출연'>조 샐다나</a>"
            	    +"</strong>"
            	    +"<span class='subtit_item'>Zoe Saldana</span>"
            	    +"<span class='txt_info'>가모라 역</span>"
            	    +"</div>"
            	    +"</div>"
            	    +"</li>"
            	    +"<li>"
            	    +"<div class='item_crew'>"
            	    +"<a href='/person/main?personId=224680' class='thumb_item' data-tiara-layer='detail_crew' data-tiara-copy='출연제작_감독/주연/출연'>"
            	    +"<img src='https://img1.daumcdn.net/thumb/C116x168/?fname=http%3A%2F%2Ft1.daumcdn.net%2Fcfile%2F183B893D4EC3368A16' class='img_thumb' alt='데이브 바티스타'>"
            	    +"</a>"
            	    +"<div class='thumb_cont'>"
            	    +"<strong class='tit_item'>"
            	    +"<a href='/person/main?personId=224680' class='link_txt' data-tiara-layer='detail_crew' data-tiara-copy='출연제작_감독/주연/출연'>데이브 바티스타</a>"
            	    +"</strong>"
            	    +"<span class='subtit_item'>Dave Bautista</span>"
            	    +"<span class='txt_info'>드랙스 역</span>"
            	    +"</div>"
            	    +"</div>"
            	    +"</li>"
            	    +"<li>"
            	    +"<div class='item_crew'>"
            	    +"<a href='/person/main?personId=1548' class='thumb_item' data-tiara-layer='detail_crew' data-tiara-copy='출연제작_감독/주연/출연'>"
            	    +"<img src='https://img1.daumcdn.net/thumb/C116x168/?fname=https%3A%2F%2Ft1.daumcdn.net%2Fmovie%2F0e848f51add0f653be967d5c4dc8edb0cb654e0f' class='img_thumb' alt='빈 디젤'>"
            	    +"</a>"
            	    +"<div class='thumb_cont'>"
            	    +"<strong class='tit_item'>"
            	    +"<a href='/person/main?personId=1548' class='link_txt' data-tiara-layer='detail_crew' data-tiara-copy='출연제작_감독/주연/출연'>빈 디젤</a>"
            	    +"</strong>"
            	    +"<span class='subtit_item'>Vin Diesel</span>"
            	    +"<span class='txt_info'>그루트 (목소리) 역</span>"
            	    +"</div></div></li><li>"
            	    +"<div class='item_crew'>"
            	    +"<a href='/person/main?personId=95705' class='thumb_item' data-tiara-layer='detail_crew' data-tiara-copy='출연제작_감독/주연/출연'>"
            	    +"<img src='https://img1.daumcdn.net/thumb/C116x168/?fname=http%3A%2F%2Ft1.daumcdn.net%2Fcfile%2F204E600B4BD006A656' class='img_thumb' alt='브래들리 쿠퍼'>"
            	    +"</a>"
            	    +"<div class='thumb_cont'>"
            	    +"<strong class='tit_item'>"
            	    +"<a href='/person/main?personId=95705' class='link_txt' data-tiara-layer='detail_crew' data-tiara-copy='출연제작_감독/주연/출연'>브래들리 쿠퍼</a>"
            	    +"</strong>"
            	    +"<span class='subtit_item'>Bradley Cooper</span>"
            	    +"<span class='txt_info'>로켓 (목소리) 역</span>"
            	    +"</div>"
            	    +"</div>"
            	    +"</li>"
            	    +"<li>"
            	    +"<div class='item_crew'>"
            	    +"<a href='/person/main?personId=193531' class='thumb_item' data-tiara-layer='detail_crew' data-tiara-copy='출연제작_감독/주연/출연'>"
            	    +"<img src='https://img1.daumcdn.net/thumb/C116x168/?fname=http%3A%2F%2Ft1.daumcdn.net%2Fcfile%2F163464264AF2131E2C' class='img_thumb' alt='카렌 길런'>"
            	    +"</a>"
            	    +"<div class='thumb_cont'>"
            	    +"<strong class='tit_item'>"
            	    +"<a href='/person/main?personId=193531' class='link_txt' data-tiara-layer='detail_crew' data-tiara-copy='출연제작_감독/주연/출연'>카렌 길런</a>"
            	    +"</strong>"
            	    +"<span class='subtit_item'>Karen Gillan</span>"
            	    +"<span class='txt_info'>네뷸라 역</span>"
            	    +"</div></div></li>"
            	    +"<li><div class='item_crew'>"
            	    +"<a href='/person/main?personId=198429' class='thumb_item' data-tiara-layer='detail_crew' data-tiara-copy='출연제작_감독/주연/출연'>"
            	    +"<img src='https://img1.daumcdn.net/thumb/C116x168/?fname=http%3A%2F%2Ft1.daumcdn.net%2Fcfile%2F166522164B1A427F19' class='img_thumb' alt='폼 클레멘티프'>"
            	    +"</a>"
            	    +"<div class='thumb_cont'>"
            	    +"<strong class='tit_item'>"
            	    +"<a href='/person/main?personId=198429' class='link_txt' data-tiara-layer='detail_crew' data-tiara-copy='출연제작_감독/주연/출연'>폼 클레멘티프</a>"
            	    +"</strong>"
            	    +"<span class='subtit_item'>Pom Klementieff</span>"
            	    +"<span class='txt_info'>맨티스 역</span>"
            	    +"</div></div></li></ul></div>"
            	    +"<div class='detail_produceinfo'>"
            	    +"<br/><br/><br/>"
            	    +"<h5 class='tit_section'>제작진</h5>"
            	    +"<dl class='list_produce'>"
            	    +"<dt>원작</dt>"
            	    +"<dd>"
            	    +"<a href='/person/main?personId=333452' class='link_txt' data-tiara-layer='produce' data-tiara-copy='출연/제작_제작진'>댄 애브넷</a> Dan Abnett," 
            	    +"<a href='/person/main?personId=333486' class='link_txt' data-tiara-layer='produce' data-tiara-copy='출연/제작_제작진'>앤디 래닝</a> Andy Lanning"
            	    +"</dd>"
            	    +"</dl>"
            	    +"<dl class='list_produce'>"
            	    +"<dt>각본</dt>"
            	    +"<dd>"
            	    +"<a href='/person/main?personId=37689' class='link_txt' data-tiara-layer='produce' data-tiara-copy='출연/제작_제작진'>제임스 건</a> James Gunn"
            	    +"</dd>"
            	    +"</dl></div>"
            	    +"<div class='detail_produceinfo'>"
            	    +"<br/><br/>"
            	    +"<h5 class='tit_section'>영화사</h5>"
            	    +"<dl class='list_produce'>"
            	    +"<dt>제작</dt>"
            	    +"<dd>"
            	    +"<a href='/production?productionId=1520' class='link_txt' data-tiara-layer='production' data-tiara-copy='출연제작_관련영화사'>마블스튜디오</a>"
            	    +"</dd>"
            	    +"</dl>"
            	    +"<dl class='list_produce'>"
            	    +"<dt>배급</dt>"
            	    +"<dd>"
            	    +"<a href='/production?productionId=1455' class='link_txt' data-tiara-layer='production' data-tiara-copy='출연제작_관련영화사'>월트 디즈니 컴퍼니 코리아</a>"
            	    +"</dd></dl>"
            	    +"<dl class='list_produce'>"
            	    +"<dt>수입</dt>"
            	    +"<dd>"
            	    +"<a href='/production?productionId=1455' class='link_txt' data-tiara-layer='production' data-tiara-copy='출연제작_관련영화사'>월트 디즈니 컴퍼니 코리아</a>"
            	    +"</dd></dl>"
            	    +"</div></div>" 
            	
                $("#output").html(output); 
            }//
           
        });//ajax
    }); //click
    
    
 /////////////////////////////////////////////////////////////////////////////////
	// 평점 클릭 시
     $("#grade").click(function() {
        $.ajax({
            url: "main_info.do",
            method: "GET",
            dataType: "html",
            error: function(xhr) {
                alert("이동 실패: " + xhr.statusText);
            },
            success: function(data) {
            	var output = 
            		 "<div><div class='contents'>"
            		 +"<div class='detail_cmtinfo' style='min-height: 450px;'>"
            		 +"<strong class='tit_netizen'>네티즌 평점  <em class='num_rating'>8.8점</em><span class='txt_netizen'>(258명)"
            		 +"<a href='#void' style='margin-left: 500px'>MY</a></span></strong>"
            		 +"<form>"
            		 +"<select name='grad' size='1'>"
            		 +"<option selected disabled>평점 등록</option>"
            		 +"<option value='2'>★</option>"
            		 +"<option value='4'>★★</option>"
            		 +"<option value='6'>★★★</option>"
            		 +"<option value='8'>★★★★</option>"
            		 +"<option value='10'>★★★★★</option>"
            		 +"</select>"		
            		 +"<br/>"
            		 +"<div style='height:140px'>"
            		 +"<input type='text' placeholder='영화 평점글을 작성해주세요.' style='width:600px; height:100px;'/>"
            		 +"<br/>"
            		 +"<input type='button' id='add' name='add' value='등록' style='width:60px; height:27px; cursor: pointer;border-radius: 4px; margin-left: 543px; margin-top:3px;cursor: pointer;'/>"
            		 +"</div>"
            		 +"<br/><br/>"
            		 +"<div><a>좋아요순</a> &nbsp; 최신순 &nbsp; 과거순</div>"
            		 +"<hr style='width:600px; margin-left: 0px'/>"
            		 +"<div style='height:100px'>"
            		 +"★★★★<img src='http://localhost/prj3_mvc/css/good.PNG' style='margin-left:525px;cursor: pointer;'/>"
            		 +"<br/>"
            		 +"<input type='text' placeholder='여기는 다른사람이 작성한 한줄평.' readonly='readonly' style=' width:600px; height:60px;'/>"
            		 +"<input type='button' id='declare' name='declare' value='신고' style='width:45px; height:27px; cursor: pointer; margin-top: 35px;cursor: pointer; border-radius: 4px; background-color: #D75E4D; border-color: #D75E4D; color: white; font-size:11pt;font-family:굴림;font-weight:bolder'/>"
            		 +"<br/>"
            		 +"홍길동 2023-05-13 05:55"  
            		 +"</div>"
            		 +"</form>"
            		 +"</div>"
            		 +"</div>"

            		 $("#output").html(output); 
            }//function
        });//ajax
    }); //click 
});//ready

//heart 좋아요 클릭시! 하트 뿅
$(function(){
    var $likeBtn =$('.icon.heart');
    var m_num = ${movie.m_num};

        $likeBtn.click(function(){
        $likeBtn.toggleClass('active');

        if($likeBtn.hasClass('active')){          
           alert("기대되는 영화 등록" + m_num);
           $(this).find('img').attr({
              'src': 'https://cdn-icons-png.flaticon.com/512/803/803087.png',
               alt:'찜하기 완료'
           });
           
           // 서버로 전송할 데이터 설정
           var data = {
               like_state: 1, 
               m_num: m_num
           };

           // Ajax 요청 보내기
           $.ajax({
               url: "add_like.do",
               type: "post",
               contentType: "application/json;charset=UTF-8",
               data: JSON.stringify(data),
               success: function(response) {
                   // 요청이 성공적으로 처리되었을 때의 동작
                   alert("좋아요 추가 - 성공");
               },
               error: function(xhr) {
                   // 요청이 실패했을 때의 동작
                   alert("좋아요 추가 - 실패: " + xhr.statusText + xhr.responseText);
               }
           });
          
         }else{
            $(this).find('i').removeClass('fas').addClass('far')
            alert("기대되는 영화 삭제");
           $(this).find('img').attr({
              'src': 'https://cdn-icons-png.flaticon.com/512/812/812327.png',
              alt:"찜하기"
           })
       
           // Ajax 요청 보내기
           $.ajax({
               url: "remove_like.do",
               type: "post",
               contentType: "application/json;charset=UTF-8",
               data: JSON.stringify(data),
               success: function(response) {
                   // 요청이 성공적으로 처리되었을 때의 동작
                   alert("좋아요 삭제 - 성공");
               },
               error: function(xhr) {
                   // 요청이 실패했을 때의 동작
                   alert("좋아요 삭제 - 실패: " + xhr.statusText + xhr.responseText);
               }
           });
         }
     })
})

</script>

</head>

<body class=""> 
    <div class="kakao_wrap detail_type"> 
		<header class="kakao_head search_on" data-tiara-layer="gnb"> 
    <div class="kakaohead_top">
        <div class="inner_head" data-tiara-layer="service">
                <a class="link_daum" data-tiara-layer="logo"><img src="http://localhost/prj3_mvc/images/movie_small.png" width="70" height="35" class="logo_daum" alt="Daum"></a>
                <a style="margin-left: 970px;" href="#void"><span style="font-weight: bold;">Login</span></a>
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
                            <button type="button" class="btn_search"><span class="ico_movie ico_search">검색</span></button>
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
            <a href="#void" id="mainInfo">
                <span class="txt_tabmenu">주요정보</span>
            </a>
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
            <a href="#void">
                <span class="txt_tabmenu">리뷰</span>
            </a>
        </li>
    </ul>
</div>            <div class="contents"></div>
        </div>
        <br/>
        <!-- -------------------- 상세내용 추가 -->
        <div id="output">
        <div>
        	따단-딴-따단-딴 ♫ 
전 세계를 열광시킬 올 타임 슈퍼 어드벤처의 등장! 

뉴욕의 평범한 배관공 형제 '마리오'와 ‘루이지’는
배수관 고장으로 위기에 빠진 도시를 구하려다
미스터리한 초록색 파이프 안으로 빨려 들어가게 된다. 

파이프를 통해 새로운 세상으로 차원 이동하게 된 형제.
형 '마리오'는 뛰어난 리더십을 지닌 '피치'가 통치하는 버섯왕국에 도착하지만
동생 '루이지'는 빌런 '쿠파'가 있는 다크랜드로 떨어지며 납치를 당하고
‘마리오’는 동생을 구하기 위해 ‘피치’와 ‘키노피오’의 도움을 받아 '쿠파'에 맞서기로 결심한다. 
        </div>
        
       <br/><br/><br/>
        <div class="detail_crewinfo" data-tiara-layer="crew">
            <h5 class="tit_section">감독 / 출연진</h5>
            <br/>
            <ul class="list_crewall">
                        <li>
                            <div class="item_crewall">
                                <a href="/person/main?personId=37689" class="thumb_item" data-tiara-layer="thumb" data-tiara-copy="주요정보_출연진_썸네일" data-tiara-ordnum="1">
                                        <img src="https://img1.daumcdn.net/thumb/C116x168/?fname=http%3A%2F%2Ft1.daumcdn.net%2Fcfile%2F1340D410AE0CB5B755" class="img_thumb" alt="제임스 건">
                                </a>
                                <div class="thumb_cont">
                                    <strong class="tit_item">
                                        <a href="/person/main?personId=37689" class="link_tit" data-tiara-layer="name" data-tiara-copy="주요정보_출연진_이름" data-tiara-ordnum="1">제임스 건</a>
                                    </strong>
                                        <span class="txt_info">감독</span>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="item_crewall">
                                <a href="/person/main?personId=110974" class="thumb_item" data-tiara-layer="thumb" data-tiara-copy="주요정보_출연진_썸네일" data-tiara-ordnum="2">
                                        <img src="https://img1.daumcdn.net/thumb/C116x168/?fname=http%3A%2F%2Ft1.daumcdn.net%2Fmovie%2F4a10874f56791f822331095f0306a539869297de" class="img_thumb" alt="크리스 프랫">
                                </a>
                                <div class="thumb_cont">
                                    <strong class="tit_item">
                                        <a href="/person/main?personId=110974" class="link_tit" data-tiara-layer="name" data-tiara-copy="주요정보_출연진_이름" data-tiara-ordnum="2">크리스 프랫</a>
                                    </strong>
                                        <span class="txt_info">주연</span>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="item_crewall">
                                <a href="/person/main?personId=17260" class="thumb_item" data-tiara-layer="thumb" data-tiara-copy="주요정보_출연진_썸네일" data-tiara-ordnum="3">
                                        <img src="https://img1.daumcdn.net/thumb/C116x168/?fname=https%3A%2F%2Ft1.daumcdn.net%2Fmovie%2F73bff634a371f32a0ff11458622b2bd2c7024e62" class="img_thumb" alt="조 샐다나">
                                </a>
                                <div class="thumb_cont">
                                    <strong class="tit_item">
                                        <a href="/person/main?personId=17260" class="link_tit" data-tiara-layer="name" data-tiara-copy="주요정보_출연진_이름" data-tiara-ordnum="3">조 샐다나</a>
                                    </strong>
                                        <span class="txt_info">주연</span>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="item_crewall">
                                <a href="/person/main?personId=224680" class="thumb_item" data-tiara-layer="thumb" data-tiara-copy="주요정보_출연진_썸네일" data-tiara-ordnum="4">
                                        <img src="https://img1.daumcdn.net/thumb/C116x168/?fname=http%3A%2F%2Ft1.daumcdn.net%2Fcfile%2F183B893D4EC3368A16" class="img_thumb" alt="데이브 바티스타">
                                </a>
                                <div class="thumb_cont">
                                    <strong class="tit_item">
                                        <a href="/person/main?personId=224680" class="link_tit" data-tiara-layer="name" data-tiara-copy="주요정보_출연진_이름" data-tiara-ordnum="4">데이브 바티스타</a>
                                    </strong>
                                        <span class="txt_info">주연</span>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="item_crewall">
                                <a href="/person/main?personId=1548" class="thumb_item" data-tiara-layer="thumb" data-tiara-copy="주요정보_출연진_썸네일" data-tiara-ordnum="5">
                                        <img src="https://img1.daumcdn.net/thumb/C116x168/?fname=https%3A%2F%2Ft1.daumcdn.net%2Fmovie%2F0e848f51add0f653be967d5c4dc8edb0cb654e0f" class="img_thumb" alt="빈 디젤">
                                </a>
                                <div class="thumb_cont">
                                    <strong class="tit_item">
                                        <a href="/person/main?personId=1548" class="link_tit" data-tiara-layer="name" data-tiara-copy="주요정보_출연진_이름" data-tiara-ordnum="5">빈 디젤</a>
                                    </strong>
                                        <span class="txt_info">주연</span>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="item_crewall">
                                <a href="/person/main?personId=95705" class="thumb_item" data-tiara-layer="thumb" data-tiara-copy="주요정보_출연진_썸네일" data-tiara-ordnum="6">
                                        <img src="https://img1.daumcdn.net/thumb/C116x168/?fname=http%3A%2F%2Ft1.daumcdn.net%2Fcfile%2F204E600B4BD006A656" class="img_thumb" alt="브래들리 쿠퍼">
                                </a>
                                <div class="thumb_cont">
                                    <strong class="tit_item">
                                        <a href="/person/main?personId=95705" class="link_tit" data-tiara-layer="name" data-tiara-copy="주요정보_출연진_이름" data-tiara-ordnum="6">브래들리 쿠퍼</a>
                                    </strong>
                                        <span class="txt_info">주연</span>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="item_crewall">
                                <a href="/person/main?personId=193531" class="thumb_item" data-tiara-layer="thumb" data-tiara-copy="주요정보_출연진_썸네일" data-tiara-ordnum="7">
                                        <img src="https://img1.daumcdn.net/thumb/C116x168/?fname=http%3A%2F%2Ft1.daumcdn.net%2Fcfile%2F163464264AF2131E2C" class="img_thumb" alt="카렌 길런">
                                </a>
                                <div class="thumb_cont">
                                    <strong class="tit_item">
                                        <a href="/person/main?personId=193531" class="link_tit" data-tiara-layer="name" data-tiara-copy="주요정보_출연진_이름" data-tiara-ordnum="7">카렌 길런</a>
                                    </strong>
                                        <span class="txt_info">주연</span>
                                </div>
                            </div>
                        </li>
            </ul>
        </div>
        
    </div>
</article>        </main>
        <hr class="hide">
        </div>


</body>
</html>