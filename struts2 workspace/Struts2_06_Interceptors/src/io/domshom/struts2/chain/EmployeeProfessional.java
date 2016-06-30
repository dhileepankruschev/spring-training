package io.domshom.struts2.chain;

import com.opensymphony.xwork2.Action;

public class EmployeeProfessional implements Action{
	private int salary;
	
	 @Override
	  public String execute() throws Exception {
	    return SUCCESS;
	  }

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
