package br.com.walmart3.regression_testing.test_cases.verify_create_acount;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import br.com.walmart3.classes_uteis.GenericDataGenerator;
import br.com.walmart3.classes_uteis.User;
import br.com.walmart3.regression_testing.GenericRegressionTesting;

public class Tc05_VerifyCreateAcountEmptyCpfCnpj extends GenericRegressionTesting {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testCaseName = "Tc05_VerifyCreateAcountEmptyCpfCnpj";

		report.openReport();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		report.closeReport();
	}

	@Test
	public void test() {

		elementId = "cpfcnpj";
		WebElement webElement = handleWindow.pressEnterById(elementId);
		
		WebElement body = driver.findElement(By.cssSelector("body"));
		assertEquals(true, body.getText().contains("CPF ou CNPJ (Campo obrigatório)"));
		
		if (body.getText().contains("CPF ou CNPJ (Campo obrigatório)")) {
			extentTest.log(LogStatus.PASS, testCaseName, "passed");
		} else {
			extentTest.log(LogStatus.FAIL, testCaseName, "failed");
		}
		
		GenericDataGenerator gdg = new GenericDataGenerator();
		User user = new User();
		user.Cpf = gdg.geraCPF();
		handleWindow.setTextToFieldById(elementId, user.Cpf);
	}

}
