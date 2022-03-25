package com.app.singletone;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreadSingletone {

	private String[] LETTERS = { "a", "b", "c", "d", "e" };
	private List<String> data = Arrays.asList(LETTERS);
	private static boolean delayMe = true;

	private static ThreadSingletone instance;

	/*
	 * Es gibt zwei Möglishkeiten ,um das Problem zu Lösen. 
	 * 1. keyword synchronized  
	 * 2. synchronized in der Methode
	 * 
	 */
	public static ThreadSingletone getInstance() {
		if (instance == null) {
			synchronized (ThreadSingletone.class) {
				if (instance == null) {
					if (delayMe) {
						try {
							delayMe = false;
							Thread.currentThread();
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					instance = new ThreadSingletone();
				}
			}
		}
		return instance;

	}

	private ThreadSingletone() {
		Collections.shuffle(data);
	}

	public void printData() {
		for (String letter : data) {
			System.out.printf("%s ", letter);
		}
		System.out.println();
	}

}
