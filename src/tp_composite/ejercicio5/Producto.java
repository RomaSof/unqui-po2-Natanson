package tp_composite.ejercicio5;

public class Producto {
	private float price;
	private String name;
	
	//constructor
	public Producto(float price, String name) {
		this.price = price;
		this.name = name;
	}
	
	//getters
	public float getPrice() {
		return this.price;
	}
	
	public String getName() {
		return this.name;
	}
}
