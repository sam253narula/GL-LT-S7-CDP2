package com.prototype.mutability.problemandsolution.example;

/**
*
* @author Samarth Narula
*/

public class Main {
    
    /**
     * @param args
     */
    public static void main(String[] args) {        
        
    	// Creating the first Honda City car
    	Car hondaCity1 = new Car();
        hondaCity1.setTransmissionType("Automatic");
      //  hondaCity1.setTransmissionType(new TransmissionType("Automatic"));
        
        // hondaCity2 is Deep Copy
        // Cloning the Honda City car to create a new Honda City car with manual transmission
        Car hondaCity2 = hondaCity1.clone();
        hondaCity2.getTransmissionType().setType("Manual");
    //    hondaCity2.setTransmissionType("Manual");
      //  hondaCity2.setTransmissionType(new TransmissionType("Manual"));
        System.out.println("Transmission Type of hondaCity1: " + hondaCity1.getTransmissionType().getType());
        System.out.println("Transmission Type of hondaCity2: " + hondaCity2.getTransmissionType().getType());
       
    }
                
}

