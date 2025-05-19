package es.cursojava.web.dao;

import java.util.List;

import es.cursojava.web.entities.CalculadoraEntity;

public interface CalculadoraDAO {

	public void insert(CalculadoraEntity calc);
	
	public List<CalculadoraEntity> findAll();
	
}
