package com.cog.user.entity;

public class User {
	String email;
	String password;
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}
	public User(){
		
	}
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
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
