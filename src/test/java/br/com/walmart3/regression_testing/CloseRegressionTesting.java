package br.com.walmart3.regression_testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import br.com.walmart3.classes_uteis.Report;
import br.com.walmart3_browsers.Browser;

public class CloseRegressionTesting extends GenericRegressionTesting {


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testCaseName = "CloseRegressionTesting";
		report.openReport();
		report.closeReport();
		extentTest.log(LogStatus.PASS, testCaseName, "passed");		
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void test() {

	}

}
