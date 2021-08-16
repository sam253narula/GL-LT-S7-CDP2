package com.after.implementing.factory.example;

import java.util.ArrayList;

/**
 *
 * @author Samarth Narula
 */

public class ButterscotchMilkShake implements MilkShake {

	@Override
	public void makeMilkShake(int quantity) {
//		ArrayList<MilkShake> butterscotchMilkShakes = new ArrayList<>();
//		for (int i = 1; i <= quantity; i++) {
//			ButterscotchMilkShake chocolateMilkShake = new ButterscotchMilkShake();
//			butterscotchMilkShakes.add(chocolateMilkShake);
//		}

		System.out.println("One order of " + quantity + " Butterscotch MilkShake is ready");
		//return butterscotchMilkShakes;

	}

}
