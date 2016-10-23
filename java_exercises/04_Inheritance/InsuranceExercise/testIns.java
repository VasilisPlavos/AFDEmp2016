import java.util.Scanner;

public class testIns {
	public static Insurance [] insurances = new Insurance[4];
	public static Customer[] customers = new Customer[4];
	public static void main(String[] args) {

		insurances[0] = new Insurance("deaf", 1995, "male", 1);
		insurances[1] = new Insurance("panos", 1995, "male",2);
		insurances[2] = new Insurance("Elpida", 1987, "female", 1);
		insurances[3] = new Insurance("Viki", 1993, "female", 1);
		




		Scanner in = new Scanner (System.in);



		System.out.println("***** Menu ******");
		System.out.println("1. Print all Insurances");
		System.out.println("2. Search insurances by customer code");
		System.out.println("3. Search insurances by insurance code");
		System.out.print("Enter : ");
		int ch = in.nextInt();
		while (ch > 3){
			System.out.print("error, try again: ");
			ch = in.nextInt();}		
		if (ch == 1){
			int i = 0;
			while (i < insurances.length){
			System.out.println(insurances[i].toString());
			i++;
			}
		}
		else if (ch == 2){
			System.out.println("enter customer id: ");
			int cid = in.nextInt();
			System.out.println(insurances[cid-1].toString());
		}
		else if (ch == 3){
			System.out.println("enter insurance id: ");
			int id = in.nextInt();
			System.out.println(insurances[id-1].toString());
		}
		else if (ch ==0){
			System.out.println("Bye, bye!");

		}
		in.close();
	}
}