<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${forumIndex}</title>
 	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
   	<link rel="icon" href="../img/yuruIcon.png" type="image/x-icon">
    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../ionicons/css/ionicons.min.css" rel="stylesheet">
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
</head>
<body>


<jsp:include page="/WEB-INF/pages/include/top.jsp" />

 <!-- top bar -->
    <div class="top-bar">
        <h1>露營商城</h1>
        <p><a href="#">camping</a> /enjoy life</p>
    </div>
    <!-- end top bar -->
    
    <!-- main container -->    
    <a href="<c:url value='/Product/BackStageIndex'/>" >商城管理系統</a>
    <div class="main-container portfolio-inner clearfix">
		<!-- portfolio div -->
		<div class="portfolio-div">
			<div class="portfolio">
				<!-- portfolio_filter -->
				<div class="categories-grid wow fadeInLeft">
					<nav class="categories text-center">
						<ul class="portfolio_filter">
							<li><a href="" class="active" data-filter="*">All</a></li>
							<li><a href="" data-filter=".photography">Photography</a></li>
							<li><a href="" data-filter=".logo">Logo</a></li>
							<li><a href="" data-filter=".graphics">Graphics</a></li>
							<li><a href="" data-filter=".ads">Advertising</a></li>
							<li><a href="" data-filter=".fashion">Fashion</a></li>
							<li><a href="<c:url value='/Product/BackStageIndex'/>" >商城管理系統</a></li>
						</ul>
					</nav>
				</div>
				<!-- portfolio_filter -->

				<!-- portfolio_container -->
				<div class="no-padding portfolio_container clearfix">
					<!-- single work -->
					<div class="col-md-4 col-sm-6  fashion logo">
						<a href="<c:url value='/CampSite/Index/Insert' />" class="portfolio_item"> <img
							src="<c:url value='/img/portfolio/01.jpg' />" alt="image" class="img-responsive" />
							<div class="portfolio_item_hover">
								<div class="portfolio-border clearfix">
									<div class="item_info">
										<span>Mockups in seconds</span> <em>Fashion / Logo</em>
									</div>
								</div>
							</div>
						</a>
					</div>
					<!-- end single work -->

					<!-- single work -->
					<div class="col-md-4 col-sm-6 ads graphics">
						<a href="../single-project.html" class="portfolio_item"> <img
							src="../img/portfolio/03.jpg" alt="image" class="img-responsive" />
							<div class="portfolio_item_hover">
								<div class="portfolio-border clearfix">
									<div class="item_info">
										<span>Floating mockups</span> <em>Ads / Graphics</em>
									</div>
								</div>
							</div>
						</a>
					</div>
					<!-- end single work -->

					<!-- single work -->
					<div class="col-md-4 col-sm-12 photography">
						<a href="single-project.html" class="portfolio_item"> <img
							src="../img/portfolio/02.jpg" alt="image" class="img-responsive" />
							<div class="portfolio_item_hover">
								<div class="portfolio-border clearfix">
									<div class="item_info">
										<span>Photorealistic smartwatch</span> <em>Photography</em>
									</div>
								</div>
							</div>
						</a>
					</div>
					<!-- end single work -->

					<!-- single work -->
					<div class="col-md-4 col-sm-6 fashion ads">
						<a href="single-project.html" class="portfolio_item"> <img
							src="../img/portfolio/04.jpg" alt="image" class="img-responsive" />
							<div class="portfolio_item_hover">
								<div class="portfolio-border clearfix">
									<div class="item_info">
										<span>Held by hands</span> <em>Fashion / Ads</em>
									</div>
								</div>
							</div>
						</a>
					</div>
					<!-- end single work -->

					<!-- single work -->
					<div class="col-md-4 col-sm-6 graphics ads">
						<a href="single-project.html" class="portfolio_item"> <img
							src="../img/portfolio/05.jpg" alt="image" class="img-responsive" />
							<div class="portfolio_item_hover">
								<div class="portfolio-border clearfix">
									<div class="item_info">
										<span>Mobile devices</span> <em>Graphics / Ads</em>
									</div>
								</div>
							</div>
						</a>
					</div>
					<!-- end single work -->

					<!-- single work -->
					<div class="col-md-4 col-sm-12 photography">
						<a href="single-project.html" class="portfolio_item"> <img
							src="../img/portfolio/010.jpg" alt="image" class="img-responsive" />
							<div class="portfolio_item_hover">
								<div class="portfolio-border clearfix">
									<div class="item_info">
										<span>Photorealistic smartwatch</span> <em>Photography</em>
									</div>
								</div>
							</div>
						</a>
					</div>
					<!-- end single work -->

					<!-- single work -->
					<div class="col-md-4 col-sm-6 graphics ads">
						<a href="single-project.html" class="portfolio_item"> <img
							src="../img/portfolio/06.jpg" alt="image" class="img-responsive" />
							<div class="portfolio_item_hover">
								<div class="portfolio-border clearfix">
									<div class="item_info">
										<span>Mobile devices</span> <em>Graphics / Ads</em>
									</div>
								</div>
							</div>
						</a>
					</div>
					<!-- end single work -->

					<!-- single work -->
					<div class="col-md-4 col-sm-6 graphics ads">
						<a href="single-project.html" class="portfolio_item"> <img
							src="../img/portfolio/07.jpg" alt="image" class="img-responsive" />
							<div class="portfolio_item_hover">
								<div class="portfolio-border clearfix">
									<div class="item_info">
										<span>Mobile devices</span> <em>Graphics / Ads</em>
									</div>
								</div>
							</div>
						</a>
					</div>
					<!-- end single work -->

					<!-- single work -->
					<div class="col-md-4 col-sm-6 graphics ads">
						<a href="single-project.html" class="portfolio_item"> <img
							src="../img/portfolio/08.jpg" alt="image" class="img-responsive" />
							<div class="portfolio_item_hover">
								<div class="portfolio-border clearfix">
									<div class="item_info">
										<span>Mobile devices</span> <em>Graphics / Ads</em>
									</div>
								</div>
							</div>
						</a>
					</div>
					<!-- end single work -->

				</div>
				<!-- end portfolio_container -->
			</div>
			<!-- portfolio -->
		</div>
		<!-- end portfolio div -->
	</div>
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
    <script>
//         (function (i, s, o, g, r, a, m) {
//             i['GoogleAnalyticsObject'] = r;
//             i[r] = i[r] || function () {
//                 (i[r].q = i[r].q || []).push(arguments)
//             }, i[r].l = 1 * new Date();
//             a = s.createElement(o),
//                 m = s.getElementsByTagName(o)[0];
//             a.async = 1;
//             a.src = g;
//             m.parentNode.insertBefore(a, m)
//         })(window, document, 'script', 'https://www.google-analytics.com/analytics.js', 'ga');

//         ga('create', 'UA-76796224-1', 'auto');
//         ga('send', 'pageview');
    </script>

</body>

</html>