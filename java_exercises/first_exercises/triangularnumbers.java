import java.util.Scanner;

public class triangularnumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a = 0;

		System.out.print("Enter the number of triangular numbers to produce: ");
		a = in.nextInt();
		for (int i = 0; i < a; i = i + 1){
			double ipow2 = Math.pow(i, 2);
			double b = ((ipow2 + i) / 2);
			System.out.print((int) b + " ");

		}
	}
}