package org.hellboy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloCrunchify extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// reading the user input
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		PrintWriter out = response.getWriter();
		/*out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" +"
				+ "http://www.w3.org/TR/html4/loose.dtd\">\n" + "<html> \n" + "<head> \n"
				+ "<meta http-equiv=\"Content-Type\" content=\"text/html; " + "charset=ISO-8859-1\"> \n"
				+ "<title> Crunchify.com JSP Servlet Example  </title> \n" + "</head> \n"
				+ "<body> <div align='center'> \n" + "<style= \"font-size=\"12px\" color='black'\"" + "\">"
				+ "Username: " + username + " <br> " + "Password: " + password + "</font></body> \n" + "</html>");*/
		
	}
}
