package com.pluralsight.guru.decorator;

public class RoseBouquet extends FlowerBouquet {

	public RoseBouquet() {
		description = "Rose Bouquet";
	}

	@Override
	public double cost() {
		
		return 12.0;
	}

}
