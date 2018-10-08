package br.com.walmart3_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.walmart3.classes_uteis.Constants;

public class FireFox extends Browser {
	
	public FireFox() {

	}

	@Override
	public void openBrowser() {
		super.setKey(Constants.FIREFOX_KEY);
		super.setValue(Constants.FIREFOX_VALUE);
		
		System.setProperty(super.getKey(), super.getValue());
		super.driver = new ChromeDriver();	
		
	}

	@Override
	public void closeBrowser() {
		super.driver.close();
		super.driver.quit();
		
	}

	@Override
	public void openUrl(String url) {
		super.driver.get(url);
		
	}

	@Override
	public void setBrowserInformation() {
		// TODO Auto-generated method stub
		
	}



}
