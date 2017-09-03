package com.servicestraining.userservices.product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.servicestraining.userservices.product.bo.UserBO;
import com.servicestraining.userservices.product.dto.User;

/**
 * Servlet implementation class AddUserServlet
 */
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		User u = new User();
		u.setId(id);
		u.setName(name);
		u.setEmail(email);
		
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		
		UserBO bo = (UserBO)context.getBean("userbo");
		bo.create(u);
		
		PrintWriter out = response.getWriter();
		out.print("User created!!!");
	}

}
