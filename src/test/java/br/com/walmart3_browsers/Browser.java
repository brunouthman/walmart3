package br.com.walmart3_browsers;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class Browser {

	public static WebDriver driver;
	public static BrowserType browserType;
	public static String browserName;
	public static String browserVersion;	
	private String key;
	private String value;	

	public Browser() {

	}
	
	public abstract void openBrowser();
	public abstract void closeBrowser();
	public abstract void openUrl(String url);
	public abstract void setBrowserInformation();

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
		
}
