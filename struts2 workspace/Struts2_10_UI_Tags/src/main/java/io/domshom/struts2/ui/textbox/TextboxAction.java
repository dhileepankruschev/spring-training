package io.domshom.struts2.ui.textbox;

import com.opensymphony.xwork2.ActionSupport;

public class TextboxAction extends ActionSupport{
	private String username;

	//simple validation
	@Override
		public void validate(){
			if(this.getUsername().length()<=0){
				addFieldError("username", "Username is required");
			}
		}
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	};

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
		
}
