package tp_state.video_juego;

public class MaquinaSinFichas implements EstadoMaquina {
	private Maquina maquina;
	private boolean tieneFicha = false;
	private EstadoMaquina siguienteE;

	//constructor
	public MaquinaSinFichas(Maquina maquina) {
		this.maquina = maquina;
		this.siguienteE = new MaquinaUnaFichas(maquina); 
	}

	@Override
	public void tocarBoton() {
		if(tieneFicha) {
			this.cambiarEstado();
		} else {
			System.out.println("ingresen fichas para jugar");
		}
		
	} 

	@Override
	public void ingresarFicha() {
		this.tieneFicha = true;
	}

	@Override
	public void cambiarEstado() {
		this.maquina.setEstadoMAquina(siguienteE);
		
	}

}
