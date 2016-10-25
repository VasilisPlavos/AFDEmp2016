
public class Test {

	public static void main(String[] args) {
		Shape s = new Shape();
		System.out.println(s.toString());
		Shape s2 = new Shape(3,4);
		System.out.println(s2.toString());
		Agreeable a = new Shape(5,6);
		System.out.println(a);
		if (s.isSmallerThan(s2)){
			System.out.println("It is smaller!");
		}
	}
}
