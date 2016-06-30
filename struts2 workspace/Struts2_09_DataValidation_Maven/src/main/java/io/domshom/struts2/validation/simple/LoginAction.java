package io.domshom.struts2.validation.simple;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	 
	@Override
	public void validate(){
		System.out.println(this.getUsername().length()>0 && this.getPassword().equals(this.getUsername()));
		if(this.getUsername().length()>0 && this.getPassword().equals(this.getUsername())){
			addActionMessage("Valid user!");
		}else{
			addActionError("Invalid user!");
		}
	}
	
	public String execute() {
		return "SUCCESS";
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}