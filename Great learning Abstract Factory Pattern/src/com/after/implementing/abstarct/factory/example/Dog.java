package com.after.implementing.abstarct.factory.example;

/**
 *
 * @author Samarth Narula
 */

public class Dog implements Species {
	@Override
	public void create() {
		System.out.println("Inside Dog::create() method.");
	}
}
