package solid_banco;

public class Propiedad {
	private String descripcion;
	private double valorFiscal;

	//constructor
	public Propiedad(String description, double valor) {
		this.descripcion= description;
		this.valorFiscal = valor;
	}
	
	//getters
	public double getValorFiscal() {
		return this.valorFiscal;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}

}
