package com.yd.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ���ͻ�����Ӧһ��json���ݣ� 
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
		response.setContentType("text/json;charset=utf-8");// tomcat��web.xml 
		
		String json =  "{\"username\":\"��ɣ\",\"password\":12212}";
		//��Ӧ���ͻ��ˣ�  
		
		response.getWriter().println(json);
	}
	
	

}
