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

public class Tc08_VerifyCreateAcountEmptyConfirmPass extends GenericRegressionTesting {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testCaseName = "tc08_VerifyCreateAcountEmptyConfirmPass";

		report.openReport();		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		report.closeReport();
	}

	@Test
	public void test() {
		
		elementId = "signupClientPwdCheck";
		WebElement webElement = handleWindow.pressEnterById(elementId);
		
		WebElement body = driver.findElement(By.cssSelector("body"));
		assertEquals(true, body.getText().contains("Senha (Campo obrigatório)"));
		
		if (body.getText().contains("Senha (Campo obrigatório)")) {
			extentTest.log(LogStatus.PASS, testCaseName, "passed");
		} else {
			extentTest.log(LogStatus.FAIL, testCaseName, "failed");
		}				
		
		String text = User.USER_PASS;
		handleWindow.setTextToFieldById(elementId, text);	
	}

}
