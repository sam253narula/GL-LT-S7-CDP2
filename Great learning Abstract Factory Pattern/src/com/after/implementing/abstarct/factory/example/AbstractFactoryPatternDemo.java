package com.after.implementing.abstarct.factory.example;

/**
 *
 * @author Samarth Narula
 */

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		// get Animal factory
		AbstractFactory animalFactory = FactoryProducer.getFactory("animal");
		// get an object of Dog
		Species dog = animalFactory.getSpecies("dog");
		// call create method of Dog
		dog.create();
		// get an object of Cat
		Species cat = animalFactory.getSpecies("cat");
		// call create method of Cate
		cat.create();
		// get human factory
		AbstractFactory humanFactory = FactoryProducer.getFactory("human");
		// get an object of Male
		Species male = humanFactory.getSpecies("male");
		// call create method of Shape Rectangle
		male.create();
		// get an object of Female
		Species female = humanFactory.getSpecies("female");
		// call create method of Female
		female.create();

	}
}
