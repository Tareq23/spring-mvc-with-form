package com.tareq23.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;




public class User {
	
	@NotEmpty
	@Size(min=5, max=45)
	private String name;
	
	
	private String email;
	private String password;
	private String country;
	private String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
