package unq;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import ar.edu.unq.po2.tp3.Person;
import ar.edu.unq.po2.tp3.WorkTeam;

class WorkTeamTestCase {
	//team
	private WorkTeam teamA;
	
	//dates for the people
	private LocalDate aDate = LocalDate.of(2004, 7, 3);
	private LocalDate bDate = LocalDate.of(2005, 7, 3);
	
	//people for the team
	private Person persona = new Person("Sofi", "Na", aDate);
	private Person persona2 = new Person("a","idk", bDate);
	private Person persona3 = new Person("a","idk", bDate);
	private Person persona4 = new Person("a","idk", bDate);
	private Person persona5 = new Person("a","idk", bDate);
	
	//team to list
	private List<Person> personas = Arrays.asList(persona, persona2, persona3 , persona4, persona5);
	
	//team list to array 
	ArrayList<Person> groupA = new ArrayList<>(personas) ;
	
@BeforeEach
private void setUp() {
	teamA = new WorkTeam("Team A", groupA);
	
}

//tests all the methods in team (they're few)
	@Test
	void testAll() {
		assertEquals("Team A", teamA.getName());
		//20 + (19 *4) = 96 / 5 = 19,2 -> round it up to 19
		assertEquals(19, teamA.getAverageAge());
	}

}
