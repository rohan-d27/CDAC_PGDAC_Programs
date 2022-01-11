package study;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Second
 */
@WebServlet("/Second")
public class Second extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			
		String firstLine =(String)request.getAttribute("line1");
		
		String poem_more = firstLine +"<br> " +"how I wonder what you are";
		
		request.setAttribute("poem", poem_more);
		
		RequestDispatcher rd =super.getServletContext().getRequestDispatcher("/Third");
		rd.forward(request, response);
			
		
		
	}

}
