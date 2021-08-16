package com.after.implementing.abstarct.factory.example;

/**
 *
 * @author Samarth Narula
 */

public class Female implements Species {
	@Override
	public void create() {
		System.out.println("Inside Female::create() method.");
	}

}
