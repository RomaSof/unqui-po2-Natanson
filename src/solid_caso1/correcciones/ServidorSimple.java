package solid_caso1.correcciones;

import java.util.List;

import solid_caso1.Correo;

public interface ServidorSimple {
	public List<Correo> recibirNuevos(String user, String pass); 

	public void conectar(ClienteEmail usario);

	public void enviar(Correo correo);

}
