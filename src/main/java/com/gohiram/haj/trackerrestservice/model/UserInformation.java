package com.gohiram.haj.trackerrestservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity(name="Users")
@Table(name="Users")
@ApiModel
public class UserInformation {

	@ApiModelProperty
	private String firstName;
	
	@ApiModelProperty
	private String lastName;
	
	@ApiModelProperty
	private String emailId;
	
	@Id
	@ApiModelProperty
	private long mobileNumber;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return emailId;
	}
	public void setEmail(String email) {
		this.emailId = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
}
