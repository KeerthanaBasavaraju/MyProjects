package com.dest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Multiplication")

public class Multiplication extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req,HttpServletResponse resp){
		try {
			int n1 = Integer.parseInt(req.getParameter("n1"));
			int n2 = Integer.parseInt(req.getParameter("n2"));
			int mul=n1*n2;
			int add=(int)req.getAttribute("add_tmp");
			PrintWriter write=resp.getWriter();
			write.println(add);
			write.println(mul);
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}