import java.util.Scanner;
public class palindrome {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		String word;
		System.out.print("Enter word: ");
		word = in.next();
		in.close();
		char[] numChar = word.toCharArray();
		int l = numChar.length;
		for (int i = 0; i < numChar.length; i++){
			l-- ;
			if (numChar[l] != numChar[i]){
				System.out.println("Not Palindrome!!!");
				return;
			}
		}System.out.println("Palindrome!!!");		
	}	
}