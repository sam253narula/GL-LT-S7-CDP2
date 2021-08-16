package com.prototype.mutability.problemandsolution.example;

/**
*
* @author Samarth Narula
*/

public class Car implements Cloneable {
    
	private String fuelType;
	private int seatingCapacity;
	private String bodyType;
    private TransmissionType transmissionType;
    
    public Car() {
        
    }
    
    public TransmissionType getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(String type) {
		TransmissionType transmissionType = new TransmissionType(type);
		this.transmissionType = transmissionType;
	}
    
//	public void setTransmissionType(TransmissionType transmissionType) {
//		this.transmissionType = transmissionType;
//	}

    
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
        	Car car = (Car) super.clone();
        	car.transmissionType = transmissionType.clone();
            return car;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    
}
