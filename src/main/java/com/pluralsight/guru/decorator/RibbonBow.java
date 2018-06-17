package com.pluralsight.guru.decorator;

public class RibbonBow extends FlowerBouquetDecorator {

	FlowerBouquet flowerBouquet;
	public RibbonBow(FlowerBouquet flowerBouquet) {
		this.flowerBouquet = flowerBouquet;
	}
	@Override
	public String getDescription() {
		
		return flowerBouquet.getDescription() + ", ribbon bow";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return flowerBouquet.cost() + 6.5;
	}

	

}
