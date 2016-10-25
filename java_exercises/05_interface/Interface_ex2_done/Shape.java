
public class Shape implements Agreeable {
	int width;
	int height;
	
	Shape(){
		this.width = 1;
		this.height = 2;
	}
	Shape(int width, int height){
		this.width = width;
		this.height = height;
	}	
	public int calcArea(){
		return ((int) (width * height));		
	}
	public boolean isSmallerThan(Agreeable obj) {
		if (this.calcArea() < ((Shape) obj).calcArea()){
			return true;
		}
		return false;
	}	
	@Override
	public String toString() {
		return "Shape [width: " + width + ", height: " + height 
				+ " & CalcArea: " + calcArea() + "]";
	}
}
