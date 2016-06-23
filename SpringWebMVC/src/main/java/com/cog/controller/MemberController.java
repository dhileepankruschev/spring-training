package com.cog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cog.entity.Member;
import com.cog.repo.MemberRepository;

@Controller
public class MemberController {
	
	@Autowired
	MemberRepository repo;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addMember(@RequestParam("membername") String name, Model model){
		System.out.println("Membername is : " + name);
		
		Member member = new Member(name);
		repo.addMember(member);
		
		model.addAttribute("m1", name);
		return "member";
	}

}
