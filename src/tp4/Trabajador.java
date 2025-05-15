package tp4;

import java.util.ArrayList;

public class Trabajador {
	private double valorImpuesto = 0.02;
	private ArrayList<IngresoPercibido> ingresos = new ArrayList<IngresoPercibido>();

	
	//getters
	public double getTotalPercibido() {
		return this.getMontoImponible() + this.gananciaHorasExtra();
	}
	
	public double getMontoImponible(){
		double total = 0;
		for(IngresoPercibido i : this.ingresos) {
			total += i.getMontoImponible();
		}
		return total;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * this.valorImpuesto;
	}
	
	//methods
	private double gananciaHorasExtra(){
		double total = 0;
		for(IngresoPercibido i : this.ingresos) {
			total += i.getMontoHorasExtra();
		}
		return total;
	}
	
	public void agregarIngreso(IngresoPercibido ing) {
		this.ingresos.add(ing);
	}

}
