<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberCreat</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<link rel="icon" href="<c:url value='/img/yuruIcon.png'/>" type="image/x-icon">

<!-- Bootstrap -->
<link href="<c:url value='/css/bootstrap.min.css' />" rel="stylesheet">
<link href="<c:url value='/ionicons/css/ionicons.min.css' />" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link href="<c:url value='/css/imgurStyle.css' />" rel="stylesheet" media="screen">
<link href="<c:url value='/css/imgurMobile-style.css' />" rel="stylesheet"
	media="screen">
<link rel="shortcut icon" href="<c:url value='/favicon.png' />">
<%-- <script src="<c:url value='/js/jquery-3.2.1.js' />"></script> --%>
<script src="<c:url value='/js/bootstrap.min.js' />"></script>
<!-- main css -->
<link href="../css/style.css" rel="stylesheet">
<!-- modernizr -->
<script src="../js/modernizr.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<!-- <script src="https://cdn.ckeditor.com/4.15.1/standard/ckeditor.js"></script> -->

<!-- <script src="https://cdn.ckeditor.com/ckeditor5/12.0.0/classic/ckeditor.js"></script> -->
<script src="https://cdn.ckeditor.com/ckeditor5/12.0.0/classic/ckeditor.js"></script>
</head>
<body>
	<jsp:include page="/WEB-INF/pages/include/top.jsp" />

	<!-- top bar -->
	<div class="top-bar">
		<h1>露營論壇</h1>
		<p>
			<a href="#">camping</a> /enjoy life
		</p>
	</div>
	<!-- end top bar -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0"> 
      <li class="nav-item"><a class="nav-link" href="<c:url value='/Forum/forumIndex' />" class="" >回上一頁</a></li>     
      <li class="nav-item"><a class="nav-link" href="<c:url value='/Forum/goInsert' />" class="" >新增文章</a></li>
      <li class="nav-item"><a class="nav-link " href="<c:url value='/Forum/articleList' />">個人文章一覽</a></li>
    </ul>
  </div>
</nav>


	<!-- main container -->
	<div style="width: 70%; margin: 1% 1% 1% 2%; float: left;">
		<div class="panel panel-default" id="main" style="">
			<div class="panel-heading" style="background-color: white">
				<a href="<c:url value='/Forum/forumIndex' />">露營休閒討論區</a>› 編輯主題
			</div>

			<div class="panel-body">
				<div class=" panel-warning">
					<form method="Post" id="imgur" enctype="multipart/form-data"
						action="<c:url value='/Forum/update'/>">
						<input type="hidden" name="poId" value="${postBean.poId} "/>
						<div class="form-group">
							<label class="t1" for="potitle" path="poTitle">主題標題</label> <input
								type="text" class="form-control" id="poTitle" path="poTitle"
								name="poTitle" value="${PostBean.poTitle} " />
						</div>
						<div class="">
							<label class="t1" for="content" path="poContent">主題內容
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<span style="color:#bbb">powered by </span><img alt="" height="50px" src="<c:url value='/img/CKEditor.png' />">
							</label>
							<textarea id="contentforckeditor"name="contentforckeditor" rows="10" cols="10"
							  style="config.resize_enabled = false;"></textarea>
							<script>
									var editor;		
									
							                    editor = ClassicEditor
							                    .create( document.querySelector( '#contentforckeditor' ) ,{
// 							                        removePlugins: ['Heading'],
							                    	ckfinder: {
							                    		uploadUrl: "/yurucamp/Imgur"
							                    	}
							                    })
							                    .then( newEditor => {
							                        editor = newEditor;
							                        
							                        var content = `${PostBean.poContent}`;
							                        
							                        editor.setData(content);
							                    } )
							                    .catch( error => {
							                        console.error( error );
							                    } );
							                    
							                    
							</script>
								
						</div>


						

						<div>
						<label >
						<span>選擇圖片
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<span style="color:#bbb">powered by </span><img alt="" height="30px" src="<c:url value='/img/imgur.jpg' />"> 
						</span>
						<input name="poImage" id="editor" type="file">
						</label>
						</div>
						




						<br /> <input type="submit" class="btn btn-primary" value="發布主題 " >

					</form>
				</div>

			</div>
		</div>
	</div>



		<div style="width: 25%; margin: 1% 2% 1% 0%; float: right; height: 200%;">
		<div class="panel panel-default" id="main" style="">
			<div style="margin:center;">
				
		                 	<img style="margin-left:3%;width:90%;top:96%" src="<c:url value='/img/forum/pillow2.jpg'/>" alt="First slide">
</div>
		</div>
				</div>
		
<!-- 	<!-- IMGUR SHOW --> 
<!-- 	<div class="" style="background-color:"> -->
<!--       <div style="text-align:center;"> -->
      
<!--       </div> -->
       
<!--        <h1 >Imgur test </h1> -->
<!--        <hr>  -->
<!--         </div> -->
    
<!--     <div class="dropzone" style="border-radius:30px;"> -->
    
<!--        <p></p>  -->
<!--        <div class="info"></div> -->
        
<!--     </div> -->
    
    <script type="text/javascript" src="../js/imgur.js"></script>
    <script type="text/javascript" src="../js/imgurUpload.js"></script>
	<hr> 

	<!-- end main container -->


	<!-- footer -->
	<footer>
		<div class="container-fluid">
			<p class="copyright">© Yuru Camp 2020</p>
		</div>
	</footer>
	<!-- end footer -->

	<!-- back to top -->
	<a href="#0" class="cd-top"><i class="ion-android-arrow-up"></i></a>
	<!-- end back to top -->



<!-- <script src="ckeditor/ckeditor.js"></script> -->
<!-- jQuery -->
	<script src="<c:url value='/js/jquery-2.1.1.js' />"></script>
	<!--  plugins -->
	<script src="<c:url value='/js/bootstrap.min.js' />"></script>
	<script src="<c:url value='/js/menu.js' />"></script>
	<script src="<c:url value='/js/animated-headline.js' />"></script>
	<script src="<c:url value='/js/isotope.pkgd.min.js' />"></script>
	



	<!--  custom script -->
	<script src="<c:url value='/js/custom.js' />"></script>

	<!-- google analytics  -->


</body>
</html>