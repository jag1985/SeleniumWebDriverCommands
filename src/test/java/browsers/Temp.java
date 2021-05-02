package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Temp {
	
	public static void main(String[] args) {
		
		//FirefoxDriver f1=new FirefoxDriver();
		//ChromeDriver f2=new ChromeDriver();
		
		//WebDriver d1= new FirefoxDriver();
		WebDriver d2= new ChromeDriver();
		d2=new FirefoxDriver();
		d2.get("http://qtpselenium.com");
		d2=new EdgeDriver(); //blank
		
		WebDriver driver=null;
		driver = new FirefoxDriver();
		driver = new EdgeDriver();
		driver = new ChromeDriver();
	}

}
