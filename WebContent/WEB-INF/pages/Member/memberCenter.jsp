<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>會員中心</title>
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<!-- Bootstrap -->
<link href="<c:url value='/css/bootstrap.min.css' />" rel="stylesheet">
<link href="<c:url value='/ionicons/css/ionicons.min.css' />"
	rel="stylesheet">
<!-- main css -->
<link href="<c:url value='/css/style.css' />" rel="stylesheet">
<!-- modernizr -->
<script src="<c:url value='/js/modernizr.js' />"></script>
<!-- jQuery -->
<script src="<c:url value='/js/jquery-2.1.1.js' />"></script>
<!--  plugins -->
<script src="<c:url value='/js/bootstrap.min.js' />"></script>
<script src="<c:url value='/js/menu.js' />"></script>
<script src="<c:url value='/js/animated-headline.js' />"></script>
<script src="<c:url value='/js/isotope.pkgd.min.js' />"></script>
<!--  custom script -->
<script src="<c:url value='/js/custom.js' />"></script>

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<!-- //匯入bootstrap -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<!-- //匯入jQuery -->
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<!-- //匯入bootstrap javascript -->
<script src='https://kit.fontawesome.com/a076d05399.js'></script>

<style>
img {
	overflow: hidden;
	border: 2px solid black;
	max-height: 200px;
	border-radius: 50%;
}

.box {
	border: 1px solid red;
	width: 300px;
}

.a, .b {
	display: inline-block;
	width: 100px;
	height: 50px;
	border: 1px solid red;
}
</style>
</head>

<body>

	<jsp:include page="/WEB-INF/pages/include/top.jsp" />



	<div class="jumbotron jumbotron-fluid"
		style="width: 90%; margin: 0 auto; margin-top: 110px; height: 200px; background-color: white;">
		<table style="width: 100%; height: 100%; margin-top: -50px;">
			<tr>
				<td style="height: 100%; background-color: white; width: 50%;">
					<div class="jumbotron-bg" style="margin-right: 15px; float: right">
						<img
							src="https://pic.90sjimg.com/design/03/29/25/25/5d18c98895c61.png">
					</div>
				</td>
				<td>
					<div>
						<h2 style="text-align: left; font-weight: bold;">Hello,${MemberBean.name}</h2>
						<p class="lead" style="text-align: left; font-weight: bold;">${MemberBean.memberId}</p>
						<button type="button" class="btn btn-primary">一般會員</button>
					</div>
				</td>
			</tr>
		</table>
	</div>
<br><hr>

	<table
		style="width: 90%; margin: 0 auto; margin-top: 30px">
		<tr>
			<td style="vertical-align: text-top;">
				<div style="width: 80%">
					<ul class="nav flex-column">
						<li class="active" style="background-color:	#BEBEBE"><a href="#">個人資料</a></li>
						<li><a href="#">訂單資訊</a></li>
						<li><a href="#">歷史發文</a></li>
					</ul>
				</div>
			</td>
			<td style="vertical-align: text-buttom">
				<div 
					style="width: 90%;border: 1px solid #D0D0D0; background-color: white; height: 500px; width: 90%;border-style: hidden">

					<form:form  method="Post" action="Insert" modelAttribute="memInfo">
						<!--action="Controller名字"(Controller自己取的) modelAttribute="隨便名稱"(後端要對應)   -->
						<table class="table" style="float: right;border-style: hidden" >
<!-- 							<tr style="border-style: hidden"> -->
<!-- 								<td style="float: right;border-style: hidden">帳號:</td> -->
<!-- 								<td><input type="text" name="memberId" id="memberId" -->
<%-- 									path="memberId" value="${MemberBean.memberId}"></td> --%>
<!-- 								<td></td> -->
<!-- 							</tr> -->
							<tr style="border-style: hidden">
								<td style="float: right;border-style: hidden">姓名:</td>
								<td><input type="text" name="name" id="name" path="name"
									value="${MemberBean.name}"></td>
								<td></td>
							</tr>
							<tr style="border-style: hidden">
								<td style="float: right;border-style: hidden">密碼:</td>
								<td><input type="password" name="password" id="password"
									path="password" value="${MemberBean.password}"></td>
								<td></td>
							</tr>
							<tr style="border-style: hidden">
								<td style="float: right;border-style: hidden">性別:</td>
								<td><input type="text" name="gender" id="gender"
									path="gender" value="${MemberBean.gender}"></td>
								<td></td>
							</tr>
							<tr style="border-style: hidden">
								<td style="float: right;border-style: hidden">生日:</td>
								<td><input type="text" name="birthday" id="birthday"
									path="birthday" value="${MemberBean.birthday}"></td>
								<td></td>
							</tr>
							<tr style="border-style: hidden">
								<td style="float: right;border-style: hidden">電話:</td>
								<td><input type="text" name="phone" id="phone" path="phone"
									value="${MemberBean.phone}"></td>
								<td></td>
							</tr>
							<tr style="border-style: hidden">
								<td style="float: right;border-style: hidden">地址:</td>
								<td><input type="text" name="address" id="address" path="address"
									value="${MemberBean.address}"></td>
								<td></td>
							</tr>
							<tr style="border-style: hidden">
								<td style="float: right;border-style: hidden">mail:</td>
								<td><input type="text" name="mail" id="mail" path="mail"
									value="${MemberBean.mail}"></td>
								<td></td>
							</tr>
							


		</table>
		<div >
		<input type="reset" value="更新資訊">
		</div>
		</form:form>
		</div>
		</td>
		</tr>
	</table>

	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>



</body>
</html>