package com.cog.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class LoggingAspect {

	@Before("execution(* com.cog.TransferService.*(..))")
	public void doLogging(JoinPoint joinPoint){
		Object[] args = joinPoint.getArgs();
		
		System.out.println("Inputs params passed are: ");
		for(Object arg : args){
			System.out.println(arg);
		}
		
		System.out.println("Will be run before transfer service");
	}

}
