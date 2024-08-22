package com.example.dao;

import com.example.model.Customer;

public interface CustomerDao {
	void findBy(int id);
	Customer findBy(String name);
	Customer[] getAll();
}
