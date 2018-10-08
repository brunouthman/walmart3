package br.com.walmart3.regression_testing.test_cases.verify_create_acount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import br.com.walmart3.regression_testing.GenericRegressionTesting;

public class Tc01_VerifyCreateAcountLinkClick extends GenericRegressionTesting {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testCaseName = "Tc01_VerifyCreateAcountLinkClick";

		report.openReport();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		report.closeReport();
	}
	
	@Test
	public void test() {

		elementId = "topbar-signup-link";
		handleWindow.clickElementById(elementId);

		elementId = "iframeLogin";
		handleWindow.switchToFrameById(elementId);
		
		elementId = "fb-sign-up";
		WebElement webElement = handleWindow.findElementById(elementId);
		
		assertEquals(true, webElement.isDisplayed());

		if (webElement.isDisplayed()) {
			extentTest.log(LogStatus.PASS, testCaseName, "passed");
		} else {
			extentTest.log(LogStatus.FAIL, testCaseName, "failed");
		}
	}

}
