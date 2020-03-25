package Filters;

import java.io.IOException;


import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@WebFilter(urlPatterns="*")
public class LoggingFilter implements Filter 
{

	static Logger logger = LogManager.getLogger(LoggingFilter.class);
	FilterConfig filterConfig; 
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		logger.info("request made to : " + ((HttpServletRequest)arg0).getRequestURI());
		LogRequestWrapper wrapper = new LogRequestWrapper((HttpServletRequest)arg0, logger);
		arg2.doFilter(wrapper, arg1);
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	
		
	}

}
