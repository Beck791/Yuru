<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>日歷</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap-clearmin.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/roboto.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/material-design.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/small-n-flat.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/font-awesome.min.css">

<script src="${pageContext.request.contextPath}/js/lib/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.mousewheel.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.cookie.min.js"></script>
<script src="${pageContext.request.contextPath}/js/fastclick.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/clearmin.min.js"></script>
<script src="${pageContext.request.contextPath}/js/demo/home.js"></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/bootbox.js/4.4.0/bootbox.min.js'></script>

 <!-- jQuery v1.9.1 -->
<!--  <script type="text/javascript" src="https://code.jquery.com/jquery-1.9.1.min.js"></script> -->
 <!-- Moment.js v2.20.0 -->
 <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.20.0/moment.min.js"></script>
 <!-- FullCalendar v3.8.1 -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/fullcalendar/3.8.1/fullcalendar.min.js"></script>
<link href="https://cdnjs.cloudflare.com/ajax/libs/fullcalendar/3.8.1/fullcalendar.min.css" rel="stylesheet"  />
<link href="https://cdnjs.cloudflare.com/ajax/libs/fullcalendar/3.8.1/fullcalendar.print.css" rel="stylesheet" media="print">



</head>
<body class="cm-no-transition cm-1-navbar">
<jsp:include page="/WEB-INF/pages/Backstage/top.jsp" />     
 <div id="global">
	 <div class="container-fluid">
	 	<div class="container">
	 	
	 	 <div id="example"></div>
 
	 	
	 	
	 	</div>
	</div>
</div>


<script>
	
	var date = new Date();
	var d = date.getDate();
	var m = date.getMonth();
	var y = date.getFullYear();
	
  	$( "#example" ).fullCalendar({
  		// 參數設定[註1]
  		header: { // 頂部排版
  			left: "prev,next today", // 左邊放置上一頁、下一頁和今天
  			center: "title", // 中間放置標題
  			right: "month,basicWeek,basicDay" // 右邊放置月、周、天
  		},
        dayNamesShort: ["週日", "週一", "週二", "週三", "週四", "週五", "週六"],
  		defaultDate: date, // 起始日期
  		weekends: true, // 顯示星期六跟星期日
  		editable: true,  // 啟動拖曳調整日期
  		eventDrop: function(event, delta, revertFunc) {
			
  			console.log(event);
  		    alert(event.title + " was dropped on " + event.start.format());

  		    if (!confirm("Are you sure about this change?")) {
  		      revertFunc();
  		    }

  		  },
		selectable: true,
		selectHelper: true,
		select: function(start, end, allDay) {
			  bootbox.prompt("新增行事曆:", function(title) {
				  if (title !== null) {
				  var data = new Object();
					data.start = start.format();
					data.end = end.format();
					data.title = title;
					console.log(data);
					  $.ajax({
				            url: '/yurucamp/Backstage/calendarInsert',
				            type: 'POST',
				            dataType: 'json',
				            data : data,
				            success: function(result) {
				            	bootbox.alert(result.msg);
				            	window.location.reload();
				            }
				        });
				  }
			  });
// 			$( "#example" ).fullCalendar('unselect');
		},
		eventClick: function(calEvent, jsEvent, view) {
			//display a modal
// 			console.log(calEvent.id);
// 			console.log(calEvent.start.format());
// 			console.log(calEvent.title);
// 			console.log(calEvent.end.format());
			
			bootbox.confirm({
				title: "Destroy planet?",
			    message:  '<input class="middle" id="titleText" autocomplete="off" type="text" value="' + calEvent.title + '" /> '
			    + '<button type="submit" id="Save" class="btn btn-sm btn-success"><i class="ace-icon fa fa-check"></i> Save</button>',
			    buttons: {
			        confirm: {
			            label: 'Yes',
			            className: 'btn-success'
			        },
			        cancel: {
			            label: 'No',
			            className: 'btn-danger'
			        }
			    },
			    callback: function (result) {
			    	if(result){
			    		   $.ajax({
			   	            url: '/yurucamp/Backstage/calendarQuery',
			   	            type: 'POST',
			   	            dataType: 'json',
			   	            success: function(doc) {
			   	                console.log(doc);
			   	            }
			   	        });
			    		
			    		console.log('yes');
			    	}else{
			    		console.log('no');
			    	}
			        console.log('This was logged in the callback: ' + result);
			    }
			});
			
			
			$("#Save").on('click',function(){
				console.log($("#titleText").val());
				bootbox.hideAll();
			})
		

		},
		events: function(start, end, timezone, callback) {
	        $.ajax({
	            url: '/yurucamp/Backstage/calendarQuery',
	            type: 'POST',
	            dataType: 'json',
	            success: function(doc) {
	                console.log(doc);
	                callback(doc);
	            }
	        });
	    }
  	});
  </script>

</body>
</html>