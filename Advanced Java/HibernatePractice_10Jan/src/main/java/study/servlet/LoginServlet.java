package study.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import study.EmployeeDAO;
import study.entity.EmployeeEntity;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeEntity emp=new EmployeeEntity();
		String uname=request.getParameter("uname");
		emp.setUsername(uname);
		String pass=request.getParameter("pass");
		emp.setPassword(pass);
		EmployeeDAO dao=new EmployeeDAO();
		
		
		if(dao.validateUser(emp)==true){
			HttpSession session =request.getSession();
			session.setAttribute("user", emp);
			ServletContext context = super.getServletContext();
			RequestDispatcher rd=context.getRequestDispatcher("/welcome.jsp");
			rd.forward(request, response); 
		}
		else
		{
			ServletContext context = super.getServletContext();
			RequestDispatcher rd=context.getRequestDispatcher("/error.jsp");
			rd.forward(request, response); 
		}
		
	}

}
