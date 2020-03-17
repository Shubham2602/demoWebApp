package org.hellboy;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/home"}, name= "SimpleServlet",initParams= {@WebInitParam(name = "ProductName", value = "Welcome Application")})
public class SimpleServlet extends HttpServlet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String appName = "My Application";
	@Override
	public void init() throws ServletException {
		appName = getServletContext().getInitParameter("ProductName");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		resp.setContentType("text/xml");
		if(name!=null) {
		resp.getWriter().printf("<application>"
				+"<name>%s</name>"
				+"<product>%s</product>"
				+"</application>",name,appName);}
		else {
			throw new ServletException("A name should be entered"); 
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		if(name!=null && name!="") {
		resp.sendRedirect("home.jsp");;}
		else {
			resp.getWriter().printf("Please enter name value");
		}
	}
	
	
	
}
