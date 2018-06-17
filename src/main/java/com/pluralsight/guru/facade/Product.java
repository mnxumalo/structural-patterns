package com.pluralsight.guru.facade;

public class Product {

	public int productId;
	public String name;
	
	public Product() {	}
	
	public Product(int productId, String name) {	
		this.name = name;
		this.productId = productId;
	}
}
