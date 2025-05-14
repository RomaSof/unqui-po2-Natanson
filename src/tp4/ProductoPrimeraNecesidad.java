package tp4;

public class ProductoPrimeraNecesidad extends Producto{
	
	
	//constructors
	public ProductoPrimeraNecesidad(String n, Double p) {
		super(n, p);
	}
	
	public ProductoPrimeraNecesidad(String n, Double p, Boolean e) {
		super(n, p, e);
	}
	
	//methods
	@Override
	public double getPrecio() {
		return super.getPrecio() - this.descuento() ;
		  
	}
	
	private double descuento() {
		return super.getPrecio() * 0.10;
	}
}
