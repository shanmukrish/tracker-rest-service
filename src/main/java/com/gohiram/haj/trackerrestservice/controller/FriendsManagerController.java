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

@RestController("/friends")
public class FriendsManagerController {

	@Autowired
	private IFriendsManagerService friendsManagerService;

	@RequestMapping(path="/accept/{friendId}/{id}",method=RequestMethod.GET,produces={"application/json"})
	public ResponseEntity<TrackerResponse<Boolean>> acceptFriendRequest(@PathVariable String id,@PathVariable String friendId) throws TrackerException {
		return new ResponseEntity<>(
				new TrackerResponse<Boolean>().setData(friendsManagerService.acceptFriendRequest(id,friendId)),
				HttpStatus.ACCEPTED);
	}
	
	@RequestMapping(path="/send-friend-request/{friendId}/{id}",method=RequestMethod.GET,produces={"application/json"})
	public ResponseEntity<TrackerResponse<Boolean>> sendRequest(@PathVariable String id,@PathVariable String friendId) throws TrackerException {
		return new ResponseEntity<>(
				new TrackerResponse<Boolean>().setData(friendsManagerService.sendRequest(id,friendId)),
				HttpStatus.OK);
	}
	
	
	@RequestMapping(path="/find-friend/{id}",method=RequestMethod.GET,produces={"application/json"})
	public ResponseEntity<TrackerResponse<List<UserInformation>>> findAllFriends(@PathVariable String id) throws TrackerException {
		return new ResponseEntity<>(
				new TrackerResponse<List<UserInformation>>().setData(friendsManagerService.findAllFriends(id)),
				HttpStatus.OK);
	}

}
