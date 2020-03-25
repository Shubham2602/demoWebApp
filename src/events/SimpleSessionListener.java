package events;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SimpleSessionListener implements HttpSessionListener
{

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		arg0.getSession().getServletContext().log("Session created");
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		arg0.getSession().getServletContext().log("Session Destroyed");
		
	}
	
}
