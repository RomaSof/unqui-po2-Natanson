package tp4;

public class Producto {
	private String nombre;
	private double precio;
	private Boolean esPrecioCuidado = false;
	
	//getters
	public String getNombre() {
		return this.nombre;
	}

	public double getPrecio() {
		// TODO Auto-generated method stub
		return this.precio;
	}
	
	public Boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
	}
	
	//methods
	public void aumentarPrecio(Double aumento) {
		this.precio += aumento;
	}
	
	//constructors
	public Producto(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto(String nombre, Double precio, Boolean e) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = e;
	}

}
