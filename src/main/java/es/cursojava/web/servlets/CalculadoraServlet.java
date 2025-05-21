package es.cursojava.web.servlets;

import java.io.IOException;
import java.util.List;

import es.cursojava.web.dto.CalculadoraDTO;
import es.cursojava.web.entities.CalculadoraEntity;
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
		CalculadoraService service = new CalculadoraService();
		List<CalculadoraEntity> lista = service.consultar();
		
		req.setAttribute("lista", lista);
		req.getRequestDispatcher("listadoOperaciones.jsp").forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String numero = req.getParameter("num1");
		int numero1 = numero!=null?Integer.parseInt(numero):0;
		
		String num2 = req.getParameter("num2");
		int numero2 = numero!=null?Integer.parseInt(num2):0;
		
		String operacion = req.getParameter("operacion");
		CalculadoraDTO dto = new CalculadoraDTO(numero1,numero2, operacion);
		CalculadoraService service = new CalculadoraService();
		
		service.ejecutaOperacion(dto);
		service.insertarOperacion(dto);
		
		System.out.println(dto.getResultado());
		
		System.out.println(dto);
		req.setAttribute("dto", dto);
		//resp.sendRedirect("calculadoraSevlet.jsp?mensaje="+dto.getMensaje());
		req.getRequestDispatcher("calculadoraSevlet.jsp?mensaje="+dto.getMensaje()).forward(req, resp);
	}
	
	
	
}


