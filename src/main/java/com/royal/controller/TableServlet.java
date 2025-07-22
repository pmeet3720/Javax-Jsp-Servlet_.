package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TableServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

//		super.service(arg0, arg1);
		
		res.setContentType("text/html");
		
	    PrintWriter out = res.getWriter();
		
	    for(int i=1;i<=10;i++) {
	    	out.print(5+" * "+i+" = "+(5*i)+"<br/>");
	    }
		
	}

}
