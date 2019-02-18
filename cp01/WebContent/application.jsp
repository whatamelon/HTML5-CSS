<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>application 내장변수 사용 예</title>
</head>
<body>
	<%
		String appPath = application.getContextPath();
		String filePath = application.getRealPath("/sub1/Intro,html");
	%>
	웹 애플리케이션의 URL 경로명 : <%=appPath %> <br>
	/sub1/Intro.html의 파일 경로명 : <%= filePath %> <br>
</body>
</html>