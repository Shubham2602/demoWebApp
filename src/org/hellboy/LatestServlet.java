package org.hellboy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LatestServlet extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String first_name,last_name;
	@Override
	public void init() throws ServletException {
		String initial = getInitParameter("initial");
		System.out.println("Initial : " + initial);
		first_name = "Shubham";
		last_name = "Routh";
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String docType =
		         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		PrintWriter out = resp.getWriter();
		String title = "Using GET Method to Read Form Data";
		
		if(req.getParameter("first_name")!=null) {
			first_name = req.getParameter("first_name");
		}
		
		if(req.getParameter("last_name")!=null) {
			last_name = req.getParameter("last_name");
		}
		
		out.println(docType +
		         "<html>\n" +
		            "<head><title>" + title + "</title></head>\n" +
		            "<body bgcolor = \"#f0f0f0\">\n" +
		               "<h1 align = \"center\">" + title + "</h1>\n" +
		               "<ul>\n" +
		                  "  <li><b>First Name</b>: "
		                  + first_name + "\n" +
		                  "  <li><b>Last Name</b>: "
		                  + last_name + "\n" +
		               "</ul>\n" +
		            "</body>" +
		         "</html>"
		      );
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
}
