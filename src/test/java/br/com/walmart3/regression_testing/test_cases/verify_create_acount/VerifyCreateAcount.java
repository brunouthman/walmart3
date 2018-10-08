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
		report.closeReport();
	}
	

	@Test
	public void tests() throws Exception{

	}
	
	public void tc01_VerifyCreateAcountLinkClick() {


	}

	
	public void tc02_VerifyCreateAcountFacebookButton() throws Exception {
		

	}

	
	public void tc03_VerifyCreateAcountEmptyName() {
		

	}

	
	public void tc04_VerifyCreateAcountEmptyEmail() {
		

	}

	
	public void tc05_VerifyCreateAcountEmptyCpfCnpj() {
		

	}

	
	public void tc06_VerifyCreateAcountEmptyTel() {


	}

	
	public void tc07_VerifyCreateAcountEmptyPass() {


		
	}

	
	public void tc08_VerifyCreateAcountEmptyConfirmPass() {

	
	}

	
	public void tc09_VerifyCreateAcountInvalidEmail() {
		
		
	}

	
	public void tc10_VerifyCreateAcountInvalidCpf() {
		

	}

	
	public void tc11_VerifyCreateAcountInvalidCnpj() {
	

		
	}

	
	public void tc12_VerifyCreateAcountInvalidTel() {
		


	}

	
	public void tc13_VerifyCreateAcountInvalidPwd() {


	}

	
	public void tc14_VerifyCreateAcountInvalidConfirPwd() {


		
	}

	
	public void tc15_VerifyCreateAcountCheckBoxTrue() {
		


	}

	
	public void tc16_VerifyCreateAcountCheckBoxFalse() {
		
	}

	
	public void tc17_VerifyCreateAcountUseTermsLink() {
		

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
