package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		Garage garage = new Garage();
		garage.addVehicle(new Car("Audi", 2001231200, "black"));
		((Car) garage.vehicleList.get(0)).setFourWheelDrive(false);
		garage.addVehicle(new Car("BMW", 543456, "silver"));
		((Car) garage.vehicleList.get(1)).setFourWheelDrive(true);
		garage.addVehicle(new Bike("Giant", 20000, "black"));
		((Bike) garage.vehicleList.get(2)).setisGeared(true);
		garage.addVehicle(new Motorcycle("Vespa", 123123, "blue"));
		((Motorcycle) garage.vehicleList.get(3)).setisScooter(true);
//		garage.addVehicle(vehicle);
//		garage.addVehicle(vehicle);
		garage.removeVehicleByBrand("Audi");
//		garage.calculateBill();
		garage.showList();
	}

}
