package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		Garage garage = new Garage();
		garage.addVehicle(new Car("Audi", 2001231200, "black", false));
		garage.addVehicle(new Car("BMW", 543456, "silver", true));
		garage.addVehicle(new Bike("Giant", 20000, "black", true));
		garage.addVehicle(new Motorcycle("Vespa", 123123, "blue", true));
//		((Motorcycle) garage.vehicleList.get(3)).setisScooter(true);
//		garage.addVehicle(vehicle);
//		garage.addVehicle(vehicle);
//		garage.removeVehicleByBrand("Audi");
//		garage.calculateBill();
		garage.showList();
	}

}
