package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
//		super.init();
		
		System.out.println("SecondServlet---init()----called: "+this);
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		super.service(arg0, arg1);
		
		System.out.println("SecondServlet---service()----called(): "+this);
		System.out.println("---------"+request);
		System.out.println("---------"+response);
		
	}
	
	@Override
	public void destroy() {
//		super.destroy();
		
		System.out.println("SecondServlet---destroy()----called: "+this);
	}

}
