package com.example.dao;

import com.example.model.Customer;
import com.example.model.Rental;

public interface RentalDao {
	void create(Rental rental);
	Rental findBy(int id);
	Rental findBy(Customer customer);	
}
