package com.edutecno.servlets.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLectorCookie
 */
@WebServlet("/leeCookie")
public class ServletLectorCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] listaCookies = request.getCookies();
		PrintWriter pr = response.getWriter();
		for (int i = 0; i < listaCookies.length; i++) {
			pr.println("Cookie rescatada " + listaCookies[i].getValue());
		}
	}
}



