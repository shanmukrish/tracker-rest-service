package com.gohiram.haj.trackerrestservice.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class TrackerRequest<T> {

	@ApiModelProperty(name="requestUid")
	private String requestUid;
	
	@ApiModelProperty(name="data")
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
