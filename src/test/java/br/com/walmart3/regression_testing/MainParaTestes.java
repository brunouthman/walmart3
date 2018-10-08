package br.com.walmart3.regression_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.walmart3.classes_uteis.Constants;

public class MainParaTestes {

	public static void main(String[] args) {
		
		System.setProperty(Constants.CHROME_KEY, Constants.CHROME_VALUE);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.walmart.com.br/");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.findElement(By.id("topbar-signup-link")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iframeLogin")));
		driver.switchTo().frame(driver.findElement(By.id("iframeLogin")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fb-sign-up")));
		driver.findElement(By.id("fb-sign-up")).click();

	}

}
