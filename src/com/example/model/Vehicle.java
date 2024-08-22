package com.example.model;

public class Vehicle {
	
	private int id;
	private String model;
	private String licenseNo;
	private double rentPrice;
	private boolean isAvailable = true;
	private static int count = 0;
	
	public Vehicle(String model, String licenseNo, double rentPrice) {
		this.model = model;
		this.licenseNo = licenseNo;
		this.rentPrice = rentPrice;
		count++;
		this.id = count;
	}

	public static int getCount() {
		return count;
	}
	
	

}
