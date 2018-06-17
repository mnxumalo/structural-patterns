package com.pluralsight.guru.flyweight;

public class FlyweightMidgetCar extends RaceCar {

	/*Track number of Flyweight instantiation.*/
	public static int number;
	public FlyweightMidgetCar() {
		number++;
	}
	
	/*This method accepts car location(extrinsic). No reference to current or
	 * new location is maintained inside the Flyweight implementation.*/
	@Override
	void moveCar(int currentX, int currentY, int newX, int newY) {
		System.out.println("New location of " + name + " is X: "+ newX + " - Y:" + newY);

	}

}
