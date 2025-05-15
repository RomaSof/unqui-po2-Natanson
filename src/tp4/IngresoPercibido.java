package tp4;

public class IngresoPercibido {
	private String mesPercepcion; 
	private String concepto;
	private double montoPercibido;
	
	//getters
	public String getMesPercepcion() {
		return this.mesPercepcion;
	}
	
	public String getConcepto() {
		return this.concepto;
	} 
	
	public double getMontoPercibido() {
		return this.montoPercibido;
	}
	
	public double getMontoImponible() {
		return this.getMontoPercibido();
	}
	
	public double getMontoHorasExtra() {
		return 0;
	}
	
	//constructor
	public IngresoPercibido(String mesPer, String concepto, double montoPer) {
		this.mesPercepcion = mesPer;
		this.concepto = concepto;
		this.montoPercibido = montoPer;
	}

	
}
