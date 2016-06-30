package io.domshom.struts2.params;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport {
	private String id, name, city;
	private int salary = 0;

	@Override
	public String execute() throws Exception {
		System.out.println("execute method");
		
		// obtain HttpServletRequest object
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx.get(ServletActionContext.HTTP_REQUEST);
		setId(request.getParameter("empId"));
		setName(request.getParameter("empName"));
		setCity(request.getParameter("empCity"));
		setSalary(Integer.parseInt(request.getParameter("empSalary")));
		return SUCCESS;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}