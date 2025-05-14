package es.cursojava.web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calculadora")
public class CalculadoraServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Llamando al doget");
		String numero = req.getParameter("num1");
		int numero1 = numero!=null?Integer.parseInt(numero):0;
		
		String numero2 = req.getParameter("num2");
		String operacion = req.getParameter("operacion");
		
		System.out.println("operacion: "+operacion);
		if (numero==null || numero2==null || operacion==null) {
			resp.getWriter().append("<h1>Ha habido un error<h1>");
		}else {
			switch(operacion) {
				case "suma": resp.getWriter().append("El resultado de la suma es "+(numero1+Integer.parseInt(numero2))); break;
				case "resta": resp.getWriter().append("El resultado de la resta es "+(numero1-Integer.parseInt(numero2))); break;
				case "multiplica": resp.getWriter().append("El resultado de la multiplicación es "+(numero1*Integer.parseInt(numero2))); break;
				case "divide": resp.getWriter().append("El resultado de la división es "+(numero1/Integer.parseInt(numero2))); break;
				default: resp.getWriter().append(operacion + "operacion no soportada"); break;
			}
			
//			resp.getWriter().append("El numero es "+numero);
//			System.out.println(numero.toLowerCase());
		}
		
		
		
		
		
	}
	
}


