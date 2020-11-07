<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>營地資料</title>
</head>
<body style="background-color:#fdf5e6">
	<div align="center">
		<h2 class="bg-dark text-white">更新資料</h2>
		<a href="<c:url value='/CampSite/Index' />" >回前頁</a>
		<br><br>
		
		<form:form method="Post" action="Insert" modelAttribute="campInfo">
		<table>
			<th>欲更新商品資料</th><th>更新後商品資料</th><tr><td>
			<table style="text-align:left">
				<tr><td><form:label class="t1" for="id" path="id">營地編號 :</form:label><td>
				<form:input type="text" name="id" readonly="readonly" path="id" value="${campInfo.id}" />
				<tr><td><form:label class="t1" for="name" path="name">營地名:</form:label><td>
				<form:input type="text" name="name" path="name" value="${campInfo.name}" />
				<tr><td><form:label class="t1" for="address" path="address">地址:</form:label><td>
				<form:input type="text" name="address" path="address" value="${campInfo.address}" />
				<tr><td><form:label class="t1" for="altitude" path="altitude">海拔:</form:label><td>
				<form:input type="text" name="altitude" path="altitude" value="${campInfo.altitude}" />
				<tr><td><form:label class="t1" for="owner" path="owner">營主姓名:</form:label><td>
				<form:input type="text" name="owner" path="owner" value="${campInfo.owner}" />
				<tr><td><form:label class="t1" for="ownerPhone" path="ownerPhone">營主電話:</form:label><td>
				<form:input type="text" name="ownerPhone" path="ownerPhone" value="${campInfo.ownerPhone}" />
			</table>
			<td>
			<table style="text-align:left">
				<tr><td>營地編號<td>
				<input type="text" disabled value="${campInfo.id}">
				<tr><td>營地名<td>
				<input type="text" disabled value="${campInfo.name}">
				<tr><td>地址<td>
				<input type="text" disabled value="${campInfo.address}">
				<tr><td>海拔<td>
				<input type="text" disabled value="${campInfo.altitude}">
				<tr><td>管理者姓名<td>
				<input type="text" disabled value="${campInfo.owner}">
				<tr><td>管理者電話<td>
				<input type="text" disabled value="${campInfo.ownerPhone}">
			</table>
			<!-- </form> -->
		</table>
			<input type="submit" value="更新" class="btn btn-primary" />
			<input type="reset" value="取消" class="btn btn-primary" />
		</form:form><br>
	</div>
</body>
</html>