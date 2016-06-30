package io.domshom.struts2.validation.required;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	
	   private String username;
	   private int age;
	   
	   public String execute() 
	   {
	       return SUCCESS;
	   }
	   public String getUsername() {
	       return username;
	   }
	   public void setUsername(String username) {
	       this.username = username;
	   }
	   public int getAge() {
	       return age;
	   }
	   public void setAge(int age) {
	       this.age = age;
	   }

/*	   public void validate()
	   {
	      if (name == null || name.trim().equals(""))
	      {
	         addFieldError("name","The name is required");
	      }
	      if (age < 28 || age > 65)
	      {
	         addFieldError("age","Age must be in between 28 and 65");
	      }
	   }*/
	}