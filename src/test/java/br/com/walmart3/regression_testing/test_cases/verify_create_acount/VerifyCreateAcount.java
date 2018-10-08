package br.com.walmart3.regression_testing.test_cases.verify_create_acount;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import br.com.walmart3.classes_uteis.Constants;
import br.com.walmart3.classes_uteis.GenericDataGenerator;
import br.com.walmart3.classes_uteis.HandleWindow;
import br.com.walmart3.classes_uteis.Report;
import br.com.walmart3.regression_testing.GenericRegressionTesting;
import br.com.walmart3.regression_testing.StartRegressionTesting;
import br.com.walmart3_browsers.Browser;

public class VerifyCreateAcount extends GenericRegressionTesting {
	
	public static String userCpf;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testCaseName = "VerifyCreateAcount";

		report.openReport();
		extentTest = extentReports.startTest(testCaseName);
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		testCaseName = "VerifyCreateAcount - close report";
		report.closeReport(extentReports, extentTest, testCaseName);
	}
	

	@Test
	public void tests() throws Exception{
		tc01_VerifyCreateAcountLinkClick();
		tc02_VerifyCreateAcountFacebookButton();
		tc03_VerifyCreateAcountEmptyName();
		tc04_VerifyCreateAcountEmptyEmail();
		tc05_VerifyCreateAcountEmptyCpfCnpj();
		tc06_VerifyCreateAcountEmptyTel();
		tc07_VerifyCreateAcountEmptyPass();
		tc08_VerifyCreateAcountEmptyConfirmPass();
		tc09_VerifyCreateAcountInvalidEmail();
		tc10_VerifyCreateAcountInvalidCpf();
		tc11_VerifyCreateAcountInvalidCnpj();
		tc12_VerifyCreateAcountInvalidTel();
		tc13_VerifyCreateAcountInvalidPwd();
		tc14_VerifyCreateAcountInvalidConfirPwd();
		tc15_VerifyCreateAcountCheckBoxTrue();
		tc16_VerifyCreateAcountCheckBoxFalse();
		tc17_VerifyCreateAcountUseTermsLink();
	}
	
	public void tc01_VerifyCreateAcountLinkClick() {

		testCaseName = "tc01_VerifyCreateAcountLinkClick";

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

	
	public void tc02_VerifyCreateAcountFacebookButton() throws Exception {
		
		testCaseName = "tc02_VerifyCreateAcountFacebookButton";
		
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

	
	public void tc03_VerifyCreateAcountEmptyName() {
		
		testCaseName = "tc03_VerifyCreateAcountEmptyName";
		
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
		
		String text = Constants.USER_NAME;
		handleWindow.setTextToFieldById(elementId, text);
	}

	
	public void tc04_VerifyCreateAcountEmptyEmail() {
		
		testCaseName = "tc04_VerifyCreateAcountEmptyEmail";
		
		elementId = "email";
		WebElement webElement = handleWindow.pressEnterById(elementId);
		
		WebElement body = driver.findElement(By.cssSelector("body"));
		assertEquals(true, body.getText().contains("Email (Campo obrigatório)"));
		
		if (body.getText().contains("Email (Campo obrigatório)")) {
			extentTest.log(LogStatus.PASS, testCaseName, "passed");
		} else {
			extentTest.log(LogStatus.FAIL, testCaseName, "failed");
		}			

		String text = Constants.USER_EMAIL;
		handleWindow.setTextToFieldById(elementId, text);
	}

	
	public void tc05_VerifyCreateAcountEmptyCpfCnpj() {
		
		testCaseName = "tc05_VerifyCreateAcountEmptyCpfCnpj";

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
		userCpf = gdg.geraCPF();
		handleWindow.setTextToFieldById(elementId, userCpf);
	}

	
	public void tc06_VerifyCreateAcountEmptyTel() {

		testCaseName = "tc06_VerifyCreateAcountEmptyTel";
		
		elementId = "phone";
		WebElement webElement = handleWindow.pressEnterById(elementId);
		
		WebElement body = driver.findElement(By.cssSelector("body"));
		assertEquals(true, body.getText().contains("Telefone (Campo obrigatório)"));
		
		if (body.getText().contains("Telefone (Campo obrigatório)")) {
			extentTest.log(LogStatus.PASS, testCaseName, "passed");
		} else {
			extentTest.log(LogStatus.FAIL, testCaseName, "failed");
		}		
		
		String text = Constants.USER_TEL;
		handleWindow.setTextToFieldById(elementId, text);
	}

	
	public void tc07_VerifyCreateAcountEmptyPass() {

		testCaseName = "tc07_VerifyCreateAcountEmptyPass";
		
		elementId = "signupClientPwd";
		WebElement webElement = handleWindow.pressEnterById(elementId);
		
		WebElement body = driver.findElement(By.cssSelector("body"));
		assertEquals(true, body.getText().contains("Senha (Campo obrigatório)"));
		
		if (body.getText().contains("Senha (Campo obrigatório)")) {
			extentTest.log(LogStatus.PASS, testCaseName, "passed");
		} else {
			extentTest.log(LogStatus.FAIL, testCaseName, "failed");
		}			
		
		String text = Constants.USER_PASS;
		handleWindow.setTextToFieldById(elementId, text);
		
	}

	
	public void tc08_VerifyCreateAcountEmptyConfirmPass() {

		testCaseName = "tc08_VerifyCreateAcountEmptyConfirmPass";
		
		elementId = "signupClientPwdCheck";
		WebElement webElement = handleWindow.pressEnterById(elementId);
		
		WebElement body = driver.findElement(By.cssSelector("body"));
		assertEquals(true, body.getText().contains("Senha (Campo obrigatório)"));
		
		if (body.getText().contains("Senha (Campo obrigatório)")) {
			extentTest.log(LogStatus.PASS, testCaseName, "passed");
		} else {
			extentTest.log(LogStatus.FAIL, testCaseName, "failed");
		}				
		
		String text = Constants.USER_PASS;
		handleWindow.setTextToFieldById(elementId, text);		
	}

	
	public void tc09_VerifyCreateAcountInvalidEmail() {
		
		testCaseName = "tc09_VerifyCreateAcountInvalidEmail";
		
		elementId = "email";
		handleWindow.clearFieldById(elementId);
		
		String text = "regressiontestinggmail.com";
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

	
	public void tc10_VerifyCreateAcountInvalidCpf() {
		
		testCaseName = "tc10_VerifyCreateAcountInvalidCpf";
		
		elementId = "cpfcnpj";
		handleWindow.clearFieldById(elementId);
		
		String text = "99999999999";
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

	
	public void tc11_VerifyCreateAcountInvalidCnpj() {
	
		testCaseName = "tc11_VerifyCreateAcountInvalidCnpj";
		
		elementId = "cpfcnpj";
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

	
	public void tc12_VerifyCreateAcountInvalidTel() {
		
		testCaseName = "tc12_VerifyCreateAcountInvalidTel";
		
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

	
	public void tc13_VerifyCreateAcountInvalidPwd() {

		testCaseName = "tc13_VerifyCreateAcountInvalidPwd";
		
		elementId = "signupClientPwd";
		handleWindow.clearFieldById(elementId);
		
		String text = "99999999";
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

	
	public void tc14_VerifyCreateAcountInvalidConfirPwd() {

		testCaseName = "tc14_VerifyCreateAcountInvalidConfirPwd";
		
		elementId = "signupClientPwdCheck";
		handleWindow.clearFieldById(elementId);
		
		String text = "99999999";
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

	
	public void tc15_VerifyCreateAcountCheckBoxTrue() {
		
		testCaseName = "tc15_VerifyCreateAcountCheckBoxTrue";
		
		elementId = "news";
		WebElement webElement = handleWindow.findElementById(elementId);
				
		assertEquals(true, webElement.isSelected());
		
		if (webElement.isSelected()) {
			extentTest.log(LogStatus.PASS, testCaseName, "passed");
		} else {
			extentTest.log(LogStatus.FAIL, testCaseName, "failed");
		}	

	}

	
	public void tc16_VerifyCreateAcountCheckBoxFalse() {
		System.out.println("criar um metodo que gera um usuario completo check box news=false");
	}

	
	public void tc17_VerifyCreateAcountUseTermsLink() {
		
		testCaseName = "tc17_VerifyCreateAcountUseTermsLink";
		
		elementId = "model-tool-tip";
		handleWindow.clickElementById(elementId);
		
		System.out.println("url termo de uso: "+driver.getCurrentUrl());
	}

	
	public void r_VerifyCreateAcountPrivacyPolicyLink() {

	}

	
	public void s_VerifyCreateAcountButton() {

	}

	
	public void t_VerifyCreateAcountUserAlreadyExistLink() {

	}

	
	public void u_VerifyCreateAcountCloseButton() {

	}
	
}
