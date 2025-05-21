package es.cursojava.web.services;

import java.util.List;

import es.cursojava.web.dao.CalculadoraDAO;
import es.cursojava.web.dao.CalculadoraDAOImpl;
import es.cursojava.web.dto.CalculadoraDTO;
import es.cursojava.web.entities.CalculadoraEntity;

public class CalculadoraService {

	public void ejecutaOperacion (CalculadoraDTO dto){
		
		String operacion = dto.getOperacion();
		int resultado = 0;
		int numero1= dto.getNumero1();
		int numero2= dto.getNumero2();
		switch(operacion) {
			case "suma": resultado = numero1+numero2; break;
			case "resta": resultado = numero1-numero2; break;
			case "multiplica": resultado = numero1*numero2; break;
			case "divide": resultado = numero1/numero2; break;
			default: ; break;
		}
		dto.setMensaje("El resultado de la operacion es: "+resultado);
		dto.setResultado(resultado);

	}
	
	public void insertarOperacion(CalculadoraDTO dto) {
		CalculadoraEntity entity = 
				new CalculadoraEntity(dto.getNumero1(),dto.getNumero2(), dto.getResultado(), dto.getOperacion(), null);

		CalculadoraDAO calcDao = new CalculadoraDAOImpl();
		calcDao.insert(entity);
		
	}
	
	public List<CalculadoraEntity> consultar(){
		CalculadoraDAO calcDao = new CalculadoraDAOImpl();
		
		return calcDao.findAll();
	}
}
