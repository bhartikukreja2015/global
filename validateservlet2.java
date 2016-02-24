import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class ValidateServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
	res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("validate servlet");
	String name=req.getParameter("name");
	String pass=req.getParameter("pass");
	if(name.equals("hi")&&pass.equals("hi"))
		{
		RequestDispatcher rd=req.getRequestDispatcher("action?check=wel");
		rd.forward(req,res);	
		}
	else
		{
		RequestDispatcher rd=req.getRequestDispatcher("action?check=err");
		rd.forward(req,res);
		}	

	}
}
