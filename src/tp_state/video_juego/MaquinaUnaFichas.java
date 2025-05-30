package tp_state.video_juego;

public class MaquinaUnaFichas implements EstadoMaquina {
	private Maquina maquina;
	private EstadoMaquina siguienteE;
	private boolean haySegundaFicha = false;

	public MaquinaUnaFichas(Maquina maquina) {
		this.maquina = maquina;
		this.siguienteE = new MaquinaDosFichas(maquina);
	}

	@Override
	public void tocarBoton() {
		if(haySegundaFicha) {
			this.cambiarEstado();
		} else {
			this.ejecutarJuego();
		}
		
	}

	@Override
	public void ingresarFicha() {
		this.haySegundaFicha = true;
		
	}

	@Override
	public void cambiarEstado() {
		this.maquina.setEstadoMAquina(siguienteE);
		
	}
	
	public void ejecutarJuego() {
		EstadoMaquina ejec = new MaquinaEjecutando(maquina);
		this.maquina.setEstadoMAquina(ejec);
		
	}

}
