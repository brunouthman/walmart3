package br.com.walmart3.regression_testing.test_cases.verify_create_acount;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import br.com.walmart3.classes_uteis.Constants;
import br.com.walmart3.classes_uteis.User;
import br.com.walmart3.regression_testing.GenericRegressionTesting;

public class Tc03_VerifyCreateAcountEmptyName extends GenericRegressionTesting {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testCaseName = "tc03_VerifyCreateAcountEmptyName";

		report.openReport();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		report.closeReport();
	}

	@Test
	public void test() {
		
		handleWindow.switchToMainWindow();
		elementId = "iframeLogin";
		handleWindow.switchToFrameById(elementId);		

		elementId = "notifymeClientName";
		WebElement webElement = handleWindow.pressEnterById(elementId);
		
		WebElement body = driver.findElement(By.cssSelector("body"));
		
		assertEquals(true, body.getText().contains("Nome (Campo obrigatório)"));
		
		if (body.getText().contains("Nome (Campo obrigatório)")) {
			extentTest.log(LogStatus.PASS, testCaseName, "passed");
		} else {
			extentTest.log(LogStatus.FAIL, testCaseName, "failed");
		}		
		
		String text = User.USER_NAME;
		handleWindow.setTextToFieldById(elementId, text);
	}

}
