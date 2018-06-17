package com.pluralsight.guru.proxy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReportGeneratorImplProxyTest {

	@Test
	void testGenerateReport() {
	    Role accessRole=new Role();
        accessRole.setRole("Manager");
        ReportGenerator proxy=new ReportGeneratorImplProxy(accessRole);
        proxy.displayReportTemplate("Pdf",150);
        proxy.generateComplexReport("Pdf",150);
        proxy.generateSensitiveReport();
		assertNotNull(proxy);
	}

}
