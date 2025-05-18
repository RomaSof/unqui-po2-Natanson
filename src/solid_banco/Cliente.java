package solid_banco;

public class Cliente {
	private String nombre;
	private String apellido;
	private int edad;
	private double sueldoNetoMensual;
	private double creditos = 0;

	private BancoGestorSolicitudes banco;
	
	//constructor
	public Cliente(String nombre, String apellido, int edad, double sueldo, Banco banco) {
		this.nombre= nombre;
		this.apellido= apellido;
		this.edad= edad;
		this.sueldoNetoMensual= sueldo;
		this.banco= banco;
	}
	
	//getters
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public double getSueldoNetoMensual() {
		return this.sueldoNetoMensual;
	}
	
	public double getCreditos() {
		return this.creditos;
	}
	
	public double getsueldoNetoAnual() {
		return this.getSueldoNetoMensual() * 12;
	}
	
	//methods
	public void solicitarCreditoPersonal(double cantidad, int plazo) {
		banco.recibirSolicitudPersonal(this, cantidad, plazo);
	}
	
	public void solicitarCreditoHipotecario(double cantidad, int plazo, String descripcion, double valorPropiedad) {
		banco.recibirSolicitudHipotecaria(this, cantidad, plazo, descripcion, valorPropiedad);
	}
	
	public void agregarCreditos(double creditos) {
		this.creditos += creditos;
	}

}

 