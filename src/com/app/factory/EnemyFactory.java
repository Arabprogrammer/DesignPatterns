package com.app.factory;

public class EnemyFactory {

	private static final int BIRD = 1;
	private static final int TURTLE = 2;

	public static Enemy createEnemy(int id) {
		switch (id) {
		case BIRD:
			return new Bird();
		case TURTLE:
			return new Turtle();
		default:
			throw new IllegalArgumentException("Unexpected value: " + id);
		}

	}
}
