package com.cog.repo;

import org.springframework.stereotype.Component;


public class MyDataSource {

	String URL;
	String user;
	
	
	@Override
	public String toString() {
		return "MyDataSource [URL=" + URL + ", user=" + user + "]";
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	
}
