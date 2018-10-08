package br.com.walmart3.regression_testing;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import br.com.walmart3.classes_uteis.HandleWindow;
import br.com.walmart3.classes_uteis.Report;
import br.com.walmart3_browsers.Browser;

public abstract class GenericRegressionTesting {
	
	public static Browser browser;
	public static Report report;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	public static WebDriver driver;
	public static String testCaseName;
	public static String elementId;
	public static HandleWindow handleWindow;
	public static WebDriverWait wait;
	public static int testCaseId;
	public static String seleniumVersion;
	public static String platform;

}
