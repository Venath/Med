package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChangePassword
 */
@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("npassword");
		boolean isTrue;
		
		isTrue = CustomerDBUtil.validatep(userName, email);
		
		
		if (isTrue == true)
		{
			
			
			isTrue=CustomerDBUtil.updatepassword(password, email);
			
				if(isTrue==true)
				{
					List<Customer> cusDetails = CustomerDBUtil.getCustomer(userName);
					request.setAttribute("cusDetails", cusDetails);
					RequestDispatcher dis = request.getRequestDispatcher("Login.jsp");
					dis.forward(request, response);
				}
				else{
					List<Customer> cusDetails = CustomerDBUtil.getCustomer(userName);
					request.setAttribute("cusDetails", cusDetails);
					RequestDispatcher dis = request.getRequestDispatcher("Home.jsp");
					dis.forward(request, response);
				}
				
			
			
			
		}
		else{
			List<Customer> cusDetails = CustomerDBUtil.getCustomer(userName);
			request.setAttribute("cusDetails", cusDetails);
			RequestDispatcher dis = request.getRequestDispatcher("Signup.jsp");
			dis.forward(request, response);
		}
		
	}

}
