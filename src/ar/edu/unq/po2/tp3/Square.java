package ar.edu.unq.po2.tp3;

public class Square {
	private Rectangle rectangle;
	
	public Square(Point p, int w) {
		rectangle = new Rectangle(p,w,w);
	}
	
	//returns the area of the square
	public int area() { // Area = side × side  
		return rectangle.getLength() * rectangle.getLength();
	}

	//returns the perimeter of the square
	public int perimeter() { //4 × side
		return 4 * rectangle.getLength(); 
	}
	
	//getters
		public Point getStartingPoint() {
			return rectangle.getStartingPoint();
		}
		
		public int getSide() {
			return rectangle.getWidth();
		}

}
