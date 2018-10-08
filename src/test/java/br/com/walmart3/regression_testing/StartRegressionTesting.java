package br.com.walmart3.regression_testing;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import br.com.walmart3.classes_uteis.Constants;
import br.com.walmart3.classes_uteis.HandleWindow;
import br.com.walmart3.classes_uteis.Report;
import br.com.walmart3_browsers.Chrome;
import br.com.walmart3_browsers.FireFox;
import br.com.walmart3_browsers.BrowserType;

public class StartRegressionTesting extends GenericRegressionTesting {

	@BeforeClass
	public static void initializeRegressionTesting() throws Exception {

		testCaseName = "Initializing Regression Testing";

		//---------------------------------------------------------------
		// commenst just for testing, remember to discomment this
		//---------------------------------------------------------------
		browser = new Chrome();
		System.out.println("Browser Chrome selected to tests");
		//chooseBrowser();
		//-------------------------------------------------------------

		setUpBrowser();
		
		setUpPlatform();
		
		setUpReport();
		
		setUpHandleWindow();
	}

	@AfterClass
	public static void endTest() throws Exception {
		testCaseName = "Initializing Regression Testing - close report";
		report.closeReport(extentReports, extentTest, testCaseName);

	}

	@Test
	public void validateBrowserTitle() {

		String title = driver.getTitle();
		assertEquals(true, title.contains(Constants.COMPANY_NAME));

		if (title.contains(Constants.COMPANY_NAME)) {
			extentTest.log(LogStatus.PASS, testCaseName, "passed");
		} else {
			report.writeErrorLogReport();
		}
	}

	public static void chooseBrowser() {

		Scanner scan = new Scanner(System.in);
		int navigatorType = 0;

		while (navigatorType == 0) {
			System.out.println("Escolha o Navegador");
			System.out.println(BrowserType.CHROME.getNavigatorTypeId() + "-" + BrowserType.CHROME);
			System.out.println(BrowserType.FIREFOX.getNavigatorTypeId() + "-" + BrowserType.FIREFOX);
			System.out.println(BrowserType.IE.getNavigatorTypeId() + "-" + BrowserType.IE);

			navigatorType = scan.nextInt();

			if (navigatorType > 3) {
				System.out.println("Navegador invalido");
				navigatorType = 0;
			}
		}

		// opennin browser to the tests
		switch (navigatorType) {
		case 1:
			browser = new Chrome();
			browser.browserType = BrowserType.CHROME;
			break;
		case 2:
			browser = new FireFox();
			break;

		default:
			browser = new Chrome();
		}

		scan.close();

	}
	
	public static void setUpPlatform() {
		Capabilities caps = ((RemoteWebDriver)driver).getCapabilities();
		
		platform = String.valueOf(caps.getPlatform());
	}
	
	public static void setUpBrowser() {
		browser.openBrowser();
		browser.openUrl(Constants.URL_WM);
		driver = browser.driver;
	}
	
	public static void setUpReport() {
		report = new Report(browser.browserName, browser.browserVersion);
		report.openReport();
		extentTest = extentReports.startTest(testCaseName);				
	}
	
	
	public static void setUpHandleWindow() {
		handleWindow = new HandleWindow(browser.browserName, browser.browserVersion);
		wait = new WebDriverWait(driver, 10);
		testCaseId = 0;			
	}
	
	
}
