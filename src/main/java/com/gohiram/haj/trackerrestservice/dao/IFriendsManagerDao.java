package com.gohiram.haj.trackerrestservice.dao;

import java.util.List;

import com.gohiram.haj.trackerrestservice.exception.TrackerException;
import com.gohiram.haj.trackerrestservice.model.UserInformation;

public interface IFriendsManagerDao {

	
	public boolean acceptFriendRequest(String id, String friendId) throws TrackerException;

	public boolean sendRequest(String id, String friendId) throws TrackerException;

	public List<UserInformation> findAllFriends(String id) throws TrackerException;
	
	
}
