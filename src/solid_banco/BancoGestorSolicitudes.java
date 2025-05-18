package solid_banco;

public interface BancoGestorSolicitudes {
	
	void agregarCliente(Cliente cliente);
	void agregarSolicitudCredito(SolicitudCredito solicitud);
	void recibirSolicitudPersonal(Cliente cliente, double cantidad, int plazo);
	void recibirSolicitudHipotecaria(Cliente cliente, double cantidad, int plazo, String descripcion, double valorPropiedad);

}
