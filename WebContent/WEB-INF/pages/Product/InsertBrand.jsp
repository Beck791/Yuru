<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color:#fdf5e6">
<div align="center">
	<h2 class="bg-dark text-white">輸入新增資料</h2>

	<a href="/Product/Index">回首頁</a><br><br>
	
	<form method="post" action="<c:url value='/Product/InsertBrandinfo'/>">
	<table class="btn btn-secondary">
		<tr><td>輸入品牌 :<td><input type="text" name="name" />
<!-- 		<tr><td>輸入建立時間 :<td><input type="text" name="createtime" /> -->
<!-- 		<tr><td>輸入修改時間 :<td><input type="text" name="updatetime" /> -->
	</table>
	<br><br>
			<input type="submit" value="新增" class="btn btn-primary" />
			<input type="reset" value="取消" class="btn btn-primary" />
	</form>
	<hr>
	<h2 class="bg-dark text-white">新增廠牌資料</h2>
	<table class="btn btn-secondary">
	<tr><td>廠牌編號<td><input type="text" disabled value="${brandBean.id}">
	<tr><td>廠牌名稱<td><input type="text" disabled value="${brandBean.name}">
	<tr><td>建立時間<td><input type="text" disabled value="${brandBean.createtime}">
	<tr><td>修改時間<td><input type="text" disabled value="${brandBean.updatetime}">
	</table>
	</div>
</body>
</html>