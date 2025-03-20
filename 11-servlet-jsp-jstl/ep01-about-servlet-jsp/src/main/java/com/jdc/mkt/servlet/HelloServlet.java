package com.jdc.mkt.servlet;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet{

	private static final long serialVersionUID = 7182001103528644896L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		var name = req.getParameter("name");
		var age = Integer.parseInt(req.getParameter("age"));
		
		resp.getWriter()
		.append("""
				<!DOCTYPE html>
					<html>
						<head>
						<meta charset="UTF-8">
						<title>Insert title here</title>
						</head>
					<body>
				""")
			.append("<h1>Hello Java Developer from httpservlet</h1>")
			.append("Name :"+name)
			.append("Age :"+age)
			.append("""
					</body>
				</html>
					""")
		.flush();
	}
	
}
