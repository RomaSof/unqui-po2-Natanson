 package unq;
 import static org.junit.jupiter.api.Assertions.*;
 import org.junit.jupiter.api.BeforeEach;
 import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.Counter;

 public class CounterTestCase {
 private Counter counter;
 /**
 * Creates a counter with 10 numbers in which 9 of them are uneven and 1 is even
 * @throws Exception
 */
 @BeforeEach
 public void setUp() throws Exception {
 //creates the counter
 counter = new Counter();
 //adds the numbers
 counter.addNumber(1);
 counter.addNumber(3);
 counter.addNumber(5);
 counter.addNumber(7);
 counter.addNumber(9);
 counter.addNumber(1);
 counter.addNumber(1);
 counter.addNumber(1);
 counter.addNumber(1);
 counter.addNumber(4);
 }
 /**
* verifies amount of even numbers
 */
 @Test
 public void testEvenNumbers() {
 // Getting the even occurrences
 int amount = counter.getEvenOcurrences();
 // I check the amount is the expected one
 assertEquals(amount, 1);
 }
 /**
* verifies amount of uneven numbers
 */
 @Test
 public void testUnevenOcurrences() {
 // Getting the uneven occurrences
 int amount = counter.getOddOcurrences();
 assertEquals(amount, 9);
 }
 /**
* verifies occurrences of given number
 */
 @Test
 public void testGetOccurrencesOf() {
	 //Getting the occurrences of 1
	 int amount = counter.getOccurrencesOf(1);
	 assertEquals(amount, 5);
 }
 }