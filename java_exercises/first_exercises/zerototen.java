import java.lang.*;

public class zerototen {
    public static void main(String[] args){
		int line = 0;
		int oc = 0;
		int zero = 8;

		while (line < 9){
			oc = oc + 1;
			line = line + 1;
			for (int x = 0; x < oc; x = x + 1){	System.out.print(oc);}

			for (int i = 0; i < zero; i = i + 1){
				System.out.print("0");

			}

			System.out.println("");


			zero = zero - 1;
		}
	}
}