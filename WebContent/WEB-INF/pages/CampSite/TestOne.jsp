<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TestOne</title>

<link rel="icon" href="<c:url value='/img/yuruIcon.png' />"
	type="image/x-icon">
<!-- Bootstrap -->
<link href="<c:url value='/css/bootstrap.min.css' />" rel="stylesheet">
<link href="<c:url value='/ionicons/css/ionicons.min.css' />"
	rel="stylesheet">
<!-- main css -->
<link href="<c:url value='/css/style.css' />" rel="stylesheet">
<!-- modernizr -->
<script src="<c:url value='/js/modernizr.js' />"></script>

<style>

/* guide */
.cal-container {
	margin-right: auto;
	margin-left: auto;
	padding-left: 10px;
	padding-right: 10px;
}

.cal-app_list {
	margin: 0 auto;
	background: #dbcf83;
	min-height: 200px;
}

.cal-app_list .cal-app_item a p {
	margin: 0;
	color: #5d5030e0;
	letter-spacing: 0;
	text-align: center;
	font-size: 14px;
}

.cal-app_list .cal-app_item a p>span {
	display: inline-block;
	vertical-align: middle;
}

.cal-app_list .cal-app_item img {
	display: inline-block;
	vertical-align: middle;
	margin-bottom: 34px;
}

.cal-app_list .cal-app_item.cal-xs-5 {
	width: 20%;
}

.cal-app_list .cal-app_item {
	float: left;
	text-align: center;
	padding-top: 5%;
	position: relative;
	min-height: 1px;
	padding-left: 15px;
	padding-right: 15px;
}

ul, li {
	list-style: outside none;
	padding: 0;
	margin: 0;
}

@media ( min-width : 1200px) .cal-container {
	width
	:
	 
	1200
	px
	;
	

}
</style>


</head>

<body>


	<!-- 導覽列 -->
	<section class="cal-app_list">
		<div class="cal-container">
			<ul class="clearfix">
				<li class="cal-xs-5 cal-app_item" cal-hover-img="../img/car/information.png">
				<a href="/tw/zh/faq/index"> 
					<img src="../img/car/information.png" width="40px">
					<p class="cal-app_name">
						<span>預約流程</span>
					</p>
				</a>
				</li>
				<li class="cal-xs-5 cal-app_item" cal-hover-img="../img/car/information.png">
				<a href="/tw/zh/faq/index"> 
					<img src="../img/car/information.png" width="40px">
					<p class="cal-app_name">
						<span>預約流程</span>
					</p>
				</a>
				</li>				<li class="cal-xs-5 cal-app_item" cal-hover-img="../img/car/information.png">
				<a href="/tw/zh/faq/index"> 
					<img src="../img/car/information.png" width="40px">
					<p class="cal-app_name">
						<span>預約流程</span>
					</p>
				</a>
				</li>				<li class="cal-xs-5 cal-app_item" cal-hover-img="../img/car/information.png">
				<a href="/tw/zh/faq/index"> 
					<img src="../img/car/information.png" width="40px">
					<p class="cal-app_name">
						<span>預約流程</span>
					</p>
				</a>
				</li>				<li class="cal-xs-5 cal-app_item" cal-hover-img="../img/car/information.png">
				<a href="/tw/zh/faq/index"> 
					<img src="../img/car/information.png" width="40px">
					<p class="cal-app_name">
						<span>預約流程</span>
					</p>
				</a>
				</li>
			</ul>
		</div>

	</section>

	<!-- jQuery -->
	<script src="../js/jquery-2.1.1.js"></script>
	<!--  plugins -->
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/menu.js"></script>
	<script src="../js/animated-headline.js"></script>
	<script src="../js/isotope.pkgd.min.js"></script>
	<!--  custom script -->
	<script src="../js/custom.js"></script>

</body>
</html>