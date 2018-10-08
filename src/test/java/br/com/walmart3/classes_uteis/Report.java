package br.com.walmart3.classes_uteis;

import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import br.com.walmart3.regression_testing.GenericRegressionTesting;
import br.com.walmart3_browsers.Browser;

import org.openqa.selenium.remote.RemoteWebDriver;

public class Report extends GenericRegressionTesting {
	
	public static String browserName;
	public static String browserVersion;
	
	public Report(String browserName, String browserVersion) {
		this.browserName = browserName;
		this.browserVersion = browserVersion;
	}

	public static ExtentReports openReport () {		
		
		extentReports = new ExtentReports(System.getProperty("user.dir")+Constants.EXTENT_REPORT_OUTPUT_DIRECTOR, false);
	
		extentReports.addSystemInfo("Selenium Version", "hardcode 999");
		extentReports.addSystemInfo("Plataform", platform);
		extentReports.addSystemInfo("Browser Version", browserVersion);
		extentReports.addSystemInfo("Browser Name", browserName);
		
		extentReports.loadConfig(new File(System.getProperty("user.dir")+Constants.EXTENT_CONFIG_XML));
		
		return null;
	}
	
	public static void closeReport(ExtentReports report, ExtentTest test, String testCaseName){
			report.endTest(test);
			report.flush();			
	}
	
	public static void writeErrorLogReport(Exception e) {
		System.out.println(testCaseName + "failed");
		extentTest.log(LogStatus.FAIL, "Test Case: " + testCaseName + e);		
	}
	
	public static void writeErrorLogReport() {
		System.out.println(testCaseName + "failed");
		extentTest.log(LogStatus.FAIL, "Test Case: " + testCaseName);		
	}
		
}
