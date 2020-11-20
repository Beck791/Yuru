<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>

<style>

</style>
<meta charset="UTF-8">
<title>露營商城</title>
 	 <meta charset="utf-8">
     <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
     <link rel="icon" href="<c:url value='/img/yuruIcon.png' />" type="image/x-icon">
<!-- Bootstrap -->
     <link href="<c:url value='/css/bootstrap.min.css' />" rel="stylesheet">
     <link href="<c:url value='/ionicons/css/ionicons.min.css' />" rel="stylesheet">
<!-- main css -->
     <link href="<c:url value='/css/style.css' />" rel="stylesheet">
<!-- modernizr -->
     <script src="<c:url value='/js/modernizr.js' />"></script>
     <script src="//ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
     integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    
</head>
<body>


<jsp:include page="/WEB-INF/pages/include/top.jsp" />

 <!-- cart -->
<div class='myblock' style='position:fixed; bottom:100px; right:10px; background-color:white; '> 
  <a href="<c:url value='/shoppingcart'/>"><img src="../img\product\cart.png" height="30" />
</div>

 <!-- top bar -->
    <div class="top-bar">
        <h1>露營商城</h1>
        <p><a href="#">camping</a> /enjoy life</p>
    </div>
    <!-- end top bar -->
    
    <!-- main container -->    
    <div class="main-container portfolio-inner clearfix">
		<!-- portfolio div -->
		<div class="portfolio-div">
			<div class="portfolio">
				<!-- portfolio_filter -->
				<div class="categories-grid wow fadeInLeft">
					<nav class="categories text-center">
						<ul class="portfolio_filter">
							<li><a href="" style='background-color:#dbcf83;border-radius:5px'>All</a></li>
							<li><a href="" style='background-color:#dbcf83;border-radius:5px'>Photography</a></li>
							<li><a href="" style='background-color:#dbcf83;border-radius:5px'>Logo</a></li>
							<li><a href="" style='background-color:#dbcf83;border-radius:5px'>Graphics</a></li>
							<li><a href="" style='background-color:#dbcf83;border-radius:5px'>Advertising</a></li>
							<li><a href="" style='background-color:#dbcf83;border-radius:5px'>Fashion</a></li>
							<c:choose>
				            <c:when test="${sessionScope.memberRolse eq 'admin'}">
							<li><a href="<c:url value='/Product/BackStageIndex'/>" style='background-color:#dbcf83;border-radius:5px'>商城管理系統</a></li>
							</c:when>
<%-- 				            <c:when test="${not empty memberId}"> --%>
<%-- 							<li><a href="<c:url value='/shoppingcart'/>"><img src="../img\product\cart.png" height="30" /></li> --%>
<%-- 							</c:when> --%>
						   </c:choose>
						</ul>
					</nav>
				</div>
				<!-- portfolio_filter -->

				<!-- portfolio_container -->

				<!-- end portfolio_container -->
			</div>
			<!-- portfolio -->
		</div>
		<!-- end portfolio div -->
	</div>
    <!-- end main container -->

  <!-- Page Content -->
  <div class="container">

    <div class="row">

      <div class="col-lg-3">

        <h1 class="my-4">Shop Name</h1>
        <div class="list-group">
          <a href="#" class="list-group-item">Category 1</a>
          <a href="#" class="list-group-item">Category 2</a>
          <a href="#" class="list-group-item">Category 3</a>
        </div>

      </div>
      <!-- /.col-lg-3 -->

      <div class="col-lg-9">

        <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
          <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
          </ol>
          <div class="carousel-inner" role="listbox">
            <div class="carousel-item active">
              <img class="d-block img-fluid" src="../img\product\banner_1.jpg" alt="First slide">
            </div>
            <div class="carousel-item">
              <img class="d-block img-fluid" src="../img\product\banner_2.jpg" alt="Second slide">
            </div>
            <div class="carousel-item">
              <img class="d-block img-fluid" src="../img\product\banner_3.jpg" alt="Third slide">
            </div>
<!--             <div class="carousel-item"> -->
<!--               <img class="d-block img-fluid" src="http://placehold.it/900x350" alt="Third slide"> -->
<!--             </div> -->
          </div>
          <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">5
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
          </a>
          <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
          </a>
        </div>

        <div class="row">
		<c:forEach var="productBean" items="${productBeans}">
          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="https://i.imgur.com/f3nueSv.jpg" width="300" height="145" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">${productBean.name}</a>
                </h4>
                <h5>$${productBean.price}</h5>
                <p class="card-text">${productBean.description}</p>
              </div>
              <div class="card-footer">
<!--               <form> -->
<!--               </form> -->
<!--               <form method="post" id="form1"  action=""> -->
              <form method="post"  action="<c:url value='/shoppingcart/addProduct?id=${productBean.id}'/>">
<%--                 <input type="submit" value="加入購物車" class="btn btn-primary" onclick="insert('${productBean.id}')" /> --%>
                <input type="submit" value="加入購物車" class="btn btn-primary" />
              </form>
              </div>
            </div>
          </div>
       </c:forEach>
          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="http://placehold.it/700x400" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">Item Two</a>
                </h4>
                <h5>$24.99</h5>
                <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur! Lorem ipsum dolor sit amet.</p>
              </div>
              <div class="card-footer">
                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
              </div>
            </div>
          </div>

  
            </div>
          </div>

        </div>
        <!-- /.row -->

      </div>
      <!-- /.col-lg-9 -->

    <!-- /.row -->

<!-- footer -->
    <footer>
        <div class="container-fluid">
            <p class="copyright">© Yuru Camp 2020</p>
        </div>
    </footer>
    <!-- end footer -->

    <!-- back to top -->

    
    <!-- end back to top -->

    <!-- jQuery -->
    <script src="../js/jquery-2.1.1.js"></script>

    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/menu.js"></script>
    <script src="../js/animated-headline.js"></script>
    <script src="../js/isotope.pkgd.min.js"></script>
    <script src="../js/custom.js"></script>  
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js" integrity="sha512-bLT0Qm9VnAYZDflyKcBaQ2gg0hSYNQrJ8RilYldYQ1FxQYoCLtUjuuRuZo+fjqhx/qtq/1itJ0C2ejDxltZVFg==" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.3/js/bootstrap.min.js" integrity="sha512-8qmis31OQi6hIRgvkht0s6mCOittjMa9GMqtK9hes5iEQBQE/Ca6yGE5FsW36vyipGoWQswBj/QBm2JR086Rkw==" crossorigin="anonymous"></script>
	
	<script>
	
// 	function insert(id){
// 		console.log(id);
// 		for(var i=0 ; i<document.forms.length ; i++){
// 			document.forms[i].action="<c:url value='/shoppingcart/addProduct?id="+id+"'/>" ;
// 			document.forms[i].method="POST";
// 			document.forms[i].submit();
// 		}
// 	}
	
	
	</script>
</body>

</html>