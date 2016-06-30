package io.domshom.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction2 extends ActionSupport{
	private String name;

	   public String run() throws Exception{
		   int a =15;
		   int b = 6;
		   if(a>b){
			   System.out.println("condition true");
			   return SUCCESS;
		   }
		   System.out.println("condition false");
		   return ERROR;
	   }
	   
	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
}
