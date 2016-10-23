
public class Life extends Insurance {
	private int invest;

	
	Life(String name, int year, String sex, int duration, int invest) {
		super(name, year, sex, duration);		
		this.invest = invest;
	}

	


	public int getInvest() {
		return invest;
	}

	public void setInvest(int invest) {
		this.invest = invest;
	}

	@Override
	public String toString() {
		return ("Life [invest=" + invest + "]. " +	super.toString());
	}

	@Override
	public int ins_cost(){
		int cost = super.ins_cost()+ (5* (2016 -super.getYear()));
		return cost;
	}
}
