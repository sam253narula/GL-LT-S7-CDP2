package com.after.implementing.factory.example;

/**
 *
 * @author Samarth Narula
 */

public class MilkoholicStore {

	public static void main(String[] args) {
		MilkShakeFactory milkShakeFactory = new MilkShakeFactory();
		milkShakeFactory.getMilkShakeOrder(5, "chocolate milkshake");
		milkShakeFactory.getMilkShakeOrder(3, "strawberry milkshake");
		milkShakeFactory.getMilkShakeOrder(2, "butterscotch milkshake");
	}

}
