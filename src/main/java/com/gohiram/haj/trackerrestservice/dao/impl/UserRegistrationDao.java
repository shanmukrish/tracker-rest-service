package com.gohiram.haj.trackerrestservice.dao.impl;

import org.springframework.stereotype.Repository;

import com.gohiram.haj.trackerrestservice.dao.IUserRegistrationDao;

@Repository
public class UserRegistrationDao implements IUserRegistrationDao {

	@Override
	public boolean isUserRegistered()
	{
		return true;
	}
}
