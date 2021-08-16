package com.after.implementing.factory.example;

import java.util.ArrayList;

/**
 *
 * @author Samarth Narula
 */

public class ChocolateMilkShake implements MilkShake {

	@Override
	public void makeMilkShake(int quantity) {
//		ArrayList<MilkShake> chocolateMilkShakes = new ArrayList<>();
//		for (int i = 1; i <= quantity; i++) {
//			ChocolateMilkShake chocolateMilkShake = new ChocolateMilkShake();
//			chocolateMilkShakes.add(chocolateMilkShake);
//		}

		System.out.println("One order of " + quantity + " Chocolate MilkShake is ready");
	//	return chocolateMilkShakes;

	}

}
