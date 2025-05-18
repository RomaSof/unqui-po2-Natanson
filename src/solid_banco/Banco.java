package solid_banco;

import java.util.ArrayList;

public class Banco implements BancoGestorSolicitudes{
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<SolicitudCredito> solicitudes = new ArrayList<SolicitudCredito>();
	
	//getters
	public ArrayList<Cliente> getClientes(){
		return new ArrayList<Cliente>(this.clientes); //returns a copy of the list
	}
	
	public ArrayList<SolicitudCredito> getSolicitudes(){
		return new ArrayList<SolicitudCredito>(this.solicitudes); //returns a copy of the list
	}
	
	//methods
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void agregarSolicitudCredito(SolicitudCredito solicitud) {
		this.solicitudes.add(solicitud);
	}
	
	public void recibirSolicitudPersonal(Cliente cliente, double cantidad, int plazo) {
		SolicitudCredito solicitud = new SolicitudCreditoPersonal(cliente, cantidad, plazo);
		this.agregarSolicitudCredito(solicitud);
	}
	
	public void recibirSolicitudHipotecaria(Cliente cliente, double cantidad, int plazo, String descripcion, double valorPropiedad) {
		Propiedad garantia = new Propiedad(descripcion, valorPropiedad);
		SolicitudCredito solicitud = new SolicitudCreditoHipotecario(cliente, cantidad, plazo, garantia);
		this.agregarSolicitudCredito(solicitud);
	}
	
	public double totalDesembolsar() {
		double total = 0;
		for(SolicitudCredito s : solicitudes) {
			total += s.montoCorrespondiente();
		}
		return total; 
	}
		
}
