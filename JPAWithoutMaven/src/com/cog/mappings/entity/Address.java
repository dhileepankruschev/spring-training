package com.cog.mappings.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="add_id")
	private Long id;
	private String location;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_id", nullable=false, updatable=false)
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	

	@Override
	public String toString() {
		return "Address [id=" + id + ", location=" + location + "]";
	}
	
	
	
	

}
