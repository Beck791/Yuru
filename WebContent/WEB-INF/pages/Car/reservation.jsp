<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
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
		rgba(255, 255, 255, .8)), url../img/car/car.jpg);
	/*     background-size: cover;
	/*     background-attachment: fixed; */
	/*     background-position: center center; */
	/*     text-align: center; */
}
.cartype{
	border: 1px solid #dbcf83;
    border-radius:30px;
    width:800px;
    padding: 20px;
    margin: auto;
/*     float:left; */
}
.cartypetd {
    padding:10px;
        }
#form2{
	box-shadow: 1px 1px 7px #8a6d3b73;
	padding:16px;
}
.country{
    width: 64%;
    color: #4a462c;
    font-size: 16px;
    letter-spacing: 1.5px;
    padding: 8px 8px;
    outline: none;
    background: rgba(255, 255, 255, 0);
    border: none;
    border-bottom: 2px solid #b9af6f;
    box-sizing: border-box;
    font-family: 'Roboto', sans-serif;
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
		<!-- <h2>Personal Details</h2> -->
		<div class="book-agileinfo-form">
			<form id="form2" name="form2" action="<c:url value='/Car/reservation' />" method="post">
				<input type="hidden" id="type" name="type" value="">
				<input type="hidden" id="amount" name="amount" value="">
				<div class="main-agile-sectns">
					<div class="agileits-btm-spc form-text1">
						<img src="../img/car/location.png" width="15px">
						<select name="dept" id="country1" class="frm-field required sect">
							<option value="">取車地點</option>
							<option value="台北" ${dept eq '台北' ? 'selected' : ''}>台北</option>
							<option value="台中" ${dept eq '台中' ? 'selected' : ''}>台中</option>
							<option value="台南" ${dept eq '台南' ? 'selected' : ''}>台南</option>
							<option value="高雄" ${dept eq '高雄' ? 'selected' : ''}>高雄</option>
							<option value="花蓮" ${dept eq '花蓮' ? 'selected' : ''}>花蓮</option>
						</select>
					</div>
					<div class="agileits-btm-spc form-text2">
						<img src="../img/car/location.png" width="15px">
						<select name="ret" id="country" class="frm-field required">
							<option value="">還車地點</option>
							<option value="台北" ${ret eq '台北' ? 'selected' : ''}>台北</option>
							<option value="台中" ${ret eq '台中' ? 'selected' : ''}>台中</option>
							<option value="台南" ${ret eq '台南' ? 'selected' : ''}>台南</option>
							<option value="高雄" ${ret eq '高雄' ? 'selected' : ''}>高雄</option>
							<option value="花蓮" ${ret eq '花蓮' ? 'selected' : ''}>花蓮</option>
						</select>
					</div>
				</div>
				<div class="main-agile-sectns">
					<div class="agileits-btm-spc form-text1">
					<img src="../img/car/calender.png" width="15px">
						<input type="date" placeholder="取車日期" name="deptDate" class="frm-field required" required
							value="${deptDate}" id="deptDate">
					</div>
					<div class="agileits-btm-spc form-text2">
						<img src="../img/car/clock.png" width="15px">
						<select name="deptTime" id="country" class="frm-field required" required>
							<option value="">時間</option>
							<option value="9:00" ${deptTime eq '9:00' ? 'selected' : ''}>9:00</option>
							<option value="10:00" ${deptTime eq '10:00' ? 'selected' : ''}>10:00</option>
							<option value="11:00" ${deptTime eq '11:00' ? 'selected' : ''}>11:00</option>
							<option value="12:00" ${deptTime eq '12:00' ? 'selected' : ''}>12:00</option>
							<option value="13:00" ${deptTime eq '13:00' ? 'selected' : ''}>13:00</option>
							<option value="14:00" ${deptTime eq '14:00' ? 'selected' : ''}>14:00</option>
							<option value="15:00" ${deptTime eq '15:00' ? 'selected' : ''}>15:00</option>
							<option value="16:00" ${deptTime eq '16:00' ? 'selected' : ''}>16:00</option>
							<option value="17:00" ${deptTime eq '17:00' ? 'selected' : ''}>17:00</option>
							<option value="18:00" ${deptTime eq '18:00' ? 'selected' : ''}>18:00</option>
						</select>
					</div>
				</div>
				<div class="main-agile-sectns">
					<div class="agileits-btm-spc form-text1">
					<img src="../img/car/calender.png" width="15px">
						<input type="date" placeholder="還車日期" name="returnDate" class="frm-field required" required
							value="${returnDate}" id="retD">
					</div>
					<div class="agileits-btm-spc form-text2">
						<img src="../img/car/clock.png" width="15px">
						<select name="returnTime" id="country" class="frm-field required">
							<option value="">時間</option>
							<option value="9:00" ${returnTime eq '9:00' ? 'selected' : ''}>9:00</option>
							<option value="10:00" ${returnTime eq '10:00' ? 'selected' : ''}>10:00</option>
							<option value="11:00" ${returnTime eq '11:00' ? 'selected' : ''}>11:00</option>
							<option value="12:00" ${returnTime eq '12:00' ? 'selected' : ''}>12:00</option>
							<option value="13:00" ${returnTime eq '13:00' ? 'selected' : ''}>13:00</option>
							<option value="14:00" ${returnTime eq '14:00' ? 'selected' : ''}>14:00</option>
							<option value="15:00" ${returnTime eq '15:00' ? 'selected' : ''}>15:00</option>
							<option value="16:00" ${returnTime eq '16:00' ? 'selected' : ''}>16:00</option>
							<option value="17:00" ${returnTime eq '17:00' ? 'selected' : ''}>17:00</option>
							<option value="18:00" ${returnTime eq '18:00' ? 'selected' : ''}>18:00</option>
						</select>
					</div>
				</div>
				
				<div class="wthree-text">
				
				</div>
				<input type="submit" value="Search">
				<div class="clear"></div>
			</form>
		</div>

	</div>
	</div>
<!-- 	<div class="book-agileinfo-form input"> -->
<%-- 		<c:forEach items="${planList}" var="data"> --%>
<!-- 			<table class="cartype"> -->
<!-- 				<tr> -->
<!-- 					<td colspan="3" class="cartypetd"></td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td colspan="3" class="cartypetd">${data.type}</td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<!-- 					<td>一般價格</td> -->
<!-- 					<td>三日價格</td> -->
<!-- 					<td>五日價格</td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td>${data.price}</td> --%>
<!-- 					<td>5% OFF</td> -->
<!-- 					<td>10% OFF</td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<!-- 					<td></td> -->
<!-- 					<td></td> -->
<!-- 					<td>數量 -->
<!-- 					<select name="device" id="device" onchange="change_country(this.value)" class="frm-field required"> -->
<!-- 							<option value="">請選擇</option> -->
<!-- 							<option value="1">1</option> -->
<!-- 							<option value="2">2</option> -->
<!-- 							<option value="3">3</option> -->
<!-- 					</select> -->
<!-- 					</td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<!-- 					<td colspan="3"><input type="submit" value="選擇這輛"></td> -->
<!-- 				</tr> -->
<!-- 			</table> -->
<!-- 			<br> -->
<%-- 		</c:forEach> --%>
<!-- 		</div> -->
		
	<div class="book-agileinfo-form input">
			<form id="form3" name="form3" action="<c:url value='/Car/reservation2' />" method="post">	
		<c:forEach items="${planList}" var="data" varStatus="step">
			<table class="cartype">
				<tr>
<%-- 					<td colspan="2" style="text-align:center" class="cartypetd"><img src="${data.imgUrl}"  width="250px"></td> --%>
					<td colspan="2" style="text-align:center;width:200px;" class="cartypetd">${data.image}</td>
					<td colspan="1" class="cartypetd"><font style="font-size:20px">${data.type}</font><input type="hidden" id="type${step.index}" name="type${step.index}" value="${data.type}"></td>
				</tr>
				<tr>
					<td class="cartypetd" style="text-align:center">一般價格</td>
					<td style="text-align:center">三日價格</td>
					<td style="text-align:center">五日價格</td>	
				</tr>	
				<tr>
					<td style="text-align:center">${data.price} /日</td>		
<%-- 					<fmt:parseNumber value="${data.price}" type="currency"/>			 --%>
<%-- 					<fmt:formatNumber type=”number” value=”${data.price*0.95}” maxFractionDigits=”0″/> --%>
					<td style="text-align:center">${data.price*0.95} /日</td>
					<td style="text-align:center">${data.price*0.9} /日</td>				
				</tr>
				<tr><td></td></tr>
				<tr>
					<td></td>
					<td></td>
					<td style="text-align:center">數量
					<select name="device" id="device${step.index}" class="country">
							<option value="">請選擇</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
					</select>
					</td>					
				</tr>	
				<tr>
					<td colspan="3" style="text-align:center"><input type="button" value="選擇這輛" onclick="doNext('${step.index}',);"></td>					
				</tr>	
			</table>
			<br>
		</c:forEach>
		
		</form>
		</div>
		</div>

<!-- 	end main container -->

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
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

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
			document.getElementById("returnDate").setAttribute("min", deptDate);
		}

		
		function doNext(count){
			var type = $('#type' + count).val();
			var device = $('#device' + count).val();
			if(device == null || device == ''){
				swal("請選擇車輛數量", "", "warning");
				return;
			}
			$('#type').val(type);
			$('#amount').val(device);
			var action = document.getElementById("form2").action;
			$('#form2').attr('action', action + "2").submit();
			document.getElementById("form2").submit();
		}
		
		
		
	</script>

</body>

</html>