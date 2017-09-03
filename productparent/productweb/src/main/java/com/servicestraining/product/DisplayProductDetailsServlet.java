package com.servicestraining.product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.servicestraining.product.bo.ProductBO;
import com.servicestraining.product.dto.Product;

/**
 * Servlet implementation class DisplayProductDetailsServlet
 */
public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(this.getServletContext());
		
		ProductBO bo = (ProductBO) context.getBean("productbo");
		Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));
		
		PrintWriter out = response.getWriter();
		out.print("Product details:");
		out.print("Product ID: " + product.getId());
		out.print("Product name: " + product.getName());
		out.print("Product desc: " + product.getDesc());
		out.print("Product price: " + product.getPrice());
	}

}
