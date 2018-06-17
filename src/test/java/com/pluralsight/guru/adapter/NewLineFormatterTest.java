package com.pluralsight.guru.adapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.pluralsight.guru.Adapter.CsvAdapterImpl;
import com.pluralsight.guru.Adapter.CsvFormattable;
import com.pluralsight.guru.Adapter.CsvFormatter;
import com.pluralsight.guru.Adapter.NewLineFormatter;
import com.pluralsight.guru.Adapter.TextFormattable;

class NewLineFormatterTest {

	@Test
	void testFormatText() throws Exception {
		String testString=" Formatting line 1. Formatting line 2. Formatting line 3.";
		TextFormattable newLineFormatter = new NewLineFormatter();
		String result = newLineFormatter.formatText(testString);
		System.out.println(result);
		assertNotNull(result);
		
		CsvFormatter csvFormatter = new CsvFormatter();
		TextFormattable csvAdapter = new CsvAdapterImpl(csvFormatter);
		String reString = csvAdapter.formatText(testString);
		System.out.println(reString);
		assertNotNull(reString);
	}

}
