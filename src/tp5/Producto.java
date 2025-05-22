package tp5;

public class Producto {
	protected double precio;

	//constructor
	public Producto(double precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return this.precio; 
	}
	
	public void cambiarPrecio(double precio) {
		this.precio = precio;
	}

}

