package com.example.apicreate;

public class carnames {
	
	private int number;
	private String name;
	private String country;
	
	
	public carnames(int number, String name, String country) {
		this.number = number;
		this.name = name;
		this.country = country;
	}
	
	public int getID() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCountry() {
		return country;
	}
	
	
	
}
