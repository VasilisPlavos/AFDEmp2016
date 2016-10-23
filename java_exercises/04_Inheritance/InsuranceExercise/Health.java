
public class Health extends Insurance {
	int expense;
	Health(int expense, int insid, int duration) {
		super(duration, insid);
		this.expense = expense;
		// TODO Auto-generated constructor stub
	}
	
	
	public int getExpense() {
		return expense;
	}
	public void setExpense(int expense) {
		this.expense = expense;
	}
	
	int i = 0;
	@Override
	public int ins_cost(){
		for (i = 0; i<3;){
		int cost = super.ins_cost()+ (7* (2016-testIns.customers[i].getYear()));
		if (testIns.customers[i].getSex().equals("male")){
				cost = cost+50;}
		return cost;}
		return i;
	}
	
}
