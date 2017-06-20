package com.gohiram.haj.trackerrestservice.model;

import java.util.Date;

public class Location {

	private String location;
	private Date lastUpdatedOn;
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}
	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}
	
	
	
}
