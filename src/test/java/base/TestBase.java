package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class TestBase {

	public WebDriver launchBrowser(String browserName) {

		WebDriver driver = null;

		if (browserName.equals("Mozilla")) {

			System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			FirefoxProfile prof = new FirefoxProfile();
			prof.setPreference("dom.webnotifications.enabled", false); // notifications are set to off
			options.setProfile(prof);
			driver = new FirefoxDriver(options);
		} else if (browserName.equals("Chrome")) {
			// System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,
			// "logs\\chrome.log");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

			ChromeOptions ops = new ChromeOptions();
			// ops.setBinary("");
			ops.setPageLoadStrategy(PageLoadStrategy.EAGER);//...will discuss later on
			ops.addArguments("--disable-notifications");
			ops.addArguments("--start-maximized");
			driver = new ChromeDriver(ops);
		} else if (browserName.equals("Edge")) {
			System.setProperty(EdgeDriverService.EDGE_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			EdgeOptions ops = new EdgeOptions();
			// ops.setBinary("");
			// ops.setPageLoadStrategy(null);...will discuss later on
			ops.setPageLoadStrategy(PageLoadStrategy.EAGER);
			ops.addArguments("--disable-notifications");
			ops.addArguments("--start-maximized");

			driver = new EdgeDriver(ops);
		}
		
		//dynamic wait - it is not pause
		//global time out - applicable to all driver.fineElements
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

}
