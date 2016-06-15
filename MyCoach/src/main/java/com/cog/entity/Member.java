package com.cog.entity;

public class Member {
	
	public Member(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	String email;
	String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
