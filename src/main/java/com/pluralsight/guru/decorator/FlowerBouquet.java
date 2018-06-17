package com.pluralsight.guru.decorator;

public abstract class FlowerBouquet {

	protected String description;
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double cost(); 
}
