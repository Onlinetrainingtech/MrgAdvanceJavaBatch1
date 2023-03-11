

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("Welcome to the Servlet");
		String u1=req.getParameter("uname");
		String p1=req.getParameter("pass");
		out.println(u1+""+p1);
		if(u1.equals("admin")&&p1.equals("admin@123"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("sucess.html");
			rd.forward(req, resp);
			//out.println("LoginSuce!!!!");
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("error.html");
			rd.include(req, resp);
			//out.println("LoginFail!!!");
		}
	}

}
