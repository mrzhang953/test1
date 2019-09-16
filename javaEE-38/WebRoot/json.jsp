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
   		 //创建一个json对象： 存放username 以及密码： 
   		 var obj = {"username":"杜桑","password":12212,"age":25.2 ,"hobby":["抽烟","喝酒","烫头"], "address":{"pro":"cs","city":"ls"}};
   		 
   		//访问： 
   		//访问方式一： 对象.key 
   		document.write(obj.username);
   		document.write("<br/>");
   		document.write(obj.password);
   		
   		//访问数组： 
   		document.write("<br/>");
   		document.write(obj.hobby[0]);
   		document.write(obj.hobby[1]);
   		document.write(obj.hobby[2]);
   		document.write("<br/>");
   		document.write(obj.address.city);
   		
   		//访问方式二： 
   		document.write(obj['username']);
   		document.write("<br/>");
   		document.write("<br/>");
   		document.write(obj['password']);
   		document.write("<br/>");
   		document.write(obj['hobby'][0]);
   		document.write("<br/>");
   		document.write(obj['address']['city']);
   		
   		
   		
   		
   </script>
  </body>
</html>
