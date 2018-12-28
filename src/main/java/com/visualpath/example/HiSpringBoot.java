package com.visualpath.example;

public class HiSpringBoot {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Hi Spring Boot message: " + message);
	}

}
