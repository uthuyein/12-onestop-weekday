package com.jdc.mkt.servlet.communication;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/communication")
public class CommunicationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final String FOOTER = """	
										</body>
										</html>
								""";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// To Include
		req.getRequestDispatcher("/toInclude").include(req, resp);
		resp.getWriter().append("<h3>From Communication </h3>")
		.append(FOOTER);
		
	}

}
