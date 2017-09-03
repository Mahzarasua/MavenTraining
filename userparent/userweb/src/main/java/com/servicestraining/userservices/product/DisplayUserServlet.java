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
 * Servlet implementation class DisplayUserServlet
 */
public class DisplayUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		
		UserBO bo = (UserBO)context.getBean("userbo");
		
		User u = bo.findUser(Integer.parseInt(request.getParameter("id")));
		
		PrintWriter out = response.getWriter();
		out.print("User Details: ");
		out.print("<br/>"); //line break
		out.print("User id: " + u.getId());
		out.print("<br/>"); //line break
		out.print("User name: " + u.getName());
		out.print("<br/>"); //line break
		out.print("User email: " + u.getEmail());
	}

}
