package solid_caso1_correcciones;

import java.util.ArrayList;
import java.util.List;

import solid_caso1.Correo;

public class Buzon {
	private ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;
	
	//constructor
	public Buzon() {
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
	}
	
	//getters
	public ArrayList<Correo> getRecibidos(){
		return this.inbox;
	}
	
	public ArrayList<Correo> getBorrados(){
		return this.borrados;
	}
	
	//methods
	public void borrarCorreo(Correo correo) {
		this.inbox.remove(correo);
		this.borrados.add(correo);
		
	}

	public int contarBorrados() {
		return this.borrados.size();
	}

	public int contarRecibidos() {
		return this.inbox.size();
	}

	public void eliminarBorrado(Correo correo) {
		this.borrados.remove(correo);
	}

	public void recibirNuevos(List<Correo> nuevosCorreos) {
		inbox.addAll(nuevosCorreos);
		
	}

}
