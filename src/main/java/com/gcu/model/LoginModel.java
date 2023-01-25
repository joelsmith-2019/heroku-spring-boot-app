package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginModel {

	@NotNull(message="You must provide a username")
	@Size(min=1, max=32, message="Username must be between 1-32 characters")
	private String username;
	
	@NotNull(message="You must provide a password")
	@Size(min=1, max=32, message="Password must be between 1-32 characters")	
	private String password;
	
	public LoginModel() {
		this.username = "";
		this.password = "";
	}
	
	public LoginModel(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
