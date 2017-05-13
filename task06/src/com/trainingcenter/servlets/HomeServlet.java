package com.trainingcenter.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaClasses.ReadFile;

public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		List<String> readAllLines = ReadFile.writeContent(request, "/WEB-INF/html/home.html");
		for (String str : readAllLines) {
			out.println(str);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("advertising.html");
		dispatcher.include(request, response);
		out.close();
	}
}