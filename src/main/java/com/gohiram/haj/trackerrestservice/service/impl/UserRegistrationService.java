package com.gohiram.haj.trackerrestservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gohiram.haj.trackerrestservice.dao.IUserRegistrationDao;
import com.gohiram.haj.trackerrestservice.service.IUserRegistrationService;


@Service
public class UserRegistrationService implements IUserRegistrationService {

	@Autowired
	private IUserRegistrationDao userRegistrationDao;

	@Override
	public boolean isUserRegistered() {
		return userRegistrationDao.isUserRegistered();
	}
	
}
