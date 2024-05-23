package com.med;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.customer.CustomerDBUtil;

/**
 * Servlet implementation class MedInsert
 */
@WebServlet("/MedInsert")
public class MedInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("prodname");
		String category = request.getParameter("category");
		String dosage = request.getParameter("dosage");
		String productPrice = request.getParameter("productPrice");
		String quantity = request.getParameter("quantity");
		String description = request.getParameter("description");
		
		boolean isTrue;
		
		
		PrintWriter out = response.getWriter();
		
		isTrue = MedDBUtil.insertmed(name, category, dosage, productPrice, quantity, description);
		
		 
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("AdminHome.jsp");
			dis.forward(request, response);
		} else {
			  out.println("<script type=\"text/javascript\">");
	            out.println("alert('Registration failed. Please try again.');");
	            out.println("window.location.href = 'Signup.jsp';"); // Replace with your registration page
	            out.println("</script>");
		
		
	}

}
	}
