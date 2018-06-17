package com.pluralsight.guru.facade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrderFulfillmentControllerTest {

	@Test
	void testOrderProduct() {
		OrderFulfillmentController controller = new OrderFulfillmentController();
		controller.setOrderServiceFacade(new OrderServiceFacadeImpl());
		controller.orderProduct(29);
		boolean result = controller.orderFulfilled;
		assertTrue(result);
	}

}
