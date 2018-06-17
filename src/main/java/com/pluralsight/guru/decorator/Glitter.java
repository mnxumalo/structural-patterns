package com.pluralsight.guru.decorator;

public class Glitter extends FlowerBouquetDecorator {

	FlowerBouquet flowerBouquet;
	
	public Glitter(FlowerBouquet flowerBouquet) {
		this.flowerBouquet = flowerBouquet;
	}
	@Override
	public String getDescription() {
		
		return flowerBouquet.getDescription() + ", glitter";
	}

	@Override
	public double cost() {
		
		return flowerBouquet.cost() + 4;
	}

	

}
