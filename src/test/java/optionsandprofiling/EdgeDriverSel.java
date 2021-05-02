package optionsandprofiling;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class EdgeDriverSel {
	
	@Test
	public void edge() {
		System.setProperty("webdriver.edge.driver", "D:\\drivers\\msedgedriver.exe");
		System.setProperty(EdgeDriverService.EDGE_DRIVER_LOG_PROPERTY, "logs\\edge.log");
		System.setProperty(EdgeDriverService.EDGE_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		EdgeOptions ops = new EdgeOptions();
		//ops.setBinary("");
		//ops.setPageLoadStrategy(null);...will discuss later on
		ops.addArguments("--disable-notifications");
		ops.addArguments("--start-maximized");
		ops.addArguments("ignore-certificate-errors");
		//ops.addArguments("--proxy-server=http://89.2872.292.2:9090");
		ops.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		
		EdgeDriver driver=new EdgeDriver(ops); //make sure previous session is closed
		//driver.get("http://pushengage.com/demo");
		driver.get("https://untrusted-root.badssl.com/");
		driver.manage().window().maximize();
	}

}
