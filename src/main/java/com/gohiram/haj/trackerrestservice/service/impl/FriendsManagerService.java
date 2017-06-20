package com.gohiram.haj.trackerrestservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gohiram.haj.trackerrestservice.dao.IFriendsManagerDao;
import com.gohiram.haj.trackerrestservice.exception.TrackerException;
import com.gohiram.haj.trackerrestservice.model.UserInformation;
import com.gohiram.haj.trackerrestservice.service.IFriendsManagerService;

@Service
public class FriendsManagerService implements IFriendsManagerService {

	@Autowired
	private IFriendsManagerDao friendsManagerDao;

	@Override
	public boolean acceptFriendRequest(String id, String friendId) throws TrackerException {

		return friendsManagerDao.acceptFriendRequest(id, friendId);
	}

	@Override
	public boolean sendRequest(String id, String friendId) throws TrackerException {

		return friendsManagerDao.sendRequest(id, friendId);
	}

	@Override
	public UserInformation findFriendById(String id, String friendId) throws TrackerException {

		return friendsManagerDao.findFriendById(id, friendId);
	}

	@Override
	public List<UserInformation> findAllFriends(String id) throws TrackerException {

		return friendsManagerDao.findAllFriends(id);
	}

}
