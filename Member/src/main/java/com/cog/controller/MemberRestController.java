package com.cog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cog.entity.Member;
import com.cog.service.MemberService;

@RestController
@RequestMapping(value = "/rest")
public class MemberRestController {

	@Autowired
	MemberService service;
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public ResponseEntity<List<Member>> listAllUsers() {
		List<Member> members = service.findMembers();
		if (members.isEmpty()) {
			return new ResponseEntity<List<Member>>(HttpStatus.NO_CONTENT);// You
																			// many																	// HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Member>>(members, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Void> addMember(@RequestBody Member member) {
		System.out.println("Member " + member);
		boolean members = service.addMember(member);
		
		HttpHeaders header = new HttpHeaders();
		return new ResponseEntity<Void>(header, HttpStatus.CREATED);
	}
	
	

	
	
	
}
