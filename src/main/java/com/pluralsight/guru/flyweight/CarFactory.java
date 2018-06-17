package com.pluralsight.guru.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {

	private static Map<String, RaceCar> flyweights = new HashMap<>();
	
	public static RaceCar getRacecar(String key) {
		if(flyweights.containsKey(key)) {
			return flyweights.get(key);
		}
		
		RaceCar raceCar;
		
		switch (key) {
		case "midget":
			raceCar = new FlyweightMidgetCar();
			raceCar.name = "Midget";
			raceCar.speed = 140;
			raceCar.horsePower = 400;
			break;
		case "sprint":
			raceCar = new FlyweightSprintCar();
			raceCar.name = "Sprint Car";
			raceCar.speed = 160;
			raceCar.horsePower = 1000;
			break;
		default:
			throw new IllegalArgumentException("Unsupported car type.");
		}
		
		flyweights.put(key, raceCar);
		return raceCar;
	}
}
