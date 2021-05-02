package webelementfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.TestBase;

public class DropDown extends TestBase {

	@Test
	public void appTest() {

		WebDriver driver = launchBrowser("Chrome");
		driver.get("https://www.qtpselenium.com/contact-us");
		//Some of the functions you would like to do with dropdown
		//select
		//read selected
		//total number elements - size  ..will discuss later
		// print all option ...will discuss later
	WebElement droplist=driver.findElement(By.name("country_id"));
	Select s=new Select(droplist); //Select is an internal class
	//s.selectByIndex(5);
	s.selectByVisibleText("India");
	//s.selectByValue(value);
	WebElement selectedOption=s.getFirstSelectedOption();
	System.out.println(selectedOption.getText());
	
	//s.getOptions();
	//https://html.com/attributes/select-multiple/
	
	
	
	
	
	}
}