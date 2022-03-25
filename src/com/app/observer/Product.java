package com.app.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

	private String name;
	private String availability;

	private List<Observer> observerList;

	public Product(String name) {
		this.name = name;
		this.observerList = new ArrayList<>();
	}

	@Override
	public void add(Observer observer) {
		this.observerList.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		this.observerList.remove(observer);
	}

	@Override
	public void notiyFyAllObserver() {
		for (Observer observer : observerList) {
			observer.update(availability);
		}
	}

	public void setAvailability(Boolean availabil) {
		availability = "the " + name + " is " + (availabil ? "available" : "not available");
		notiyFyAllObserver();
	}

}
