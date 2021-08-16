
package com.before.implementing.factory.example;

import java.util.ArrayList;

/**
 *
 * @author Samarth Narula
 */

public class StrawberryMilkShake implements MilkShake {

	@Override
	public ArrayList<MilkShake> makeMilkShake(int quantity) {
		ArrayList<MilkShake> chocolatePackage = new ArrayList<>();
		for (int i = 1; i <= quantity; i++) {
			ChocolateMilkShake chocolate = new ChocolateMilkShake();
			chocolatePackage.add(chocolate);
		}

		System.out.println("One order of " + quantity + " Strawberry MilkShake is ready");
		return chocolatePackage;

	}

}
