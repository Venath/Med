package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserDetailsServlet")
public class UserDetailsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle GET requests (e.g., display user details without updating)
        HttpSession session = request.getSession();
        String userName = (String) session.getAttribute("name");
        try {
            List<Customer> cusDetails = CustomerDBUtil.getCustomer(userName);
            request.setAttribute("cusDetails", cusDetails);
        } catch (Exception e) {
            e.printStackTrace();
        }
        RequestDispatcher dis = request.getRequestDispatcher("UserAccount.jsp");
        dis.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle POST requests (e.g., update user details)
        HttpSession session = request.getSession();
        String userName = (String) session.getAttribute("name");
        try {
            List<Customer> cusDetails = CustomerDBUtil.getCustomer(userName);
            request.setAttribute("cusDetails", cusDetails);
        } catch (Exception e) {
            e.printStackTrace();
        }
        RequestDispatcher dis = request.getRequestDispatcher("UserAccount.jsp");
        dis.forward(request, response);
    }
}
