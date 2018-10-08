package br.com.walmart3.regression_testing.test_cases.verify_create_acount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import br.com.walmart3.regression_testing.GenericRegressionTesting;

public class Tc02_VerifyCreateAcountFacebookButton extends GenericRegressionTesting{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testCaseName = "tc02_VerifyCreateAcountFacebookButton";

		report.openReport();
		extentTest = extentReports.startTest(testCaseName);	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		report.closeReport(extentReports, extentTest, testCaseName);
	}

	@Test
	public void test() {
		
		elementId = "fb-sign-up";
		handleWindow.clickElementById(elementId);
		
		handleWindow.switchWindow();

		elementId = "homelink";
		WebElement webElement = handleWindow.findElementById(elementId);
		
		elementId = "email";
		webElement = handleWindow.findElementById(elementId);
		
		elementId = "pass";
		webElement = handleWindow.findElementById(elementId);
		
		elementId = "loginbutton";
		webElement = handleWindow.findElementById(elementId);

		elementId = "booklet";
		webElement = handleWindow.findElementById(elementId);

		elementId = "forgot-password-link";
		webElement = handleWindow.findElementById(elementId);
		
		assertEquals(true, webElement.isDisplayed());	
				
		if (webElement.isDisplayed()) {
			extentTest.log(LogStatus.PASS, testCaseName, "passed");
		} else {
			extentTest.log(LogStatus.FAIL, testCaseName, "failed");
		}
	}

}
