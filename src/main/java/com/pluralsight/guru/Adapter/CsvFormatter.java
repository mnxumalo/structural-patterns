package com.pluralsight.guru.Adapter;

public class CsvFormatter implements CsvFormattable {

	public String formatCsvText(String text) {
		
		return text.replace(".", ",");
	}

}
