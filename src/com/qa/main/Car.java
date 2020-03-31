package com.qa.main;

public class Car extends Vehicle {

	private boolean fourWheelDrive;

	public Car(String brand, Integer mileage, String colour) {
		super(brand, mileage, colour);
		// TODO Auto-generated constructor stub
	}

	public boolean isFourWheelDrive() {
		return fourWheelDrive;
	}

	public void setFourWheelDrive(boolean fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}

	@Override
	public String toString() {
		return "Car: fourWheelDrive=" + fourWheelDrive + " " + super.toString();
	}

}
