
public class Health extends Insurance {
	int expense;
	Health(String name, int year, String sex, int duration, int expense) {
		super(name, year, sex, duration);
		this.expense = expense;
	}
	
	
	public int getExpense() {
		return expense;
	}
	public void setExpense(int expense) {
		this.expense = expense;
	}
	
	
	public int ins_cost(){
		int cost = 0;
		if (super.getSex().equals("male")){
			cost = super.ins_cost() + 50 + (7* (2016 - super.getYear()));
		}else cost = super.ins_cost() + (7 * (2016 - super.getYear()));
		return cost;
	}

	@Override
	public String toString() {
		return "Health [expense=" + expense + super.toString();
	}
	
	
	
	
}
