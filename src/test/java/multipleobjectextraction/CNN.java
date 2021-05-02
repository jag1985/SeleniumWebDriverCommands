package multipleobjectextraction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CNN {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("http://cnn.com");
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Totla links "+allLinks.size());
		//By.xpath("//a")
		WebElement fifthlink=allLinks.get(5); //webelement corresponds to 6th link
		System.out.println(fifthlink.getText());
		System.out.println(fifthlink.getAttribute("href"));
		//fifthlink.click();
		System.out.println(fifthlink.getLocation().x);
		System.out.println(fifthlink.getLocation().y);
		
		for(int i=0;i<allLinks.size();i++) {
			WebElement link=allLinks.get(i);
			System.out.println(link.getText()+"-----"+link.isDisplayed());
			
		}
		
		////a[@class='IRpwTa']
		//a.IRpwTa
		
	}

}
