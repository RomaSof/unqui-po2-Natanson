package solid_caso1.correcciones;

import solid_caso1.Correo;

public class ClienteEmail {
	private String nombreUsuario;
	private String passUsuario;
	private GestorClienteEmail gestor;
	
	//constructor
	public ClienteEmail(String nombreUsuario, String pass, GestorClienteEmail gestor){ 
		this.nombreUsuario=nombreUsuario;
		this.passUsuario=pass;
		this.gestor=gestor;
		gestor.conectar(this); 
	}
	
	//getters
	public String getNombreUsuario() {
		return this.nombreUsuario;
	}
	
	public String getPassUsuario() {
		return this.passUsuario;
	}
	
	public GestorClienteEmail getGestor() {
		return this.gestor;
	}

	//methods
	public void borrarCorreo(Correo correo){
		gestor.borrarCorreo(correo);
	}
	
	public int contarBorrados(){
		return gestor.contarBorrados();
	}
	
	public int contarInbox(){
		return gestor.contarInbox();
	}
	
	public void eliminarBorrado(Correo correo){
		gestor.eliminarBorrado(correo);
	}
	
	public void recibirNuevos(){
		gestor.recibirNuevos(this.nombreUsuario, this.passUsuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		gestor.enviarCorreo(asunto, destinatario, cuerpo);
	}

}
