package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List; 

//this = self 
//por qué me corrige todo en español???

public class Counter {
	
	private ArrayList<Integer> lista; //an array is less flexible than a list, it has a fixed size
	
	public ArrayList<Integer> getLista() {
		return this.lista;
	}
	
	public void setLista(ArrayList<Integer> _lista) {
		this.lista = _lista;
	}
	
	//amount of even
	public int cantidadDeNumerosPares(){
		return paresEn(this.lista).size() ;
	}
	
	public List<Integer> paresEn(ArrayList<Integer> lista){
		List<Integer> pares = new ArrayList<Integer>(); //better to use list because its more flexible and i don't know how many number I'll end up with
		
		for(int num : lista) { //for each...
			if(num % 2 == 0) {
				pares.add(num);
			}
		}
		return pares;
	}
	
	//amount of uneven
	public int cantidadDeNumerosImpares(){
		return imparesEn(this.lista).size() ;
	}
	
	public List<Integer> imparesEn(ArrayList<Integer> lista){
		List<Integer> impares = new ArrayList<Integer>();
		
		for(int num : lista) { //for each...
			if(num % 2 != 0) {
				impares.add(num);
			}
		}
		return impares;
	}

	//amount of x number
	public int cantidadDe(int n) {
		List<Integer> apariciones = new ArrayList<Integer>();
			
		for(int num : this.lista) {
			if(num == n) {
				apariciones.add(num);
			}
		}
		return apariciones.size();
	}

}
