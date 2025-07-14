package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
//inside jar file we have jakarta folder > servlet folder > http folder > HttpServlet Class
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Java Class -- Servlet
public class FirstServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		super.service(request, response	);
		System.out.println("FirstServlet -- service(HttpServletRequest request, HttpServletResponse response) -- HttpServlet -- Hello World");
	}

}
