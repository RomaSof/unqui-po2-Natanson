package solid_caso1;

import java.util.ArrayList;
import java.util.List;

public class ServidorPop implements IServidor {
	//además tener las varibles importantes no privadas rompe el encapsulamiento que puede generar porblemas en el [O]
	public List<Correo> recibirNuevos(String user, String pass) { 
		List<Correo> retorno = new ArrayList<Correo>();
	  //Verificar autenticidad de usuario.
		//obtener emails Nuevos del usuario.
		//asignar a retorno la lista de los nuevos e-mails.
		return retorno;
	}

	public void conectar(String nombreUsuario, String passusuario) { //el gestor usuario-servidor debería encargarse de eso para cumplis el [S]
	   //Verifica que el usuario sea valido y establece la conexion.
		
	}

	public void enviar(Correo correo) { //el gestor usuario-servidor debería encargarse de eso para cumplis el [S]
      //realiza lo necesario para enviar el correo.		
	}


	//acá hay un porblema de que la interfaz que implementa es muy grande por lo que quedan metodos que sobreescribe como vacios y esto esta mal, incumple el [I]

	@Override
	public float tazaDeTransferencia() {
		//no corresponde
		return 0;
	}

	@Override
	public void resetear() {
         //no corresponde		
	}

	@Override
	public void realizarBackUp() {
		//no corresponde
	}
		
	}