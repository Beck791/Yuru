<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增營地</title>
<style>
fieldset {
	width: 500px;
	margin: 15px;
	border: 1px solid #acd6ff;
	border-radius: 15px;
}

legend {
	margin-left: 50px;
}

.st1 {
	width: 450px;
	border-bottom: 3px dashed #ADADAD;
	margin: 20px;
	padding-bottom: 10px;
}

.sub {
	width: 450px;
	margin: 20px;
	text-align: center;
}

.t1 {
	width: 100px;
	float: left;
	text-align: right;
}

textarea {
	resize: none;
}
</style>
</head>
<body>
	<form action="<c:url value='/CampSite/Insert' />" method="Post"
		enctype="application/json">
		<fieldset>
			<legend>營地資料註冊</legend>
			<div class="st1">
				<label class="t1" for=name>營地名:</label> 
				<input type="text"
					id="name" name="name" size="10" value="阿里山神木">
			</div>
			<div class="st1">
				<label class="t1" for=address>地址:</label> 
				<input type="text"
					id="address" name="address" size="10" value="嘉義縣">
			</div>
			<div class="st1">
				<label class="t1" for=altitude>海拔:</label> 
				<input type="text"
					id="altitude" name="altitude" size="10" value="1992">
			</div>
			<div class="st1">
				<label class="t1" for=owner>營主姓名:</label> 
				<input type="text"
					id="owner" name="owner" size="10" value="老王">
			</div>
			<div class="st1">
				<label class="t1" for=ownerPhone>營主電話:</label> 
				<input type="text"
					id="ownerPhone" name="ownerPhone" size="10" value="0988765321">
			</div>
		</fieldset>
		<div class="sub">
			<input type="submit" value="送出"> <input type="reset"
				value="清除">
		</div>
	</form>
</body>
</html>