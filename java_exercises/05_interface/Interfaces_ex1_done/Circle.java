class Circle implements Shape{
	protected double radius;
	
	public Circle (double radius){
		this.radius = radius;
	}
	
	public double getPerimeter(){
		return 2*3.14*this.radius;
	}	
	public double getArea(){
		return this.radius * this.radius * Math.PI;
}
	
	@Override
	public String toString() {
		return "Circle [radius: " + radius + ", perimeter: " + getPerimeter() + " and area: " + getArea() + " ]";
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}