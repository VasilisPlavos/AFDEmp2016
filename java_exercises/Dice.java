import java.lang.*;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args){
		int x = 0;
		int counter = 0;
		while (x == 0){
			int dice1 = (int)(Math.random() * 6);
			int dice2 = (int)(Math.random() * 6);
			System.out.println("Dice 1: " + dice1 + " Dice 2: " + dice2);
			counter = counter + 1;
			if ((dice1 == 1) & (dice2 ==1)){
				x = 1;
			}
		}
		System.out.println("It takes " + counter + " times!");
	}
}