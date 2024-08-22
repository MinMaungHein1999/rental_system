package com.example.model;

public class Customer {
	private int id;
	private String name;
	private static int count = 0;
	
	public Customer(String name) {
		this.name = name;
		count++;
		this.id = count;
	}

	public static int getCount() {
		return count;
	}
	
}
