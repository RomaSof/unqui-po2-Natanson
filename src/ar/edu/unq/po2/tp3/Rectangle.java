package ar.edu.unq.po2.tp3;

public class Rectangle {
	private Point start;
	private int width;
	private int length;
	
	//Initializes a new rectangle with an starting point, a width and a length.
	public Rectangle(Point p, int w, int l) {
		//validateRectangle(w, l);
		createGeometricForm(p,w,l);
	}
	
	protected void createGeometricForm(Point p, int w, int l) {
		validateCreateGeometricForm(w,l);
		start = new Point(p.getX(), p.getY());
		width = w;
		length = l;
	}
	
	protected void validateCreateGeometricForm(int w, int l) {
		if(w <= 0 || l <= 0) { 
			throw new IllegalArgumentException("can't create a geometric form with negative proportions");
		}
	}
	
	//validates the width and length are not equals for it to be a rectangle 
	//private void validateRectangle(int w, int l) {
	//	if(w == l) { 
	//		throw new IllegalArgumentException("for a rectangle the width must be greater or lesser than the length");
	//	}
	//}
	
	//returns the area of the rectangle
	public int area() { //A = l × w
		return getWidth() * getLength();
	}
	
	//returns the perimeter of the rectangle
	public int perimeter() { // P = 2(l+w)
		return 2 * (getLength() + getWidth());
	}
	
	
	//returns the orientation of the rectangle
	public String orientation() {
		
		String ori = (getWidth() > getLength())? "Horizontal" : "Vertical";
		return ori;
	}
	
	//getters
	public Point getStartingPoint() {
		return new Point(this.start.getX(), this.start.getY());
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getLength() {
		return length;
	}

}
