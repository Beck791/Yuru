<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+TC:wght@700&display=swap" rel="stylesheet">
<meta charset="UTF-8">
<style>
* {
    font-family: 'Noto Sans TC', sans-serif;
}
</style>
<title>露營商品管理</title>
</head>
<body style="background-color:#fdf5e6">
<div align="center">
<h1 class="bg-dark text-white">露營商品管理</h1>
<br><br>
    <a href="<c:url value='/Product/Index' />" class="btn btn-primary">露營商城</a><br><br>
	<a href="<c:url value='/Product/GetProduct.jsp'/>" class="btn btn-primary">查詢單筆資料 </a><br><br>
    <a href="<c:url value='/Product/GetAllProduct'/>" class="btn btn-primary">查詢全部資料</a><br><br>
	<a href="<c:url value='/Product/InsertProduct'/>" class="btn btn-primary">新增資料</a><br><br>
	<a href="<c:url value='/Product/GetAllBrand'/>" class="btn btn-primary">查詢廠牌資料</a><br><br>
	<a href="<c:url value='/Product/InsertBrand'/>" class="btn btn-primary">新增廠牌資料</a><br><br>

</div>
</body>
</html>