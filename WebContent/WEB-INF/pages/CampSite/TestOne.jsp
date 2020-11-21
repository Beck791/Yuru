<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

</head>
<body>



	<button id="buy-btn" name="buy-btn"></button>


	<div id="authority-redirect-popup"></div>
		
	<script>
		$("#buy-btn").click(function() {
			authUpgrade('PP', 'PM');
		});
		
		function authUpgrade(userData,authID){
			$.ajax({
				url : "<c:url value='/EcPay/Authority' />",
				type : "POST",
				data : "",
				contentType : "application/json",
				success : function(data) {
					$("#authority-redirect-popup").html(data);
				}
			});
		}
	</script>
</body>
</html>