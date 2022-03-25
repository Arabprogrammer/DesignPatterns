package com.app.singletone;

public class Driver {

	public static void main(String[] args) {

//		LazySingletone inst1 = LazySingletone.getInstance();
//		LazySingletone inst2 = LazySingletone.getInstance();
//
//		System.out.println("instance 1 hash: " + inst1.hashCode());
//		System.out.println("instance 2 hash: " + inst2.hashCode());
//		inst1.printData();
//		inst2.printData();

		new DataPrinter().start();
		new DataPrinter().start();

	}

}

class DataPrinter extends Thread {

	@Override
	public void run() {
		ThreadSingletone.getInstance().printData();
	}

}
