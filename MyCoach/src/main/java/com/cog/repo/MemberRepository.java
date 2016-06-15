package com.cog.repo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cog.entity.Member;

@Repository
public class MemberRepository {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public MemberRepository(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource); 
	}
	public boolean addMember(Member member) {
		
	// JDBC Template Code
		String SQL = "insert into member (email, password) values (?,?)";
		int count = jdbcTemplate.update(SQL, member.getEmail(), member.getPassword());
		if(count>=1){
			return true;
		}
		return false;
	}
	public Member fetchMember(String email) {
		String SQL = "select * from member where email=?";
		Member member = jdbcTemplate.queryForObject(SQL, new MemberRowMapper(), email);
		return member;
	}
	
	public boolean isUniqueMember(Member member){
		String SQL = "select count(*) from member where email=?";
		int count = jdbcTemplate.queryForInt(SQL, member.getEmail());
		if(count>=1){
			return false;
		}
		return true;
	}

}
