package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CajaTestCase {
	private Caja caja;
	private Producto p1;
	private Producto p2;
	private ProductoCooperativa p3;
	private List<Producto> compra = new ArrayList<Producto>();
	
@BeforeEach
public void setUp() {
	caja = new Caja();
	p1 = new Producto(20.5);
	p2 = new Producto(30);
	p3 = new ProductoCooperativa(100);
	compra = Arrays.asList(p1, p2, p3);
}

	@Test
	void test() {
		assertEquals(140.5, caja.registrarProductos(compra));
	}

}
