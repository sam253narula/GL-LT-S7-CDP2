package com.before.implementing.abstarct.factory.example;

/**
 *
 * @author Samarth Narula
 */

public class HumanFactory {

	public static Species getSpecies(String type) {
		if (type.equalsIgnoreCase("male")) {
			return new Male();
		} else if (type.equalsIgnoreCase("female")) {
			return new Female();
		}
		return null;
	}

}
