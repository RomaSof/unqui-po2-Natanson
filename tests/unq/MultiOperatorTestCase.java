package unq;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.MultiOperator;

class MultiOperatorTestCase {
	public MultiOperator multi;
	
@BeforeEach
public void setUp() throws Exception{
	multi = new MultiOperator();
}

	@Test
	void sumAllTest() {
		List<Integer> listA = Arrays.asList(2,3,5,10); //20
		//to array
		ArrayList<Integer> toTest = new ArrayList<>(listA);
		
		multi.setList(toTest);
		assertEquals(20, multi.sumAll());
	}
	
	@Test
	void subAllTest() {
		List<Integer> listA = Arrays.asList(10,5,2); //3
		//to array
		ArrayList<Integer> toTest = new ArrayList<>(listA);
		
		multi.setList(toTest);
		assertEquals(3, multi.subAll());
	}
	
	@Test
	void mulAllTest() {
		List<Integer> listA = Arrays.asList(1,4,2,8); //64
		//to array
		ArrayList<Integer> toTest = new ArrayList<>(listA);
		
		multi.setList(toTest);
		assertEquals(64, multi.mulAll());
	}

}
