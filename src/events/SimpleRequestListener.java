package events;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class SimpleRequestListener implements ServletRequestListener
{

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		arg0.getServletContext().log("Request Destroyed");
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		arg0.getServletContext().log("Request Initialized");
		
	}
	
}
