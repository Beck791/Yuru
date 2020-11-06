<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.yurucamp.mallsystem.model.ProductBean" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%! @SuppressWarnings("unchecked") %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<style>
* {
    font-family: 微軟正黑體;
}
</style>
<meta charset="UTF-8">
<title>產品資料</title>
</head>
<body style="background-color:#fdf5e6">
<div align="center">
<h2 class="bg-dark text-white">所有產品資料</h2>
<a href="<c:url value='/Product/Index'/>" >回首頁</a>
	<form method="get" action="/MidtermMvc/DeleteProduct">
       輸入刪除的產品編號 : <input type="text" id="idName" name="productId" autofocus placeholder="請輸入四位數字" maxlength="4" required="required" onblur="checkName()" />
	<input type="submit"  value="確定" class="btn btn-primary" />	<p>
	 <span class="sp" id="idspName" style="color:red"></span><br>
	<font color='red' size="-1">${errorMsg.productId}</font>
	</form>
		
<table class="table table-dark table-striped" border="1">
<tr style="background-color:#7A0099">
<th><th>廠牌ID<th>廠牌名稱<th>新增日期<th>修改日期
<c:forEach var="brandBean" items="${brandBeans}">
<tr><td>
<!-- <input type="submit" value="修改" name="update"/>	 -->
<form method="post" id="form1"  action="">
<input type="submit" value="修改" name="" class="btn btn-primary" onclick="update('${brandBean.id}')" />	
<input type="submit" value="刪除" name="" class="btn btn-primary" onclick="del('${brandBean.id}')" />	
</td>
<td>${brandBean.id}</td>
<td>${brandBean.name}</td>	
<td>${brandBean.createtime}</td>
<td>${brandBean.updatetime}</td></tr>
</form>

</c:forEach>
</table>
<h3>共${brandBeans.size()}筆廠牌資料</h3>
</div>
<script>

function checkName() {
    let NameObjVal = document.getElementById("idName").value;
    let spName = document.getElementById("idspName");
    let NameObjValLen = NameObjVal.length;
    if (NameObjVal == "") {
        spName.innerHTML = "內容不可以為空白";
    }
    else if (NameObjValLen >= 4) {
             spName.innerHTML = "<span style=\"font-size:1em\">格式正確</span>";
//              spName.innerHTML += "<img src=\"images/correct.jpg\" width = 20px height =20px>";           
        
    } else {
        spName.innerHTML = "請至少輸入四個數字";
//         spName.innerHTML += "<img src=\"images/error.jpg\" width = 20px height =20px>";
    }
}

function update(productId){

	for(var i=0;++i;)
	document.forms[i].action="<c:url value='UpdateProduct2?productId="+productId+"'/>" ;
	document.forms[i].method="POST";
	document.forms[i].submit();
	}
function del(productId){
	if(confirm("真的要刪除嗎!!!!!?")){
		if(confirm("真的不後悔嗎!!?")){
	for(var i=0;++i;)
	document.forms[i].action="<c:url value='DeleteProduct?productId="+productId+"'/>" ;
	document.forms[i].method="POST";
	document.forms[i].submit();
	}}}

</script>
</body>
</html>