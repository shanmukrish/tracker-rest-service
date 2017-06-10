package com.gohiram.haj.trackerrestservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gohiram.haj.trackerrestservice.model.TrackerRequest;
import com.gohiram.haj.trackerrestservice.model.TrackerResponse;
import com.gohiram.haj.trackerrestservice.model.UserInformation;
import com.gohiram.haj.trackerrestservice.service.IUserRegistrationService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/user")
public class UserRegistrationController {

	@Autowired
	private IUserRegistrationService userRegistrationService;

	@ApiOperation(consumes = "application/json", value = "/register", httpMethod = "POST", produces = "application/json", response = TrackerResponse.class)
	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public TrackerResponse<String> registerUser() {
		TrackerResponse<String> response = new TrackerResponse<>();
		response.setData(String.valueOf(userRegistrationService.isUserRegistered()));
		return response;

	}

}
