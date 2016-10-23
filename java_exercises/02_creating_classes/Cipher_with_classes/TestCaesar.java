import java.util.Scanner;
public class TestCaesar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter shift: ");
		int shift = input.nextInt();
		System.out.print("Enter phrase: ");
		String phrase = input.next();
		CaesarsCipher a = new CaesarsCipher();
		System.out.print("PRINT: ");
		System.out.print(a.Caesars(phrase, shift));
		input.close();

		
		
		
		
	}

}
