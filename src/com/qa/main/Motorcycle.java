package com.qa.main;

public class Motorcycle extends Vehicle {

	private boolean isScooter;

	public Motorcycle(String brand, Integer mileage, String colour, boolean isScooter) {
		super(brand, mileage, colour);
		this.setisScooter(isScooter);
	}

	public boolean getisScooter() {
		return isScooter;
	}

	public void setisScooter(boolean isScooter) {
		this.isScooter = isScooter;
	}

	@Override
	public String toString() {
		return "Motorcycle: isScooter=" + isScooter + " " + super.toString();
	}

}
