package com.example.service;

import java.io.IOException;

import com.example.dao.CustomerDao;
import com.example.dao.CustomerDaoImpl;
import com.example.dao.RentalDao;
import com.example.dao.RentalDaoImpl;
import com.example.dao.VehicleDao;
import com.example.dao.VehicleDaoImpl;
import com.example.model.Customer;
import com.example.model.Rental;
import com.example.model.Vehicle;

public abstract class RentalService extends BaseService {
	
	private CustomerDao customerDao;
	private VehicleDao vehicleDao;
	private RentalDao rentalDao;
	private Rental rental;
	private String type;
	
	public RentalService() {
		this.customerDao = new CustomerDaoImpl();
		this.vehicleDao = new VehicleDaoImpl();
		this.rentalDao = new RentalDaoImpl();
	}
	
	public void call() throws IOException {
		displayCustomers();
		selectCustomer();
		selectType();
		displayVehicles();
		selectVehicle();
		enterRentInfo();
		this.rentalDao.create(this.rental);
		
		System.out.print("Do you want to continue ?");
		String flag = br.readLine();
		if("yes".equalsIgnoreCase(flag)) {
			call();
		}
		
	}

	private void enterRentInfo() throws NumberFormatException, IOException
	{
		System.out.println("Number of Rental Days : ");
		double rentDays = Double.parseDouble(br.readLine());
		this.rental.setRentDay(rentDays);
	}
	
	public void displayVehicles() {
		for(Vehicle vehicle : this.vehicleDao.getByType(this.type)) {
			System.out.println(vehicle);
		}
	}

	private void selectVehicle() throws IOException {
		System.out.println("Select Vehicle Id : ");
		int vehicleId = Integer.parseInt(br.readLine());
		Vehicle vehicle = this.vehicleDao.findById(vehicleId);
		this.rental.setVehicle(vehicle);
		
	}

	public void selectType() throws IOException {
		System.out.println("Select Vehicle Type : ");
		this.type = br.readLine();
	}

	private void selectCustomer() throws IOException {
		System.out.println("Enter Customer Id : ");
		String customerId = br.readLine();
		Customer customer = this.customerDao.findBy(customerId);
		this.rental.setCustomer(customer);
	}

	private void displayCustomers() {
		for(Customer customer : this.customerDao.getAll()) {
			System.out.println(customer);
		}
		
	}
}
