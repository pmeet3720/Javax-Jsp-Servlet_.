package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ColorDiamondServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		
//		out.print("<p><span>*</span></p>");
//		out.print("<p><span>*</span> <span>*</span></p>");
		String[] colors = {"red","blue","green","yellow","brown","pink","grey","teal"};
		int n = 6;
		
		out.print("<h1 style='font-family:arial'>Color Diamond</h1><br>");
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				out.print("<span>&nbsp</span>");
			}
			
			for(int j=1;j<=i;j++) {
				String color = colors[(int) Math.floor(Math.random()*colors.length)];
				out.print("<span style='color:"+color+"'>*&nbsp</span>");
			}
			out.print("<br>");
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				out.print("<span>&nbsp</span>");
			}
			for(int j=1;j<=n-i;j++) {
				String color = colors[(int) Math.floor(Math.random()*colors.length)];
				out.print("<span style='color:"+color+"'>*&nbsp</span>");
			}
			
			out.print("<br>");
		}
	}

}
