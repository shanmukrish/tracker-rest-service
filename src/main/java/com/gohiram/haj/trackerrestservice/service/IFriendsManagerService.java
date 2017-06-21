package com.gohiram.haj.trackerrestservice.service;

import java.util.List;

import com.gohiram.haj.trackerrestservice.exception.TrackerException;
import com.gohiram.haj.trackerrestservice.model.UserInformation;

public interface IFriendsManagerService {

	public boolean acceptFriendRequest(String id, String friendId) throws TrackerException;

	public boolean sendRequest(String id, String friendId) throws TrackerException;

	public List<UserInformation> findAllFriends(String id) throws TrackerException;

	public UserInformation findFriendById(String friendId) throws TrackerException;

}
