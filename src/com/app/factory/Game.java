package com.app.factory;

import java.util.Random;

public class Game {

	public static Random random = new Random();

	public static void main(String[] args) {

		int loop = 5;
		while (loop > 0) {
			loop--;
			Enemy enemy = EnemyFactory.createEnemy(getRandom(2, 1));
			enemy.showUp();
		}
	}

	public static int getRandom(int max, int min) {
		return random.nextInt((max - min) + 1) + min;
	}

}
