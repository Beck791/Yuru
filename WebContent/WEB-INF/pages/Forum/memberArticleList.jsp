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


<%-- 	<jsp:include page="/WEB-INF/pages/include/top.jsp" /> --%>
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
  <input type="text" class="form-control" aria-label="Text input with segmented dropdown button" id="memberSearch">
  <button onclick="callMemberPost()" >會員發文一覽</button>
  <button onclick="callMemberReply()">會員回文一覽</button>
</div>
	</div>
</div>
	<!-- main container -->
		<!-- AJAX -->
<div id="List">


<div>
	<table class="table" id="memberPostList">
		<thead 　class="thead-dark">
			<tr>
				<th>論壇分類</th>
				<th>MemberID</th>
				<th>文章標題</th>
				<th>發文時間</th>
				<th>最後修改時間</th>
				<th>管理動作</th>
			</tr>
		</thead>
	</table>
<%-- 		<c:forEach var="PostBean" items="postList"> --%>
<!-- 			<tbody> -->
<!-- 				<tr> -->
<!-- 					<td>露營休閒討論區</td> -->
<!-- 					<td>M001</td> -->
<!-- 					<td>AAAAAAAAA</td> -->
<%-- 					<td>${PostBean.poTile}</td> --%>
<!-- 					<td></td> -->
<!-- 				</tr> -->
<!-- 			</tbody> -->
<%-- 		</c:forEach> --%>



	
</div>



















</div>

<script>
function callMemberPost() {	
		var memberSearch = $('#memberSearch').val();
		console.log(memberSearch);

        $.ajax({
        	      type: 'GET',
                  url : '/yurucamp/Forum/memberPost?memberPost=' + memberSearch + '&type=memberPost',
                  success : function(data) {
								
                	  			console.log(data);
                	  
		                	  	if(data){
		                	  		
		                	  		for(let PostBean of data){
		                	  			console.log(PostBean);
		                	  			
		                	  			var resultHtml = "<tr>"
		                	  				           + "<td>" + PostBean.forumId + "</td>" 
		                	  			               + "<td>" + PostBean.memberId + "</td>"
		                	  			               + "<td>" + PostBean.potitle + "</td>"
		                	  			               + "<td>" + PostBean.poCreatTime + "</td>"
		                	  			               + "<td>" + PostBean.poUpdateTime + "</td>" 
		                	  			               + "</tr>";
		                	  			
		                	  			console.log(resultHtml);
		                	  			
		                	  			$("#memberPostList").append(resultHtml);
		                	  			
		                	  		}
		                	  		
		                	  	}
                  }
        });
}
</script>

<script>
function callMemberReply() {	
		var memberSearch = $('#memberSearch').val();
		console.log(memberSearch);

        $.ajax({
        	      type: 'GET',
                  url : '/yurucamp/Forum/memberPost?memberPost=' + memberSearch,
                  success : function(data) {
								
                	  			console.log(data);
                	  
		                	  	if(data){
		                	  		
		                	  		for(let ReplyBean of data){
		                	  			console.log(ReplyBean);
		                	  			
		                	  			var resultHtml = "<tr>"
		                	  				           + "<td>" + ReplyBean.forumId + "</td>" 
		                	  			               + "<td>" + ReplyBean.memberId + "</td>"
		                	  			               + "<td>" + ReplyBean.retitle + "</td>"
		                	  			               + "<td>" + ReplyBean.reCreatTime + "</td>"
		                	  			               + "<td>" + ReplyBean.reUpdateTime + "</td>" 
		                	  			               + "</tr>";
		                	  			
		                	  			console.log(resultHtml);
		                	  			
		                	  			$("#memberReplyList").append(resultHtml);
		                	  			
		                	  		}
		                	  		
		                	  	}
                  }
        });
}
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