package com.app.decorator;

public class Fool extends SandwichDecorator {

	public Fool(Sandwich sand) {
		super(sand);
	}

	@Override
	public double getCost() {
		return super.getCost() + 3;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ",Fool";
	}

}
