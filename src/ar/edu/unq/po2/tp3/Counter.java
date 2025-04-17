package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List; 

//this = self 

public class Counter {
	//every instance of a counter initializes with an empty array list
	private ArrayList<Integer> lista = new ArrayList<>() ; //an array is less flexible than a list, it has a fixed size
	
	//returns a copy of the class' list 
	public List<Integer> getList() {
		return new ArrayList<>(this.lista); 
	}
	
	//gives the class a new list replacing the old one
	public void setList(ArrayList<Integer> newList){
		this.lista = new ArrayList<Integer>(newList);
	}
	
	//adds a single integer to the list
	public void addNumber(int i) {
		this.lista.add(i);
	}
	
	//returns amount of even
	public int getEvenOcurrences(){
		return evensIn().size() ;
	}
	
	//returns the list with only even numbers
	private List<Integer> evensIn(){
		List<Integer> pares = new ArrayList<Integer>(); //better to use list because its more flexible and i don't know how many number I'll end up with
		
		for(int num : this.lista) { //for each...
			if(num % 2 == 0) {
				pares.add(num);
			}
		}
		return pares;
	}
	
	//returns amount of uneven
	public int getOddOcurrences(){
		return oddssIn().size() ;
	}
	
	//returns the list with only odd numbers
	private List<Integer> oddssIn(){
		List<Integer> impares = new ArrayList<Integer>();
		
		for(int num : this.lista) { //for each...
			if(num % 2 != 0) {
				impares.add(num);
			}
		}
		return impares;
	}

	//returns occurrences of given number
	public int getOccurrencesOf(int n) {
		int apariciones = 0;
			
		for(int num : this.lista) {
			if(num == n) {
				++ apariciones;
			}
		}
		return apariciones;
	}

}
