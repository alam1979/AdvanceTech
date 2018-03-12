package testNGclass;

import java.io.File;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ScreanshortTest {
  
  @Test
  public void captureScreenshort() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\alamm\\git\\My.project\\DriverBrowser\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

  driver.get("https://www.facebook.com/");
  driver.manage().window().maximize();
  driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("rtjhur");
  
  TakesScreenshot ts  =  (TakesScreenshot) driver;
  File source = ts.getScreenshotAs(OutputType.FILE);  // this line has a Exception
  FileUtils.copyFile(source, new File("./Screenshort/facebook.png"));
  System.out.println("Screenshort taken");
  driver.quit();
  }}




