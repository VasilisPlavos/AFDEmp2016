/*
Exercise: Python Tutorial 2 - Exercise 2
*/


import java.util.Scanner;
public class Tin {
	public static void main(String []args) {
		System.out.print("Enter Tax Identification Number: ");
		Scanner scanner = new Scanner (System.in);
		int Tin = scanner.nextInt();
		int LC = Tin%10; /* Last character */
		int OC = Tin/10; /* Other characters */
		int x = 0;
		int sum = 0;

		while (x < 8) {
			x = x + 1;
			double d = Math.pow(2,x);
			int a = (int)d;
			int lc2 = (int)OC%10;
			sum = sum + lc2*a;
			OC = (int)OC/10;
		}
		sum = sum % 11;
		sum = sum % 10;
		if ( sum == LC){
			System.out.println("Tax Identification Number valid");
		}else {
			System.out.println("Tax Identification Number not valid");
		}




	}
}
