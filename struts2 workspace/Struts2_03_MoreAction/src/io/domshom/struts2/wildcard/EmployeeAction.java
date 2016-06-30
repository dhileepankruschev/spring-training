package io.domshom.struts2.wildcard;

import com.opensymphony.xwork2.Action;

public class EmployeeAction implements Action{
	@Override
	public String execute() throws Exception {
		System.out.println("in employee action class");
		return SUCCESS;
	}
}
