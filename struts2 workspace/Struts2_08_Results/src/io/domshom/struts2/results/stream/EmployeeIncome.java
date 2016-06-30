package io.domshom.struts2.results.stream;

public class EmployeeIncome {
	private String month;
	private double basic;

	public EmployeeIncome() {
	}

	public EmployeeIncome(String month, double basic) {
		this.month = month;
		this.basic = basic;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	@Override
	public String toString() {
		return month + "\t" + basic;
	}

}