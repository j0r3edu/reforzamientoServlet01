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
 * Servlet implementation class ServletCreaCookies
 */
@WebServlet("/creaCookies")
public class ServletCreaCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie = new Cookie("nombre", "nitro");
		cookie.setMaxAge(60);
		response.addCookie(cookie);
		PrintWriter pr = response.getWriter();
		pr.println("cookie creada");
	}
}


