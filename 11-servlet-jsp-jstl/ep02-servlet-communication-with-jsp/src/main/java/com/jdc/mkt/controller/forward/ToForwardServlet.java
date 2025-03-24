package com.jdc.mkt.controller.forward;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import static com.jdc.mkt.controller.StaticFields.*;

@WebServlet("/toForward")
public class ToForwardServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().append(HEADER)
		.append("Current Date :"+ req.getAttribute("date").toString())
		.append(FOOTER);
	}

}
