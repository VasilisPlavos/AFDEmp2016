import java.util.Arrays;

public class min {

	public static void main(String[] args) {
		int [] array = {1, 3, 1, 2, 5, 6, 6, 8, 9, 12, 1, 13, 3, 1};
		int [] array_copy = array.clone();
		Arrays.sort(array_copy);
		int min = array_copy[0];
		System.out.print("Min is " + min + " in positions: ");


		//edo ftiaxnoume ton proto pinaka
		for (int i = 0; i < array.length; i = i+1){
			if (array[i] == min){
				System.out.print(i + " ");
			}

		}
	}
}
