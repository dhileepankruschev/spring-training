package com.cog.repo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cog.entity.Member;

public class MemberRowMapper implements RowMapper<Member> {

	public Member mapRow(ResultSet rs, int arg1) throws SQLException {
		
		return new Member(rs.getString("email"), rs.getString("password"));
	}

}
