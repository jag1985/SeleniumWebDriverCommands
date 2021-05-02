package optionsandprofiling;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class IEOptionsExample {

	// cannot manage notifications
	// no profiling concept
	// no binary
	// page load strategy is possible
	// proxy and certificates can be done in IE

	@Test
	public void ie() {
		System.setProperty("webdriver.ie.driver", "D:\\drivers\\IEDriverServer.exe");
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_LOGFILE_PROPERTY, "logs\\ie.log");
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_LOGLEVEL_PROPERTY, "INFO");
		
		//System.setProperty(InternetExplorerDriverService.IE_DRIVER_SILENT_PROPERTY, "true");
		InternetExplorerOptions options=new InternetExplorerOptions();
		//options.setPageLoadStrategy(strategy)
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		String proxy = "82.288.287.22:8080";
		Proxy p=new Proxy();
		p.setAutodetect(false);
		p.setProxyType(Proxy.ProxyType.MANUAL);
		p.setSocksProxy(proxy);
		
		cap.setCapability(CapabilityType.PROXY, p);
		options.merge(cap);
		//InternetExplorerDriver ie = new InternetExplorerDriver(options);
		InternetExplorerDriver ie = new InternetExplorerDriver();
			ie.get("https://expired.badssl.com/");	
		ie.get("havascript:document.getElementByID('overridelink')click();"); //standard code
	}
}
