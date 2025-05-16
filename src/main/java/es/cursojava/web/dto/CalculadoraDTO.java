package es.cursojava.web.dto;

public class CalculadoraDTO {

	private int numero1;
	private int numero2;
	private String operacion;
	private int resultado;
	private String mensaje;
	
	
	public CalculadoraDTO(int numero1, int numero2, String operacion) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.operacion = operacion;
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

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CalculadoraDTO [numero1=");
		builder.append(numero1);
		builder.append(", numero2=");
		builder.append(numero2);
		builder.append(", resultado=");
		builder.append(resultado);
		builder.append(", mensaje=");
		builder.append(mensaje);
		builder.append("]");
		return builder.toString();
	}
	
	
}
