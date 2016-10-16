import java.lang.*;
import java.util.Scanner;

public class MoveElementsInArrayWithoutArray {
    public static void main(String[] args){
		int ten = 0;
		while (ten != 10) {
			System.out.print("Enter 10: ");
			Scanner scanner = new Scanner (System.in);
			ten = scanner.nextInt();
		}

		int lc = ten + 1;
		int line = 0;
		while (line < 10){
			line = line + 1;
			lc = lc - 1;
			for (int x = lc; x < 11; x = x + 1){
				System.out.print(x);

			}				for (int i = 1; i < lc; i = i + 1){
				System.out.print(i);
			}
			System.out.println("");
		}


	}
}