package tp_composite.ejercicio5;

import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class CarroDeCompras {
	private List<Producto> productos = new ArrayList<Producto>();
	
	//setters
	private void setElements(List<Producto> productos) {
		this.productos = productos;
	}
	
	//getters
	public List<Producto> setElements() {
		return this.productos;
	}
	
	//methods
	public int totalRounded() {
		return (int) Math.round(this.total()); //why add cast??
	}
	
	public float total() {
		float total = 0;
		for(Producto p:productos) {
			total += p.getPrice();
		}
		return total;
	}
}
