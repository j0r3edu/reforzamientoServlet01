package com.edutecno.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLoginValidador
 */
@WebServlet("/login")
public class ServletLoginValidador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String AUTORIZADO = "admin";
		String pass = request.getParameter("pass");
		if(pass.equals(AUTORIZADO)) {
			request.getRequestDispatcher("loginCorrecto.html").forward(request, response);
		}else {
			request.getRequestDispatcher("loginInvalido.html").forward(request, response);
		}
	}

}
