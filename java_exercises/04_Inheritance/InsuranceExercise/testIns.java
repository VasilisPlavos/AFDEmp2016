import java.util.Scanner;

public class testIns {
	public static Customer [] customers = new Customer[3];
	public static Insurance [] insurances = new Insurance[3];
	public static void main(String[] args) {
		customers[0] = new Customer("Vasilis", 1991, "male");
		customers[1] = new Customer("Elpida", 1987, "female");
		customers[2] = new Customer("Giannis Fallas", 1999, "male");

		insurances[0] = new Insurance(1,1);
		insurances[1] = new Insurance(1,2);
		insurances[2] = new Insurance(2,3);




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
			for (int i = 0; i < 3; i++)
			System.out.println(testIns.insurances[i].toString());

		}
		else if (ch == 2){
			System.out.println("enter customer id: ");
			int cid = in.nextInt();
			for (int i = 0; i < 3; i++){
				if (testIns.customers[i].getCid() == cid){
					System.out.println(testIns.insurances[i].toString());
				}
			}

		}
		else if (ch == 3){
			System.out.println("enter insurance id: ");
			int id = in.nextInt();
			for (int i = 0; i < 3; i++){
				if (testIns.insurances[i].getInsid() == id){
					System.out.println(testIns.insurances[i].toString());
				}
			}

		}
		
		
		else if (ch ==0){
			System.out.println("Bye, bye!");

		}
		in.close();
	}
}