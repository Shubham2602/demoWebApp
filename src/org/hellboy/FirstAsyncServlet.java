package org.hellboy;

import java.io.IOException;
import java.text.MessageFormat;

import javax.servlet.AsyncContext;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/simpleAsync"},asyncSupported=true)
public class FirstAsyncServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log("FirstAsyncServlet in 'doGet()', thread id : " + Thread.currentThread().getId());
		System.out.println(("FirstAsyncServlet in 'doGet()', thread id : " + Thread.currentThread().getId()));
		
		final AsyncContext actx = req.startAsync();
		
		actx.addListener(new AsyncListener() {
			
			public void onTimeout(AsyncEvent event) throws IOException {log("FirstAsyncServlet onTimeout called : " + Thread.currentThread().getId());}
			
			public void onStartAsync(AsyncEvent event) throws IOException {log("FirstAsyncServlet onStartAsync called : " + Thread.currentThread().getId());}
			
			public void onError(AsyncEvent event) throws IOException {log("FirstAsyncServlet onError called : " + Thread.currentThread().getId());}
			
			public void onComplete(AsyncEvent event) throws IOException {log("FirstAsyncServlet onComplete called : " + Thread.currentThread().getId());}
		});
		
		actx.start(()->{
			try {
				log("FirstAsyncServlet in 'start', thread is : " + Thread.currentThread().getId());
				actx.getResponse().getWriter().write(MessageFormat.format("<h1>Processing task in bgt_id:[{0}]</h1>", Thread.currentThread().getId()));
			}catch(Exception e) {
				log("Problem processing task",e);
			}
			actx.complete();
		});
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}

}
