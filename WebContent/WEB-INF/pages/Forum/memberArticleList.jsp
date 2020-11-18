<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberArticleList</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<link rel="icon" href="<c:url value='/img/yuruIcon.png' />"
	type="image/x-icon">

<!-- Bootstrap -->
<link href="<c:url value='/css/bootstrap.min.css' />" rel="stylesheet">
<link href="<c:url value='/ionicons/css/ionicons.min.css' />"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<!-- main css -->
<link href="<c:url value='/css/style.css' />" rel="stylesheet">


<!-- modernizr -->
<script src="<c:url value='/js/modernizr.js' />"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
<script src="https://code.jquery.com/jquery-3.5.1.js"
integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
crossorigin="anonymous"></script>


	<jsp:include page="/WEB-INF/pages/include/top.jsp" />
	<!-- top bar -->
	<div class="top-bar">
		<h1>露營論壇</h1>
		<p>
			<a href="#">camping</a> /enjoy life
		</p>
	</div>
	<!-- end top bar -->





	<!-- Just an image -->
<div style="position: relative;width:70%;border:1px solid #fff;left:2%;right:2%">
	<div style="width:30%;left:2%; float:left;">
	<nav class="navbar navbar-light bg-light" >
		<div>
		<a class="navbar-brand" href="#"> <img
			src="<c:url value='/img/yuruIcon.png' />" width="30" height="30"
			alt="" loading="lazy">
		</a>
		
		</div>
		<div style="float:right;" >
		<h2 ><span>Yuru.Camp 會員文章</span></h2>
		</div>
	</nav>
</div>
<div style="width:50%;left:25%;top:60%; " >
<div class="input-group mb-3" >
  <div class="input-group-prepend">
    <button type="button" class="btn btn-outline-secondary dropdown-toggle" 
    data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">會員文章一覽</button>
    <div class="dropdown-menu">
      <a class="dropdown-item" id="memberPost" href="Javascript:;">會員發文一覽</a>
      <div role="separator" id="memberReply" class="dropdown-divider"></div>
      <a class="dropdown-item" href="#">會員回文一覽</a>
    </div>
  </div>
  <input type="text" class="form-control" aria-label="Text input with segmented dropdown button">
</div>
	</div>
</div>
	<!-- main container -->
		<!-- AJAX -->
<div id="List">






















</div>


<script>
			$("#memberPost").click(function() { //click event

				$.ajax({
					url : "/Forum/memberPost",
					type : "GET",
					dataType : "html", //server送回
					contentType : 'application/json; charset=utf-8',
					data : {}, //data空的代表沒任何參數
					success : function(data) { //成功的話
						$("#List").empty();
						$("#List").append(data); //透過導向的URL到ajax方法 div class裝東西
					}
				})
			})
		</script>

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
</body>
</html>