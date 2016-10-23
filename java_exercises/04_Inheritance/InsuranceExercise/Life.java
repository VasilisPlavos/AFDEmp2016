
public class Life extends Insurance {

	
	Life(int invest, int insid, int duration) {
		super(duration, insid);
		
		this.invest = invest;
	}

	private int invest;


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


	int i = 0;
	@Override
	public int ins_cost(){
		for (int i = 0; i<3;){
		int cost = super.ins_cost()+ (5* (2016-testIns.customers[i].getYear()));
		return cost;}
		return i;
	}


}

