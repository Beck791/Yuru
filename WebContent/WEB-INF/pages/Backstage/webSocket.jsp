<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>web socket</title>
</head>
<body>
	<div>
            <form id="chatRoomForm" onsubmit="return false;">
                聊天室
                名字: <input type="text" id="userNameInput" /> 
 
                <input type="button" id="loginBtn" value="登入" /> <span id="infoWindow"></span>
 
                <input type="text" id="userinput" /> 
  
                <input type="submit" value="送出訊息" />
            </form>
        </div>
        <div id="messageDisplay"></div>
        
<script>
window.onload = function () {
    //獲取DOM元件
    var loginBtn = document.getElementById("loginBtn");
    var userNameInput = document.getElementById("userNameInput");
    var infoWindow = document.getElementById("infoWindow");
    var userinput = document.getElementById("userinput");
    var chatRoomForm = document.getElementById("chatRoomForm");
    var messageDisplay = document.getElementById("messageDisplay");
 
    var webSocket;
    var isConnectSuccess = false;
 
    //設置登入鈕的動作，沒有登出，登入才可發言
    loginBtn.addEventListener("click", function () {
        //檢查有無輸入名稱
        if (userNameInput.value && userNameInput.value !== "") {
            setWebSocket();  //設置WebSocket連接
        } else {
            infoWindow.innerHTML = "請輸入名稱";
        }
 
    });
    //Submit Form時送出訊息
    chatRoomForm.addEventListener("submit", function () {
        sendMessage();
        return false;
    });
    //使用webSocket擁有的function, send(), 送出訊息
    function sendMessage() {
        //檢查WebSocket連接狀態
        if (webSocket && isConnectSuccess) {
            var messageInfo = {
                userName: userNameInput.value,
                message: userinput.value
            }
            webSocket.send(JSON.stringify(messageInfo));
        } else {
            infoWindow.innerHTML = "未登入";
        }
    }
 
    //設置WebSocket
    function setWebSocket() {
        //開始WebSocket連線
        webSocket = new WebSocket('ws://localhost:8080/yurucamp/websocket');
        //以下開始偵測WebSocket的各種事件
         
        //onerror , 連線錯誤時觸發  
        webSocket.onerror = function (event) {
            loginBtn.disabled = false;
            userNameInput.disabled = false;
            infoWindow.innerHTML = "登入失敗";
        };
 
        //onopen , 連線成功時觸發
        webSocket.onopen = function (event) {
            isConnectSuccess = true;
            loginBtn.disabled = true;
            userNameInput.disabled = true;
            infoWindow.innerHTML = "登入成功";
             
            //送一個登入聊天室的訊息
            var firstLoginInfo = {
                userName : "系統",
                message : userNameInput.value + " 登入了聊天室"
            };
            webSocket.send(JSON.stringify(firstLoginInfo));
        };
 
        //onmessage , 接收到來自Server的訊息時觸發
        webSocket.onmessage = function (event) {
            var messageObject = JSON.parse(event.data);
            console.log("messageObject"+event.data);
            messageDisplay.innerHTML += "</br>" + messageObject.userName + " 說 : " + messageObject.message;
        };
    }
};

</script>        
</body>
</html>