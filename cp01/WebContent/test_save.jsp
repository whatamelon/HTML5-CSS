<%@page import="java.util.Date"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�Խ��� �۾���-���ȭ��</title>
</head>
<body>
	<h2>�۾���</h2>
	<%
	request.setCharacterEncoding("euc-kr");
	String name = request.getParameter("name");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	Date date = new Date();
	Long time = date.getTime();
	String filename = time + ".txt";
	PrintWriter writer = null;
	try {
		String filePath = application.getRealPath(
								"/WEB-INF/bbs/"+filename);
		
		writer = new PrintWriter(filePath);
		
		writer.printf("����:%s%n",title);
		writer.printf("�۾���:%s%n",name);
		writer.println(content);
		out.println("����Ǿ����ϴ�.");
	}
	catch (IOException ioe) {
		out.println("���Ͽ� �����͸� �� �� �����ϴ�.");
	}
	finally{
		try{
			writer.close();
		}
		catch(Exception e) {
		}
		}
	%>
</body>
</html>