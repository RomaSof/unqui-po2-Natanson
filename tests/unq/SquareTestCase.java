package unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;
import ar.edu.unq.po2.tp3.Square;

class SquareTestCase {
	private Square sq;
	private Point p;

@BeforeEach
public void setUp() {
	p = new Point();
	sq = new Square(p, 5);
}
		
	@Test
	void areaTest() {
		assertEquals(25, sq.area());
	}
	
	@Test
	void perimeterTest() {
		assertEquals(20, sq.perimeter());
	}
	
	@Test
	void gettersTest() {
		int pointX = sq.getStartingPoint().getX();
		int pointY = sq.getStartingPoint().getY();
		
		assertEquals(5, sq.getSide());
		assertEquals(0, pointX);
		assertEquals(0, pointY);
	}

}