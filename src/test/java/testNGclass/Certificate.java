package testNGclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Certificate {
	
	@Test
	public void CokisOf () {
		
     // Create object of DesiredCapabilities class
     DesiredCapabilities cap = DesiredCapabilities.chrome();
 
    // Set ACCEPT_SSL_CERTS  variable to true
    cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
 
     // Set the driver path
     System.setProperty("webdriver.chrome.driver","./DriverBrowser/chromedriver.exe");
 
      // Open browser with capability
    WebDriver driver=new ChromeDriver(cap);
    driver.get("http://www.softwaretestinghelp.com/qa-interview-questions/");
    driver.manage().window().maximize();
 
    }}
