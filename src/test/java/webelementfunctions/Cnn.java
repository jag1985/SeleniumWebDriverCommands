package webelementfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.TestBase;

public class Cnn extends TestBase {

	@Test
	public void appTest() {

		WebDriver driver = launchBrowser("Chrome");
		driver.get("http://cnn.com"); // wait till page loads 100%
		boolean b = driver
				.findElement(By.xpath("//*[@id='header-nav-container']/div/div[2]/div/div[3]/nav/ul/li[3]/ul/li[1]/a"))
				.isDisplayed();
		// isDisplayed - assumes element is present - checks visibility of element.
		System.out.println("Visibility " + b);
		
		driver.findElement(By.cssSelector("svg.menu-icon")).click();

		b = driver
				.findElement(By.xpath("//*[@id='header-nav-container']/div/div[2]/div/div[3]/nav/ul/li[3]/ul/li[1]/a"))
				.isDisplayed();
		System.out.println("Visibility after clicking " + b);

		driver.findElement(By.xpath("//*[@id='header-nav-container']/div/div[2]/div/div[3]/nav/ul/li[3]/ul/li[1]/a"))
				.click();

	}

}
