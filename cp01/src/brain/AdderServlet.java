package brain;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdderServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException , ServletException{
		
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int sum = num1 + num2;
		
		response.setContentType("text/html;charset=euc-kr");
		
		PrintWriter out = response.getWriter();
		
		out.println("<HTML");
		out.println("<HEAD><TITLE>µ¡¼À ÇÁ·Î±×·¥ - °á°úÈ­¸é</TITLE></HEAD>");
		out.println("<BODY>");
		out.printf("%d + %d = %d", num1, num2, sum);
		//out.println("<br>");
		//out.println(num1 + "+" + num2 + "=" + sum);
		out.println("</BODY>");
		out.println("</HTML>");
		
	}
}
