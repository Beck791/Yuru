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

.munuinf{
	width: 50%;
	margin: 0 auto;
	margin-top:20px;
	border:2px solid #DDDDDD;
	border-radius:20px;
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
<br>
<div id="A"></div>
	<div style="background-color:#AAAAAA">
	<ul class="nav nav-tabs" style="width: 80%; margin: 0 auto; margin-top: 20px" >
        <li><a data-toggle="tab" href="#menu1"  style="color:black">個人資料</a></li>
        <li><a data-toggle="tab" href="#menu2" style="color:black">會員升級</a></li>
        <li><a data-toggle="tab" href="#menu3" style="color:black">歷史訂單</a></li>
        <li><a data-toggle="tab" href="#menu4" style="color:black">歷史發文</a></li>
    </ul>
    </div>
        
    <div class="tab-content"  >
            <div id="home" class="tab-pane fade in active" style="width: 80%;margin: 0 auto;height:0px;">
      		<h3></h3>
      		<p></p>
    	</div>
        <div id="menu1" class="tab-pane fade munuinf" >
			<h3 style="text-align:center">個人資料</h3><br>
			<table class="table" style="text-align:left">
			  <tbody>
			    <tr >
					<td style="text-align:right;width:250px;">姓名:</td>
					<td><input type="text" name="name" id="name" path="name" value="${MemberBean.name}"></td>
			    	<td></td>
			    </tr>
			    <tr>
					<td style="text-align:right;width:200px">密碼:</td>
					<td><input type="password" name="password" id="password"
									path="password" value="${MemberBean.password}"></td>
					<td></td>		    
			    </tr>
			    <tr>
					<td style="text-align:right;width:200px">性別:</td>
					<td><input type="text" name="gender" id="gender"
									path="gender" value="${MemberBean.gender}"></td>
					<td></td>
			    </tr>
			    <tr>
					<td style="text-align:right;width:200px">生日:</td>
					<td><input type="text" name="birthday" id="birthday"
						path="birthday" value="${MemberBean.birthday}"></td>
					<td></td>
				</tr>
				<tr >
					<td style="text-align:right;width:200px">電話:</td>
					<td><input type="text" name="phone" id="phone" path="phone"
						value="${MemberBean.phone}"></td>
					<td></td>
				</tr>
				<tr>
					<td style="text-align:right;width:200px">地址:</td>
					<td><input type="text" name="address" id="address" path="address"
						value="${MemberBean.address}"></td>
					<td></td>
				</tr>
				<tr>
					<td style="text-align:right;width:200px">mail:</td>
					<td><input type="text" name="mail" id="mail" path="mail"
						value="${MemberBean.mail}"></td>
					<td></td>
				</tr>
				<tr>
					<td style="text-align:right;width:200px"></td>
					<td><br><button type="button" class="btn btn-light">更新資訊</button></td>
					<td></td>
				</tr>
			  </tbody>
			</table>
        </div>
        <div id="menu2" class="tab-pane fade munuinf">
            <h3>${MemberBean.memberId}</h3>
            <div>
            	<input type="radio" name="pay" value="pay" />會員升級 NT$500/年 <br>
           		<button>確認</button>
            </div>
        </div>
        <div id="menu3" class="tab-pane fade munuinf" >
            <h3>Menu 3</h3>
            <p>Some content in menu 3.</p>
        </div>
        <div id="menu4" class="tab-pane fade munuinf">
            <h3>Menu 4</h3>
            <p>Some content in menu 4.</p>
        </div>
    </div>
    
<body>

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

<!--             <h3 style="text-align:center">會員資料</h3> -->
<!--             <div style="width: 90%;border: 1px solid #D0D0D0;"> -->

<%-- 					<form:form  method="Post" action="Insert" modelAttribute="memInfo"> --%>
<!-- 						action="Controller名字"(Controller自己取的) modelAttribute="隨便名稱"(後端要對應)   -->
<!-- 						<table class="table" style="float: right;border:2px solid black" > -->
<!-- 							<tr style="border-style: hidden"> -->
<!-- 								<td style="float: right;">姓名:</td> -->
<!-- 								<td><input type="text" name="name" id="name" path="name" -->
<%-- 									value="${MemberBean.name}"></td> --%>
<!-- 								<td></td> -->
<!-- 							</tr> -->
<!-- 							<tr "> -->
<!-- 								<td style="float: right;border-style: hidden">密碼:</td> -->
<!-- 								<td><input type="password" name="password" id="password" -->
<%-- 									path="password" value="${MemberBean.password}"></td> --%>
<!-- 								<td></td> -->
<!-- 							</tr> -->
<!-- 							<tr> -->
<!-- 								<td style="float: right">性別:</td> -->
<!-- 								<td><input type="text" name="gender" id="gender" -->
<%-- 									path="gender" value="${MemberBean.gender}"></td> --%>
<!-- 								<td></td> -->
<!-- 							</tr> -->
<!-- 							<tr> -->
<!-- 								<td style="float:right;">生日:</td> -->
<!-- 								<td><input type="text" name="birthday" id="birthday" -->
<%-- 									path="birthday" value="${MemberBean.birthday}"></td> --%>
<!-- 								<td></td> -->
<!-- 							</tr> -->
<!-- 							<tr > -->
<!-- 								<td style="float: right;border-style: hidden">電話:</td> -->
<!-- 								<td><input type="text" name="phone" id="phone" path="phone" -->
<%-- 									value="${MemberBean.phone}"></td> --%>
<!-- 								<td></td> -->
<!-- 							</tr> -->
<!-- 							<tr> -->
<!-- 								<td style="float: right;border-style: hidden">地址:</td> -->
<!-- 								<td><input type="text" name="address" id="address" path="address" -->
<%-- 									value="${MemberBean.address}"></td> --%>
<!-- 								<td></td> -->
<!-- 							</tr> -->
<!-- 							<tr> -->
<!-- 								<td style="float: right;border-style: hidden">mail:</td> -->
<!-- 								<td><input type="text" name="mail" id="mail" path="mail" -->
<%-- 									value="${MemberBean.mail}"></td> --%>
<!-- 								<td></td> -->
<!-- 							</tr> -->
<!-- 		</table> -->
<!-- 		<div > -->
<!-- 		<input type="reset" value="更新資訊"> -->
<!-- 		</div> -->
<%-- 		</form:form> --%>
<!-- 		</div> -->


</body>
</html>