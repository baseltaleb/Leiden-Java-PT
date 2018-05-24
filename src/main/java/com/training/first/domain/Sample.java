package com.training.first.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Sample {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String tag;
	@Transient
	private String something;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTag() {
		return tag;
	}
	
	public void setTag(String tag) {
		this.tag = tag;
	}
	

	public String getSomething() {
		return something;
	}

	public void setSomething(String something) {
		this.something = something;
	}

}
