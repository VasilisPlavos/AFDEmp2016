import java.util.Scanner;
import java.lang.*;

public class MoveElementsInArray {
    public static void main(String[] args){
		int ten = 0;
		while (ten != 10) {
			System.out.print("Enter 10: ");
			Scanner scanner = new Scanner (System.in);
			ten = scanner.nextInt();
		}
		int sp = ten + 1; /* start position = apo afto to simio tu pinaka ksekina na tiponei kathe fora */
		int line = 0;
		int[] temp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] dest = {11,12,13,14,15,16,17,18,19,20};
		int a = 9;
		int b = 0;
		int c = 1;
		while (line < 10) {
			line = line + 1;
		System.arraycopy(temp, a, dest, b, c);
		System.arraycopy(temp, b, dest, c, a);
		a = a - 1;
		c = c + 1;
		for (int x : dest){
			System.out.print (x);
		}
			System.out.println ("");

		}
	}
}


