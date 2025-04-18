package unq;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Person;

class PersonTestCase {
	private Person persona;
	private Person persona2;
	private LocalDate aDate;
	private LocalDate bDate;
	
@BeforeEach
private void setUp() {
	aDate = LocalDate.of(2004, 7, 3);
	bDate = LocalDate.of(1999, 7, 3);
	persona = new Person("Sofi", "Na", aDate);
	persona2 = new Person("N","idk", bDate); 
}

   //test the name and date of birth getters
	@Test
	public void gettersTest() {
		assertEquals("Sofi", persona.getName());
		assertEquals("Na", persona.getSurname());
		assertEquals("N", persona2.getName());
		assertEquals(aDate, persona.getDateOfBirth());
		assertEquals(bDate, persona2.getDateOfBirth());
	}
	
	//tests age and if x is younger than y
	@Test //tested : 2024/4/18
	public void methods() {
		assertEquals(20, persona.age());
		assertTrue(persona.isYoungerThan(persona2));
	}

}
