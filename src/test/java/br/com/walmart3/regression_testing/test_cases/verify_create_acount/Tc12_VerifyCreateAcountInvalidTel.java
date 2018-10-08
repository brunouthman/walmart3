package br.com.walmart3.regression_testing.test_cases.verify_create_acount;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import br.com.walmart3.regression_testing.GenericRegressionTesting;

public class Tc12_VerifyCreateAcountInvalidTel extends GenericRegressionTesting{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testCaseName = "tc12_VerifyCreateAcountInvalidTel";

		report.openReport();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		report.closeReport();
	}

	@Test
	public void test() {
		
		elementId = "phone";
		handleWindow.clearFieldById(elementId);
		
		String text = "99999999999999";
		handleWindow.setTextToFieldById(elementId, text);
		handleWindow.clickElementById(elementId);
		
		WebElement webElement = handleWindow.findElementById(elementId);
		String text2 = webElement.getText();
		assertEquals(true, text2.contains(text));
		
		if (text2.contains(text)) {
			extentTest.log(LogStatus.PASS, testCaseName, "passed");
		} else {
			extentTest.log(LogStatus.FAIL, testCaseName, "failed");
		}	
	}

}
