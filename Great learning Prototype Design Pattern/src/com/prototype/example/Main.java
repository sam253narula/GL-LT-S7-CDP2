package com.prototype.example;

/**
*
* @author Samarth Narula
*/

public class Main {
    public static void main(String[] args) {
       
    	// Creating the first Honda City car
    	Car hondaCity1 = new Car();
        hondaCity1.setSeatingCapacity(5);
        hondaCity1.setBodyType("Sedan");
        hondaCity1.setFuelType("Petrol");
        
        // hondaCity2 is a shallow copy
        // Cloning the Honda City car to create a new Honda City car
        Car hondaCity2 = hondaCity1.clone();
        hondaCity1.setBodyType("abc");
        System.out.println("Body Type of hondaCity1: " + hondaCity1.getBodyType());
        System.out.println("Body Type of hondaCity2: " + hondaCity2.getBodyType());
    }    
    
}
