package com.pluralsight.guru.composite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CatalogComponentTest {

	@Test
	void testPrint() throws Exception{
		/*Create primary products for main catalog*/
        CatalogComponent mJeanProduct=new Product("Male: Jeans 32", 65.00);
        CatalogComponent mTShirtProduct=new Product("Male: T Shirt 38", 45.00);
 
        /*Create a composite product catalog and add female products to it*/
        CatalogComponent newCatalog = new ProductCatalog("Female Products");
        CatalogComponent fJeans=new Product("Female: Jeans 32", 65.00);
        CatalogComponent fTShirts=new Product("Female: T Shirt 38", 45.00);
        newCatalog.add(fJeans);
        newCatalog.add(fTShirts);
 
       /*Create a composite product catalog and add kid products to it*/
        CatalogComponent kidCatalog = new ProductCatalog("Kids Products");
        CatalogComponent kidShorts=new Product("Boys: Return Gift", 23.00);
        CatalogComponent kidPlayGears = new Product("Boys: Summer Play Gear", 65.00);
        kidCatalog.add(kidShorts);
        kidCatalog.add(kidPlayGears);
 
        /*Create primary catalog and add primary products and new catalogs to it*/
        CatalogComponent mainCatalog=new ProductCatalog("Primary Catalog");
        mainCatalog.add(mJeanProduct);
        mainCatalog.add(mTShirtProduct);
        mainCatalog.add(newCatalog);
        mainCatalog.add(kidCatalog);
 
        /*Print out product/catalog information*/
        mainCatalog.print();
		assertNotNull(mainCatalog);
	}

}
