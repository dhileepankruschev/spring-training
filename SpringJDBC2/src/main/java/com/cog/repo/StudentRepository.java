package com.cog.repo;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class StudentRepository {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public StudentRepository(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource); 
	}
	
	public int getStudentCount(){
		   String SQL = "select count(*) from Student";
		   return jdbcTemplate.queryForInt(SQL);
	   }
	
	
}
