package com.HDAP.Entities.ExceptionsHandling;


public class ErrorModel {
	private String code;
	private String message;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ErrorModel(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public ErrorModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ErrorModel [code=" + code + ", message=" + message + "]";
	}
	
	
}
