package com.qa.main;

public class Car extends Vehicle {

	private boolean fourWheelDrive;

	public Car(String brand, Integer mileage, String colour, boolean fourWheelDrive) {
		super(brand, mileage, colour);
		this.setFourWheelDrive(fourWheelDrive);
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
