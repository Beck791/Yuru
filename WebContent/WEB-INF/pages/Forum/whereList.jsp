<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>






</div>
	<table class="table ">
		<thead 　class="thead-dark">
			<tr>
				<th>論壇分類</th>
				<th>MemberID</th>
				<th>文章標題</th>
				<th>發文時間</th>
				<th>最後修改時間</th>
				<th>管理動作</th>
			</tr>
		</thead>

		<c:forEach var="PostBean" items="#">
			<tbody>
				<tr>
					<td>露營休閒討論區</td>
					<td>M001</td>
					<td>AAAAAAAAA</td>
					<td></td>
					<td></td>
				</tr>
			</tbody>
		</c:forEach>



	</table>



































</body>
</html>