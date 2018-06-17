package com.pluralsight.guru.Adapter;

public class CsvAdapterImpl implements TextFormattable {

	CsvFormatter csvFormatter;
	public CsvAdapterImpl(CsvFormatter csvFormatter) {
		this.csvFormatter = csvFormatter;
	}
	public String formatText(String text) {
		
		return csvFormatter.formatCsvText(text);
	}

}
