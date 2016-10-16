import java.util.Scanner;
public class CaesarCipher {
	public static void main(String []args) {
		Scanner kb = new Scanner(System.in);
		int shift;
		String phrase;
		System.out.print("Enter shift: ");
		shift = kb.nextInt();
		System.out.print("Enter phrase: ");
		phrase = kb.next();
		char[] numChar = phrase.toCharArray();
		for (int x : numChar){
			int t = x + shift;
			if (t > 90){
				t = t - 90;
				t = 64 + t;}
			System.out.print ((char) t);
		}
		System.out.println("");
	}
}