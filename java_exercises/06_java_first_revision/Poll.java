
public class Poll {

	public static void main(String[] args) {
		int [] board = {1, 2, 6, 4, 8, 5, 9, 7, 8, 
				10, 1, 6, 3, 8, 6, 10, 3, 8, 2, 7, 
				6, 5, 7, 6, 8, 6, 7, 5, 6, 6, 5, 6, 
				7, 5, 6, 8, 4, 6, 8, 10};
		
		System.out.print("Rating");
		System.out.println("\t" + "Frequency");
		

		for (int x = 1; x < 11; ++x){
			System.out.print(x);
			int counter = 0;
			for (int i = 0; i < board.length; ++i){
				if (board[i] == x){
					counter = counter + 1;					
				}			
			}System.out.println("\t" + counter);			
		}
	}
}