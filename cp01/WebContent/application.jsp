<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>application ���庯�� ��� ��</title>
</head>
<body>
	<%
		String appPath = application.getContextPath();
		String filePath = application.getRealPath("/sub1/Intro,html");
	%>
	�� ���ø����̼��� URL ��θ� : <%=appPath %> <br>
	/sub1/Intro.html�� ���� ��θ� : <%= filePath %> <br>
</body>
</html>