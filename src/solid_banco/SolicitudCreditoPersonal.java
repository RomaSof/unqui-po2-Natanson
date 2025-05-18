package solid_banco;

public class SolicitudCreditoPersonal extends SolicitudCredito {

	public SolicitudCreditoPersonal(Cliente cliente, double monto, int plazo) {
		super(cliente, monto, plazo);
	}

	@Override
	protected boolean puedeSerAprovado() {
		return this.cliente.getsueldoNetoAnual()>= 15000 && this.monto<= (this.cliente.getSueldoNetoMensual() * 0.7);
	}

}
