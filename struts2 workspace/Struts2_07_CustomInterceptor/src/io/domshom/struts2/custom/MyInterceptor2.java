package io.domshom.struts2.custom;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor2 implements Interceptor {

	@Override
	public void init() {
	System.out.println("\t\tMyInterceptor2 init method");
	}
	
	@Override
	public void destroy() {
		System.out.println("\t\tMyInterceptor2 destroy method");
	}
	

	@Override
	public String intercept(ActionInvocation inv) throws Exception {
		System.out.println("\t\tintercept method in Interceptor2 before invoke");
			String result = inv.invoke();
		System.out.println("\t\t"+result);
		System.out.println("\t\tintercept method in Interceptor2 after invoke");
		return result;
	}

}
