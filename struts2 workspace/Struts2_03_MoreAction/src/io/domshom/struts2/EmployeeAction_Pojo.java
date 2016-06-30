package io.domshom.struts2;

public class EmployeeAction_Pojo {
	private String code;
	  private String name;
	  private String city;
	  private String salary;
	  
	  public String run() throws Exception {
	    System.out.println("Execute method in EmployeeAction_Pojo");
	    return "success";
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
