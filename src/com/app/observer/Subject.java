package com.app.observer;

public interface Subject {

	void add(Observer observer);

	void remove(Observer observer);
	
	void notiyFyAllObserver();

}
