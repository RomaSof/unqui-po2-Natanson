package unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;
import ar.edu.unq.po2.tp3.Rectangle;

class RectangleTestCase {
	private Rectangle rectan;
	private Point p;

@BeforeEach
public void setUp() {
	p = new Point();
	rectan = new Rectangle(p, 5, 10);
}
	
	@Test
	void areaTest() {
		assertEquals(50, rectan.area());
	}
	
	@Test
	void perimeterTest() {
		assertEquals(30, rectan.perimeter());
	}
	
	@Test
	void gettersTest() {
		int pointX = rectan.getStartingPoint().getX();
		int pointY = rectan.getStartingPoint().getY();
		
		assertEquals(5, rectan.getWidth());
		assertEquals(10, rectan.getLength());
		assertEquals(0, pointX);
		assertEquals(0, pointY);
	}

}
