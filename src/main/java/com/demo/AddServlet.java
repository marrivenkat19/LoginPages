package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet  {

	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		String user = req.getParameter("user name");
		String password =  req.getParameter("password");
		
		
		PrintWriter out = res.getWriter();
		
		
		
		
		 
		
		
		 out.println("LOGIN SUCUSESS ! welcome venkat reddy " );
		 out.close();
		// out.println("LOGIN SUCCUSES !  WELCOME VENKAT REDDY : " );
		
	}

}
