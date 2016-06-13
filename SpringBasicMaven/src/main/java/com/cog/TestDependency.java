package com.cog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependency {
 public static void main(String[] args) {
	/*B b = new B(); 
	 
	A a = new A(b);*/
//	a.setB(b);
	
	 
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
	
	A a = context.getBean(A.class);
	
	A a1 = context.getBean(A.class);
	System.out.println(a.age);
	System.out.println("Cities list: " + a.cities);
	
	if(a == a1){
		System.out.println("SingleTon objects");
	}
	else{
		System.out.println("Not a singleton");
	}
	
	a.execute();
	a.execute();
	a.execute();
}
}
