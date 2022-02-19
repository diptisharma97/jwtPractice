package com.project.jwtdemo.payload.response;

public class MessageResponse {

	
	String message;
	public MessageResponse(String string) {
		this.message=string;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
