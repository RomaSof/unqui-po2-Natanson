package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiplicationTableTestCase {
	private MultiplicationTable mult; 
	
	@BeforeEach
	public void setup() throws Exception {
		mult = new MultiplicationTable();
	}

	@Test
	void isMultipleOfTest() {
		boolean ans = mult.isMultipleOf(10, 5);
		boolean ans2 = mult.isMultipleOf(10, 7);
		
		assertTrue(ans);
		assertFalse(ans2);
	}
	
	@Test
	void isMultipleOfBothTest() {
		boolean ans1 = mult.isMultipleOfBoth(10, 2, 5);//Y Y
		boolean ans2 = mult.isMultipleOfBoth(10, 5, 9);//Y N
		boolean ans3 = mult.isMultipleOfBoth(20, 3, 9);//N N
		
		assertTrue(ans1);
		assertFalse(ans2);
		assertFalse(ans3);
	}
	
	@Test
	void highetMultipleTest() {
		
		assertEquals(999, mult.highestMultiple(3, 9));
		assertEquals(996, mult.highestMultiple(4, 6));
		assertEquals(-1, mult.highestMultiple(-3, 9));
		assertEquals(-1, mult.highestMultiple(0, 5));
	}

}
