package io.domshom.struts2.alias;

import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAlias extends ActionSupport {
	private String empCode, empName, empCity;
	private Double empSalary;
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}


	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "EmployeeAlias [empCode=" + empCode + ", empName=" + empName
				+ ", empCity=" + empCity + ", empSalary=" + empSalary + "]";
	}
	

}