package com.pluralsight.guru.bridge;

public class TextMessageSender implements MessageSender {

	@Override
	public void sendMessage() {
		System.out.println("TextMessageSender: Sending text message...");

	}

}
