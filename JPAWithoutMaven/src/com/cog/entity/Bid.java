package com.cog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//@Entity
public class Bid {
	
	@Id
	@GeneratedValue
	@Column(name="bid_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="item_id", nullable=false, updatable=false)
	private Item item;

	
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
