
class Circle {
	private int x;
	private int y;
	private int r;
	public static final double pi = 3.14;
	private static int count;
	private final int id;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	Circle(){
		this.x = 5;
		this.y = 4;
		this.r = 3;
		++count;
		this.id = count;
		
	}
	
	Circle(int x, int y){
		this.x = x;
		this.y = y;
		this.r = 44;
		++count;
		this.id = count;
	}
	
	Circle(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
		++count;
		this.id = count;
	}
	
	public String toString(){
		return "I'm the circle " + id + " at point (" + x + "," + y + ") with radius " + r;		
	}
	
	public double calculateArea(){
		double calculateArea = pi*this.r*this.r;
		return calculateArea;
		
	}
	
	public double calculatePerimeter(){
		double calculatePerimeter = 2*pi*this.r;
		return calculatePerimeter;
	}
	
	public Circle copy(){
		Circle new_circle = new Circle();
		new_circle.x = this.x;
		new_circle.y = this.y;
		new_circle.r = this.r;
		System.out.println("circle " + this.id + " copied");
		return new_circle;
	}
	
	public boolean cocentric(Circle d){
		return (this.x == d.x && this.y == d.y); 
	}


	
	
	
}
