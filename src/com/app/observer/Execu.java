package com.app.observer;

public class Execu {

	public static void main(String[] args) {

		Product phone = new Product("S8+",100);

		Person bashir = new Person("Bashir");
		Person ahmad = new Person("Ahmad");
		Person mohamad = new Person("Mohamad");

		phone.add(bashir);
		phone.add(ahmad);
		phone.add(mohamad);

		phone.setAvailability(true);
	}
}
