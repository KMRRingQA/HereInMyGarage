package com.qa.main;

public class Bike extends Vehicle {

	private boolean isGeared;

	public Bike(String brand, Integer mileage, String colour, boolean isGeared) {
		super(brand, mileage, colour);
		this.setisGeared(isGeared);
	}

	public boolean getisGeared() {
		return isGeared;
	}

	public void setisGeared(boolean isGeared) {
		this.isGeared = isGeared;
	}

	@Override
	public String toString() {
		return "Bike: isGeared=" + isGeared + " " + super.toString();
	}

}
