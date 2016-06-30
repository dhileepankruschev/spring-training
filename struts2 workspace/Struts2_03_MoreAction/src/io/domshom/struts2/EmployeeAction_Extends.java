package io.domshom.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction_Extends extends ActionSupport {
	  private String code;
	  private String name;
	  private String city;
	  private String salary;
	        
	@Override
	  public String execute() throws Exception {
	    System.out.println("Execute method in EmployeeAction_Extends");
	    return SUCCESS;
	  }
	
	  public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}


}
