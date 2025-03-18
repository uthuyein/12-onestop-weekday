package com.jdc.mkt.listeners;

import com.jdc.mkt.dto.Planet;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		var context = sce.getServletContext();		
		context.setAttribute("dayOfWeek", Planet.values());
	}
}


