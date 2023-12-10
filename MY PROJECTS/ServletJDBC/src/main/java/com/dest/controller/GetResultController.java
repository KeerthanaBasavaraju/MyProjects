package com.dest.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dest.model.StudentModel;
@WebServlet("/GetResultController")
public class GetResultController extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String usn = req.getParameter("usn");
		StudentModel m =  new StudentModel();
		m.setUsn(usn);
		boolean b=m.fetchResult();
		PrintWriter writer = resp.getWriter();
		if(b==true)
		{
			req.setAttribute("sname",m.getSname());
			req.setAttribute("m1",m.getM1());
			req.setAttribute("m2",m.getM2());
			req.setAttribute("m3",m.getM3());
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("PercentageController");
			requestDispatcher.forward(req, resp);
		}
		else
		{
			 writer.println("specified usn does not have any result");
		}
	}

}