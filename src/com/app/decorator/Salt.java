package com.app.decorator;

public class Salt extends SandwichDecorator {

	public Salt(Sandwich sand) {
		super(sand);
	}

	@Override
	public double getCost() {
		return super.getCost() + 0.8;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ",Salt";
	}
	
}
