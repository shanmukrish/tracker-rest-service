package com.gohiram.haj.trackerrestservice.model;

import com.gohiram.haj.trackerrestservice.exception.ErrorInformation;

public class TrackerResponse<T> {

	private ErrorInformation errorInformation;
	private T data;
	
	
	public ErrorInformation getErrorInformation() {
		return errorInformation;
	}
	public void setErrorInformation(ErrorInformation errorInformation) {
		this.errorInformation = errorInformation;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
}
