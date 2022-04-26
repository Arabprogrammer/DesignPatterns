package com.app.decorator;

public class Shatta extends SandwichDecorator {

	public Shatta(Sandwich sand) {
		super(sand);
	}

	@Override
	public double getCost() {
		return super.getCost() + 0.5;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ",Shatta";
	}

}
