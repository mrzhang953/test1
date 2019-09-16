package com.yd.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 给客户端相应一个json数据： 
 * @author Mrzhang
 *
 */
public class BServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");// tomcat的web.xml 
		
		String json =  "{\"username\":\"杜桑\",\"password\":12212}";
		//响应给客户端：  
		
		response.getWriter().println(json);
	}
	
	

}
