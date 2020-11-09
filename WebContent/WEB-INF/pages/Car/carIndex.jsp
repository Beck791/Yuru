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
		rgba(255, 255, 255, .8)), url(../img/car.jpg);
	background: linear-gradient(rgba(255, 255, 255, .8),
		rgba(255, 255, 255, .8)), url(../img/car.jpg);
	/*     background-size: cover;
/*     background-attachment: fixed; */
	/*     background-position: center center; */
	/*     text-align: center; */
}
form{
	box-shadow: 1px 1px 7px #8a6d3b73;
	padding:16px;
	background-color:white;
	width:600px;
	margin:auto;
}
</style>


<style>
/***** key__visual *****/
.key__visual {
  position: relative;
  height: 760px;
  padding-top: 115px;
  min-width: 1000px;
  z-index: 1;
  background: #fff;
}
.key__visual::before {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 115px;
  background: #fff;
  z-index: 9997;
}
.key__visual--inner {
  position: relative;
  height: 630px;
}
.key__visual--inner::before {
  content: "";
  background: url("../img/car/wave_top.png") repeat-x center 0;
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 60px;
  z-index: 1;
}
.key__visual--inner::after {
  content: "";
  background: url("../img/car/wave_bottom.png") repeat-x center 0;
  position: absolute;
  bottom: 0;
  left: 0;
  width: 100%;
  height: 60px;
}
.key__visual .key__visual--main {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  margin: auto;
  width: 100%;
  height: 630px;
  overflow: hidden;
  z-index: 0;
  display: flex;
}
.key__visual .key__visual--main video {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  margin: auto;
  width: 100%;
  z-index: 0;
}
.key__visual .key__visual--main::after {
  content: "";
  background: #000;
  position: absolute;
  top: 0;
  left: 0;
  opacity: 0.1;
  width: 100%;
  height: 100%;
  z-index: 1;
}
.key__visual h1 {
  color: #fff;
  font-size: 285.7%;
  font-weight: bold;
  position: absolute;
  top: 210px;
  left: 50%;
  transform: translateX(-50%);
  text-align: center;
  width: 980px;
  margin: 0 auto;
  z-index: 1;
}
.key__visual--movie {
  position: absolute;
  top: 270px;
  left: 50%;
  transform: translateX(-50%);
  text-align: center;
  margin: 8px auto 0;
  width: 980px;
  z-index: 1;
}
.key__visual--movie a {
  background: url(/car/common_new/images/parts/icon_link_01.png) no-repeat 0 center;
  background-size: 25px;
  color: #fff;
  font-size: 128.5%;
  font-weight: bold;
  padding: 6px 0 6px 35px;
}
.key__visual--movie a:hover {
  text-decoration: underline;
}
.key__visual--banner {
  position: absolute;
  left: 50%;
  bottom: 15%;
  margin-left: -359px;
}
.key__visual--search {
  position: relative;
  text-align: center;
  margin-top: 38px;
  z-index: 1;
}
.key__visual--search button {
  position: relative;
  background: url(/car/common_new/images/parts/icon_search.png) no-repeat 18px center #F08300;
  background-size: 20px;
  border: 2px solid #fff;
  border-radius: 25px;
  color: #fff;
  display: inline-block;
  font-size: 114.2%;
  font-weight: bold;
  vertical-align: middle;
  overflow: hidden;
  padding: 11px 40px 10px;
  position: relative;
  width: 240px;
  z-index: 1;
}
.key__visual--search button:before,
.key__visual--search button:after {
  content: "";
  background: #fff;
  position: absolute;
  top: 0;
  bottom: 7px;
  right: 15px;
  margin: auto 0;
  width: 10px;
  height: 1px;
  transform: rotate(50deg);
  z-index: 0;
}
.key__visual--search button:after {
  top: 7px;
  bottom: 0;
  transform: rotate(-50deg);
}


.key__visual--bnr {
    position: absolute;
    bottom: 214px;
    left: 0;
    z-index: 9999;
    width: 100%; 
}
#img{
	opacity: 0.5;
}

</style>

</head>

<body>

	<jsp:include page="/WEB-INF/pages/include/top.jsp" />

	<!-- top bar -->
