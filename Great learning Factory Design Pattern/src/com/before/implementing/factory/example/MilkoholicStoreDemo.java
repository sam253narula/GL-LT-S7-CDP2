package com.before.implementing.factory.example;

/**
 *
 * @author Samarth Narula
 */

public class MilkoholicStoreDemo {

	public static void main(String[] args) {
		MilkShake chocolateMilkShake = new ChocolateMilkShake();
		chocolateMilkShake.makeMilkShake(5);
		
		MilkShake strawberryMilkShake = new StrawberryMilkShake();
		strawberryMilkShake.makeMilkShake(3);
	}

}
