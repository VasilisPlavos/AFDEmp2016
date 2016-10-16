import java.util.Scanner;
public class triangearea {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float a = 0;
		float b = 0;
		float c = 0;

		System.out.print("Enter first side: ");
		a = in.nextFloat();
		System.out.print("Enter second side: ");
		b = in.nextFloat();
		System.out.print("Enter first side: ");
		c = in.nextFloat();

		float r = ((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c));
		System.out.println("The area of the triangle is " + Math.sqrt(r)/4);
		in.close();
	}
}