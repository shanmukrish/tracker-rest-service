package com.gohiram.haj.trackerrestservice.exception;

import org.springframework.http.HttpStatus;

public class TrackerException extends Exception {
	
	private static final long serialVersionUID = 4153614440368350637L;

	private HttpStatus status;
	
	public TrackerException(Exception e)
	{
		super(e);
	}
	
	public TrackerException(String message)
	{
		super(message);
	}
	
	public TrackerException(String message, HttpStatus status)
	{
		super(message);
		this.status=status;
	}

	public HttpStatus getStatus() {
		return status;
	}
	
	
	
}
