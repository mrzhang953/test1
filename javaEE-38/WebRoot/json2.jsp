<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'json.jsp' starting page</title>
    
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
   <script type="text/javascript">
   		 //创建一个json对象：
   		 var obj = {"username":"杜桑","password":12212};
   		 //alert(typeof obj);
   		 //alert(typeof(obj));
   		 
   		 //alert(obj.username);
   		 
   		 //创建一个json字符串：
   		 var objStr = "{\"username\":\"杜桑\",\"password\":12212}";
   		// alert(typeof(objStr));//string 
   		 
   		 //json字符串转成json对象：  
   		 //方式一： 使用eval 函数将json字符串转换成json对象：  
   		 // var obj1 = eval("("+objStr+")");  
   		 //alert(obj1.username); 
   		 //alert(obj1.password);
   		 //eval() 模拟了浏览器的殷勤： 能够执行js代码： 
   		// eval("alert('x')")
   		
   		
   		//方式二： 使用JSON对象： 使用json对象的parse方法： 能够将一个json串转换成json对象： 
   		//JSON对象方式， 需要借助于服务器
   		var obj2 = JSON.parse(objStr);
   		//alert(obj2.username); 
   		//alert(obj2.password);
   		
   		
   		//将json对象转换成json字符串； 
   		var s= JSON.stringify(obj2);
   		alert(typeof s);
   </script>
  </body>
</html>
