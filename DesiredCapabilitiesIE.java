package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesIE {
	  
	 public static void main(String[] args) {

	//it is used to define IE capability 
	 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
	  
	capabilities.setCapability(CapabilityType.BROWSER_NAME, "internet explorer");
	capabilities.setCapability(InternetExplorerDriver.
	  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);


	System.setProperty("webdriver.ie.driver", "C:\\IEDriverLocation/IEDriverServer.exe");
	  
	 //it is used to initialize the IE driver
	WebDriver driver = new InternetExplorerDriver(capabilities);
	//public InternetExplorerDriver(InternetExplorerOptions options);
	//WebDriver driver = new InternetExplorerDriver(InternetExplorerOptions);
	  
	 driver.manage().window().maximize();

	 driver.get("http://gmail.com");
	  
	 driver.quit();
	 }
	  
	}

