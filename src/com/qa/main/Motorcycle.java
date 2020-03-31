package com.qa.main;

public class Motorcycle extends Vehicle {

	private boolean isScooter;

	public Motorcycle(String brand, Integer mileage, String colour) {
		super(brand, mileage, colour);
		// TODO Auto-generated constructor stub
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
