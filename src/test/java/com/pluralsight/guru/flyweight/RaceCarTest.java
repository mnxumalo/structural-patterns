package com.pluralsight.guru.flyweight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RaceCarTest {

	@Test
	void testRaceCar() {
		 RaceCarClient raceCars[] = {
	                new RaceCarClient("midget"),
	                new RaceCarClient("midget"),
	                new RaceCarClient("midget"),
	                new RaceCarClient("sprint"),
	                new RaceCarClient("sprint"),
	                new RaceCarClient("sprint")
	        };
	        raceCars[0].moveCar(29, 3112);
	        raceCars[1].moveCar(39, 2002);
	        raceCars[2].moveCar(49, 1985);
	        raceCars[3].moveCar(59, 2543);
	        raceCars[4].moveCar(69, 2322);
	        raceCars[5].moveCar(79, 2135);
	       /*Output and observe the number of instances created*/
	       System.out.println("Midget Car Instances: " + FlyweightMidgetCar.number);
	       System.out.println("Sprint Car Instances: " + FlyweightSprintCar.number);
		assertNotNull(raceCars);
	}

}
