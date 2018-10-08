package br.com.walmart3.regression_testing.test_cases.verify_create_acount;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import br.com.walmart3.regression_testing.GenericRegressionTesting;

public class Tc15_VerifyCreateAcountCheckBoxTrue extends GenericRegressionTesting {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testCaseName = "tc15_VerifyCreateAcountCheckBoxTrue";

		report.openReport();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		report.closeReport();
	}

	@Test
	public void test() {
		
		elementId = "news";
		WebElement webElement = handleWindow.findElementById(elementId);
				
		assertEquals(true, webElement.isSelected());
		
		if (webElement.isSelected()) {
			extentTest.log(LogStatus.PASS, testCaseName, "passed");
		} else {
			extentTest.log(LogStatus.FAIL, testCaseName, "failed");
		}	
	}

}
