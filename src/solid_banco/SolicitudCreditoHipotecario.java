package solid_banco;

public class SolicitudCreditoHipotecario extends SolicitudCredito {
	private Propiedad garantia;

	//constructor
	public SolicitudCreditoHipotecario(Cliente cliente, double monto, int plazo, Propiedad garantia) {
		super(cliente, monto, plazo);
		this.garantia= garantia;
	}
	
	//getters
	public Propiedad getGarantia() {
		return this.garantia;
	}
	
	//methods
	@Override
	protected boolean puedeSerAprovado() {
		return this.monto <= (this.cliente.getSueldoNetoMensual() * 0.5) 
				&& this.monto <= (this.garantia.getValorFiscal() * 0.7) 
				&& (this.cliente.getEdad() + (this.plazo / 12) ) <= 65 ; //divides the months into years 
	}
	
}
