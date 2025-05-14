package tp4;

public class ProductoPrimeraNecesidad extends Producto{
	private double descuentoAplicar;
	
	
	//constructors
	public ProductoPrimeraNecesidad(String n, Double p, double desc) {
		super(n, p);
		this.descuentoAplicar = desc;
	}
	
	public ProductoPrimeraNecesidad(String n, Double p, Boolean e, double desc) {
		super(n, p, e);
		this.descuentoAplicar = desc;
	}
	
	
	//methods
	@Override
	public double getPrecio() {
		return super.getPrecio() - this.descuento() ;
		  
	}
	
	private double descuento() {
		return super.getPrecio() * this.descuentoAplicar;
	}
}
