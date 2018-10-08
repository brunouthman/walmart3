package br.com.walmart3.classes_uteis;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import br.com.walmart3.regression_testing.GenericRegressionTesting;
import br.com.walmart3.regression_testing.StartRegressionTesting;

public class HandleWindow extends GenericRegressionTesting {

	public String mainWindow;

	public HandleWindow(String browserName, String browserVersion) {
		this.mainWindow = driver.getWindowHandle();
	}

	public void switchWindow() {
		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			if (!handle.equals(mainWindow)) {
				driver.switchTo().window(handle);
				break;
			}
		}
	}

	public void switchToMainWindow() {
		driver.switchTo().window(mainWindow);
	}

	public void clickElementByXpath(String elementId) {

		try {
			WebElement webElement = findElementByXpath(elementId);
			webElement.click();
		} catch (Exception e) {
			report.writeErrorLogReport(e);
		}
	}

	public void clickElementById(String elementId) {

		try {
			WebElement webElement = findElementById(elementId);
			webElement.click();
		} catch (Exception e) {
			report.writeErrorLogReport(e);
		}
	}

	public void switchToFrameById(String elementId) {

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));
			driver.switchTo().frame(driver.findElement(By.id(elementId)));
		} catch (Exception e) {
			report.writeErrorLogReport(e);
		}
	}

	public void switchToDefaultContentById(String elementId) throws Exception {
		try {
			findElementById(elementId);
			driver.switchTo().defaultContent().findElement(By.id(elementId));
		} catch (Exception e) {
			report.writeErrorLogReport(e);
		}
	}

	public WebElement findElementById(String elementId) {

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));
			WebElement webElement = driver.findElement(By.id(elementId));
			return webElement;
		} catch (Exception e) {
			report.writeErrorLogReport(e);
			return null;
		}
	}
	
	public WebElement findElementByXpath(String elementId) {

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementId)));
			WebElement webElement = driver.findElement(By.xpath(elementId));
			return webElement;
		} catch (Exception e) {
			report.writeErrorLogReport(e);
			return null;
		}
	}

	public WebElement pressEnterById(String elementId) {
		try {
			WebElement webElement = findElementById(elementId);
			webElement.sendKeys(Keys.ENTER);
			return webElement;
		} catch (Exception e) {
			report.writeErrorLogReport(e);
			return null;
		}

	}
	
	public WebElement setTextToFieldById(String elementId, String text) {
		try {
			WebElement webElement = findElementById(elementId);
			webElement.sendKeys(text);
			return webElement;
		} catch (Exception e) {
			report.writeErrorLogReport(e);
			return null;
		}
	}
	
	public WebElement clearFieldById(String elementId) {
		try {
			WebElement webElement = findElementById(elementId);
			webElement.clear();
			return webElement;
		} catch (Exception e) {
			report.writeErrorLogReport(e);
			return null;
		}

	}	
	
	public void closeCurrentWindow() {
		driver.close();
	}
	
	public void closeAllWindows() {
		driver.quit();
	}
	
}
