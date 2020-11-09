<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Box personal portfolio Template</title>
<link rel="icon" href="../img/fav.png" type="image/x-icon">
<!-- Bootstrap -->
<link href="<c:url value='/css/bootstrap.min.css' />" rel="stylesheet">
<link href="<c:url value='/ionicons/css/ionicons.min.css' />" rel="stylesheet">
<!-- main css -->
<link href="<c:url value='/css/style.css' />" rel="stylesheet">
<!-- form css -->
<link href="<c:url value='/css/formstyle.css' />" rel='stylesheet' type='text/css' />
<!-- modernizr -->
<script src="<c:url value='/js/modernizr.js' />"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<style>
.input-contact {
	height: 40px;
	width: 100%;
	border: solid 0px rgba(0, 0, 0, .1);
	position: relative;
	margin-bottom: 30px;
}

.top-bar {
	/*     color: #333; */
	/*     padding: 150px 0 150px; */
	background: -webkit-linear-gradient(rgba(255, 255, 255, .8),
		rgba(255, 255, 255, .8)), url(../img/car/car.jpg);
	background: linear-gradient(rgba(255, 255, 255, .8),
		rgba(255, 255, 255, .8)), url(../img/car/car.jpg);
	/*     background-size: cover;
	/*     background-attachment: fixed; */
	/*     background-position: center center; */
	/*     text-align: center; */
}

h3 {
	font-size: 15px;
	/* font-weight: 500; */
	text-transform: capitalize;
	color: #5d5030e0;
	/* text-shadow: 1px 1px 7px #6b6b6b; */
	/* letter-spacing: 5px; */
	margin: 1.0em 0 1em;
	/* text-align: center; */
	/* font-family: 'Montserrat Alternates', sans-serif; */
}

.deviceform {
	/* border:3px solid #f5f0de;
            background-color: #f5f0de; */
	border-radius: 30px;
	width: 450px;
	padding: 30px;
	padding-bottom: 20px;
	float: left;
	box-shadow:1px 1px 7px #8a6d3b73;
 	margin:10px;
}

#amount-table {
	border: 3px solid #dbcf83;
	border-radius: 30px;
	width: 400px;
	padding: 30px;
	float:left;
/* 	box-shadow:1px 1px 7px #8a6d3b73; */
}

.tabletd {
	padding: 7px;
}
</style>
</head>

<body>

	<jsp:include page="/WEB-INF/pages/include/top.jsp" />

	<!-- top bar -->
	<div class="top-bar">
		<h1>露營車租借</h1>
		<p>
			<a href="#">Travel is the only thing you buy that makes you richer.</a>
		</p>
	</div>
	<!-- end top bar -->

	<!-- main container -->
	<div class="book-appointment">
		<div class="book-agileinfo-form">

			<form action="<c:url value='/Car/reservation2' />" method="post" class="deviceform">

						<p style="font-size:20px;">加購裝備</p>
						<p>露營組<br>內含露營椅、小木桌、露營燈、小音箱</p>
						<img alt="" src="../img/car/monster.png">
						<br> <select id="country1" class="frm-field required sect" name="device">
							<option value="">數量</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
						</select>

						<br><br><p style="font-size:20px;">優惠序號 coupon</p>
						<p>請輸入您的優惠券號碼</p>
						<br> <input type="text" placeholder="請輸入" name="discount">
					
			</form>
		</div>

   <div  class="book-agileinfo-form">
<%--    	<form class="deviceform"> --%>
	<table id="amount-table">
		<tr>
			<td colspan="3" style="background:#dbcf83; font-size:20px; padding:6px" >您選擇的方案</td>
		</tr>
		<tr>
			<td class="tabletd">取車地點</td>
			<td colspan="2">${dept}</td>
		</tr>
		<tr>
			<td class="tabletd">還車地點</td>
			<td colspan="2">${ret}</td>
		</tr>
		<tr>
			<td class="tabletd">取車日期</td>
			<td>${deptDate}</td>
			<td>${deptTime}</td>
		</tr>
		<tr>
			<td class="tabletd">還車日期</td>
			<td>${returnDate}</td>
			<td>${returnTime}</td>
		</tr>
		<tr>
			<td class="tabletd">租用車款</td>
			<td colspan="2">${type}</td>
		</tr>
		<tr>
			<td class="tabletd">數量</td>
			<td colspan="2">${amount}</td>
		</tr>
		<tr>
			<td class="tabletd">租車費用</td>
			<td colspan="2"></td>
		</tr>
		<tr>
			<td class="tabletd">加購裝備數量</td>
			<td>${device}</td>
			<td></td>
		</tr>
		<tr>
			<td class="tabletd">適用多日優惠</td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td class="tabletd">優惠券折抵</td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td colspan="2" class="tabletd">合計金額</td>
			<td></td>
		</tr>
		<tr>
			<td colspan="3"><input type="submit" value="確定預約"></td>
		</tr>
	</table>
<%-- 	</form> --%>

	<div class="clear"></div>
		</div>
	</div>

	
	
<!-- 	new start -->
	<form:form method='POST' modelAttribute="bookBean" class='form-horizontal' enctype="multipart/form-data" >
		<input type="hidden" id="dept" name="dept" value="dept">
		<input type="hidden" id="ret" name="ret" value="ret">
		<input type="hidden" id="deptDate" name="deptDate" value="deptDate">
		<input type="hidden" id="deptTime" name="deptTime" value="deptTime">
		<input type="hidden" id="returnDate" name="returnDate" value="returnDate">
		<input type="hidden" id="returnTime" name="returnTime" value="returnTime">
		<input type="hidden" id="device" name="device" value="device">
		
<!-- 		<div class='col-lg-offset-2 col-lg-10'> -->
<!-- 			<input id="btnAdd" type='submit' class='btn btn-primary' value="送出" /> -->
		</div>
	</form:form>
	
	
<!-- 	new end -->
	
	

	<!-- end main container -->

	<!-- footer -->
	<footer>
		<div class="container-fluid">
			<p class="copyright">© Box Portfolio 2016</p>
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