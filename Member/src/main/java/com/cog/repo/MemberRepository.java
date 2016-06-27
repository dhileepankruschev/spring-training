package com.cog.repo;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cog.entity.Member;

@Repository
public class MemberRepository {

	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public void addMember(Member member) throws Exception{
		em.persist(member);
	}

	public List<Member> findMembers() {
		// TODO Auto-generated method stub
		Query query = em.createNamedQuery("findAllMembers");
		List<Member> members = query.getResultList();
		return members;
	}
}
