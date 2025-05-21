<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, 
    es.cursojava.web.entities.CalculadoraEntity"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
<%
	List<CalculadoraEntity> listado = (List<CalculadoraEntity>)request.getAttribute("lista");
	for (CalculadoraEntity ce   :    listado){
%>

	
	<li><%=ce.getResultado()%></li>
	

<%
	}
%>
</ul>
</body>
</html>