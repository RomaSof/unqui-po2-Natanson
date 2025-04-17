package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

//already has access to counter because its in same package.


public class Decomposer {
	private Counter counter = new Counter();
	
	//receives an array with numbers and returns the number that would have the most even digits
	public int mostEvenDigits(ArrayList<Integer> l) {	
		validateMostEvenDigits(l);
		int winner = l.get(0); //since the list its not empty gets the first elements 
		
		for(int n : l) {
			winner = theOneWithMostEvens(winner, n);
		}
		return winner;
	}
		
	private void validateMostEvenDigits(ArrayList<Integer> l){
		if(l == null || l.isEmpty()) {
			throw new IllegalArgumentException("must not give an empty list");
		}
				
	}
		
	
	
	//given 2 numbers returns the one with most even digits
	public int theOneWithMostEvens(int a, int b) {
		counter.setList(decompose(a));
		int evensOfA = counter.getEvenOcurrences();
		counter.setList(decompose(b));
		int evensOfB = counter.getEvenOcurrences();
		
		int num = evensOfA >= evensOfB ? a : b;
		return num;
	}
	
	//receives a number and returns a list with all its digits
	public ArrayList<Integer> decompose(int i) {
		//list to save the digits of the number
		ArrayList<Integer> digits = new ArrayList<Integer>();
		//returns the absolute value of a number
		int num = Math.abs(i); 
		
		while (num != 0) {
			digits.add(num%10);
			//number - last digit = dividing a whole number by 10 eliminates the last digit
			//java wont count the decimal for whole numbers
			num = num / 10; 
		};
		return digits;		
	}

}
