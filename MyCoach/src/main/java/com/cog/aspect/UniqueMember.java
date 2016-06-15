package com.cog.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cog.entity.Member;
import com.cog.repo.MemberRepository;

@Component
@Aspect
public class UniqueMember {
	
	@Autowired
	MemberRepository memberRepository;
	

	@Before("execution(* com.cog.service.MemberService.addMember(..))")
	public void doLogging(JoinPoint joinPoint) throws Exception{
		Object args[] = joinPoint.getArgs();
		Member member = (Member) args[0];
		
		boolean unique = memberRepository.isUniqueMember(member);
		if(!unique){
			throw new Exception("Member already present");
		}
		System.out.println("Will be run before transfer service");
	}

}
