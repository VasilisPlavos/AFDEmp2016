import java.util.Arrays;

public class CaesarsCipher {
	private String phrase;
	private int shift;
	
	
	
	
	public int getShift() {
		return shift;
	}


	public void setShift(int shift) {
		this.shift = shift;
	}


	public String getPhrase() {
		return phrase;
	}


	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}


	String Caesars(String phrase, int shift){
		int p = -1;
		this.phrase = phrase;
		this.shift = shift;		
		char[] cipher = phrase.toCharArray();
		char[] reverse = cipher.clone();
		for (int x : cipher){
			p = p + 1;
			int t = x + shift;
			if (t > 90){
				t = t - 90;
				t = 64 + t;}
			reverse[p] = (char) t;
		}
		return Arrays.toString(reverse);
	}
}
