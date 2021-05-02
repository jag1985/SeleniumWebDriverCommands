package optionsandprofiling;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.Test;

public class FirefoxProfilingAndOptions {
	//set binary
	//notifications
	//maximize the browsers
	//certificate errors (ssl)
	//work with proxy
	//page load strategy
		
	
	@Test
	public void firefox() {
		
		//selenium 4 - ssl is managed. Still to manage ssl write 2 lines which are mentioned below
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, System.getProperty("user.dir")+"\\logs\\firefox.log");
		FirefoxOptions options =new FirefoxOptions();
		//options.setPageLoadStrategy(strategy)...will be discussed later
		//options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		//if pc is not able to find the exe path, then put the above code.
		ProfilesIni allProf = new ProfilesIni(); // represents all the profiles
		FirefoxProfile prof = allProf.getProfile("April21");
		//manage notification
		prof.setPreference("dom.webnotifications.enabled", false); //notifications are set to off
		//ssl
		prof.setAcceptUntrustedCertificates(true);
		prof.setAssumeUntrustedCertificateIssuer(false);
		//proxy
		prof.setPreference("network.proxy.type", 1);
		prof.setPreference("network.proxy.socks", "83.778.87.11");
		prof.setPreference("network.proxy.socs_port", 1827);
		
		options.setProfile(prof);
		
		FirefoxDriver fd=new FirefoxDriver(options); //new profile
		//fd.get("http://pushengage.com/demo");
		fd.get("https://expired.badssl.com/");
	}
	
	
	
}
