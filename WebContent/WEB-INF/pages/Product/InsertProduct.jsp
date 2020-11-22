<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
     
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<meta charset="UTF-8">
<link rel="icon" href="<c:url value='/img/yuruIcon.png' />" type="image/x-icon">
<title>Insert title here</title>
<style>
	
</style>
</head>
<body style="background-color:#fdf5e6">
<div align="center">
	<h2 class="bg-dark text-white">輸入新增資料</h2>


	<a href="<c:url value='/Product/BackStageIndex'/>" >回首頁</a><br><br>
	
	<form id="formdata">
	 <table class="btn btn-secondary" style="text-align:left" >
		<tr><td>輸入產品 :<td><input type="text" id="name" name="name" />
		<tr><td>輸入品牌 :<td ><select id="brandId" name="brandId" required="required" >
								<option value="">選擇廠牌</option>
								<option value="1">台灣 努特Nuit</option>
								<option value="2">台灣 犀牛RHINO</option>
								<option value="3">日本 LOGOS</option>
							</select>
		<tr><td>輸入價格 :<td><input type="text" id="price" value="888" name="price" />
		<tr><td>上傳圖片 :<td><input type="file" id="image" onchange="uploadimg()">
		<input type="text" name="image" style="display:none">
		<tr><td>輸入產品內容 :<td><input type="text" id="description" value="產品內容" name="description" />
		<tr><td>輸入產品狀態:<td><select id="statusId" name="statusId" required="required">
								<option value="">選擇狀態</option>
								<option value="1">上架中</option>
								<option value="2">下架中</option>
								<option value="3">庫存不足</option>
							   </select>
		<tr><td>輸入庫存數量 :<td><input type="text" id="stock" value="50" name="stock" />
		<tr><td>輸入種類 :<td><input type="text" id="category" value="桌椅傢具" name="category" />
	</table>
	<br><br>
			<input type="button" value="新增" class="btn btn-primary" onclick="sendForm()" />			
	</form>
		
	<hr>
	<table id="result-table"class="table table-dark table-striped" border="1">
		
		<tr  style="background-color:#7A0099">
			<th>產品ID</th>
			<th>產品名稱</th>
			<th>價格</th>
			<th>廠牌</th>
			<th>圖檔</th>
			<th>瀏覽次數</th>
			<th>產品敘述</th>
			<th>庫存量</th>
			<th>種類</th>
			<th>商品狀態</th>
			<th>新增日期</th>
			<th>修改日期</th>
		</tr>

</table>
	</div>
	<script>
	
	function uploadimg(){
		var formData = new FormData();
		formData.append('image', $('#image')[0].files[0]);
		$.ajax({
		    url: '/yurucamp/Product/upfileimage',
		    type: 'POST',
		    data:formData,
		    processData: false,
		    contentType: false,
		    success:function(result){
		    	console.log(result.url);
		    	$('input[name="image"]').val(result.url);
		    	console.log($('input[name="image"]').val());
		    }
		})

	}
	function sendForm() {	
		var form = $('#formdata').serialize();
		console.log(form);

        $.ajax({
        	      type: 'POST',
                  url : '/yurucamp/Product/InsertProductinfo',
                  data : $("#formdata").serialize(),
                  success : function(data) {
								
                	  			console.log(data);
                	  
		                	  	if(data){
		                	  		
		                	  		for(let item of data){
		                	  			console.log(item);
		                	  			
		                	  			var resultHtml = "<tr>"
		                	  				           + "<td>" + item.id + "</td>" 
		                	  			               + "<td>" + item.name + "</td>"
		                	  			               + "<td>" + item.price + "</td>"
		                	  			               + "<td>" + item.brand + "</td>"
		                	  			               + "<td><img src='" + item.image + "' style='height: 30px;'/></td>"
		                	  			               + "<td>" + item.webTraffic + "</td>"
		                	  			               + "<td>" + item.description + "</td>"
		                	  			               + "<td>" + item.stock + "</td>"
		                	  			               + "<td>" + item.category + "</td>"
		                	  			               + "<td>" + item.status + "</td>"
		                	  			               + "<td>" + item.createtime + "</td>"
		                	  			               + "<td>" + item.updatetime + "</td>"
		                	  			               + "</tr>";
		                	  			
		                	  			console.log(resultHtml);
		                	  			
		                	  			$("#result-table").append(resultHtml);
		                	  			
		                	  		}
		                	  			
		                	  	}

                  }

        });

	}
	</script>
	
</body>
</html>