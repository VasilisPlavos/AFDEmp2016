import java.util.Scanner;
public class eurosum {
	public static void main(String[] args) {
		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of 50 euro banknotes: ");
		sum = sum + in.nextInt()*50;
		System.out.print("Enter number of 20 euro banknotes: ");
		sum = sum + in.nextInt()*20;
		System.out.print("Enter number of 10 euro banknotes: ");
		sum = sum + in.nextInt()*10;
		System.out.print("Enter number of 5 euro banknotes: ");
		sum = sum + in.nextInt()*5;
		System.out.print("Enter number of 2 euro banknotes: ");
		sum = sum + in.nextInt()*2;
		System.out.print("Enter number of 1 euro banknotes: ");
		sum = sum + in.nextInt()*1;
		System.out.println("You have " + sum + " euros.");
		in.close();
	}
}