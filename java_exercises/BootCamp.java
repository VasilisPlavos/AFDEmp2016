import java.lang.*;
import java.util.Scanner;

public class BootCamp {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number 1:");
		int num1 = scan.nextInt();
		System.out.print("Enter Number 2:");
		int num2 = scan.nextInt();
		if ( num1 < num2){
			double res = Math.sqrt(Math.abs(num1 - num2));
			System.out.println((int)res);
		}else {
			System.out.println(num1 + num2);
		}
	}
}