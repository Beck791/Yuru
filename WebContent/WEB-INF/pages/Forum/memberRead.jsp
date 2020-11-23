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

<link rel="icon" href="<c:url value='/img/yuruIcon.png'/>" type="image/x-icon">

<!-- Bootstrap -->
<link href="<c:url value='/css/bootstrap.min.css'/>" rel="stylesheet">
<link href="<c:url value='/ionicons/css/ionicons.min.css'/>" rel="stylesheet">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    
    <link rel="stylesheet" href="<c:url value='/css/articles.css'/>" type="text/css">

<!-- main css -->
<link href="<c:url value='/css/style.css'/>" rel="stylesheet">


<!-- modernizr -->
<script src="<c:url value='/js/modernizr.js'/>"> </script>

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
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0"> 
      <li class="nav-item"><a class="nav-link" href="<c:url value='/Forum/forumIndex' />" class="" >回上一頁</a></li>     
      <li class="nav-item"><a class="nav-link" href="<c:url value='/Forum/goInsert' />" class="" >新增文章</a></li>
      <li class="nav-item"><a class="nav-link " href="<c:url value='/Forum/articleList' />">個人文章一覽</a></li>
    </ul>
  </div>
</nav>
	<!-- main container -->
	
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
          <p class="article-topic">${PostBean.poTitle}
          <div style="float:right;">${PostBean.poId}</div></p>
          <p class="article-act-list">${PostBean.poCreatTime}</p>
          <p class="article-act-list list-divider"></p>  
          <p class="article-act-list">${PostBean.clickNumber} views</p>
          <div style="float:right;">
            <p class="article-act-list">
              <i class="fa fa-share-alt" aria-hidden="true"></i> 分享</p>
            <p class="article-act-list list-divider"></p>
            <p class="article-act-list">
            <a href="<c:url value='/Forum/goReply?poId=${PostBean.poId}'/>">
            	<i class="fa fa-reply" aria-hidden="true"></i> 回覆</a></p>
            <p class="article-act-list list-divider"></p>
            <p class="article-act-list">
              <i class="fa fa-quote-right" aria-hidden="true"></i> 引用</p>            
          </div>
        </div>
        <!-- Article Content -->
        <div style="width:96%;padding:15px 0;" class="article-content">
         ${PostBean.poContent}
        <img src="${PostBean.poImage}" style="height:300px;">
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
				
					
					
				<!-- 文章編輯區 -->

	<!---------------------------------------------------------------------------->
<c:forEach var="replyBean" items="${replyList}">
 <div id="container">
      <!-- User Column -->
      <div class="user-column">
        <img src="img/headshot.jpg" height="100" alt="headshot">
        <div class="user-info">
          <a href="#" class="user-account">${replyBean.memberId}</a>
          <p class="user-sequence-first">回覆</p>
          <div class="extra-user-info">
            <dl class="pairs-justified">
              <dt> <input type="submit" class="btn btn-primary" value="編輯"></dt>
              <dd></dd>
            </dl>
            <dl class="pairs-justified">
              <dt>讚:</dt>
              <dd></dd>
            </dl>
          </div> 
        </div>
      </div>
      
      <!-- Article Column -->
      <div class="article-column">
        <!-- Article Topic -->
        <div class="article-info">
          <p class="article-topic"></p>
          <p class="article-act-list">${replyBean.reCreatTime}</p>
          <p class="article-act-list list-divider"></p>  
          <p class="article-act-list"> views</p>
          <div style="float:right;">
            <p class="article-act-list">
              <i class="fa fa-share-alt" aria-hidden="true"></i> 分享</p>
            <p class="article-act-list list-divider"></p>
            <p class="article-act-list">
            <a href="<c:url value='/Forum/goReply'/>">
              <i class="fa fa-reply" aria-hidden="true"></i> 回覆</a></p>
            <p class="article-act-list list-divider"></p>
            <p class="article-act-list">
              <i class="fa fa-quote-right" aria-hidden="true"></i> 引用</p>            
          </div>
        </div>
        <!-- Article Content -->
        <div style="width:96%;padding:15px 0;" class="article-content">
          ${replyBean.reContent}
        <img src="${replyBean.reImage}" style="height:300px;">
          <div class="article-reply" style="width:96%;margin-left:2%;border-left:3px solid #eee;padding-left:1em;"><br>
            …<br>
          </div>
        </div>
        <!-- Article Bottom Info -->
        <div class="article-bot-info">
          <p class="article-act-list">${replyBean.reUpDateTime}</p>
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
</c:forEach>

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
	<script src="<c:url value='/js/jquery-2.1.1.js' />"></script>
	<!--  plugins -->
	<script src="<c:url value='/js/bootstrap.min.js' />"></script>
	<script src="<c:url value='/js/menu.js' />"></script>
	<script src="<c:url value='/js/animated-headline.js' />"></script>
	<script src="<c:url value='/js/isotope.pkgd.min.js' />"></script>


	<!--  custom script -->
	<script src="<c:url value='/js/custom.js' />"></script>

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