package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.Products;

/**
 * Servlet implementation class addProductSerlvet
 */
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		if (request.getParameter("productid").equals("") || request.getParameter("productName").equals("") || request.getParameter("price").equals(""))
		{
			request.getRequestDispatcher("index.jsp").include(request, response);
			out.println("<p style=\"color:red\";>Error: one or more fields is empty</p>");
		}
		else {
			String id = request.getParameter("productid");
			String name = request.getParameter("productName");
			
			int price = Integer.parseInt(request.getParameter("price"));
			Products product = new Products(id , name, price);
			
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			session.setAttribute("productName", name);
			session.setAttribute("price", price);
			
			request.getRequestDispatcher("displayProduct.jsp").include(request, response);
			//out.println("<p style=\"color:blue\";>Product added to database</p>");
			
		}
		
		
		
		
	}

}
