public class ResizableCircle extends Circle implements Resizable  {
	
	public ResizableCircle(double radius) {
		super(radius);
	}

	@Override
	public double resize(double given_percentage) {
		return super.radius = (given_percentage * super.radius)/100;
	}

	@Override
	public String toString() {
		return super.toString();
	}


}
