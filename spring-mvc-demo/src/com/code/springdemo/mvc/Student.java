package com.code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	
	private String country;
	
	//STEP 1
	private LinkedHashMap<String, String> countryOptions;
	
	//constructor
	public Student() {
		//STEP 1
		//populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		//STEP 1
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("GE", "Germany");
		countryOptions.put("IN", "India");
	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	//STEP 1
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	
	

}
