package com.gohiram.haj.trackerrestservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Locations")
@Entity(name="location")
public class Location {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private String id;

	private String location;

	private Date lastUpdated;

	public Location() {

	}

	public Location(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getLastUpdatedOn() {
		return lastUpdated;
	}

	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdated = lastUpdatedOn;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
