package com.cog.user.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cog.user.entity.NewUser;

@Repository
public class UserRepository {
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public void addMember(NewUser user)
	{
		em.persist(user);
		System.out.println("After persist");
		
	}
	
	

}
