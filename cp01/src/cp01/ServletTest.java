package cp01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTest extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int total = 0;
		for(int cnt=1; cnt<101; cnt++)
			total += cnt;
		
		response.setContentType("text/html;charset=euc-kr");
		
		PrintWriter out = response.getWriter();
		out.println("<HTML");
		out.println("<HEAD><TITLE>1부터 100꺼지 더하는 서블릿</TITLE></HEAD>");
		out.println("<BODY>");
		out.printf("1+2+3+...+100=%d",total);
		out.println("</BODY>");
		out.println("</HTML");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet (request, response);
		
	}

}
