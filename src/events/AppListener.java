package events;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppListener implements ServletContextListener 
{

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		arg0.getServletContext().log("Context Initialized");
		
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
