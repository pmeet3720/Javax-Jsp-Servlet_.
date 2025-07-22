package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
//inside jar file we have jakarta folder > servlet folder > http folder > HttpServlet Class
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Java Class -- Servlet
public class FirstServlet extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
//		super.init(config);
		
		System.out.println("FirstServlet---init()---called: "+this);
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		super.service(request, response	);
		
		//set MIME
//		response.setContentType("text/html");
//		
//		PrintWriter out = response.getWriter();
//		
//		out.println("<h2>FirstServlet -- service(HttpServletRequest request, HttpServletResponse response) -- HttpServlet -- Hello World</h2>");
		
		System.out.println("FirstServlet---Service()----Method-called "+this);
		System.out.println(request+"---------"+response);
	}
	
	@Override
	public void destroy() {
		
//		super.destroy();
		System.out.println("FirstServlet---destroy()---called: "+this);
	}
	
	

}
