package io.domshom.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport{
	private String code;
	private String name;
	private String city;
	private Double salary;

	@Override// overriding from ActionSupport class
	public void validate() {
		if (getCode() == null || getCode().trim().length() == 0) {
			addActionError("Employee code is not valid");
			addFieldError("code","FieldLevelErroMessage: Employee code is not valid");
		}
		if (getName() == null || getName().trim().length() == 0) {
			addActionError("Employee Name is not valid");
			addFieldError("name","FieldLevelErroMessage: Employee Name is not valid");
		}
		if (getCity() == null || getCity().trim().length() == 0) {
			addActionError("City is not valid");
			addFieldError("city","FieldLevelErroMessage: Employee city is not valid");
		}
		if (getSalary() <= 0) {
			addActionError("Salary is not valid");
			addFieldError("salary","FieldLevelErroMessage: Employee salary is not valid");
		}
	}

	@Override
	public String execute() throws Exception {
		addActionMessage("You have entered correct data");
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
