package com.cog;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	
	public int square(int number){
		return number * number;
	}

}
