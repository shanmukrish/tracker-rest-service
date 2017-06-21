package com.gohiram.haj.trackerrestservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gohiram.haj.trackerrestservice.dao.IFriendsManagerDao;
import com.gohiram.haj.trackerrestservice.exception.TrackerException;
import com.gohiram.haj.trackerrestservice.model.UserInformation;
import com.gohiram.haj.trackerrestservice.service.IFriendsManagerService;
import com.gohiram.haj.trackerrestservice.service.IUserRegistrationService;

@Service
public class FriendsManagerService implements IFriendsManagerService {

	@Autowired
	private IFriendsManagerDao friendsManagerDao;
	
	@Autowired
	private IUserRegistrationService  userRegistrationService;

	@Override
	public boolean acceptFriendRequest(String id, String friendId) throws TrackerException {

		return friendsManagerDao.acceptFriendRequest(id, friendId);
	}

	@Override
	public boolean sendRequest(String id, String friendId) throws TrackerException {

		return friendsManagerDao.sendRequest(id, friendId);
	}

	@Override
	public List<UserInformation> findAllFriends(String id) throws TrackerException {

		return friendsManagerDao.findAllFriends(id);
	}

	@Override
	public UserInformation findFriendById(String friendId) throws TrackerException {
		return userRegistrationService.readUserInformation(friendId);
	}

}
