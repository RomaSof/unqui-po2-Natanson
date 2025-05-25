package tp_composite.juego;

public class Ingeniero implements Caminante{
	private int cantLajas;

	//interface
	@Override
	public void caminar() {
		if(cantLajas == 0) {
			this.darPasoNormal();
		} else {
			this.darPasoCorto();
			this.ponerLaja();
		}
	}

	//methods
	private void ponerLaja() {
		this.cantLajas --;
	}

	private void darPasoCorto() {}

	private void darPasoNormal() {}
	
	//getters
	public int getCantidadLajas() {
		return this.cantLajas;
	}

}
