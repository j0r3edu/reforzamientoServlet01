package com.edutecno.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletMetodosRequest
 */
@WebServlet(description = "Usamos los metodos de un request", urlPatterns = { "/metodosReq" })
public class ServletMetodosRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pr = response.getWriter();
		response.getWriter().append("Numero de bytes del request body : ");
		pr.println(request.getContentLength() + "<br>");
		response.getWriter().append("Protocolo del request: " + request.getProtocol() + "<br>");
		response.getWriter().append("Tipo MIME del request: " + request.getContentType() + "<br>");
		response.getWriter().append("Nombre del esquema: " + request.getScheme());
		response.getWriter().append("Parametros recibidos: " + request.getParameter("id") + "<br>");
	}

}
