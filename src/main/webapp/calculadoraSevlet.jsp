<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="es.cursojava.web.dto.CalculadoraDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	CalculadoraDTO calcDTO = (CalculadoraDTO)request.getAttribute("dto");
	if (calcDTO!=null){
	%>
	<p>Tengo el DTO!!!</p>
	<%} %>
	<form action="calculadora" method="post">
		Numero1: <input type="number" name="num1" id="num1" value="<%=calcDTO!=null?calcDTO.getNumero1():0%>"> 
		Numero2: <input type="number" name="num2" id="num2" value="<%=calcDTO!=null?calcDTO.getNumero2():0%>"> <select
			name="operacion">
			<option value="suma">Sumar</option>
			<option value="resta">Restar</option>
			<option value="multiplica">Multiplicar</option>
			<option value="divide">Dividir</option>
		</select> <input type="submit"></input>

	</form>
	
	
	<%
	if (request.getParameter("mensaje") != null) {
		String mensaje = request.getParameter("mensaje");
	%>
	<p><%= mensaje %></p>
	<%
	}
	%>
</body>
</html>