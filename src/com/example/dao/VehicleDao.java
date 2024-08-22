package com.example.dao;

import com.example.model.Vehicle;

public interface VehicleDao {
	void create(Vehicle vehicle);
	Vehicle findById(int id);
	Vehicle[] getByType(String type);
}
