package com.gohiram.haj.trackerrestservice.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gohiram.haj.trackerrestservice.dao.IFriendsManagerDao;
import com.gohiram.haj.trackerrestservice.exception.TrackerException;
import com.gohiram.haj.trackerrestservice.model.UserInformation;


@Repository
public class FriendsManagerDao implements IFriendsManagerDao {


	@Override
	public boolean acceptFriendRequest(String id, String friendId) throws TrackerException {
		
		return false;
	}

	@Override
	public boolean sendRequest(String id, String friendId) throws TrackerException {
		
		return false;
	}

	@Override
	public UserInformation findFriendById(String id, String friendId) throws TrackerException {
		
		return null;
	}

	@Override
	public List<UserInformation> findAllFriends(String id) throws TrackerException {
		
		return null;
	}

}
