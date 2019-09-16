package com.yd.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/xml;charset=utf-8");
	    String students ="<students><student><id>1001</id><name>lisi</name><age>21</age></student></students>";
	    //响应到客户端： 
	    response.getWriter().println(students);
	}

}
