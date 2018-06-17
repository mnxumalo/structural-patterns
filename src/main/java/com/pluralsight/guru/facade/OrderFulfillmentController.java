package com.pluralsight.guru.facade;

public class OrderFulfillmentController {

	OrderServiceFacade orderServiceFacade;
	boolean orderFulfilled = false;
	public void orderProduct(int productId) {
		orderFulfilled = orderServiceFacade.placeOrder(productId);
		System.out.println("OrderFulfillmentController: Order fulfillment completed.");
	}
	public OrderServiceFacade getOrderServiceFacade() {
		return orderServiceFacade;
	}
	public void setOrderServiceFacade(OrderServiceFacade orderServiceFacade) {
		this.orderServiceFacade = orderServiceFacade;
	}
}
