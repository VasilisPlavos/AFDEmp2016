/*
Exercise: Python Tutorial 2 - Exercise 2
*/


import java.util.Scanner;
public class BinaryCheck {
	public static void main(String []args) {
		System.out.print("Enter binary number: ");
		Scanner scanner = new Scanner (System.in);
		int bin = scanner.nextInt();
		int LC = bin%10; /* Last character */
		int OC = bin/10; /* Other characters */
		int x = 0;
		int sum = 0;
		int c1 = 0;

		while (x < 8) {
			x = x + 1;
			double d = Math.pow(2,x);
			int a = (int)d;
			int lc2 = (int)OC%10;
			if (lc2 == 1){
				c1 = c1 + 1;}
			OC = (int)OC/10;
		}if ((c1 % 2 == 0) & (LC == 0)){
			System.out.println("Parity check OK.");
		}else if ((c1 % 2 != 0) & (LC == 1)) {
			System.out.println("Parity check OK.");
		}else {
			System.out.println("Parity check not OK.");
		}
	}
}