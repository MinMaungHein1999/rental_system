package com.example.dao;

import com.example.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	private static Customer[] customerDB = new Customer[1000];
	
	static{
		customerDB[Customer.getCount()-1] = new Customer("John Doe");
		customerDB[Customer.getCount()-1] = new Customer("Jane Smith");
		customerDB[Customer.getCount()-1] = new Customer("Alice Johnson");
		customerDB[Customer.getCount()-1] = new Customer("Bob Brown");
		customerDB[Customer.getCount()-1] = new Customer("Charlie Davis");
	}

	@Override
	public void findBy(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer findBy(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
