<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${forumClassifyIndex}</title>
 	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
   	<link rel="icon" href="${pageContext.request.contextPath}/img/yuruIcon.png" type="image/x-icon">
   	 <link href="${pageContext.request.contextPath}/css/forum.css" rel="stylesheet">
    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/ionicons/css/ionicons.min.css" rel="stylesheet">
    <!-- main css -->
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">
    <!-- modernizr -->
    <script src="${pageContext.request.contextPath}/js/modernizr.js"></script> 
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->  	
</head>
<body>
<jsp:include page="/WEB-INF/pages/include/top.jsp" />
 <!-- top bar -->
    <div class="top-bar">
        <h1>露營論壇</h1>
        <p><a href="#">camping</a> /enjoy life</p>
    </div>
    <!-- end top bar -->



    <!-- main container -->
    <div class="">
       
                <!-- Classify_enter -->
                <div>
                    <nav class="">
                        <ul class="classify-enter" >
                       	  	<li ><a href="<c:url value='/Forum/forumIndex' />"  >露營休閒討論區</a></li>
                            <li ><a href="<c:url value='/Forum/forumIndex' />"  >露營帳篷討論區</a></li>
                            <li ><a href="<c:url value='/Forum/forumIndex' />"  >露營寢具討論區</a></li>
                            <li ><a href="<c:url value='/Forum/forumIndex' />"  >露營爐具桌椅討論區</a></li>
                            <li ><a href="<c:url value='/Forum/forumIndex' />"  >露營料理討論區</a></li>
                            <li ><a href="<c:url value='/Forum/forumIndex' />"  >露營地點討論區</a></li>
                            <li ><a href="<c:url value='/Forum/forumIndex' />"  >露營車討論區</a></li>
                        </ul>
                    </nav>
                </div>
  </div>
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

    <!-- jQuery -->
    <script src="../js/jquery-2.1.1.js"></script>
    <!--  plugins -->
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/menu.js"></script>
    <script src="../js/animated-headline.js"></script>
    <script src="../js/isotope.pkgd.min.js"></script>


    <!--  custom script -->
    <script src="../js/custom.js"></script>
    
    <!-- google analytics  -->


</body>

</html>