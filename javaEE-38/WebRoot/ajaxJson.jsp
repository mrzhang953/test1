<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<!-- 演示页面的局部刷新： -->
	<ul>
		<li>青翼蝠王</li>
		<li>白眉鹰王</li>
		<li>金毛狮王</li>
		<li>紫衫龙王</li>
		
	</ul>

	<input type="button" value="点击" id="btn">
	<!-- 引入了外部的js文件 -->
	<script type="text/javascript" src="js/xhrHttp.js"></script>

	<script type="text/javascript">
	    
		//获得btn 对象： 
		var btnEle = document.getElementById("btn");

		//给按钮注册一个动态的事件：
		btnEle.onclick = function() {

			//第一步： 获得了一个xmlHttpRequest对象： 
			var xhrHttp = getxhr();
			
			//第一步:建立和服务器的链接： 
			xhrHttp.open("GET","/javaEE-38/servlet/BServlet",true);
			
			//第三步：给服务端发送数据： 
			xhrHttp.send(null);
			
			//第四步： 注册监听器， 监听xhrHttp 对象的状态： 
			xhrHttp.onreadystatechange = function(){
				if(xhrHttp.readyState==4 && xhrHttp.status== 200){
				    //获得服务端相应的xml格式的文本数据： 
				    var jsonStr = xhrHttp.responseText; 
				    alert(typeof jsonStr);
				    var obj = JSON.parse(jsonStr);
				    alert(obj.username);
				    alert(obj.password);
				}
			};   
		};
	</script>
	
	
	
	
</body>
</html>
