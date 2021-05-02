package singlescript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DynamicBrowsers {

	@Test
	public void launch() {
		/*System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "D:\\drivers\\msedgedriver.exe");*/
		
		String browser = "Chrome";
		WebDriver driver = null;
		/*
		 * if(browser.equals("Mozilla")) { FirefoxDriver fd=new FirefoxDriver();
		 * fd.get("http://qtpselenium.com"); System.out.println(fd.getTitle()); } else
		 * if (browser.equals("Chrome")) { ChromeDriver cd=new ChromeDriver();
		 * cd.get("http://qtpselenium.com"); System.out.println(cd.getTitle()); } else
		 * if (browser.equals("Edge")) { EdgeDriver ed=new EdgeDriver();
		 * ed.get("http://qtpselenium.com"); System.out.println(ed.getTitle()); }
		 */

		if (browser.equals("Mozilla"))
			driver = new FirefoxDriver();
		else if (browser.equals("Chrome"))
			driver = new ChromeDriver();
		else if (browser.equals("Edge"))
			driver = new EdgeDriver();

		// browser init
		driver.get("http://yahoo.com");
		System.out.println(driver.getTitle());
	}
}
