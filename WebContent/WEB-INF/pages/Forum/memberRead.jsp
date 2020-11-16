<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${memberRead}</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<link rel="icon" href="${pageContext.request.contextPath}/img/yuruIcon.png" type="image/x-icon">

<!-- Bootstrap -->
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../ionicons/css/ionicons.min.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="../css/articles.css" type="text/css">

<!-- main css -->
<link href="../css/style.css" rel="stylesheet">


<!-- modernizr -->
<script src="../js/modernizr.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->




</head>
<body>


	<jsp:include page="/WEB-INF/pages/include/top.jsp" />
	<!-- top bar -->
	<div class="top-bar">
		<h1>露營論壇</h1>
		<p>
			<a href="#">camping</a> /enjoy life
		</p>
	</div>
	<!-- end top bar -->
<div>XXXXXXXXXXXXXXXXXXXX</div>
	<!-- main container -->
	<c:forEach var="PostBean" items="${PostBeans}">	
	<div>${PostBean.poId}</div>
	 <div id="container">
      <!-- User Column -->
      <div class="user-column">
        <img src="img/headshot.jpg" height="100" alt="headshot">
        <div class="user-info">
          <a href="#" class="user-account">${PostBean.memberId}</a>
          <p class="user-sequence-first">樓主</p>
          <div class="extra-user-info">
            <dl class="pairs-justified">
              <dt></dt>
              <dd></dd>
            </dl>
            <dl class="pairs-justified">
              <dt>讚:</dt>
              <dd>${PostBean.likeNumber}</dd>
            </dl>
          </div> 
        </div>
      </div>
      
      <!-- Article Column -->
      <div class="article-column">
        <!-- Article Topic -->
        <div class="article-info">
          <p class="article-topic">${PostBean.poTitle}</p>
          <p class="article-act-list">${PostBean.poCreatTime}</p>
          <p class="article-act-list list-divider"></p>  
          <p class="article-act-list">${PostBean.clickNumber} views</p>
          <div style="float:right;">
            <p class="article-act-list">
              <i class="fa fa-share-alt" aria-hidden="true"></i> 分享</p>
            <p class="article-act-list list-divider"></p>
            <p class="article-act-list">
            <a href="">
            	<i class="fa fa-reply" aria-hidden="true"></i> 回覆</a></p>
            <p class="article-act-list list-divider"></p>
            <p class="article-act-list">
              <i class="fa fa-quote-right" aria-hidden="true"></i> 引用</p>            
          </div>
        </div>
        <!-- Article Content -->
        <div style="width:96%;padding:15px 0;" class="article-content">
          給重感，陽世率整成怎？生一一極青軍經然計親間印英國角代也室。<br><br>

          一我病投！就對老說；們中不特金要用當以我自為學招以產布上取任的你性會股看不緊陽裡原！<br><br>

          個要護類苦。定為一；要認買回參認回春得指要合本是上，眼了善看辦國義起識自上酒情一活好們源，作由電。影早界、能何早？正就跟灣能外些。式心紅不龍，上怎己設我之術顧語沒又於入一覺打們有古裡一好朋心動生相教中話人教臺事興；步國日爭想失見有河眼輪前各可應人青、水主舞和快出童冷過手醫準走怎前講提動，是是目，能得者一人調不代車他把水得表主用臺了面……常價元我自；車唱前創隊戰民心實……我讓氣知點果樂覺年友病當面……面建異他海見想中什而境來。說無戰，住是以合重例麼感目孩畫學兒著國滿她。<br><br>

          歡兒望安次了，健日有意紙意人有錯代況那；間業費果前模山決黨研高時規是如對得性推停思真候的不斷式濟業外屋故相造，上明而也不，性是南兒知為場我方計企特公復非牛負自高斯候！年自西來下工然。語到強懷有：談魚球極照沒地金；樣文經力服坡是我卻花了中票……密的成開團專，數過出業老足；中麼會呢的我，建和了行世究統。果們音。讓衣一麼如區入士物作每我紅。
        </div>
        <!-- Article Bottom Info -->
        <div class="article-bot-info">
          <p class="article-act-list">${PostBean.poUpDateTime}</p>
          <div style="float:right;">
            <p class="article-act-list">
              <i class="fa fa-thumbs-o-up" aria-hidden="true"></i> [num]</p>
