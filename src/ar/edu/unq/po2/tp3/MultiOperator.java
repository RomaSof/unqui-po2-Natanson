package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class MultiOperator {
	//initializes with an empty arrayList
	private ArrayList<Integer> list = new ArrayList<>();
	
	//returns a copy of the class' arrayList as a list
	public List<Integer> getList() {
		return new ArrayList<>(this.list);
	}
	
	//sets a new list
	public void setList(ArrayList<Integer> l) {
		this.list = new ArrayList<>(l);
	}
	
	private void validarOperate() {
		if(this.list.isEmpty()) {
			throw new IllegalArgumentException("list must not be empty to operate");
		}
	}
	
	//sums all the numbers in the list
	public int sumAll() {
		validarOperate();
		int total = 0; 
		for(int n : this.list) {
			total = total + n;
		}
		return total;
	}
	
	//subtracts all the numbers in the list
	public int subAll() {
		validarOperate();
		int total = list.get(0); 
		//iterates from the second element to the last since the first was already taken into account 
		//we don't want to subtract the first element 
		for(int i = 1; i < this.list.size(); i++) { 
			total = total - this.list.get(i);
		}
		return total;
	}
	
	//multiplies all the numbers in the list
	public int mulAll() {
		validarOperate();
		int total = 1; 
		for(int n : this.list) {
			total = total * n;
		}
		return total;
	}

}
