
public class Insurance {
	private int duration;
	private final int insid;
	private int cid;
	static int count = 0;

	Insurance (int duration, int cid){
		++count;
		this.insid = count;		
		this.duration = duration;
		this.cid = cid;		
	}





	@Override
	public String toString() {
		return "Insurance [duration=" + duration + ", insid=" + insid + ", cid=" + cid + "]";
	}





	public int getDuration() {
		return duration;
	}





	public void setDuration(int duration) {
		this.duration = duration;
	}





	public int getCid() {
		return cid;
	}





	public void setCid(int cid) {
		this.cid = cid;
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





	public int ins_cost() {
		// TODO Auto-generated method stub
		return 100;
	}









}