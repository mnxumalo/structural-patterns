package com.pluralsight.guru.facade;

public class OrderServiceFacadeImpl implements OrderServiceFacade {

	@Override
	public boolean placeOrder(int productId) {
		boolean orderFulfilled = false;
		
		Product product = new Product();		
		product.productId = productId;
		if(InventoryService.isAvailable(product)) {
			System.out.println("Product with Id: " + product.productId + " is available.");
			boolean paymentConfirmed = PaymentService.makePayment();
			if(paymentConfirmed) {
				System.out.println("Payment confirmed...");
				ShippingService.shipProduct(product);
				System.out.println("Product shipped...");
				orderFulfilled = true;
			}
		}
		return orderFulfilled;
	}

}
