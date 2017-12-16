import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

@WebServlet("/CheckEligibility")
public class CheckEligibility extends HttpServlet{
	
	

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		String ssc=req.getParameter("sscGpa");
		String hsc=req.getParameter("hscGpa");
		//pw.print("hi "+ssc+" "+hsc);
		RequestDispatcher rd=req.getRequestDispatcher("List.jsp");
		rd.include(req, resp);
	  
		
	}
	
	

}
