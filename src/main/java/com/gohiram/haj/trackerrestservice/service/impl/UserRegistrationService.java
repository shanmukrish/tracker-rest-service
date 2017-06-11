package com.gohiram.haj.trackerrestservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gohiram.haj.trackerrestservice.dao.IUserRegistrationDao;
import com.gohiram.haj.trackerrestservice.exception.TrackerException;
import com.gohiram.haj.trackerrestservice.model.UserInformation;
import com.gohiram.haj.trackerrestservice.service.IUserRegistrationService;


@Service
public class UserRegistrationService implements IUserRegistrationService {

	@Autowired
	private IUserRegistrationDao userRegistrationDao;

	@Override
	public boolean registerUser(UserInformation userInformation) throws TrackerException {
		return userRegistrationDao.registerUser(userInformation);
	}

	@Override
	public boolean isUserRegistered(String id) throws TrackerException {
		return userRegistrationDao.isUserRegistered(id);
	}

	@Override
	public UserInformation readUserInformation(String id) throws TrackerException {
		return userRegistrationDao.readUserInformation(id);
	}

	
}
