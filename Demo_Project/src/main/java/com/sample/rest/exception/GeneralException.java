package com.sample.rest.exception;

public class GeneralException extends Exception {
	
	private String errorCode;

	private String errorMessage;
	
	public GeneralException(String errorCode, String errorMessage) {
		super(errorCode + errorMessage);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	
	public GeneralException(String errorCode, String errorMessage, Throwable exception) {
		super(errorCode + errorMessage, exception);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	

}