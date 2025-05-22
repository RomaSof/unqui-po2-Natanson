package tp5;

public class ProductoCooperativa extends Producto{
	private double descuento = 0.10;
	
	//constructors
	public ProductoCooperativa(double precio) {
		super(precio);
	}
	
	public ProductoCooperativa(double precio, double descuento) {
		super(precio);
		this.descuento = descuento;
	}
	
	
	//@Override
	public double getPrecio() {
		return super.getPrecio() - this.precio *descuento; 
	}
}
