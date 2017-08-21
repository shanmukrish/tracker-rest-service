package com.gohiram.haj.trackerrestservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gohiram.haj.trackerrestservice.exception.TrackerException;
import com.gohiram.haj.trackerrestservice.model.TrackerResponse;
import com.gohiram.haj.trackerrestservice.model.UserInformation;
import com.gohiram.haj.trackerrestservice.service.IFriendsManagerService;
import com.gohiram.haj.trackerrestservice.service.impl.UserRegistrationService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController("/friends")
public class FriendsManagerController {

	@Autowired
	private IFriendsManagerService friendsManagerService;

	@Autowired
	private UserRegistrationService userRegistrationService;

	@ApiOperation(value = "Change status of friends request")
	@RequestMapping(path = "/accept/{friendId}/{id}/{status}", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<TrackerResponse<Boolean>> acceptFriendRequest(@PathVariable long id,
			@PathVariable long friendId,@ApiParam(name="status") @PathVariable String status) throws TrackerException {
		return new ResponseEntity<>(
				new TrackerResponse<Boolean>().setData(friendsManagerService.acceptFriendRequest(id, friendId,status)),
				HttpStatus.ACCEPTED);
	}

	@RequestMapping(path = "/send-friend-request/{friendId}/{id}", method = RequestMethod.GET, produces = {
			"application/json" })
	public ResponseEntity<TrackerResponse<Boolean>> sendRequest(@PathVariable long id, @PathVariable long friendId)
			throws TrackerException {
		boolean isUserRegistered = userRegistrationService.isUserRegistered(friendId);
		if (!isUserRegistered) {
			return new ResponseEntity<>(new TrackerResponse<Boolean>().setData(false), HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(
				new TrackerResponse<Boolean>().setData(friendsManagerService.sendRequest(id, friendId)), HttpStatus.OK);
	}

	@RequestMapping(path = "/find-friends/{id}", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<TrackerResponse<List<UserInformation>>> findAllFriends(@PathVariable long id)
			throws TrackerException {
		return new ResponseEntity<>(
				new TrackerResponse<List<UserInformation>>().setData(friendsManagerService.findAllFriends(id)),
				HttpStatus.OK);
	}

	@RequestMapping(path = "/find-friend/{friendId}", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<TrackerResponse<UserInformation>> findFriendById(@PathVariable long friendId)
			throws TrackerException {
		boolean isUserRegistered = userRegistrationService.isUserRegistered(friendId);
		UserInformation userInformation = null;
		if (isUserRegistered) {
			userInformation = friendsManagerService.findFriendById(friendId);
		}
		return new ResponseEntity<>(new TrackerResponse<UserInformation>().setData(userInformation), HttpStatus.OK);
	}

}
