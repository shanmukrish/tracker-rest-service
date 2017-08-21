package com.gohiram.haj.trackerrestservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Friends")
@Table(name="Friends")
public class Friend {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int generatedId;
	
	private long id;
	
	private long friendId;
	
	@Column(name="status", columnDefinition="default 'PENDING'")
	private String status;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getFriendId() {
		return friendId;
	}
	public void setFriendId(long friendId) {
		this.friendId = friendId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getGeneratedId() {
		return generatedId;
	}
	public void setGeneratedId(int generatedId) {
		this.generatedId = generatedId;
	}
	
	
}
