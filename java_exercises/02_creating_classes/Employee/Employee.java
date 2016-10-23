
public class Employee {
	
	private String fname;
	private String lname;
	private int year;
	public static int this_year = 2016;
	private int id = 0;
	public static int count = 0;
	
	public String getFname(){return fname;}
	public void setFname(String fname){this.fname = fname;}
	public String getLname(){return lname;}
	public void setLname(String lname){this.lname = lname;}
	public int getYear(){return year;}
	public void setYear(int year){this.year = year;}
	public int age(){return this_year - getYear();} // epistrefi tin ilikia
	
	public String toString(){
		return "Employee name: " + getFname() + " , surname: " + getLname() + " age: " + age()
		+ " id: " + id;
	}
	
	public Employee (String fname, String lname, int year){
		setFname(fname);
		setLname(lname);
		setYear(year);	
		count = count+1;
		id = count;
	}
	
	
	
	public Employee () { //aftos einai constructoras
		this.fname = "Μαρία";
		this.lname = "Παππά";
		this.year = 1950;	
		count = count++;
		id = count;
	}
}
