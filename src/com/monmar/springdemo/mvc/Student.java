package com.monmar.springdemo.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.monmar.springdemo.mvc.validation.CourseCode;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	
	private LinkedHashMap<String, String> countryList;
	
	private String favoriteLanguage;
	
	private List<String> favoriteLanguages;
	
	private List<String> operatingSystems;
	
	@CourseCode(value="LUV", message="must start with LUV")
	private String courseCode;
	
	
	public Student() {
		countryList = new LinkedHashMap<>();
		countryList.put("BR", "Brazil");
		countryList.put("PL", "Poland");
		countryList.put("FR", "France");
		countryList.put("DE", "Germany");
		
		favoriteLanguages = new ArrayList<>();
		favoriteLanguages.add("Java");
		favoriteLanguages.add("C++");
		favoriteLanguages.add("PHP");
		favoriteLanguages.add("Ruby");
		
		operatingSystems = new ArrayList<>();
		operatingSystems.add("Linux");
		operatingSystems.add("Mac OS");
		operatingSystems.add("MS Windows");
		
		
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
	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public List<String> getFavoriteLanguages() {
		return favoriteLanguages;
	}

	public List<String> getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(List<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	
}
