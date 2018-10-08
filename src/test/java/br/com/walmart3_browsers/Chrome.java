package br.com.walmart3_browsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import br.com.walmart3.classes_uteis.Constants;

public class Chrome extends Browser {

	public Chrome() {
		setKey(Constants.CHROME_KEY);
		setValue(Constants.CHROME_VALUE);
		browserType = BrowserType.CHROME;

	}

	@Override
	public void openBrowser() {
		System.setProperty(getKey(), getValue());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		setBrowserInformation();

	}

	@Override
	public void closeBrowser() {
		if (driver == null) {
			return;
		}
		driver.close();
		driver.quit();

	}

	@Override
	public void openUrl(String url) {
		driver.get(url);

	}

	@Override
	public void setBrowserInformation() {
		Capabilities caps = ((RemoteWebDriver)driver).getCapabilities();

		browserName = caps.getBrowserName();
		browserVersion = caps.getVersion();
		
	}

}
