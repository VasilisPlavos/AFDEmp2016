import java.util.Scanner;

public class pronicnumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long pr = 0;
		long a = 0;
		long b = 0;

		System.out.print("Enter the number of pronic numbers to output: ");
		int i = in.nextInt();
		while (pr < i){
			a = a + 1;
			b = a + 1;
			System.out.print(a*b + " ");
			pr = pr + 1;
		}
	}
}