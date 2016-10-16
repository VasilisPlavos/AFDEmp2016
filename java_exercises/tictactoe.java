import java.util.Scanner;

public class tictactoe {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] board = new String[9];
		System.out.println("Please enter 1 to 9");


		//edo ftiaxnoume ton proto pinaka
		for (int i = 0; i < 9; i = i+1){
			board[i] = "-";
		}

			for (int i = 0; i < 10; i = i +1){
				if (i % 2 == 0){ //sta ziga paizei o x sta mona o o
					System.out.print("x:");

					int temp = input.nextInt();
					if (board[temp-1]== "-"){
						board[temp-1] = "x";

					}else{
						System.out.println("error. try again");
						i = i-1;
					}
				}else {
					System.out.print("o:");
					int temp = input.nextInt();
					if (board[temp-1] == "-"){
						board[temp-1] = "o";
					}else{
						System.out.println("error. try again");
						i = i - 1;
					}
				}

				System.out.println("");
				System.out.print(board[0]); //o pinakas
				System.out.print(board[1]); //itan pio grigoro na
				System.out.println(board[2]); //ton tiposo xoris loop :P
				System.out.print(board[3]);
				System.out.print(board[4]);
				System.out.println(board[5]);
				System.out.print(board[6]);
				System.out.print(board[7]);
				System.out.println(board[8]);
				System.out.println("");

				if (i == 8){System.out.println("tie");System.out.println("");i = 11;}

				if (board[0] == "x" && board[3]=="x" && board[6]=="x"){System.out.println("x wins");i = 11;}
				if (board[0] == "x" && board[4]=="x" && board[8]=="x"){System.out.println("x wins");i = 11;}
				if (board[0] == "x" && board[1]=="x" && board[2]=="x"){System.out.println("x wins");i = 11;}
				if (board[2] == "x" && board[4]=="x" && board[6]=="x"){System.out.println("x wins");i = 11;}
				if (board[2] == "x" && board[5]=="x" && board[8]=="x"){System.out.println("x wins");i = 11;}
				if (board[6] == "x" && board[7]=="x" && board[8]=="x"){System.out.println("x wins");i = 11;}
				if (board[3] == "x" && board[4]=="x" && board[5]=="x"){System.out.println("x wins");i = 11;}
				if (board[1] == "x" && board[4]=="x" && board[7]=="x"){System.out.println("x wins");i = 11;}

				if (board[0] == "o" && board[3]=="o" && board[6]=="o"){System.out.println("o wins");i = 11;}
				if (board[0] == "o" && board[4]=="o" && board[8]=="o"){System.out.println("o wins");i = 11;}
				if (board[0] == "o" && board[1]=="o" && board[2]=="o"){System.out.println("o wins");i = 11;}
				if (board[2] == "o" && board[4]=="o" && board[6]=="o"){System.out.println("o wins");i = 11;}
				if (board[2] == "o" && board[5]=="o" && board[8]=="o"){System.out.println("o wins");i = 11;}
				if (board[6] == "o" && board[7]=="o" && board[8]=="o"){System.out.println("o wins");i = 11;}
				if (board[3] == "o" && board[4]=="o" && board[5]=="o"){System.out.println("o wins");i = 11;}
				if (board[1] == "o" && board[4]=="o" && board[7]=="o"){System.out.println("o wins");i = 11;}
			}
			input.close();
	}

}
