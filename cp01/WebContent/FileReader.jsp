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
<title>파일 읽기</title>
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
		out.println("파일이 존재하지 않습니다.");
	}
	catch (IOException ioe) {
		out.println("파일을 읽을 수 없습니다.");
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