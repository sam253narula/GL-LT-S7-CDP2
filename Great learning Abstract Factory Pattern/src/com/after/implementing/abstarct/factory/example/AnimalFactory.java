package com.after.implementing.abstarct.factory.example;

/**
 *
 * @author Samarth Narula
 */

public class AnimalFactory extends AbstractFactory {
	@Override
	public Species getSpecies(String type) {
		if (type.equalsIgnoreCase("CAT")) {
			return new Cat();
		} else if (type.equalsIgnoreCase("DOG")) {
			return new Dog();
		}
		return null;
	}

}