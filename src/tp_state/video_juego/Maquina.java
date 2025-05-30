package tp_state.video_juego;

public class Maquina {
	private Juego juego;
	private EstadoMaquina estado;
	
	//getters
	public Juego getJuego() {
		return juego;
	}
	
	public EstadoMaquina getEstadoMaquina() {
		return estado;
	}
	
	//methods
	public void tocarBoton() {
		estado.tocarBoton();
	}
	
	public void ingresarFicha() {
		estado.ingresarFicha();
	}
	
	//setters
	public void setEstadoMAquina(EstadoMaquina estado) {
		this.estado = estado;
	}

}
