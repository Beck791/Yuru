<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	
</style>
</head>
<body style="background-color:#fdf5e6">
<div align="center">
	<h2 class="bg-dark text-white">輸入新增資料</h2>


	<a href="<c:url value='/Product/BackStageIndex'/>" >回首頁</a><br><br>
	
	<form method="post"  id="imgur" enctype="multipart/form-data" action="<c:url value='/Product/InsertProductinfo'/>">
	 <table class="btn btn-secondary">
		<tr><td>輸入產品 :<td><input type="text" name="name" />
		<tr><td>輸入品牌 :<td><input type="text" value="犀牛" name="brand" />
		<tr><td>輸入價格 :<td><input type="text" value="888" name="price" />
		<tr><td>上傳圖片 :<td><input type="file" name="image" >
		<tr><td>輸入產品內容 :<td><input type="text" value="產品內容" name="description" />
		<tr><td>輸入產品狀態:<td><input type="text" value="上架中" name="status" />
		<tr><td>輸入庫存數量 :<td><input type="text" value="50" name="stock" />
		<tr><td>輸入種類 :<td><input type="text" value="帳篷" name="category" />
	</table>
	<br><br>
			<input type="submit" value="新增" class="btn btn-primary" />
			<input type="reset" value="取消" class="btn btn-primary" />
			
	</form>
	
	<hr>
	<table class="table table-dark table-striped" border="1">
<tr style="background-color:#7A0099">
<th><th>產品ID<th>產品名稱<th>價格<th>廠牌<th>圖檔<th>瀏覽次數<th>產品敘述<th>庫存量<th>種類<th>商品狀態<th>新增日期<th>修改日期
<c:forEach var="productBean" items="${productBeans}">
<tr><td>
<!-- <input type="submit" value="修改" name="update"/>	 -->

</td>
<td>${productBean.id}</td>
<td>${productBean.name}</td>	
<td>${productBean.price}</td>
<td>${productBean.brand}</td>
<td><img src="${productBean.image}"></td>
<td>${productBean.webTraffic}</td>
<td>${productBean.description}</td>
<td>${productBean.stock}</td>
<td>${productBean.category}</td>
<td>${productBean.status}</td>
<td><fmt:formatDate type="both" pattern="yyyy-MM-dd HH:mm:ss" value="${productBean.createtime}"/></td>
<td><fmt:formatDate type="both" pattern="yyyy-MM-dd HH:mm:ss" value="${productBean.updatetime}"/></td></tr>


</c:forEach>
</table>
	</div>
	<script>
	</script>
	
</body>
</html>