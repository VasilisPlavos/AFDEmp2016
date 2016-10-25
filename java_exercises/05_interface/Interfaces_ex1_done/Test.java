public class Test {
	public static void main(String[] args) {
		Shape s1 = new Circle(3);
		System.out.println(s1.getPerimeter());
		System.out.println(s1.toString());
		Circle c = (Circle) s1;
		System.out.println(c.getPerimeter());
		System.out.println(c.toString());
		Resizable r = new ResizableCircle(5);
		System.out.println(r.toString());
		
		System.out.println("The last circle resized 88% "
				+"the new radius is: " + r.resize(88));
	

	}

}
