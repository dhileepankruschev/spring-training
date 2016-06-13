package com.cog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cog.repo.AccountRepository;
import com.cog.repo.IAccountRepository;

@Component
public class TransferService {
	
	@Autowired
	IAccountRepository repository;
	
	


	public void fundsTransfer(){
		
		repository.getAccount();
		
		System.out.println("Tranfering funds");
	}
	
	


}
