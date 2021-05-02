package implicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.TestBase;

public class WaitingExample extends TestBase {

	@Test
	public void linkedIn() throws InterruptedException {
		WebDriver driver = launchBrowser("Chrome");
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		//dynamic wait - it is not pause
		//global time out - applicable to all driver.fineElements
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//wait for sometime
		//Thread.sleep(5000);
		driver.findElement(By.id("usernamexx")).sendKeys("XYZ");
		driver.findElement(By.id("password")).sendKeys("XYZ");
	
	}
}
