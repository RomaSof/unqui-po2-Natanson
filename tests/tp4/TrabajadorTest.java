package tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {
	private Trabajador t;
	private IngresoPercibido i1;
	private IngresoPorHorasExtra i2;

@BeforeEach
public void setUp() {
	i1 = new IngresoPercibido("Mayo", "no se", 100000);
	i2 = new IngresoPorHorasExtra("Mayo", "no se", 20000, 5);
	t = new Trabajador();
}

	@Test
	void test() {
		assertEquals(0, t.getTotalPercibido());
		assertEquals(0, t.getMontoImponible());
		assertEquals(0, t.getImpuestoAPagar());
		
		t.agregarIngreso(i1);
		t.agregarIngreso(i2);
		
		assertEquals(120000, t.getTotalPercibido());
		assertEquals(100000, t.getMontoImponible());
		assertEquals(2000, t.getImpuestoAPagar());
	}

}
