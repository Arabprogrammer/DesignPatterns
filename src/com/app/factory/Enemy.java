package com.app.factory;

public abstract class Enemy {

	private String name;
	private int damage;
	private int health;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamge(int damge) {
		this.damage = damge;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void showUp() {
		System.out.printf("[%S] is showing up, Damge is [%d], Health is [%d] \n", getName(), getDamage(), getHealth());
	}
}
