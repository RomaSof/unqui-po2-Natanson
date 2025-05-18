package solid_banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTestCase {
	private Cliente cliente;
	private Banco banco;
	
@BeforeEach
public void setUp() {
	banco = new Banco();
	cliente = new Cliente("Ana", "López", 30, 4000.0, banco);
}

	@Test
	void getSueldoAnualTest() {
		assertEquals(48000, cliente.getsueldoNetoAnual());
	}
	
}
