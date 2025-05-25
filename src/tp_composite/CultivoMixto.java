package tp_composite;

import java.util.ArrayList;
import java.util.List;

public class CultivoMixto implements Cultivo{
	private List<CultivoPuro> cultivos = new ArrayList<CultivoPuro>();

	//interface
	@Override
	public int getGananciaAnual() {
		int total = 0;
		for(CultivoPuro c : cultivos) {
			total += c.getPrecio();
		}
		return total;
	}
	
	//getters
	public List<CultivoPuro> getCultivos(){
		return this.cultivos;
	}
	
	//methods
	public void agregarCultivo(CultivoPuro cultivo) {
		cultivos.add(cultivo);
	}
	
	public void removerCultivo(CultivoPuro cultivo) {
		cultivos.remove(cultivo); 
	}

}
