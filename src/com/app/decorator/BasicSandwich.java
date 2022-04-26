package com.app.decorator;

public class BasicSandwich implements Sandwich {

	@Override
	public double getCost() {
		return 10.0;
	}

	@Override
	public String getDescription() {
		return "Bread";
	}

}
