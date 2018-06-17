package com.pluralsight.guru.bridge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MessageTest {	

	@Test
	void testSend() throws Exception{
		MessageSender messageSender = new TextMessageSender();
		Message textMessage = new TextMessage(messageSender);
		textMessage.send();
		
		MessageSender messageSender2 = new EmailMessageSender();
		Message emailMessage = new EmailMessage(messageSender2);
		emailMessage.send();
		assertNotNull(emailMessage);
	}

}
