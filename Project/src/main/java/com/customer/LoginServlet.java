package com.customer;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(); //ADDED
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		boolean isTrue;
		
		if ("admin".equals(userName) && "admin123".equals(password)) {
		    // Admin login, redirect to AdminHome.jsp
		    RequestDispatcher dispatcher = request.getRequestDispatcher("AdminHome.jsp");
		    dispatcher.forward(request, response);
		}
		
		if ("admin".equals(userName)) {
			out.println("<script type='text/javascript'>");
			out.println("alert('You can not use Admin as username');");
			out.println("location='Login.jsp'");
			out.println("</script>");
		}
		isTrue = CustomerDBUtil.validate(userName, password);
	
		
		
		if (isTrue == true) {
			List<Customer> cusDetails = CustomerDBUtil.getCustomer(userName);
			request.setAttribute("cusDetails", cusDetails);
			
			String usernameFromList = getUsernameFromList(cusDetails); // ADDED
			
			//RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			session.setAttribute("name", usernameFromList); //ADDED
			RequestDispatcher dis = request.getRequestDispatcher("Home.jsp");
			dis.forward(request, response);
		} else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or password is incorrect');");
			out.println("location='Login.jsp'");
			out.println("</script>");
		}
		
	}


	private String getUsernameFromList(List<Customer> cusDetails) { //ADDED
        if (!cusDetails.isEmpty()) {								//ADDED
            // Assuming the Customer class has a getUsername() method //ADDED
            return cusDetails.get(0).getUserName();						//ADDED
        }															//ADDED
        return null;												//ADDED
	}																//ADDED

}
