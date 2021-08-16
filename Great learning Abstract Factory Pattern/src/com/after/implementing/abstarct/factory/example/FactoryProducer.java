package com.after.implementing.abstarct.factory.example;

/**
 *
 * @author Samarth Narula
 */

public class FactoryProducer {
	public static AbstractFactory getFactory(String typeOfFactory) {
		if (typeOfFactory.equalsIgnoreCase("human")) {
			return new HumanFactory();
		} else if(typeOfFactory.equalsIgnoreCase("animal")){
			return new AnimalFactory();
		}
		return null;
	}
}
