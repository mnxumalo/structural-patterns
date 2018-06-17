package com.pluralsight.guru.Adapter;

public class NewLineFormatter implements TextFormattable {

	public String formatText(String text) {
		
		return text.replace(".", "\n");
	}

}
