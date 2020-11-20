<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>


</head>

<body>
	<h2>Modal Example</h2>
	<!-- Trigger the modal with a button -->
	<a href="https://yurucamp.youcanbook.me/" data-toggle="modal"
		data-target="#myModal">Click Me</a>
	<!-- Modal -->
	<div class="modal fade" id="myModal" role="dialog" aria-hidden="true">
		<div class="modal-dialog modal-lg">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header"></div>
				<div class="modal-body">
					<iframe src="https://yurucamp.youcanbook.me/" width="100%"
						height="550" frameborder="0"></iframe>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">關閉</button>
				</div>
			</div>

		</div>
	</div>

</body>
</html>