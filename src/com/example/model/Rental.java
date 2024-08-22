package com.example.model;

public class Rental {
	private Vehicle vehicle;
	private Customer customer;
	private double rentDay;
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getRentDay() {
		return rentDay;
	}
	public void setRentDay(double rentDay) {
		this.rentDay = rentDay;
	}
	
}
