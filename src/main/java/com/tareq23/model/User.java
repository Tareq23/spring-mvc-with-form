package com.tareq23.model;

public class User {

	private String name, gender,country,introduction,visitedCountries[];

	public String[] getVisitedCountries() {
		return visitedCountries;
	}

	public void setVisitedCountries(String[] visitedCountries) {
		this.visitedCountries = visitedCountries;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

//	@Override
//	public String toString() {
//		return "User [name=" + name + ", gender=" + gender + ", country=" + country + "]";
//	}

	
	
	
}
