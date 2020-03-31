package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	public List<Vehicle> vehicleList = new ArrayList<>();

	public boolean addVehicle(Vehicle vehicle) {
		return this.vehicleList.add(vehicle);
	}

	public void calculateBill() {
		int sum = 0;
		for (int i = 0; i < vehicleList.size(); i++) {
			if (vehicleList.get(i) instanceof Bike) {
				System.out.println(" 100€ for your " + vehicleList.get(i).getBrand() + " bike");
				sum += 100;
			}
			if (vehicleList.get(i) instanceof Car) {
				System.out.println(" 3000€ for your " + vehicleList.get(i).getBrand() + " car");
				sum += 3000;
			}
			if (vehicleList.get(i) instanceof Motorcycle) {
				System.out.println(" 1000€ for your " + vehicleList.get(i).getBrand() + " motorcycle");
				sum += 1000;
			}
		}
		System.out.println("annually you'll spend around " + sum + "€");
	}

	public void emptyGarage() {
		vehicleList.clear();
		System.out.println("emptied the garage.");
	}

	public void findVehicleByBrand(String brandName) {
		for (int i = 0; i < vehicleList.size(); i++) {
			if (vehicleList.get(i).getBrand().equals(brandName)) {
				System.out.println(vehicleList.get(i).toString());
			}
		}
	}

	public void removeVehicleByBrand(String brandName) {
		for (int i = 0; i < vehicleList.size(); i++) {
			if (vehicleList.get(i).getBrand().equals(brandName)) {
				this.removeVehicleByID(i + 1);
			}
		}
	}

	public void removeVehicleByID(int i) {
		vehicleList.remove(i - 1);
	}

	public void showList() {
		for (int i = 0; i < vehicleList.size(); i++) {
			System.out.println("Vehicle " + (i + 1) + ": " + vehicleList.get(i).toString());

		}
	}

}