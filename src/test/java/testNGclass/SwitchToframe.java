package testNGclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class SwitchToframe {
public static void main(String[] args) throws  InterruptedException{
		System.setProperty("webdriver.chrome.driver","./DriverBrowser/chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://www.freecrm.com");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[1]")).sendKeys("naveenk");
	    driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[2]")).sendKeys("test@123");
	    Thread.sleep(5000);  
	    
	    // first select the frame
	    driver.switchTo().frame("intercom-borderless-frame");
	    
	    // then mouse hover on corner
	    Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'intercom-chat-card-author')]"))).build().perform();
	    
	    // Closes the fream
	    driver.findElement(By.xpath("//div[contains(@class,'intercom-borderless-dismiss-button')]//span")).click();
	    
	    // then Login button work as well
	    driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
	    
	     Thread.sleep(5000);
	    driver.quit();
        }}
