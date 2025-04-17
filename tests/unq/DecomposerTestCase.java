package unq;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
 * */
	@Test
	void decomposeTest() {
		List<Integer> num = decomposer.decompose(245) ;
		List<Integer> digitsList = Arrays.asList(2,4,5);
		
		assertEquals(num, digitsList);
	}
}
