package com.app.singletone;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LazySingletone {

	private String[] LETTERS = { "a", "b", "c", "d", "e" };
	private List<String> data = Arrays.asList(LETTERS);

	private static LazySingletone instance;

	public static LazySingletone getInstance() {
		if (instance == null) {
			instance = new LazySingletone();
		}
		return instance;
	}

	private LazySingletone() {
		Collections.shuffle(data);
	}

	public void printData() {
		for (String letter : data) {
			System.err.printf("%s", letter);
		}
		System.out.println();
	}

}