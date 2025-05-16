package es.cursojava.web.servlets;

import java.io.IOException;

import es.cursojava.web.dto.CalculadoraDTO;
import es.cursojava.web.services.CalculadoraService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calculadora")
public class CalculadoraServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String numero = req.getParameter("num1");
		int numero1 = numero!=null?Integer.parseInt(numero):0;
		
		String num2 = req.getParameter("num2");
		int numero2 = numero!=null?Integer.parseInt(num2):0;
		
		String operacion = req.getParameter("operacion");
		CalculadoraDTO dto = new CalculadoraDTO(numero1,numero2, operacion);
		CalculadoraService service = new CalculadoraService();
		service.ejecutaOperacion(dto);
		
		System.out.println(dto.getResultado());
		
		System.out.println(dto);
		req.setAttribute("dto", dto);
		//resp.sendRedirect("calculadoraSevlet.jsp?mensaje="+dto.getMensaje());
		req.getRequestDispatcher("calculadoraSevlet.jsp?mensaje="+dto.getMensaje()).forward(req, resp);
//		System.out.println("operacion: "+operacion);
//		if (numero==null || numero2==null || operacion==null) {
//			resp.getWriter().append("<h1>Ha habido un error<h1>");
//		}else {
////			switch(operacion) {
////				case "suma": resp.getWriter().append("<h1>El resultado de la suma es "+(numero1+Integer.parseInt(numero2))); break;
////				case "resta": resp.getWriter().append("El resultado de la resta es "+(numero1-Integer.parseInt(numero2))); break;
////				case "multiplica": resp.getWriter().append("El resultado de la multiplicación es "+(numero1*Integer.parseInt(numero2))); break;
////				case "divide": resp.getWriter().append("El resultado de la división es "+(numero1/Integer.parseInt(numero2))); break;
////				default: resp.getWriter().append(operacion + "operacion no soportada"); break;
////			}
//			
//			//resp.sendRedirect("calculadoraSevlet.html");
//			resp.sendRedirect("prueba.jsp?repeticiones="+numero1);
////			resp.getWriter().append("El numero es "+numero);
////			System.out.println(numero.toLowerCase());
//		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	
	
}


