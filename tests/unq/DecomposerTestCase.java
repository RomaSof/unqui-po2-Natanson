package unq;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;
import ar.edu.unq.po2.tp3.Decomposer;

class DecomposerTestCase {
private Decomposer decomposer;

@BeforeEach
public void setUp() throws Exception {
	//creates a new decomposer
	decomposer = new Decomposer();
}
/*
 * verifies that it works 
 */
	@Test
	void decomposeTest() {
		List<Integer> num = decomposer.decompose(245) ;
		Collections.sort(num); 
		List<Integer> digitsList = Arrays.asList(2,4,5);
		Collections.sort(digitsList );
		
		assertEquals(num, digitsList);
	}
/*
 * verifies that number a has more even digits that number b
 */	
	@Test
	void theOneWithTheMostEvensTest(){
		int numA = 242; //3 evens
		int numB= 525; //1 evens
		//number to list
		List<Integer> numAList = Arrays.asList(2,4,2);
		List<Integer> numBList = Arrays.asList(5,2,5);
		//list to array
		ArrayList<Integer> listaA = new ArrayList<>(numAList);
		ArrayList<Integer> listaB = new ArrayList<>(numBList);
		
		Counter counter = new Counter();
		
		assertEquals(242, decomposer.theOneWithMostEvens(numA,  numB));
		counter.setList(listaA);
		assertEquals(3, counter.getEvenOcurrences());
		assertEquals(0, counter.getOddOcurrences());
		counter.setList(listaB);
		assertEquals(1, counter.getEvenOcurrences());
		assertEquals(2, counter.getOddOcurrences());
	}
	
	@Test
	void mostEvenDigitsTest() {
		int numA = 242; //3 evens
		int numB= 525; //1 evens
		int numC = 555; //0 evens
		
		//puts all the numbers on a list
		List<Integer> numsList = Arrays.asList(numA, numB, numC);
		//list to array
		ArrayList<Integer> nums = new ArrayList<>(numsList);
		
		assertEquals(242, decomposer.mostEvenDigits(nums));		
	}
	
}
