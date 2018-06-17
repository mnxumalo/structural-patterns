package com.pluralsight.guru.flyweight;

public class FlyweightSprintCar extends RaceCar {

	public static int number;
	public FlyweightSprintCar() {
		number++;
	}
	@Override
	void moveCar(int currentX, int currentY, int newX, int newY) {
		System.out.println("New location of " + name + " is X: "+ newX + " - Y:" + newY);

	}

}
