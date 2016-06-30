package io.domshom.struts2.wildcard;

import com.opensymphony.xwork2.Action;

public class PersonAction implements Action{
	@Override
	public String execute() throws Exception {
		System.out.println("in person action class");
		return SUCCESS;
	}
}
