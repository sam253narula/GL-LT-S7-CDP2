package com.before.implementing.abstarct.factory.example;

/**
 *
 * @author Samarth Narula
 */

public class WithoutAbstractFactoryPatternDemo {
	public static void main(String[] args) {
		// get Animal factory
		Species dog = AnimalFactory.getSpecies("dog");
		// call create method of Dog
		dog.create();
		// get an object of Cat
		Species cat = AnimalFactory.getSpecies("cat");
		// call create method of Cat
		cat.create();
		// get human factory
		Species male = HumanFactory.getSpecies("male");
		// call create method of Shape Rectangle
		male.create();
		// get an object of Female
		Species female = HumanFactory.getSpecies("female");
		// call create method of Female
		female.create();

	}
}
