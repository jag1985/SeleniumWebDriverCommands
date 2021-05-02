package webelementfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.TestBase;

public class Zoho extends TestBase {

	@Test
	public void appTest() throws InterruptedException {

		WebDriver driver = launchBrowser("Chrome");
		driver.get("https://www.zoho.com/signup.html");
		//Thread.sleep(5000);
		boolean b=driver.findElement(By.xpath("//input[@id='tos']")).isEnabled();
		System.out.println(b);
		//Thread.sleep(5000);
		//WebDriverWait - explicit wait
		
		int i=1;
		while (i<=10) {  //run for max 10 secs
			if(driver.findElement(By.xpath("//input[@id='tos']")).isEnabled())
				break;
			else{
				Thread.sleep(1000);	
				i++;
				System.out.println(i);
			}
			}
		
		driver.findElement(By.xpath("//input[@id='tos']")).click();
		driver.findElement(By.id("emailfield")).sendKeys("hello");
		//driver.findElement(By.id("emailfield")).clear();
		String text=driver.findElement(By.xpath("//h3")).getText();
		System.out.println(text);
		text=driver.findElement(By.id("emailfield")).getAttribute("value");
		System.out.println("Value of the text field "+text);
		text=driver.findElement(By.id("signupbtn")).getAttribute("value");
		System.out.println(text);
		text=driver.findElement(By.xpath("//input[@id='tos']")).getAttribute("checked");
		System.out.println(text);
		}
	
}

