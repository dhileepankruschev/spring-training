package io.domshom.struts2;

import io.domshom.struts2.model.Employee;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{
	Employee emp = new Employee ();
	
	@Override
	public Employee getModel()
	{
		return emp;
	}
	@Override// overriding from ActionSupport class
	public void validate() {
		if (emp.getCode() == null || emp.getCode().trim().length() == 0) {
			addActionError("Employee code is not valid");
			addFieldError("code","FieldLevelErroMessage: Employee code is not valid");
		}
		if (emp.getName() == null || emp.getName().trim().length() == 0) {
			addActionError("Employee Name is not valid");
			addFieldError("name","FieldLevelErroMessage: Employee Name is not valid");
		}
		if (emp.getCity() == null || emp.getCity().trim().length() == 0) {
			addActionError("City is not valid");
			addFieldError("city","FieldLevelErroMessage: Employee city is not valid");
		}
		if (emp.getSalary() <= 0) {
			addActionError("Salary is not valid");
			addFieldError("salary","FieldLevelErroMessage: Employee salary is not valid");
		}
	}

	@Override
	public String execute() throws Exception {
		addActionMessage("You have entered correct data");
		return SUCCESS;
	}

}
