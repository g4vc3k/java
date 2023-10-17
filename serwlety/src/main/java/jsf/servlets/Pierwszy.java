package jsf.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;

public class Pierwszy extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException
	{
		// typ odpowiedzi
		resp.setContentType("text/html; charset=UTF-8");

		// strumień do którego zostanie zapisana odpowiedz
		PrintWriter out = resp.getWriter();
		
		// typ naglowka -> odswiezanie co 10 s
		resp.setHeader("Refresh", "10");
		
    	// aktualna data i czas
		String data = new Date().toString();
	    
		out.println("<html>\n<body>\n" + data +
		            "\n<h1>Witaj !!!</h1><br>\n" +
	               "<img border=\"0\" src=\"images/duke.gif\">\n" +
		            "</body>\n</html>");
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException
	{
		doGet(req, resp);
	}
}
