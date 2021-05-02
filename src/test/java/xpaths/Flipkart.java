package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.TestBase;

public class Flipkart extends TestBase {

	@Test
	public void login() {
		WebDriver driver = launchBrowser("Chrome");
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input"))
				.sendKeys("hello");

	}
}
