package com.gohiram.haj.trackerrestservice.model;

public class TrackerRequest<T> {

	private String requestUid;
	private T data;
	
	public String getRequestUid() {
		return requestUid;
	}
	public void setRequestUid(String requestUid) {
		this.requestUid = requestUid;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

	
	
	
}
