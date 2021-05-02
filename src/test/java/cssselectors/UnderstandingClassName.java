package cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestBase;

public class UnderstandingClassName extends TestBase {

	@Test
	public void linkedIn() {
		WebDriver driver = launchBrowser("Chrome");
		driver.get("http://flipkart.com");
		//driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("ABC");
}
}
