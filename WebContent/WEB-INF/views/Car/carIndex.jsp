<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${carIndex}</title>
 <meta charset="utf-8">
 
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <link href="../css/carstyle.css" rel="stylesheet">
<!-- 連結專用風格檔 -->
   <link rel="icon" href="../img/yuruIcon.png" type="image/x-icon">
    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../ionicons/css/ionicons.min.css" rel="stylesheet">
<!--     main css -->
    <link href="../css/style.css" rel="stylesheet">
<!-- modernizr -->
    <script src="../js/modernizr.js"></script>
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    
<!--以上為BANNER設定   -->
<style>
        * {
            font-family: 微軟正黑體;
        }

        body {
            background-image: url("image/01.png");
            background-attachment: fixed;
            background-size: 510px;
            background-repeat: no-repeat;
            background-size: 100%;
        }

        .st1 {
            width: 450px;
            /* border-bottom: rgb(253, 211, 133) solid;  */
            padding-bottom: 15px;
            margin-bottom: 15px;
        }

        .sub {
            width: 450px;
            text-align: center;
            margin: auto;
            padding-top: 30px;
        }

        fieldset {
            margin: auto;
            width: 400px;
            border: 3px solid rgb(137, 161, 97);
            background-color: white;
            border-radius: 30px;
            padding: 20px;
            text-align: left;
        }

        h3 {
            color: rgb(71, 45, 33);
            font-weight: bolder;
            padding-top: 50px;
            padding-bottom: 8px;
            text-align: center;
        }
    </style>


</head>
<body>


<jsp:include page="/WEB-INF/views/Index/top.jsp" />

 <!-- top bar -->
    <div class="top-bar">
        <h1>露營車出租</h1>
        <p><a href="#">camping</a> /enjoy life</p>
    </div>
    <!-- end top bar -->



    <!-- main container -->
     <h3>我要預約 Reservation</h3>
    <form method="get" action="">
        <fieldset>
            <legend><img src="image/03.png" width=80px)></legend>
            <div class="st1">
                <label>取車地點：</label>
                <select name="dept">
                    <option value="">請選擇</option>
                    <option value="TPE">台北</option>
                    <option value="TYC">桃園</option>
                    <option value="HSC">新竹</option>
                    <option value="TXG">台中</option>
                    <option value="TNN">台南</option>
                    <option value="KHH">高雄</option>
                    <option value="ILC">宜蘭</option>
                    <option value="HWC">花蓮</option>
                    <option value="TTT">台東</option>
                </select>
            </div>
            <div class="st1">
                <label>還車地點：</label>
                <select name="return">
                    <option value="">請選擇</option>
                    <option value="TPE">台北</option>
                    <option value="TYC">桃園</option>
                    <option value="HSC">新竹</option>
                    <option value="TXG">台中</option>
                    <option value="TNN">台南</option>
                    <option value="KHH">高雄</option>
                    <option value="ILC">宜蘭</option>
                    <option value="HWC">花蓮</option>
                    <option value="TTT">台東</option>
                </select>
            </div>
            <div class="st1">
                <label>取車日期：</label>
                <input type="date" name="deptd">&nbsp;&nbsp;
                </div>
                <div class="st1">
                <label>時間：</label>
                <select name="depttime">
                    <option value="">請選擇</option>
                    <option value="9">9:00</option>
                    <option value="10">10:00</option>
                    <option value="11">11:00</option>
                    <option value="12">12:00</option>
                    <option value="13">13:00</option>
                    <option value="14">14:00</option>
                    <option value="15">15:00</option>
                    <option value="16">16:00</option>
                    <option value="17">17:00</option>
                    <option value="18">18:00</option>
                </select>
            </div>

            <div class="st1">
                <label>還車日期：</label>
                <input type="date" name="returnd">&nbsp;&nbsp;
                </div>
        	<div class="st1">
                <label>時間：</label>
                <select name="returntime">
                    <option value="">請選擇</option>
                    <option value="9">9:00</option>
                    <option value="10">10:00</option>
                    <option value="11">11:00</option>
                    <option value="12">12:00</option>
                    <option value="13">13:00</option>
                    <option value="14">14:00</option>
                    <option value="15">15:00</option>
                    <option value="16">16:00</option>
                    <option value="17">17:00</option>
                    <option value="18">18:00</option>
                </select>
            </div>
            <div class="st1">
                <label>訂購車型：</label>
                <select name="type">
                    <option value="">請選擇</option>
                    <option value="9">moterhome</option>
                    <option value="10">ADRIA AVIVA 390PS</option>
                    <option value="11">STARCRAFT AR-ONE 15RB</option>
                </select>
            </div>
            <div class="sub">
                <input type="submit" value="預定好車">
                <input type="reset" value="清除">
            </div>
        </fieldset>
        </form>
    <h3>加購露營組</h3>
    <form method="get" action="">
        <fieldset>
            <legend><img src="image/02.png" width=40px)><img src="image/04.png" width=45px)></legend>
            <div class="st1">
                <label>露營組</label><br>
                <label>內含天幕、營燈、折疊桌乙張、折疊椅乙張及瓦斯爐</label><br><br>
                <label>請選擇數量：</label>
                <select name="type">
                    <option value="0">0</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                </select>
            </div>
        </fieldset>
    </form>
    <div class="sub">
        <input type="submit" value="送出預約">
        <input type="reset" value="清除">
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
        (function (i, s, o, g, r, a, m) {
            i['GoogleAnalyticsObject'] = r;
            i[r] = i[r] || function () {
                (i[r].q = i[r].q || []).push(arguments)
            }, i[r].l = 1 * new Date();
            a = s.createElement(o),
                m = s.getElementsByTagName(o)[0];
            a.async = 1;
            a.src = g;
            m.parentNode.insertBefore(a, m)
        })(window, document, 'script', 'https://www.google-analytics.com/analytics.js', 'ga');

        ga('create', 'UA-76796224-1', 'auto');
        ga('send', 'pageview');
    </script>

</body>

</html>