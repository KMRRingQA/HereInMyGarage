package com.qa.main;

public abstract class Vehicle {

	private String brand;
	private Integer mileage;
	private String colour;

	public Vehicle(String brand, Integer mileage, String colour) {
		super();
		this.brand = brand;
		this.mileage = mileage;
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}

	public String getColour() {
		return colour;
	}

	public Integer getMileage() {
		return mileage;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "brand=" + brand + ", mileage=" + mileage + "km , colour=" + colour;
	}

}
