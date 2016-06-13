package com.cog.repo;

import org.springframework.stereotype.Component;

@Component
public class AccountRepository implements IAccountRepository{
	
	public void getAccount() {
		System.out.println("Getting Account Details");
		
	}
}
