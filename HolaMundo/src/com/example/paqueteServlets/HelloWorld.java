package com.example.paqueteServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		java.io.PrintWriter out =response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>HelloWorld</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<div style='text-align:center'>");
		out.print("<h1 style='color:red'>Hola Mundo</h1>");
		out.print("<img width='400px' src='https://pbs.twimg.com/media/BCh-v51CAAA9HuT.jpg'/>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
