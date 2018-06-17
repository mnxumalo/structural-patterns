package com.pluralsight.guru.composite;

import java.awt.List;
import java.util.ArrayList;

public class ProductCatalog extends CatalogComponent {
	
	private String name;
	private ArrayList<CatalogComponent> products = new ArrayList<>();
	public ProductCatalog(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		
		return this.name;
	}
	
	@Override
	public double getPrice() {
		
		return super.getPrice();
	}

	@Override
	public void add(CatalogComponent catalogComponent) {
		
		products.add(catalogComponent);
	}
	@Override
	public void remove(CatalogComponent catalogComponent) {
		
		products.remove(catalogComponent);
	}
	
	@Override
	public void print() {
		
		for(CatalogComponent product : products) {
			product.print();
		}
	}
}
