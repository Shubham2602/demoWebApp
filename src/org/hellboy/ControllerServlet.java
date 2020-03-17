package org.hellboy;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import VO.ApplicationSettings;
import VO.CssClass;
import VO.User;

public class ControllerServlet extends HttpServlet 
{	
	private static final long serialVersionUID = 1L;

	
	@Override
	public void init() throws ServletException {
		ApplicationSettings applicationSettings = new ApplicationSettings();
		CssClass cssClass = new CssClass();
		cssClass.set_name("blueUser");
		applicationSettings.set_formCssClass(cssClass);
		getServletContext().setAttribute("app", applicationSettings);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.set_name("Shubham");
		user.set_email("shubhamr@gmail.com");
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
		request.setAttribute("user", user);
		dispatcher.forward(request,response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
}
