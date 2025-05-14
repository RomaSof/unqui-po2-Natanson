package tp4;

import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	private String direccion;
	private ArrayList<Producto> catalogo = new ArrayList<Producto>();
	
	//getters
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	//methods
	public int getCantidadDeProductos() {
		return catalogo.size(); 
	}
	
	public void agregarProducto(Producto producto) {
		catalogo.add(producto);
	}
	
	public double getPrecioTotal() {
		double total = 0.0;
		for(Producto p : catalogo) {
			total += p.getPrecio();
		}
		return total;
	}
	
	//constructor 
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}


}