<!--             <p class="article-act-list list-divider"></p> -->
<!--             <p class="article-act-list"> -->
<!--               <i class="fa fa-share-alt" aria-hidden="true"></i> 分享</p> -->
<!--             <p class="article-act-list list-divider"></p> -->
<!--             <p class="article-act-list"> -->
<!--               <i class="fa fa-quote-right" aria-hidden="true"></i> 引用</p>             -->
          </div>
        </div>
      </div>

      
        
    </div>



	<div class=""
		style="display: block; width: 774.6px; height: 30px; float: none;"></div>
	
				<!-- 文章編輯區 -->
				
					
						<td>
							<!-- <input type="submit" value="修改" name="update"/>	 -->
						</td>
						<td>${PostBean.poId}</td>
						<td>${PostBean.memberId}</td>
						<td>${PostBean.forumId}</td>
						<td>${PostBean.poTitle}</td>
						<td><img src="${PostBean.poImage}"></td>
						<td>${PostBean.poContent}</td>
						<td>${PostBean.likeNumber}</td>
						<td>${PostBean.reContentNumber}</td>
						<td>${PostBean.clickNumber}</td>
						<td><fmt:formatDate type="both" pattern="yyyy-MM-dd HH:mm:ss"
								value="${PostBean.poCreatTime}" /></td>
						<td><fmt:formatDate type="both" pattern="yyyy-MM-dd HH:mm:ss"
								value="${PostBean.poUpDateTime}" /></td>
					</tr>
				</c:forEach>
				<!-- 文章編輯區 -->

	<!---------------------------------------------------------------------------->

 <div id="container">
      <!-- User Column -->
      <div class="user-column">
        <img src="img/headshot.jpg" height="100" alt="headshot">
        <div class="user-info">
          <a href="#" class="user-account">[accout-name]</a>
          <p class="user-sequence-first">回覆</p>
          <div class="extra-user-info">
            <dl class="pairs-justified">
              <dt>文章:</dt>
              <dd>[artc-q]篇</dd>
            </dl>
            <dl class="pairs-justified">
              <dt>讚:</dt>
              <dd>[thumb-q]</dd>
            </dl>
          </div> 
        </div>
      </div>
      
      <!-- Article Column -->
      <div class="article-column">
        <!-- Article Topic -->
        <div class="article-info">
          <p class="article-topic">[article-topic]</p>
          <p class="article-act-list">[yyyy-mm-dd hh:mm]</p>
          <p class="article-act-list list-divider"></p>  
          <p class="article-act-list">[num] views</p>
          <div style="float:right;">
            <p class="article-act-list">
              <i class="fa fa-share-alt" aria-hidden="true"></i> 分享</p>
            <p class="article-act-list list-divider"></p>
            <p class="article-act-list">
              <i class="fa fa-reply" aria-hidden="true"></i> 回覆</p>
            <p class="article-act-list list-divider"></p>
            <p class="article-act-list">
              <i class="fa fa-quote-right" aria-hidden="true"></i> 引用</p>            
          </div>
        </div>
        <!-- Article Content -->
        <div style="width:96%;padding:15px 0;" class="article-content">
          經自樹……中友命明之區富。果眼化表候的車風教但，媽候上小、保帶聲以成陸，子所當所作頭顧超庭到未國處選。內職就線火里山們學不還國另區的我消險：一變親育不大新備，他不在加數較轉裝常活單調畫合生如從稱。期簡此趣，友年支能數著。型黨我！參友我越物，他正他己成、政加此治，物農語包非古聽利各氣有中。<br><br>
          
          <div class="article-reply" style="width:96%;margin-left:2%;border-left:3px solid #eee;padding-left:1em;">
            一我病投！就對老說；們中不特金要用當以我自為學招以產布上取任的你性會股看不緊陽裡原！<br>
            …<br>
          </div>
        </div>
        <!-- Article Bottom Info -->
        <div class="article-bot-info">
          <p class="article-act-list">yyyy-mm-dd hh:mm</p>
          <div style="float:right;">
            <p class="article-act-list">
              <i class="fa fa-thumbs-o-up" aria-hidden="true"></i> [num]</p>
            <p class="article-act-list list-divider"></p>
            <p class="article-act-list">
              <i class="fa fa-share-alt" aria-hidden="true"></i> 分享</p>
            <p class="article-act-list list-divider"></p>
            <p class="article-act-list">
              <i class="fa fa-quote-right" aria-hidden="true"></i> 引用</p>            
          </div>
        </div>
      </div>

    </div>

	<!-- end main container -->

	<!-- footer -->
	<footer>
		<div class="container-fluid">
			<p class="copyright">© Yuru Camp 2020</p>
		</div>
	</footer>
	<!-- end footer -->

	<!-- back to top -->
	<a href="#0" class="cd-top"><i class="ion-android-arrow-up"></i></a>
	<!-- end back to top -->




	<!-- jQuery -->
	<script src="../js/jquery-2.1.1.js"></script>
	<!--  plugins -->
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/menu.js"></script>
	<script src="../js/animated-headline.js"></script>
	<script src="../js/isotope.pkgd.min.js"></script>


	<!--  custom script -->
	<script src="../js/custom.js"></script>

	<!-- google analytics  -->
	<script>
		(function(i, s, o, g, r, a, m) {
			i['GoogleAnalyticsObject'] = r;
			i[r] = i[r] || function() {
				(i[r].q = i[r].q || []).push(arguments)
			}, i[r].l = 1 * new Date();
			a = s.createElement(o), m = s.getElementsByTagName(o)[0];
			a.async = 1;
			a.src = g;
			m.parentNode.insertBefore(a, m)
		})(window, document, 'script',
				'https://www.google-analytics.com/analytics.js', 'ga');

		ga('create', 'UA-76796224-1', 'auto');
		ga('send', 'pageview');
	</script>

</body>
</html>