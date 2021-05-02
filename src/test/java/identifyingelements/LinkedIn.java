package identifyingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestBase;

public class LinkedIn extends TestBase {

	@Test
	public void linkedIn() {
		WebDriver driver = launchBrowser("Mozilla");
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("XYZ");
		System.out.println(username.getLocation().x);
		System.out.println(username.getLocation().y);

		// WebElement password = driver.findElement(By.name("session_password"));
		// password.sendKeys("PASS");

		driver.findElement(By.name("session_password")).sendKeys("PASS");
		
	}

}
