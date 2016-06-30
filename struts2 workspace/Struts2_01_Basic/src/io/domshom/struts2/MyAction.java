package io.domshom.struts2;

import com.opensymphony.xwork2.ActionSupport;

class CustomAction extends ActionSupport {
	public static String HEAD = SUCCESS;
    public static String TAIL = ERROR;
}

public class MyAction extends ActionSupport{
	
	public String execute()
    {
		int a = 2;
		int b = 3;
		if(a<b){
			return CustomAction.HEAD;
		}
		return CustomAction.TAIL;
    }
}
