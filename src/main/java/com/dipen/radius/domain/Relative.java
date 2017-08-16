package com.dipen.radius.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="relative")
public class Relative {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rel_id")
	private long relId;
	@Column(name = "name")
	private String name;
	
	public long getRelId() {
		return relId;
	}
	public void setUserId(long userId) {
		this.relId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Relative(){}
	public Relative(String name)
	{
		this.name = name;
	}
	

}
