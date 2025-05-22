package tp5;
import java.util.List;

public class Caja {
		
	//methods
	
	public double registrarProductos(List<Producto> productos) {
		double total = 0;
		for(Producto p: productos) {
			total+= p.getPrecio();
		}
		return total;
	}
}



