package com.tareq23.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;




public class User {
	
//	@NotEmpty
	@Size(min=5, max=45, message="Enter your name between 5 to 40 characters")
	private String name;
	
	@Email
	@Size(max=50, message="Enter your email which length less than equal 50")
	private String email;
	
	@Size(min=6, max=16, message="Password length should be between 6 to 16")
	private String password;
	
	
	private String country;
	private String gender;
	private String[] visitedCountries;
	
	

	public User(@Size(min = 5, max = 45, message = "Enter your name between 5 to 40 characters") String name,
			@Email @Size(max = 50, message = "Enter your email which length less than equal 50") String email,
			@Size(min = 6, max = 16, message = "Password length should be between 6 to 16") String password) {
		
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String[] getVisitedCountries() {
		return visitedCountries;
	}

	public void setVisitedCountries(String[] visitedCountries) {
		this.visitedCountries = visitedCountries;
	}

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

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
}
