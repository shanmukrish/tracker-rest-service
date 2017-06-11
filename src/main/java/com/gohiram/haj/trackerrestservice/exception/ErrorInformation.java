package com.gohiram.haj.trackerrestservice.exception;

import org.springframework.http.HttpStatus;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class ErrorInformation {

	@ApiModelProperty(name = "message")
	private String message;

	@ApiModelProperty(name = "statusCode")
	private HttpStatus statusCode;

	@ApiModelProperty(name = "developerMessage")
	private String developerMessage;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

	public HttpStatus getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}

}
