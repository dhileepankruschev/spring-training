package io.domshom.struts2.custom;

import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction1 extends ActionSupport {
	
	@Override
	public String execute() throws Exception {
	System.out.println("execute method in EmployeeAction1");
		return SUCCESS;
	}
}
