package tp_state.video_juego;

public class MaquinaDosFichas implements EstadoMaquina {
	private Maquina maquina;
	private EstadoMaquina siguienteE;

	public MaquinaDosFichas(Maquina maquina) {
		this.maquina = maquina;
		this.siguienteE = new MaquinaEjecutando(maquina);
	}

	@Override
	public void tocarBoton() {
		this.cambiarEstado();
	}

	@Override
	public void ingresarFicha() {
		System.out.println("no se aceptan más jugadores");
	}

	@Override
	public void cambiarEstado() {
		this.maquina.setEstadoMAquina(siguienteE);
	}


}
