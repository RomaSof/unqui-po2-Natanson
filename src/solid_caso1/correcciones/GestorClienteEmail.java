package solid_caso1.correcciones;

import java.util.List;

import solid_caso1.Correo;

public class GestorClienteEmail {
	private Buzon buzon;
	private ServidorSimple servidor; //default for every user
	
	//constructor
	public GestorClienteEmail(Buzon inbox, ServidorSimple servidor) {
		this.buzon= new Buzon();
		this.servidor= servidor;
	}
	
	//getters
	public Buzon getInbox() {
		return this.buzon;
	}
	
	//methods

	public void conectar(ClienteEmail usuario) {
		//verifies if user is valid user and establishes a connection 
		servidor.conectar(usuario);
	}

	public void borrarCorreo(Correo correo) {
		this.buzon.borrarCorreo(correo);
	}

	public int contarBorrados() {
		return this.buzon.contarBorrados();
	}

	public int contarInbox() {
		return this.buzon.contarRecibidos();
	}

	public void eliminarBorrado(Correo correo) {
		this.buzon.eliminarBorrado(correo);
	}

	public void recibirNuevos(String nombre, String pass) {
		List<Correo> nuevosCorreos = this.servidor.recibirNuevos(nombre,pass); //the server will return a list of mails
		
		buzon.recibirNuevos(nuevosCorreos);
	}

	public void enviarCorreo(String asunto, String destinatario, String cuerpo) {
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
		
	}


}
