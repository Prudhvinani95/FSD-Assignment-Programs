package com.ibm.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginuser")
public class LoginUserServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		System.out.println("taking html values");
		String uname = request.getParameter("user");
		System.out.println("uname");
		String pass = request.getParameter("pswd");
		System.out.println("pass");
		if(uname.equals("prudhvinani95") && pass.equals("youngtiger95")) {
		     response.getWriter().append("Success");
		     request.getRequestDispatcher("loginUser.html").include(request, response);
		}
		else {
			 response.getWriter().append("Falied!");
		     request.getRequestDispatcher("loginUser.html").include(request, response);
		}
			
		}

}
