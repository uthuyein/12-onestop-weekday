package com.jdc.mkt.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value = "/information",initParams = {
		@WebInitParam(name = "status",value = "Status Ok."),
		@WebInitParam(name = "methodType",value = "Request method type is get.")
})
public class InformationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//header information
		var headers = req.getHeaderNames();
		
		while(headers.hasMoreElements()) {
			var header = headers.nextElement();
			System.out.println(header+"\t"+req.getHeader(header));
		}
		
		//init parameters
		var initParams = getInitParameterNames();
		
		while(initParams.hasMoreElements()) {
			var param = initParams.nextElement();
			System.out.println("init param :"+param +"\t"+ getInitParameter(param));
		}
		
		System.out.println("Context path :"+getServletContext(). getContextPath());
		System.out.println("Servlet path :"+req.getServletPath());
		System.out.println("Path Info :"+req.getPathInfo());
	}

}
