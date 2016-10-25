
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle a = new Rectangle(4,3);
		Rectangle b = new Rectangle(4,4);
		Rectangle c = new Rectangle(4,4);
		a.draw();
		b.areEquals(a);
		b.areEquals(c);
		b.isSquare();
		a.copy();
	}
}