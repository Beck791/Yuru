<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.yurucamp.mallsystem.model.ProductBean" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%!@SuppressWarnings("unchecked")%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<meta charset="UTF-8">
<title>產品資料</title>
</head>
<body style="background-color:#fdf5e6">
<div align="center">
<h2 class="bg-dark text-white">更新資料</h2>
<a href="<c:url value='/Product/BackStageIndex'/>" >回首頁</a><br><br>

<form method="post" action="/Product/UpdateBrand">

<table><th class="bg-dark text-white">欲更新商品資料<th class="bg-dark text-white">更新後商品資料<tr><td>
<table align="left" class="table table-dark table-striped">

<%-- 	<jsp:useBean id="pdbs" scope="request" class="com.yurucamp.mallsystem.model.ProductBean"/> --%>
	<tr><td>輸入廠牌編號 :<td><input type="text" name="id" readonly="readonly" value="${brandBean.id}" />
	<tr><td>廠牌名稱 :<td><input type="text" name="name" value="${brandBean.name}" />

</table>


	<td>		
	<table align="left" class="table table-dark table-striped">
	<tr><td>廠牌編號<td><input type="text" disabled value="${brandBean.id}">
	<tr><td>廠牌名稱<td><input type="text" disabled value="${brandBean.name}">
	<tr><td>建立日期<td><input type="text" disabled value="${brandBean.createtime}">
	<tr><td>修改日期<td><input type="text" disabled value="${brandBean.updatetime}">
	</table>
<!-- </form> -->
</table>

			<input type="submit" value="新增" class="btn btn-primary" />
			<input type="reset" value="取消" class="btn btn-primary" />
</form><br>
<button onclick="location.href='/Product/GetAllBrand'" class="btn btn-primary">繼續更改其它資料</button><br>
</div>
</body>
</html>