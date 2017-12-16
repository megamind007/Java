import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrivateUni")
public class PrivateUni  extends HttpServlet{

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		String range=req.getParameter("rangeVal");
		//String hsc=req.getParameter("hscGpa");
		//pw.print("hi "+ssc );
		
		RequestDispatcher rd=req.getRequestDispatcher("Plist.jsp");
		rd.include(req, resp);
		
	}
	
	

}
