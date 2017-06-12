package com.gohiram.haj.trackerrestservice.model;

import com.gohiram.haj.trackerrestservice.exception.ErrorInformation;

import io.swagger.annotations.ApiModel;


@ApiModel
public class TrackerResponse<T> {

	private ErrorInformation errorInformation;
	private T data;
	
	
	public ErrorInformation getErrorInformation() {
		return errorInformation;
	}
	public TrackerResponse<T> setErrorInformation(ErrorInformation errorInformation) {
		this.errorInformation = errorInformation;
		return this;
	}
	public T getData() {
		return data;
	}
	public TrackerResponse<T> setData(T data) {
		this.data = data;
		return this;
	}
	
	
}
