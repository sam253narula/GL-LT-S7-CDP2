package com.prototype.mutability.problemandsolution.example;

/**
 *
 * @author Samarth Narula
 */

public class TransmissionType  implements Cloneable  {
	
	private String type;

	public TransmissionType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
    public TransmissionType clone() {
        try {
        	TransmissionType transmissionType = (TransmissionType) super.clone();
            return transmissionType;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


}
