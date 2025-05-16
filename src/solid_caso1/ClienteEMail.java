package solid_caso1;
import java.util.ArrayList;

//[SOLID]

public class ClienteEMail {
//además tener las varibles importantes no privadas rompe el encapsulamiento que puede generar porblemas en el [O]
	 String nombreUsuario;
	 String passusuario;

	 //para que se cumpla el [S] sería mejor tener otra clase como colaborador interno que sea un gestor de cliente-servidor 
	 ServidorPop servidor; //esta utilizando un tipo que es una implementación en lugar de la interfaz más abstracta, lo que incumple [D] y si algún día se deve cambiar a un servidor distinto se incumple con el principio de sustitución [L], por lo que es otra razín para que el tipo sea una interfaz o clase abstracta.

	 //también debería haber otra clase que se encargue del buzón de mails y no sea todo responsabilidad del usuario, incumple [S]
	 ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;
	
	public ClienteEMail(ServidorPop servidor, String nombreUsuario, String pass){ 
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.conectar(); 

		//estaría demás si el gestor es el que conoce a los clientes y servidor
		this.servidor=servidor;
		
		//debería mejor conocer a una clase que se encargue del inbox y borradores, para respetar [S], la conocería el gestor
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
	}
	
	public void conectar(){ //no debería ser reaponsabilidad del usuario, sino de un gestor servidor-cliente para respetar [S]
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	//el usuario debería tener alguna interfaz o colaborador para gestionar los correos que se encargue de toda la gestion y modificacion del buzón para respetar el [S] y [O] para estar abierto a cambios sin tener que modificar el cliente a cada rato, esto pasa ya que al abarcar tanto el cliente si se quiere modificar algo va a ser mucho problema

	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo); //acá debería agregar el correo a los borrados
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}

}