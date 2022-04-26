package com.app.decorator;

public abstract class SandwichDecorator implements Sandwich {

	private Sandwich sandwich;

	public SandwichDecorator(Sandwich sand) {
		this.sandwich = sand;
	}

	@Override
	public double getCost() {
		return sandwich.getCost();
	}

	@Override
	public String getDescription() {
		return sandwich.getDescription();
	}

}