<!-- 	<div class="top-bar"> -->
<!-- 		<h1>露營車租借</h1> -->
<!-- 		<p> -->
<!-- 			<a href="#">Travel is the only thing you buy that makes you richer.</a> -->
<!-- 		</p> -->
<!-- 	</div> -->
	<!-- end top bar -->

	<!-- main container -->
	
	<div class="key__visual">
	<div class="book-appointment key__visual--inner">
		<div class="key__visual--main">
			<img class="lazyloaded" src="../img/car/car.png" alt="背景" id="img">
		</div>
		<div class="key__visual--bnr book-agileinfo-form">
			<form id="form1" name="form1" action="<c:url value='/Car/reservation' />" method="post">

				<div class="main-agile-sectns">
					<div class="agileits-btm-spc form-text1">
						<img src="../img/car/location.png" width="15px">
						<select name="dept" id="country1" class="frm-field required sect" required>
							<option value="">取車地點</option>
							<option value="台北">台北</option>
							<option value="台中">台中</option>
							<option value="台南">台南</option>
							<option value="高雄">高雄</option>
							<option value="花蓮">花蓮</option>
						</select>
					</div>
					<div class="agileits-btm-spc form-text2">
						<img src="../img/car/location.png" width="15px">
						<select name="ret" id="country" class="frm-field required" required>
							<option value="">還車地點</option>
							<option value="台北">台北</option>
							<option value="台中">台中</option>
							<option value="台南">台南</option>
							<option value="高雄">高雄</option>
							<option value="花蓮">花蓮</option>
						</select>
					</div>
				</div>
				<div class="main-agile-sectns">
					<div class="agileits-btm-spc form-text1">
						<img src="../img/car/calender.png" width="15px">
						<input type="date" placeholder="取車日期" name="deptDate" class="frm-field required" required
							id="deptDate" onchange="changeMin();">
					</div>
					<div class="agileits-btm-spc form-text2">
						<img src="../img/car/clock.png" width="15px">
						<select name="deptTime" id="country" class="frm-field required" required>
							<option value="">時間</option>
							<option value="9:00">9:00</option>
							<option value="10:00">10:00</option>
							<option value="11:00">11:00</option>
							<option value="12:00">12:00</option>
							<option value="13:00">13:00</option>
							<option value="14:00">14:00</option>
							<option value="15:00">15:00</option>
							<option value="16:00">16:00</option>
							<option value="17:00">17:00</option>
							<option value="18:00">18:00</option>
						</select>
					</div>
				</div>
				<div class="main-agile-sectns">
					<div class="agileits-btm-spc form-text1">
						<img src="../img/car/calender.png" width="15px">
						<input type="date" placeholder="還車日期" name="returnDate" class="frm-field required" required
							id="returnDate">
					</div>
					<div class="agileits-btm-spc form-text2">
						<img src="../img/car/clock.png" width="15px">
						<select name="returnTime" id="country" onchange="change_country(this.value)" class="frm-field required" required>
							<option value="">時間</option>
							<option value="9:00">9:00</option>
							<option value="10:00">10:00</option>
							<option value="11:00">11:00</option>
							<option value="12:00">12:00</option>
							<option value="13:00">13:00</option>
							<option value="14:00">14:00</option>
							<option value="15:00">15:00</option>
							<option value="16:00">16:00</option>
							<option value="17:00">17:00</option>
							<option value="18:00">18:00</option>
						</select>
					</div>
				</div>
				
				<div class="wthree-text">
				
				</div>
				<input type="submit" value="Search">
				<div class="clear"></div>
			</form>
		</div>

	</div></div>
	</div>
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

		//   日期檢查
		var today = new Date();
		var todayPlus3Month = '';
		var dd = today.getDate();
		var mm = today.getMonth() + 1; //January is 0!
		var mm2 = today.getMonth() + 4; //January is 0!
		var yyyy = today.getFullYear();
		if (dd < 10) {
			dd = '0' + dd
		}
		if (mm < 10) {
			mm = '0' + mm
		}

		today = yyyy + '-' + mm + '-' + dd;
		todayPlus3Month = yyyy + '-' + mm2 + '-' + dd;
		document.getElementById("deptDate").setAttribute("min", today);
		document.getElementById("returnDate").setAttribute("min", today);
		document.getElementById("deptDate").setAttribute("max", todayPlus3Month);
		document.getElementById("returnDate").setAttribute("max", todayPlus3Month);

		function changeMin() {
			let deptd = $('#deptDate').val();
			document.getElementById("returnDate").setAttribute("min", deptd);
		}

		//  檢查有無空白欄位
		//    function doNext(){
		//        if($("#dept").val()==""){
		//               alert("您尚未選取取車地點");
		//               eval("document.form1['dept'].focus()");       
		//           }else if($("#ret").val()==""){
		//               alert("您尚未選取還車地點");
		//               eval("document.form1['ret'].focus()");    
		//           }else if($("#depttime").val()==""){
		//               alert("您尚未選取取車時間");
		//               eval("document.form1['depttime'].focus()");     
		//           }else if($("#returntime").val()==""){
		//               alert("您尚未選取還車時間");
		//               eval("document.form1['returntime'].focus()");    
		//           }else if($("#type").val()==""){
		//               alert("您尚未選取訂購車型");
		//               eval("document.form1['type'].focus()"); 
		//           }else if($("#device").val()==""){
		//               alert("您尚未選取露營組數量");
		//               eval("document.form1['device'].focus()");              
		//           }else{
		//               document.form1.submit();
		//           }
		//    }
		
	</script>

</body>

</html>