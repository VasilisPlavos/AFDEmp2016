


class Customer {
	private final int cid;
	private String name;
	private int year;
	private String sex;
	private static int count;


	Customer (String name, int year, String sex){
		++count;
		this.cid = count;
		this.name = name;
		this.year = year;
		this.sex = sex;		
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getCid() {
		return cid;
	}


	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", year=" + year + ", sex=" + sex  + "]";
	}






}
