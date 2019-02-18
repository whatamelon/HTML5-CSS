package brain;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonalInfoServlet
 */
@WebServlet("/brain/pinfo-result")
public class PersonalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PersonalInfoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("NAME");
		String id = request.getParameter("ID");
		String password = request.getParameter("PASSWORD");
		String gender = request.getParameter("GENDER");
		if (gender.equals("MALE"))
			gender = "��";
		else
			gender = "��";
		String iNotice = request.getParameter("INOTICE");
		String clNotice = request.getParameter("CNOTICE");
		String dNotice = request.getParameter("DNOTICE");
		String job = request.getParameter("JOB");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>���� ���� �Է� - ��� ȭ��</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H2>���� ���� �Է�</H2>");
		out.printf("�̸�: %s <BR>", name);
		out.printf("���̵�: %s <BR>", id);
		out.printf("��ȣ: %s <BR>", password);
		out.printf("����: %s <BR>", gender);
		out.printf("���� ����: %s <BR>", noticeToHangul(iNotice));
		out.printf("���� ����: %s <BR>", noticeToHangul(clNotice));
		out.printf("��� Ȯ�� ����: %s <BR>", noticeToHangul(dNotice));
		out.printf("����: %s <BR>", job);
		out.println("</BODY>");
		out.println("</HTML>");
	}

	private String noticeToHangul(String notice) {
		if (notice == null)
			return "���� ����";
		else if (notice.equals("on"))
			return "����";
		else
			return notice;
	}

}
