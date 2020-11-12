<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${memberCreat}</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<link rel="icon" href="../img/yuruIcon.png" type="image/x-icon">
<!-- Bootstrap -->
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../ionicons/css/ionicons.min.css" rel="stylesheet">


<script src="/js/jquery-3.2.1.js"></script>
<script src="/js/bootstrap.min.js"></script>
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
 <script src="https://cdn.ckeditor.com/4.15.1/standard/ckeditor.js"></script>
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



	<!-- main container -->
	<div style="width: 70%; margin: 1% 1% 1% 2%; float: left;">
		<div class="panel panel-default" id="main" style="">
			<div class="panel-heading" style="background-color: white">
				<a href="<c:url value='/Forum/forumIndex' />">${ForumBean}</a> › 新主題
			</div>

			<div class="panel-body">
				<div class=" panel-warning">
				<form method="Post" action="<c:url value='/Forum/insert'/>"  >
					<div class="form-group">
						<label class="t1" for="potitle" path="poTitle">主題標題</label>
						<input type="text" class="form-control" id="poTitle"
							path="poTitle" name="poTitle" placeholder="請輸入主題標題"
							/>
					</div>
					<div class="">
						<label class="t1" for="content" path="poContent">正文</label>
						<textarea name="contentforckeditor" rows="10" cols="10" placeholder="請輸入正文"></textarea>
						
					</div>
<!-- 					<div class="form-group"> -->
<%-- 						<form:label class="t1" for="potitle" path="forumId">討論區分類</form:label> --%>
<!-- 						<br /> -->
<%-- 						<form:input type="text" class="form-control" id="forumId" --%>
<%-- 							path="forumId" name="forumId" placeholder="討論區代號" --%>
<%-- 							value="${PostBean.forumId}" /> --%>
<!-- 					</div> -->

					<!--                     <div class="col-sm-10" style="width: 40%"> -->
					<!--                       <div class="form-group"> -->
					<!--                         <select class="form-control" id="tab" name="tab"> -->
					<%--                             <c:forEach items="${forumId}" var="tab"> --%>
					<%--                             <option value="${Forum.id}">${forumId}</option> --%>
					<%--                             </c:forEach> --%>
					<!--                         </select> -->
					<!-- 			</div> -->
					<!-- 		</div> -->
					<br />
					<input type="submit" class="btn btn-primary" value="發布主題">

				</form>
				</div>
				
			</div>
		</div>
	</div>
	


<div style="width: 25%; margin: 1% 2% 1% 0%; float: right;">
<div class="panel panel-default" id="main" style="">
	<div>
	<h1>廣告區</h1>
	<span>
	(*^&%%$#^&*()(*&^%))
	344567865435678
	546788654356789
	jkjhgfdgrtyhytjghg
	dgfhfghffjhj
	1111111111111111111111111111111111
	</span>
	</div>
	<img alt="" src="">
		
</div>
	
</div>




<script src="ckeditor/ckeditor.js" ></script>
<script >
CKEDITOR.replace('contentforckeditor');
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
	<script src="../js/jquery-2.1.1.js"></script>
	<!--  plugins -->
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/menu.js"></script>
	<script src="../js/animated-headline.js"></script>
	<script src="../js/isotope.pkgd.min.js"></script>


	<!--  custom script -->
	<script src="../js/custom.js"></script>

	<!-- google analytics  -->


</body>
</html>