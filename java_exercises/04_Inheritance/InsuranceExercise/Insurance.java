
public class Insurance extends Customer {
	private int duration;
	private final int insid;
	static int count = 0;

	Insurance (String name, int year, String sex, int duration){
		super(name, year, sex);
		++count;
		this.insid = count;		
		this.duration = duration;	
	}
	

	public int ins_cost() {
		// TODO Auto-generated method stub
		return 100;
	}
	
	
	public void printIns(){
		System.out.println(toString());
	}
	
	public void printInsId(int insid){
		if (this.getInsid() == insid){
			System.out.println(toString());
		}
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		Insurance.count = count;
	}


	public int getInsid() {
		return insid;
	}


	@Override
	public String toString() {
		return "Insurance [duration=" + duration + ", insid=" + insid + super.toString();
	}
	



	
	
	









}