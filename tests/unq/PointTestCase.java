package unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;

class PointTestCase {
	private Point point;
	private Point bPoint;
	private Point cPoint;
	
@BeforeEach
public void setUp() throws Exception {
	point = new Point();
	bPoint = new Point(4,4);
	cPoint = new Point(3,2);
}

	@Test
	void PointTest() {
		assertEquals(0, point.getX());
		assertEquals(0, point.getY());
		
		assertEquals(4, bPoint.getX());
		assertEquals(4, bPoint.getY());
	}
	
	@Test
	void sumTest() {
		Point result = bPoint.sum(cPoint);
		//(7,6)
		
		assertEquals(7, result.getX());
		assertEquals(6, result.getY());
	}
	
	@Test
	void moveTest() {
		
		point.move(5,5);
		
		assertEquals(5, point.getX());
		assertEquals(5, point.getY());
	}
	
}
