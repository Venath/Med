package com.customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CustomerInsert")
public class CustomerInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isTrue;
		PrintWriter out = response.getWriter();
		if ("admin".equals(username)) {
			out.println("<script type='text/javascript'>");
			out.println("alert('You can not use Admin as username');");
			out.println("location='Signup.jsp'");
			out.println("</script>");
			out.close();
		}
		isTrue = CustomerDBUtil.insertcustomer(name, email, phone, username, password);
		
		 
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("Login.jsp");
			dis.forward(request, response);
		} else {
			  out.println("<script type=\"text/javascript\">");
	            out.println("alert('Registration failed. Please try again.');");
	            out.println("window.location.href = 'Signup.jsp';"); // Replace with your registration page
	            out.println("</script>");
		
		
	}

}
	}
