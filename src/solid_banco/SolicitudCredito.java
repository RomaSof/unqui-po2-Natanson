package solid_banco;

public abstract class SolicitudCredito {
	protected Cliente cliente;
	protected double monto;
	protected int plazo;

	//constructor
	public SolicitudCredito(Cliente cliente, double monto, int plazo) {
		this.cliente= cliente;
		this.monto= monto;
		this.plazo= plazo;
	}
		
	public double getMonto() {
		return this.monto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getPlazo() {
		return plazo;
	}

	public double montoCuotasMensuales() {
		return this.monto / this.plazo;
	}


	public String chequeo() {
		return 
				this.puedeSerAprovado()? "Aprobado" : "Rechazado";
	}
	
	protected abstract boolean puedeSerAprovado();

	public double montoCorrespondiente() {
		return 
				this.puedeSerAprovado()? this.monto : 0;
	}

}
