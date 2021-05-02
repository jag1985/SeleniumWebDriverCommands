

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart {
	
	@Test
	public void printNames() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/clothing-and-accessories/topwear/tshirt/men-tshirt/pr?sid=clo,ash,ank,edy&otracker=categorytree&otracker=nmenu_sub_Men_0_T-Shirts");
		
		//List<WebElement> allTshirtnames = driver.findElements(By.xpath("//a[@class='IRpwTa']"));
		List<WebElement> allTshirtnames = driver.findElements(By.cssSelector("a.IRpwTa"));
		System.out.println("Total t shirts - "+allTshirtnames.size());
	
		for(WebElement e:allTshirtnames) {
			System.out.println(e.getText());			
		}
		
		List<WebElement> allTshirtprices = driver.findElements(By.xpath("//div[@class='_30jeq3']"));
		System.out.println("Total prices  - "+allTshirtprices.size());
	
	}
	
}
