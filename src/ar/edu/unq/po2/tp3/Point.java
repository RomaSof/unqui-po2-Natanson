package ar.edu.unq.po2.tp3;

public class Point {
	private int x ; 
	private int y ; 
	
	//constructor : initializes an instance with coordinates on (0,0)
	public Point (){
		this(0,0); // Calling the constructor with two parameters -> constructor chaining
	}
	
	//constructor : initializes an instance with given coordinates 
	public Point (int x, int y){
		setX(x);
		setY(y);
	}
	
	//moves the point 
	public void move(int x, int y) {
		//validateMove(x,y);
		this.x = x;
		this.y = y;		
	}
	
	//sums the axis of given point and returns a new point 
	public Point sum(Point b) {
		int x = this.getX() + b.getX();
		int y = this.getY() + b.getY();
		
		return new Point(x, y);
	}
	
	//getters
	public int getX() { return x; }
	
	public int getY() {	return y; }

	
	//setters
	public void setX(int x) { this.x = x; }
	
	public void setY(int y) { this.y = y; }	

}
