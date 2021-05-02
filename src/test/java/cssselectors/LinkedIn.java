package cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestBase;

public class LinkedIn extends TestBase {

	@Test
	public void linkedIn() {
		WebDriver driver = launchBrowser("Chrome");
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		//WebElement username = driver.findElement(By.id("username"));
		//WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		WebElement username = driver.findElement(By.cssSelector("input#username"));
		username.sendKeys("XYZ");
		System.out.println(username.getLocation().x);
		System.out.println(username.getLocation().y);

		// WebElement password = driver.findElement(By.name("session_password"));
		// password.sendKeys("PASS");
		String text = driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/div[1]/h1")).getText();
		System.out.println(text);
		
		driver.findElement(By.name("session_password")).sendKeys("PASS");
		
	}

}
