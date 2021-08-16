package com.prototype.example;

/**
*
* @author Samarth Narula
*/

public class Car implements Cloneable {

	private String fuelType;
	private int seatingCapacity;
	private String bodyType;

	public Car() {
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}



	@Override
	public Car clone() {
		try {
			return (Car) super.clone();
		} catch (CloneNotSupportedException ex) {
			throw new AssertionError();
		}
	}
	
	

}
