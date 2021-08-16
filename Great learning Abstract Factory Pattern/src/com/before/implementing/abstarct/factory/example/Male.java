package com.before.implementing.abstarct.factory.example;

/**
 *
 * @author Samarth Narula
 */

public class Male implements Species {
	@Override
	public void create() {
		System.out.println("Inside Male::create() method.");
	}
}
