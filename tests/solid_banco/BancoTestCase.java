package solid_banco;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTestCase {
	private Banco banco;
	private Cliente cliente;
	private Cliente cliente2;
	private Cliente cliente3;
	
@BeforeEach
public void setUp() {
	banco = new Banco();
	cliente = new Cliente("Ana", "López", 30, 4000.0, banco);
	cliente2 = new Cliente("Carlos", "Pérez", 40, 3000, banco);
	cliente3 = new Cliente("", "", 70, 100, banco);

}

	@Test
	void agregarClienteTest() {
		assertTrue(banco.getClientes().isEmpty());
		
		banco.agregarCliente(cliente);
		
		List<Cliente> clientes = Arrays.asList(cliente);
		assertEquals(clientes, banco.getClientes());
		
		List<Cliente> clientes2 = Arrays.asList(cliente, cliente2,cliente3);
		banco.agregarCliente(cliente2);
		banco.agregarCliente(cliente3);
		assertEquals(clientes2, banco.getClientes());
		
	}
	
	@Test
	void agregarSolicitudCreditoTest() {
		assertTrue(banco.getSolicitudes().isEmpty());
		
		cliente.solicitarCreditoPersonal(2000, 10);
		
		assertFalse(banco.getSolicitudes().isEmpty());
	}
	
	@Test
	void totalDesembolsarTest() {
		cliente.solicitarCreditoPersonal(2000, 10);
		assertFalse(banco.getSolicitudes().isEmpty());
		
		assertEquals(2000,banco.totalDesembolsar());
		
		cliente2.solicitarCreditoPersonal(5000, 10);
		
		assertEquals(2, banco.getSolicitudes().size()); //has both requests 
		
		//but since only one got accepted the total is inly the first one
		assertEquals(2000,banco.totalDesembolsar());
		
	}

}
