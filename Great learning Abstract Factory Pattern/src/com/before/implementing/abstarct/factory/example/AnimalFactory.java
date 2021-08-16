package com.before.implementing.abstarct.factory.example;

/**
 *
 * @author Samarth Narula
 */

public class AnimalFactory {

	public static Species getSpecies(String type) {
		if (type.equalsIgnoreCase("CAT")) {
			return new Cat();
		} else if (type.equalsIgnoreCase("DOG")) {
			return new Dog();
		}
		return null;
	}

}