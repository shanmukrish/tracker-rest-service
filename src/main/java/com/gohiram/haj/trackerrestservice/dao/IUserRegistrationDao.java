package com.gohiram.haj.trackerrestservice.dao;

import com.gohiram.haj.trackerrestservice.exception.TrackerException;
import com.gohiram.haj.trackerrestservice.model.UserInformation;

public interface IUserRegistrationDao {

	
	public boolean registerUser(UserInformation userInformation) throws TrackerException;
	public boolean isUserRegistered(String id) throws TrackerException;
	public UserInformation readUserInformation(String id) throws TrackerException;
	
}
