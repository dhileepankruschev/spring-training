package com.cog.repo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class HotelRoom {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private int roomsLeft;
	
	@Version
	private long versionId;

	public int getRoomsLeft() {
		return roomsLeft;
	}

	public void setRoomsLeft(int roomsLeft) {
		this.roomsLeft = roomsLeft;
	}
	

}
