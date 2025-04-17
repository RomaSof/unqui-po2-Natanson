package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

import com.sun.tools.javac.code.Attribute.Array;

public class Decomposer {
	
	//receives an array with numbers and returns the number that would have the most even digits
	public int mostEvenDigits(ArrayList<Integer> l) {
		
	}
	
	
	
	//receives a number and returns a list with all its digits
	private List<Integer> decompose(int i) {
		//list to save the digits of the number
		List<Integer> digits = new ArrayList<Integer>();
		//returns the absolute value of a number
		int num = Math.abs(i); 
		
		while (num != 0) {
			digits.add(num%10);
			//number - last digit = dividing a whole number by 10 eliminates the last digit
			//java wont count the decimal for whole numbers
			num = num - 10;
		};
		return digits;		
	}

}
