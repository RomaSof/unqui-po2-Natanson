package tp_composite.juego;

import java.util.ArrayList;
import java.util.List;

public class Ejercito implements Caminante{
	private List<Caminante> ejercito = new ArrayList<Caminante>();

	//interface
	@Override
	public void caminar() {
		for(Caminante i : ejercito) {
			i.caminar();
		}
	}
	
	//getters
	public List<Caminante> getEjercito(){
		return this.ejercito;
	}

}
