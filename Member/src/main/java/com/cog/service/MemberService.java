package com.cog.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cog.entity.Member;
import com.cog.repo.MemberRepository;

@Service
public class MemberService {
	@Autowired
	MemberRepository repository;
	
	public boolean addMember(Member member){
		try {
			repository.addMember(member);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	public List<Member> findMembers() {
		// TODO Auto-generated method stub
		List<Member> members = repository.findMembers();
		Collections.sort(members, new Comparator<Member>(){

			public int compare(Member o1, Member o2) {
				// TODO Auto-generated method stub
				return o1.getSalary().compareTo(o2.getSalary());
			}
			
		});
		
		return members;
	}
}
