package com.jdc.mkt.servlet.communication;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/toInclude")
public class IncludeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final String HEADER = """
							<!DOCTYPE html>
								<html>
								<head>
								<meta charset="UTF-8">
								<title>Insert title here</title>
								<link rel="stylesheet" href="css/styles.css" />
								</head>
								<body>
								<div class="container">
									<h3>Servlet Information</h3>
									<ul>
										<li><a href="/include">To Clude</a></li>
										<li><a href="/forward">To Forward</a></li>
										<li><a href="/redirect">To Redirect</a></li>
									</ul>
								</div>
							""";


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter()
		.append(HEADER)
		.append("<h3>From ToClude</h3>");
	}
}
