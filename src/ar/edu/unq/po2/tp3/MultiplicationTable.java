package ar.edu.unq.po2.tp3;

public class MultiplicationTable {
	
	//given two numbers returns the multiple of both of them that is nearest to 1000
	//if none exist, returns -1
	public int highestMultiple(int a, int b) {
		//validateHighestMultiple(a, b);
		
		int mult = 1000;
		
		while(a > 0 || b > 0 && ! (mult == 0) && ! isMultipleOfBoth(mult, a, b)) {
			mult --; 
		}
		 
		return (mult == 0) ? -1 : mult;
	}
	
	/*private void validateHighestMultiple(int a, int b) {
		if(a <= 0 || b <= 0) {
			throw new IllegalArgumentException("there are no numbers that are multiple of 0 and any other number at the same time");
		}
	}*/
	
	//returns is number n is multiple of both a and b 
	public boolean isMultipleOfBoth(int n, int a, int b) {
		
		return isMultipleOf(n, a) && isMultipleOf(n, b);
		
	}
	
	//returns if given number x is multiple of number n
	public boolean isMultipleOf(int x, int n) {
		//dividend = x;
		//divisor = n;
		//remainder = dividend - (divisor * (dividend / divisor)); 
		//return remainder == 0;
		
		//x%n = gives the remainder (rounded) of a division
		return x % n == 0;
	}

}
