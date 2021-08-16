package com.before.implementing.abstarct.factory.example;

/**
 *
 * @author Samarth Narula
 */

public class Cat implements Species {

	@Override
	public void create() {
		System.out.println("Inside Cat::create() method.");
	}

}