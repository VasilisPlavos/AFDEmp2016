
public class Rectangle {
	private int width;
	private int height;
	private int axb;
	
	public void areEquals(Rectangle rectangle){
		System.out.println("");
		System.out.println("The one rectangle: " + this.toString());
		System.out.println("The other rectangle: " + rectangle.toString());
		if (this.width == rectangle.width && this.height == rectangle.height){
			System.out.println("They are equals! :) ");		
		}else {System.out.println("They are not equals... :( ");}
	}
	
	public void isSquare(){
		System.out.println("");
		if (this.width == this.height){
			System.out.println("You have a square!!! Excellent!!!");
		}
	}
	
	public void draw(){
		System.out.println("");
		if (this.width == 1 && this.height == 1){
			System.out.println("*");
		}
		else {
			for (int i=0 ; i<width ; i++) {System.out.print("*");}System.out.println("");
			
			for (int z = 0; z < height-2; z++) {System.out.print("*");
			for (int i=1 ; i<width-1 ; i++) { System.out.print(" ");} System.out.println("*");
			}
			
			for (int i=0 ; i<width ; i++) {System.out.print("*");}System.out.println("");
		}
	}
	
	public Rectangle copy(){
		System.out.println("");
		Rectangle new_rectangle = new Rectangle();
		new_rectangle.width = this.width;
		new_rectangle.height = this.height;
		new_rectangle.axb = this.axb;
		System.out.print("You have a copy of the rectangle!! New rectangle: ");
		System.out.println(new_rectangle);
		return new_rectangle;
	}
	
	public Rectangle(){};
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		this.axb = width*height;
	}	
	@Override
	public String toString() {
		return "[width: " + width + ", height: " + height + ", width * height: " + axb + "]";
	}
	public int getAxb() {
		return axb;
	}
	public void setAxb(int axb) {
		this.axb = axb;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
