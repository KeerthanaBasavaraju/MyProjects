package com.dest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Addition")

public class Addition extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req,HttpServletResponse resp){
		try {
			int n1 = Integer.parseInt(req.getParameter("n1"));
			int n2 = Integer.parseInt(req.getParameter("n2"));
			int add=n1+n2;
			req.setAttribute("add_tmp", add);
			RequestDispatcher d=req.getRequestDispatcher("Multiplication");
			d.forward(req, resp);	
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}