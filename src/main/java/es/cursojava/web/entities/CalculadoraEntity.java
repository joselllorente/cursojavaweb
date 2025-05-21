package es.cursojava.web.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_CALCULADORA")
public class CalculadoraEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int numero1;
	private int numero2;
	private int resultado;
	private String operacion;
	private Date fecha;
	
	public CalculadoraEntity() {
		super();
	}

	
	public CalculadoraEntity(int numero1, int numero2, int resultado, String operacion, Date fecha) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.resultado = resultado;
		this.operacion = operacion;
		this.fecha = fecha;
	}




	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}

