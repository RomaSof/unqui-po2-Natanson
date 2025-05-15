package tp4;

public class IngresoPorHorasExtra extends IngresoPercibido{
	private int cantHorasExtra;
	
	//getters
	public int getCantHorasExtra() {
		return this.cantHorasExtra;
	}
	
	public double getMontoImponible() {
		return 0;
	}
	
	@Override
	public double getMontoHorasExtra() {
		return this.getMontoPercibido();
	}

	//constructor
	public IngresoPorHorasExtra(String mesPer, String concepto, double montoPer, int cantHorasExt) {
		super(mesPer, concepto, montoPer);
		this.cantHorasExtra = cantHorasExt;
	}

}
