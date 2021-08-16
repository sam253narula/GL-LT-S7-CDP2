package com.after.implementing.abstarct.factory.example;

public class HumanFactory extends AbstractFactory {
	@Override
	public Species getSpecies(String type) {
		if (type.equalsIgnoreCase("male")) {
			return new Male();
		} else if (type.equalsIgnoreCase("female")) {
			return new Female();
		}
		return null;
	}

}
