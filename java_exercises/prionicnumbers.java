import java.util.Scanner;

public class prionicnumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int pr = 0;
		int a = 0;
		int b = 0;

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