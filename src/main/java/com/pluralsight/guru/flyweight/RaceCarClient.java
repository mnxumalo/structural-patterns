package com.pluralsight.guru.flyweight;

public class RaceCarClient {

	private RaceCar raceCar;
	private int currentX = 0;
	private int currentY = 0;
	
	public RaceCarClient(String name) {
		raceCar = CarFactory.getRacecar(name);
	}
	
	public void moveCar(int newX, int newY) {
		raceCar.moveCar(currentX, currentY, newX, newY);
		currentX = newX;
		currentY = newY;
	}
}
