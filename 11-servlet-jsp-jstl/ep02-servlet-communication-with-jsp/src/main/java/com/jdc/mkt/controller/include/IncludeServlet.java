package com.jdc.mkt.controller.include;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import static com.jdc.mkt.controller.StaticFields.*;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/toInclude").include(req, resp);
		resp.getWriter().append(HEADER)
		.append("<p class='text-primary'> This is from include servlet </p>")
		.append(FOOTER);
	}

}




