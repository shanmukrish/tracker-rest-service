package com.gohiram.haj.trackerrestservice.dao;

import java.util.List;

import com.gohiram.haj.trackerrestservice.exception.TrackerException;
import com.gohiram.haj.trackerrestservice.model.UserInformation;

public interface IFriendsManagerDao {

	
	public boolean acceptFriendRequest(long id, long friendId) throws TrackerException;

	public boolean sendRequest(long id, long friendId) throws TrackerException;

	public List<UserInformation> findAllFriends(long id) throws TrackerException;
	
	
	
}
