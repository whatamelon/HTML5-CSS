package brain;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BBSPostServletTest
 */
@WebServlet("/brain/bbs-post")
public class BBSPostServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BBSPostServletTest() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("EUC-KR");
		
		String name = request.getParameter("name");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		response.setContentType("text/html;charset=EUC-KR");
		
		PrintWriter out = response.getWriter();
		
		out.println("<HTML");
		out.println("<HEAD><TITLE>�Խ��� �۾���- ���ȭ��</TITLE></HEAD>");
		out.println("<BODY>");
		
		out.printf("�̸� : %s <br/>", name);
		out.printf("���� : %s <br/>", title);

		out.println("---------------------------<br/>");
		
		out.printf("<pre>%s</pre>", content);
		
		out.println("----------------------------<br/>");
		out.println("����Ǿ����ϴ�.");
		
		out.println("</BODY>");
		out.println("</HTML>");
	}

}
