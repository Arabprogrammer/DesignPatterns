package com.app.decorator;

public class Driver {

	public static void main(String[] args) {

		Sandwich fool = new Fool(new Salt(new BasicSandwich()));
		System.out.printf("Description is [%s] \n", fool.getDescription());
		System.out.printf("Cost is is [%s] \n", fool.getCost());
		
		Sandwich foolWithShatta = new Fool(new Salt(new Shatta(new BasicSandwich())));
		System.out.printf("Description is [%s] \n", foolWithShatta.getDescription());
		System.out.printf("Cost is is [%s] \n", foolWithShatta.getCost());
	}

}
