<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int numRepticiones = Integer.parseInt(request.getParameter("repeticiones")); 
%>

<% for (int i=0;i<numRepticiones;i++){ %>
	<h3>Texto de prueba</h3>

<% }%>


</body>
</html>