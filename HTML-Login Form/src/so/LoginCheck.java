package so;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet
{
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	
		{
			String uname=request.getParameter("uname");
		String passwd=request.getParameter("passwd");
		so.LoginCredential obj = new so.LoginCredential();
		obj.setUname(uname);
		obj.setPasswd(passwd);
		if(obj.CheckLogin())
		{
			RequestDispatcher Dispatch = request.getRequestDispatcher("Success.jsp");
					Dispatch.forward(request, response);
		}
			else
			{
				RequestDispatcher Dispatch = request.getRequestDispatcher("Failure.jsp");
				Dispatch.forward(request, response);
	
		}
		// TODO Auto-generated method stub
	}

}
