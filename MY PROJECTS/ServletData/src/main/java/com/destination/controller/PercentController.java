package com.destination.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/PercentController")
public class PercentController extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sname = (String)req.getAttribute("sname");
		int m1 = (int)req.getAttribute("m1");
		int m2 = (int)req.getAttribute("m2");
		int m3 = (int)req.getAttribute("m3");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		double p = ((m1+m2+m3)*100)/300;
		PrintWriter writer = resp.getWriter();
		writer.println(sname);
		writer.println(m1);
		writer.println(m2);
		writer.println(m3);
		writer.println(p);
		
	}

}