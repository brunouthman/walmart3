package br.com.walmart3.regression_testing.test_cases.verify_create_acount;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.walmart3.regression_testing.GenericRegressionTesting;

public class Tc17_VerifyCreateAcountUseTermsLink extends GenericRegressionTesting{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testCaseName = "tc17_VerifyCreateAcountUseTermsLink";

		report.openReport();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		report.closeReport();
	}

	@Test
	public void test() {
	
		elementId = "model-tool-tip";
		handleWindow.clickElementById(elementId);
		
		System.out.println("url termo de uso: "+driver.getCurrentUrl());
	}

}
