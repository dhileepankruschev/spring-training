package io.domshom.struts2.execute_and_wait;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String lid, lpass;

	@Override
	public void validate() {

		if (lid == null || lid.trim().length() == 0) {
			addFieldError("lid", "Login id can not be left blank");
		}

		if (lpass == null || lpass.trim().length() == 0) {
			addFieldError("lpass", "Password can not be left blank");
		}
	}

	@Override
	public String execute() throws Exception {
		for(int i =0; i<500000; i++){
			System.out.println(i);
		}
			return SUCCESS;
	}

	
	public String getLid() {
		return lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getLpass() {
		return lpass;
	}

	public void setLpass(String lpass) {
		this.lpass = lpass;
	}

}