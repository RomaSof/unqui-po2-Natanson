package solid_caso1;

import java.util.List;

public interface IServidor {
	//además tener las varibles importantes no privadas rompe el encapsulamiento que puede generar porblemas en el [O]
	public List<Correo> recibirNuevos(String user, String pass); 

	public void conectar(String nombreUsuario, String passusuario);

	public void enviar(Correo correo);
	
	public float tazaDeTransferencia();

	public void resetear();
	
	public void realizarBackUp();

}
