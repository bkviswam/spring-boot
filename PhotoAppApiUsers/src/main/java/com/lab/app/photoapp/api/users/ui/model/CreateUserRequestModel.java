package com.lab.app.photoapp.api.users.ui.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserRequestModel {
	@NotNull(message = "First name can not be null")
	@Size(min=2, message="First name should be more than 2 characters")
	private String firstName;
	
	@NotNull(message = "Last name can not be null")
	@Size(min=2, message="Last name should be more than 2 characters")
	private String lastName;
	
	@NotNull(message = "Email can not be null")
	@Email
	private String email;
	
	@NotNull(message = "Password can not be null")
	@Size(min=6, max=16, message="Password should be between 6 - 16 characters")
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
