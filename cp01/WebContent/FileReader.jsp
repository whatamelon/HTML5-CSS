<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileNotFoundException"%>
<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���� �б�</title>
</head>
<body>
	<%
	BufferedReader reader = null;
	try {
		String filePath = application.getRealPath("/WEB-INF/input.txt");
		reader = new BufferedReader(new FileReader(filePath));
		while(true) {
			String str = reader.readLine();
			if (str == null)
				break;
			out.println(str+"<BR>");
		}
	}
	catch (FileNotFoundException fnfe) {
		out.println("������ �������� �ʽ��ϴ�.");
	}
	catch (IOException ioe) {
		out.println("������ ���� �� �����ϴ�.");
	}
	finally {
		try {
			reader.close();
		}
		catch(Exception e) {
		}
	}
	%>
</body>
</html>