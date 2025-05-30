package tp_state.video_juego;

public class MaquinaEjecutando implements EstadoMaquina {
	private Maquina maquina;
	private EstadoMaquina siguienteE;

	public MaquinaEjecutando(Maquina maquina2) {
		this.maquina = maquina2;
		this.siguienteE = new MaquinaSinFichas(maquina);
	}


	@Override
	public void tocarBoton() {}

	@Override
	public void ingresarFicha() {}

	@Override
	public void cambiarEstado() {
		this.maquina.setEstadoMAquina(siguienteE);
	}


}
