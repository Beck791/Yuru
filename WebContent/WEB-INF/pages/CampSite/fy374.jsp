<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
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
<!-- main css -->
<link href="<c:url value='/css/style.css' />" rel="stylesheet">
<!-- modernizr -->
<script src="<c:url value='/js/modernizr.js' />"></script>
<title>南庄 鳳凰谷</title>

<style>
.wrapper {
	position: relative;
	width: 1000px;
	height: 400px;
	overflow: hidden;
	margin: 0 auto;
}

ul {
	margin: 0;
	padding: 0;
	position: absolute;
}

li {
	margin: 0;
	padding: 0;
	list-style: none;
}

ul.slides {
	width: 5000px;
	left: 0px;
	transition: all .5s;
}

ul.slides li {
	width: 1000px;
	height: 400px;
	overflow: hidden;
	float: left;
}

ul.slides li img {
	width: 100%;
	height: 100%;
	object-fit: cover;
}

.dot {
	bottom: 10px;
	width: 100%;
	display: flex;
	justify-content: center;
}

.dot li {
	border: 1px solid #fff;
	border-radius: 50%;
	margin: 0 5px;
	width: 10px;
	height: 10px;
}

.slide_btn {
	display: flex;
	justify-content: center;
	align-items: center;
	top: 0;
	bottom: 0;
	width: 30px;
	color: #fff;
	position: absolute;
	font-size: 24px;
}

#prevSlide {
	left: 0;
}

#nextSlide {
	right: 0;
}

.slide_btn i {
	color: rgba(255, 255, 255, .6);
	transition: .5s;
}

.slide_btn:hover i {
	color: rgba(255, 255, 255, 1);
}

.title {
	padding-left: 145px;
	font-family: 微軟正黑體
}
</style>
</head>
<body>
	<jsp:include page="/WEB-INF/pages/include/top.jsp" />
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

	<h2 class="title">南庄 鳳凰谷</h2>
	<div class="wrapper">
		<ul class="slides">
			<li><img src="<c:url value='/img/camp/fy374/fy374_1.png' />"
				alt=""></li>
			<li><img src="<c:url value='/img/camp/fy374/fy374_2.png' />"
				alt=""></li>
			<li><img src="<c:url value='/img/camp/fy374/fy374_3.png' />"
				alt=""></li>
			<li><img src="<c:url value='/img/camp/fy374/fy374_4.png' />"
				alt=""></li>
			<li><img src="<c:url value='/img/camp/fy374/fy374_5.png' />"
				alt=""></li>
		</ul>
		<ul class="dot">
			<li id="1"></li>
			<li id="2"></li>
			<li id="3"></li>
			<li id="4"></li>
			<li id="5"></li>
		</ul>
		<div id="prevSlide" class="slide_btn">
			<i class="fa fa-caret-left"></i>
		</div>
		<div id="nextSlide" class="slide_btn">
			<i class="fa fa-caret-right"></i>
		</div>
	</div>


	<!-- Trigger the modal with a button -->
	<a href="https://yurucamp.youcanbook.me/" data-toggle="modal"
		data-target="#myModal">預約營地</a>
	<!-- Modal -->
	<div class="modal fade" id="myModal" role="dialog" aria-hidden="true">
		<div class="modal-dialog modal-lg">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header"></div>
				<div class="modal-body">
					<iframe src="https://yurucamp.youcanbook.me/" width="100%"
						height="550" frameborder="0"></iframe>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">關閉</button>
				</div>
			</div>
		</div>
	</div>


	<!-- jQuery -->
	<script src="<c:url value='/js/jquery-2.1.1.js' />"></script>
	<!--  plugins -->
	<script src="<c:url value='/js/bootstrap.min.js' />"></script>
	<script src="<c:url value='/js/menu.js' />"></script>
	<script src="<c:url value='/js/animated-headline.js' />"></script>
	<script src="<c:url value='/js/isotope.pkgd.min.js' />"></script>

	<!--  custom script -->
	<script src="<c:url value='/js/custom.js' />"></script>

	<script>
		//輪播
		let slideNum = 0;
		let slideCount = $(".slides li").length; //5
		let lastIndex = slideCount - 1;
		$(".dot li").eq(0).css("background-color", "white");
		$(".dot li").mouseenter(function() {
			slideNum = $(this).index();
			// 	    console.log(slideNum);
			show();
		});

		function show() {
			$(".dot li").eq(slideNum).css("background-color", "#fff")
					.siblings().css("background-color", "transparent");
			let move = 0 - 1000 * slideNum;
			$("ul.slides").css("left", move);
		}

		$("#prevSlide").click(function() {
			slideNum--;
			if (slideNum < 0)
				slideNum = lastIndex;
			show();
		})

		$("#nextSlide").click(function() {
			slideNum++;
			if (slideNum > lastIndex)
				slideNum = 0;
			show();
		})

		let timer = setInterval(advertising, 3000);

		$(".wrapper").mouseenter(function() {
			// 	    console.log("in");
			clearInterval(timer);
		})

		$(".wrapper").mouseleave(function() {
			// 	    console.log("out");
			timer = setInterval(advertising, 3000);
		})

		function advertising() {
			let move = 0 - 1000 * slideNum;
			slideNum++;
			if (slideNum > 4)
				slideNum = 0;
			;
			show();
		}
	</script>

</body>
</html>