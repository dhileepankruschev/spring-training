package com.cog;

import java.util.List;

public class A {
	B b;
	int age;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	List<String> cities;
	
	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	public void execute(){
		System.out.println("Execute A");
		b.message = "Execute B";
		b.execute();
	}

	public A(B b) {
		super();
		this.b = b;
	}

	/*public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}*/
	
	
	
}
