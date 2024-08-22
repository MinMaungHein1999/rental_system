package com.example.dao;

import com.example.model.Car;
import com.example.model.Cycle;
import com.example.model.Vehicle;

public class VehicleDaoImpl implements VehicleDao{
	private static Vehicle[] vehicleDB = new Vehicle[1000];
	
	static {
		System.out.println("*****Preparing DB*********");
		 vehicleDB[Vehicle.getCount()-1] = new Cycle("Mountain Bike", "LIC123", 15.5);
	       vehicleDB[Vehicle.getCount()-1] = new Cycle("Road Bike", "LIC456", 18.0);
	       vehicleDB[Vehicle.getCount()-1] = new Cycle("Hybrid Bike", "LIC789", 16.75);
	       vehicleDB[Vehicle.getCount()-1] = new Cycle("Electric Bike", "LIC101", 25.0);
	       vehicleDB[Vehicle.getCount()-1] = new Cycle("Folding Bike", "LIC202", 20.0);
	       vehicleDB[Vehicle.getCount()-1] = new Car("Sedan", "CAR123", 50.0);
	        vehicleDB[Vehicle.getCount()-1] = new Car("SUV", "CAR456", 75.0);
	        vehicleDB[Vehicle.getCount()-1] = new Car("Convertible", "CAR789", 85.0);
	        vehicleDB[Vehicle.getCount()-1] = new Car("Hatchback", "CAR101", 40.0);
	        vehicleDB[Vehicle.getCount()-1] = new Car("Coupe", "CAR202", 60.0);  
	}
	
	public VehicleDaoImpl() {
		
	}
	
	@Override
	public void create(Vehicle vehicle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vehicle findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vehicle[] getByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
