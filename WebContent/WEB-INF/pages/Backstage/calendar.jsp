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
		selectable: true,
		selectHelper: true,
		select: function(start, end, allDay) {
			bootbox.prompt("start"+start+"end"+end, function(title) {
				if (title !== null) {
					$( "#example" ).fullCalendar('renderEvent',
						{
							title: title,
							start: start,
							end: end,
							allDay: allDay,
							className: 'label-info'
						},
						true // make the event "stick"
					);
				}
			});
			$( "#example" ).fullCalendar('unselect');
		},
		
		eventClick: function(calEvent, jsEvent, view) {
			//display a modal
			var modal = 
			'<div class="modal fade">\
			  <div class="modal-dialog">\
			   <div class="modal-content">\
				 <div class="modal-body">\
				   <button type="button" class="close" data-dismiss="modal" style="margin-top:-10px;">&times;</button>\
				   <form class="no-margin">\
					  <label>Change event name &nbsp;</label>\
					  <input class="middle" autocomplete="off" type="text" value="' + calEvent.title + '" />\
					 <button type="submit" class="btn btn-sm btn-success"><i class="ace-icon fa fa-check"></i> Save</button>\
				   </form>\
				 </div>\
				 <div class="modal-footer">\
					<button type="button" class="btn btn-sm btn-danger" data-action="delete"><i class="ace-icon fa fa-trash-o"></i> Delete Event</button>\
					<button type="button" class="btn btn-sm" data-dismiss="modal"><i class="ace-icon fa fa-times"></i> Cancel</button>\
				 </div>\
			  </div>\
			 </div>\
			</div>';
		
		
			var modal = $(modal).appendTo('body');
			modal.find('form').on('submit', function(ev){
				ev.preventDefault();

				calEvent.title = $(this).find("input[type=text]").val();
				$( "#example" ).fullCalendar('updateEvent', calEvent);
				modal.modal("hide");
			});
			modal.find('button[data-action=delete]').on('click', function() {
				$( "#example" ).fullCalendar('removeEvents' , function(ev){
					return (ev._id == calEvent._id);
				})
				modal.modal("hide");
			});
			
			modal.modal('show').on('hidden', function(){
				modal.remove();
			});

			//console.log(calEvent.id);
			//console.log(jsEvent);
			//console.log(view);

			// change the border color just for fun
			//$(this).css('border-color', 'red');

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