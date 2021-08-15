package com.app.shop.bill.exceptionHandler;

public class ExceptionMessageFormat {

	private String message;
	private String date;
	private String description;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ExceptionMessageFormat(String message, String string, String description) {
		this.message = message;
		this.date = string;
		this.description = description;
	}
	
}
