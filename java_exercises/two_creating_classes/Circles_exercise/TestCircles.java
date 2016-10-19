
public class TestCircles {

	public static void main(String[] args) {
		Circle a = new Circle();
		System.out.println(a.toString());
		a.setX(1);
		a.setY(0);
		a.setR(999);		
		Circle b = new Circle(8,8);
		Circle c = new Circle(9,9,9);		
		Circle d = new Circle(2,2,2);
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());		
		System.out.println(d.toString());	
		Circle dclone = d.copy();
		System.out.println(dclone.toString());		
		d.setX(22);
		d.setY(22);
		d.setR(22);
		System.out.println(d.toString());
	}
}
