package com.gohiram.haj.trackerrestservice.exception;

public class TrackerException extends Exception {
	
	private static final long serialVersionUID = 4153614440368350637L;

	public TrackerException(Exception e)
	{
		super(e);
	}
	
	public TrackerException(String message)
	{
		super(message);
	}
	
}
