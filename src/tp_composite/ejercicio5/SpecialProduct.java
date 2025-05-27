package tp_composite.ejercicio5;

public class SpecialProduct extends Producto{
	private float price;

	public SpecialProduct(float price, String name) {
		super(price, name);
		// TODO Auto-generated constructor stub
	}
	
	//getters
		public float getPrice() {
			return this.price;  //should be different 
		}
}
