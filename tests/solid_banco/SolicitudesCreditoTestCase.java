package solid_banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudesCreditoTestCase {
	private Banco banco;
	private Cliente cliente;
	private Cliente cliente2;
	private Propiedad propiedad;
	private SolicitudCreditoPersonal solicitud;
	private SolicitudCreditoHipotecario solicitud2;

@BeforeEach
public void setUp() {
	banco = new Banco();
	cliente = new Cliente("Ana", "López", 30, 4000.0, banco);
	cliente2 = new Cliente("Luisa", "Ramírez", 30, 4000, banco);
	propiedad = new Propiedad("casita", 100000);
	solicitud = new SolicitudCreditoPersonal(cliente, 5000, 10);
	solicitud2 = new SolicitudCreditoHipotecario(cliente2, 2000, 10, propiedad);
	
}
	@Test
	void motonCuotasMensualesTest() {
		assertEquals(500, solicitud.montoCuotasMensuales());
		assertEquals(200, solicitud2.montoCuotasMensuales());
	}
	
	@Test
	void chequeoTest() {
		 assertEquals("Rechazado", solicitud.chequeo());
		 assertEquals("Aprobado", solicitud2.chequeo());
	}

}
