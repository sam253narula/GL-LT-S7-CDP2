package com.after.implementing.factory.example;

import java.util.ArrayList;

/**
 *
 * @author Samarth Narula
 */

public class MilkShakeFactory {

	private MilkShake getMilkShake(String type) {
		switch (type) {
		case "chocolate milkshake":
			return new ChocolateMilkShake();
		case "strawberry milkshake":
			return new StrawberryMilkShake();
		case "butterscotch milkshake":
			return new ButterscotchMilkShake();
		default:
			return null;
		}
	}

	public void getMilkShakeOrder(int quantity, String type) {
		MilkShake milkshake = getMilkShake(type);
		//ArrayList<MilkShake> milkshakeOrders = 
				milkshake.makeMilkShake(quantity);
	//	return milkshakeOrders;
	}

}
