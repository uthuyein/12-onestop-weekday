package com.jdc.mkt.controller;

import java.io.IOException;

import com.jdc.mkt.dto.Counter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/", loadOnStartup = 1)
public class CounterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final String COUNTER = "counter";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// request scope
		Counter c1 = (Counter) req.getAttribute(COUNTER);
		if (null == c1) {
			c1 = new Counter();
		}
		c1.countUp();
		req.setAttribute(COUNTER, c1);

		// session scope
		HttpSession session = req.getSession();
		Counter c2 = (Counter) session.getAttribute(COUNTER);

		if (null == c2) {
			c2 = new Counter();
		}
		c2.countUp();
		session.setAttribute(COUNTER, c2);

		// application scope
		var context = getServletContext();
		Counter c3 = (Counter) context.getAttribute(COUNTER);

		if (null == c3) {
			c3 = new Counter();
		}
		c3.countUp();
		context.setAttribute(COUNTER, c3);
		
		req.getRequestDispatcher(getServletContext().getContextPath()).forward(req, resp);

	}
}
