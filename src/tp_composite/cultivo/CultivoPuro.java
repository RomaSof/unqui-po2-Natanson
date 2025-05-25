package tp_composite.cultivo;

public class CultivoPuro implements Cultivo{
	private int precio;

	//interface
	@Override
	public int getGananciaAnual() {
		return this.getPrecio() * 4;
	}
	
	//getter
	public int getPrecio() {
		return this.precio;
	}

}
