package io.domshom.struts2.custom;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor1 implements Interceptor {

	@Override
	public void init() {
	System.out.println("\tMyInterceptor1 init method");
	}
	
	@Override
	public void destroy() {
		System.out.println("\tMyInterceptor1 destroy method");
	}

	@Override
	public String intercept(ActionInvocation inv) throws Exception {
		System.out.println("\tintercept method in Interceptor1 before invoke");
			String result = inv.invoke();
		System.out.println("\t"+result);
		System.out.println("\tintercept method in Interceptor1 after invoke");
		return result;
	}

}
